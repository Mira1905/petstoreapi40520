package models;
import lombok.Builder;
import lombok.Getter;
import java.util.Date;
import static models.Status.*;


@Getter
@Builder
public class Order {
    @Builder.Default
    private long id = 0;
    @Builder.Default
    private long petId = 0;
    @Builder.Default
    private long quantity = 0;
    @Builder.Default
    private Date shipDate;
    @Builder.Default
    private Status status = PLACED;
    @Builder.Default
    private Boolean complete = true;

}
