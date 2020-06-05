import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//public class UpdatetPetTests {
//    //обновить питомца  PUT — обновление ресурса
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
//                "  \"name\": \"CatTEST\",\n" +
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
//    @After
//    public void after (){
//        petEndpoint.deletePet(petId);
//    }
//
//    @Test
//    public void updatePet(){
//        String body = "{\n" +
//                "  \"id\": " + petId + ",\n" +
//                "  \"category\": {\n" +
//                "    \"id\": 0,\n" +
//                "    \"name\": \"string\"\n" +
//                "  },\n" +
//                "  \"name\": \"CatTEST2\",\n" +
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
//         petEndpoint.updatePet(body);
//         petEndpoint.getPetName(petId);
//        System.out.println( petEndpoint.getPetName(petId));
//    }
//
//
//}
