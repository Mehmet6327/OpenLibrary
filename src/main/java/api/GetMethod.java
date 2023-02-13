package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import static io.restassured.RestAssured.*;

public class GetMethod {

    public Response callGETMethod(String endpoint){

        baseURI = "https://openlibrary.org";

        Response response = given().accept(ContentType.JSON).get(endpoint);
        Assert.assertEquals(response.statusCode(),200);
        Assert.assertEquals(response.contentType(),"application/json");
        return response;
    }

    public String getAuthorKey(String enpoint){
        return callGETMethod(enpoint).path("docs[0].seed[4]").toString();
    }
    public String getAuthorName(String enpoint){
        return callGETMethod(getAuthorKey(enpoint)).path("name").toString();
    }

}
