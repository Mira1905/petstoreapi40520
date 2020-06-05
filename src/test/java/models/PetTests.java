//import org.junit.Test;
//import static io.restassured.RestAssured.given;
//
//
//
//public class PetTests {
//
//endpoints.PetEndpoint petEndpoint = new endpoints.PetEndpoint();
//
//
//    @Test
//    public void getPetById(){
//        String body = "{\n" +
//                "  \"id\": 0,\n" +
//                "  \"category\": {\n" +
//                "    \"id\": 0,\n" +
//                "    \"name\": \"string\"\n" +
//                "  },\n" +
//                "  \"name\": \"kitty\",\n" +
//                "  \"photoUrls\": [\n" +
//                "    \"string\"\n" +
//                "  ],\n" +
//                "  \"tags\": [\n" +
//                "    {\n" +
//                "      \"id\": 0,\n" +
//                "      \"name\": \"string\"\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"status\": \"available\"\n" +
//                "}";
//        Long petId = petEndpoint.createPet(body);
//        petEndpoint.getPet(petId);
//        petEndpoint.deletePet(petId);
//
//    } //ВЫНЕСЛИ ВДРУГОЙ КЛАСС
//
//
//
//
//    @Test
//    public void createPet(){
//        given()
//                .body("{\n" +
//                        "  \"id\": 0,\n" +
//                        "  \"category\": {\n" +
//                        "    \"id\": 0,\n" +
//                        "    \"name\": \"string\"\n" +
//                        "  },\n" +
//                        "  \"name\": \"kitty\",\n" +
//                        "  \"photoUrls\": [\n" +
//                        "    \"string\"\n" +
//                        "  ],\n" +
//                        "  \"tags\": [\n" +
//                        "    {\n" +
//                        "      \"id\": 0,\n" +
//                        "      \"name\": \"string\"\n" +
//                        "    }\n" +
//                        "  ],\n" +
//                        "  \"status\": \"available\"\n" +
//                        "}")
//                .post(endpoints.PetEndpoint.CREATE_PET)
//                .then()
//                .log().all();
//
//    }
//
//
//    @Test
//    public void updatetPet(){
//      given()
//              .body("{\n" +
//                        "  \"id\": 0,\n" +
//                        "  \"category\": {\n" +
//                        "    \"id\": 0,\n" +
//                        "    \"name\": \"string\"\n" +
//                        "  },\n" +
//                        "  \"name\": \"kitty\",\n" +
//                        "  \"photoUrls\": [\n" +
//                        "    \"string\"\n" +
//                        "  ],\n" +
//                        "  \"tags\": [\n" +
//                        "    {\n" +
//                        "      \"id\": 0,\n" +
//                        "      \"name\": \"string\"\n" +
//                        "    }\n" +
//                        "  ],\n" +
//                        "  \"status\": \"available\"\n" +
//                        "}")
//                .put(endpoints.PetEndpoint.UPDATE_PET)
//                .then()
//                .log().all();
//
//    }
//
//    @Test
//    public void deletePet(){
//        given()
//                .delete(endpoints.PetEndpoint.DELETE_PET)
//                .then()
//                .log().all()
//                .statusCode(200);
//    }
//









//}
