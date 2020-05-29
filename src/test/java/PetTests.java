import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.anyOf;


public class PetTests {



    private RequestSpecification given(){
        return RestAssured
                .given()
                .log().all()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType("application/json");
    }


    @Test
    public void getPetById(){
        int petId = 666;
        given()
                .get(PetEndpoint.GET_PET, petId)
                .then()
                .log().all()
                .body("id", anyOf(is(665), is(petId)))
                .statusCode(200);
    }




    @Test
    public void createPet(){
        given()
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"kitty\",\n" +
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
                .post(PetEndpoint.CREATE_PET)
                .then()
                .log().all();

    }


    @Test
    public void updatetPet(){
      given()
              .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"kitty\",\n" +
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
                .put(PetEndpoint.UPDATE_PET)
                .then()
                .log().all();

    }

    @Test
    public void deletePet(){
        given()
                .delete(PetEndpoint.DELETE_PET)
                .then()
                .log().all()
                .statusCode(200);
    }










}
