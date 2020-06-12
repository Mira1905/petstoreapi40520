package tests;
import endpoints.PetEndpoint;
import models.Pet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UpdatetPetTests {
    //обновить питомца  PUT — обновление ресурса

    private PetEndpoint petEndpoint = new PetEndpoint();
    private Long petId;


    @Before
    public void before(){
        Pet pet = Pet.builder()
                .id(0)
                .status("available")
                .name("kitty")
                .build();

        petId = petEndpoint.createPet(pet);

    }


    @Test
    public void updatePet(){


    }


    @After
    public void after (){
        petEndpoint.deletePet(petId);
    }

}
