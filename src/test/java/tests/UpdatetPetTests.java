package tests;
import endpoints.PetEndpoint;
import models.Category;
import models.Pet;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class UpdatetPetTests {  //обновить питомца  PUT — обновление ресурса
    private Long petId;

    @Steps
    private PetEndpoint petEndpoint;



    @Before
    public void before(){
        Pet pet = Pet.builder()
                .name("pet1")
                .category(Category.builder()
                        .id(0)
                        .name("test")
                        .build())
                .build();
        petId = petEndpoint.createPet(pet);

    }


    @Test
    public void updatePet(){
        Pet pet = Pet.builder()
                .id(petId)
                .status("available")
                .name("pet1")
                .status("sold")
                .build();
        petEndpoint.updatePet(pet);

    }


    @After
    public void after (){
        petEndpoint.deletePet(petId);
    }

}
