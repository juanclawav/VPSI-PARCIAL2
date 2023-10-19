package examen.api.factoryRequest;

import examen.api.utils.Configuration;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestPUT implements IRequest {
    @Override
    public Response send(RequestInfo requestInfo) {
        Response response=given()
                .auth()
                .preemptive()
                .basic(Configuration.user, Configuration.password)
                .body(requestInfo.getBody())
                .log()
                .all().
                when()
                .put(requestInfo.getHost());
        response.then().log().all();
        return response;
    }

}
