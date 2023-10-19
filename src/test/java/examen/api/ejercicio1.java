package examen.api;

import examen.api.factoryRequest.FactoryRequest;
import examen.api.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import examen.api.utils.Configuration;

import java.util.Base64;

import static org.hamcrest.Matchers.equalTo;

public class ejercicio1 {

    RequestInfo requestInfo = new RequestInfo();
    Response response;
    JSONObject body = new JSONObject();
    String auth;

    @BeforeEach
    public void setup() {
        auth = Base64.getEncoder().encodeToString((Configuration.user+":"+Configuration.password).getBytes());
    }

    @Test
    public void verifyPregunta1() {

        //Verify Create User

        body.clear();
        body.put("Email", Configuration.user);
        body.put("Password", Configuration.password);
        body.put("FullName", Configuration.user);
        requestInfo.setHost(Configuration.host+"/api/user.json").setBody(body.toString());
        response = FactoryRequest.make("post").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("Email", equalTo(body.get("Email")))
                .body("FullName", equalTo(body.get("FullName")));

        //Verify Token

        body.clear();
        requestInfo.setHost(Configuration.host+"/api/authentication/token.json").setHeaders("Authorization","Basic "+auth);
        response = FactoryRequest.make("get").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("UserEmail", equalTo(Configuration.user));

        String token = response.then().extract().path("TokenString");


        //Verify Create Project
        body.put("Content", "Project1");
        body.put("Icon", 4);
        requestInfo.removeHeader("Authorization").setHost(Configuration.host+"/api/projects.json").setBody(body.toString()).setHeaders("Token",token);
        response = FactoryRequest.make("post").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("Content", equalTo(body.get("Content")))
                .body("Icon", equalTo(body.get("Icon")));


        //Verify Delete Token
        requestInfo.setHost(Configuration.host+"/api/authentication/token.json").setHeaders("Token",token);
        response = FactoryRequest.make("delete").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("TokenString", equalTo(token));

        //Verify Create Project deleted token
        body.clear();
        body.put("Content", "Project2");
        body.put("Icon", 5);
        requestInfo.setHost(Configuration.host+"/api/projects.json").setBody(body.toString()).setHeaders("Token",token);
        response = FactoryRequest.make("post").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("ErrorCode", equalTo(103));
    }

}
