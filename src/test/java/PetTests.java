import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.given;



public class PetTests {


    @Test
    public void getPetById(){
        given()
                .log().all()
                .baseUri("https://petstore.swagger.io/v2")
                .get("/pet/666")
                .then()
                .log().all()
                .statusCode(200);
    }



    @Test
    public void postPetNew(){
        given()
                .contentType("application/json")
                .log().all()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .post("/elephant")
                .then()
                .log().all();

    }


    @Test
    public void putPett(){
        given()
                .contentType("application/json")
                .log().all()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .put("/elephant")
                .then()
                .log().all();

    }

    @Test
    public void deletePet(){
        RestAssured test = new RestAssured();
        given()
                .log().all()
                .baseUri("https://petstore.swagger.io/v2/pet")
                .delete("/pet/666")
                .then()
                .log().all()
                .statusCode(200);
    }




    @Test
    public void postPet2() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
        given().urlEncodingEnabled(true)
                .log().all()
                .param("name", "elephant")
                .param("id", "8")
                .header("Content-Type", ContentType.JSON.getAcceptHeader())
                .post("http://host:port/weather").then().assertThat().statusCode(201)
                .log().all();
    }


//
//    @Test
//    public void postPet3() {
//        RequestSpecification request = RestAssured.given();
//        request.contentType(ContentType.JSON);
//        body.setBase("Test");
//        body.setId(321);
//        request.body(body, ObjectMapperType.GSON)
//                .post("https://petstore.swagger.io/v2/pet").then().assertThat().statusCode(201)
//                .log().all();
//    }


}
