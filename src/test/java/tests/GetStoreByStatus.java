package tests;
import endpoints.StoreEndpoint;
import models.Pet;
import models.Status;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static models.Status.AVAILABLE;
import static models.Status.SOLD;

public class GetStoreByStatus {


    @Steps
    private StoreEndpoint storeEndpoint = new StoreEndpoint();
    private Long petId;

    private Status status;


    public GetStoreByStatus(Status status) {
        this.status = status;
    }


    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {AVAILABLE},
                {SOLD}
        });
    }


    @Before
    public void before() {
        Pet pet = Pet.builder()
                .id(0)
                .status(status)
                .name("pet")
                .build();
        petId = storeEndpoint.createStore(pet);

    }


    @Test
    public void getStoreByStatusTests() {
        storeEndpoint.getStoryByStatus(status);

    }

    @After
    public void after() {
        storeEndpoint.deleteStore(petId);

    }
}