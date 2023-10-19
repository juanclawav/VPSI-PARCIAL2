package examen.api.factoryRequest;

import examen.api.utils.Configuration;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestGET implements IRequest {
    @Override
    public Response send(RequestInfo requestInfo) {
        Response response=given()
                .auth()
                .preemptive()
                .basic(Configuration.user, Configuration.password)
                .log()
                .all().
                when()
                .get(requestInfo.getHost());
        response.then().log().all();
        return response;
    }

}