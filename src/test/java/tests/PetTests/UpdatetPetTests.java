package tests.PetTests;
import endpoints.PetEndpoint;
import lombok.extern.slf4j.Slf4j;
import models.petModels.Category;
import models.petModels.Pet;
import models.petModels.Status;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@Slf4j
@RunWith(SerenityRunner.class)
public class UpdatetPetTests {
    //обновить питомца  PUT — обновление ресурс


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
        log.info(String.format("Created Pet with id = %s", petId));

    }


    @Test
    public void updatePet(){
        Pet pet = Pet.builder()
                .id(petId)
                .status(Status.AVAILABLE)
                .name("pet1")
                .status(Status.SOLD)
                .build();
        petEndpoint.updatePet(pet);

    }


    @After
    public void after (){
        petEndpoint.deletePet(petId);
    }

}
