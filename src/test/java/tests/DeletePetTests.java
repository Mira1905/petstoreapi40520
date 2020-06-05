//import org.junit.Before;
//import org.junit.Test;
//
//public class DeletePetTests {
//// DELETE — удаление ресурса
//
//    private endpoints.PetEndpoint petEndpoint = new endpoints.PetEndpoint();
//    private Long petId;
//
//    @Before
//    public void before(){
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
//        petId = petEndpoint.createPet(body);
//
//    }
//
//
//    @Test
//    public void updatePet(){
//        petEndpoint.deletePet(petId);
//
//    }
//}
