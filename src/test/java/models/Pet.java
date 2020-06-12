package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Pet {


    //Структура данных
    private long id;
    private Category category;
    private  String name;
    private String[] photoUrls;
    private Tags [] tags;
    private String status;



//    //конструктор
//    public Pet (long id, String name) {
//        this.id = id;
//        this.category = new Category(3, "animals");
//        this.name = name;
//        this.photoUrls = new String[] {"https://media.nature.com/lw800/magazine-assets/d41586-020-01443-0/d41586-020-01443-0_17985512.jpg", "https://cs4.pikabu.ru/post_img/big/2014/05/21/5/1400654986_1651578960.jpg"};
//        this.tags = new Tags[]{new Tags("zoo"), new Tags("animals")};
//        this.status = "available";
//    }
//
//
//    public Pet (long id, String name, String status) {
//        this.id = id;
//        this.category = new Category(3, "animals");
//        this.name = name;
//        this.photoUrls = new String[] {"https://media.nature.com/lw800/magazine-assets/d41586-020-01443-0/d41586-020-01443-0_17985512.jpg", "https://cs4.pikabu.ru/post_img/big/2014/05/21/5/1400654986_1651578960.jpg"};
//        this.tags = new Tags[]{new Tags("zoo"), new Tags("animals")};
//        this.status = status;
//    }






}
