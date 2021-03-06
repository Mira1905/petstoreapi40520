package tests.PetTests;

import endpoints.PetEndpoint;
import models.petModels.Pet;
import models.petModels.Status;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;
import static models.petModels.Status.AVAILABLE;
import static models.petModels.Status.SOLD;

@RunWith(SerenityParameterizedRunner.class)
public class GetPetByStatusTests {

    @Steps
    private PetEndpoint petEndpoint = new PetEndpoint();
    private Long petId;

    private Status status;


    public GetPetByStatusTests(Status status) {
        this.status = status;
    }


    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {AVAILABLE},
                {SOLD}
        });
    }




    @Before
    public void before(){
        Pet pet = Pet.builder()
                .id(0)
                .status(status)
                .name("pet")
                .build();
        petId = petEndpoint.createPet(pet);

    }



    @Test
    public void getPetByStatusTests(){
        petEndpoint.getPetByStatus(status);

    }

    @After
    public void after (){
        petEndpoint.deletePet(petId);

    }















}
