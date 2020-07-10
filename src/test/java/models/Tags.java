package models;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Tags {

    //Структура данных
    private long id;
    private String name;

}
