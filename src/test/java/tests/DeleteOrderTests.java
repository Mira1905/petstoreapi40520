package tests;
import models.Order;
import models.Status;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class DeleteOrderTests {

    @Steps
    private endpoints.StoreEndpoint storeEndpoint = new endpoints.StoreEndpoint();
    private Integer orderId;


    @Before
    public void before(){
        Order order = Order.builder()
                .id(0)
                .status(Status.PLACED)
                .build();
        orderId = storeEndpoint.createStore(order);
    }

    @Test
    public void deleteStore(){
        storeEndpoint.deleteStore(orderId);

    }
}
