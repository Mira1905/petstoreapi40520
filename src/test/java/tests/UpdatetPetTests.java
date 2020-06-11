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
        Pet pet= new Pet(0,"kitty");
        petId = petEndpoint.createPet(pet);

    }


    @After
    public void after (){
        petEndpoint.deletePet(petId);
    }

    @Test
    public void updatePet(){
       //  petEndpoint.updatePet(petId);
         petEndpoint.getPetName(petId);
        System.out.println( petEndpoint.getPetName(petId));
    }


}
