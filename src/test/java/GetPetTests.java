import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetPetTests {

    private PetEndpoint petEndpoint = new PetEndpoint();
    private Long petId;

    @Before
    public void before(){
        String body = "{\n" +
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
                "}";
        petId = petEndpoint.createPet(body);

    }

    @After
    public void after (){
        petEndpoint.deletePet(petId);

    }

    @Test
    public void getPetById(){
        petEndpoint.getPet(petId);


    }
}
