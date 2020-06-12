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
        //Pet pet= new Pet(0,"kitty");
        Pet pet = Pet.builder()
                .id(0)
                .name("kitty")
                .status("available")
                .build();

        petId = petEndpoint.createPet(pet);

    }

    @After
    public void after (){
        petEndpoint.deletePet(petId);
    }

    @Test
    public void updatePet(){

       // Pet pet = new Pet(petId,"kitty","sold");
      //  petEndpoint.updatePet(petId);

    }


}
