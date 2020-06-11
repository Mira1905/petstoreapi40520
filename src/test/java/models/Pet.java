package models;

public class Pet {


    //Структура данных
    private long id;
    private Category category;
    private  String name;
    private String[] photoUrls;
    private Object[] tags;
    private String status;



    //конструктор
    public Pet(long id, String name) {
        this.category = new Category(3,"tests");
        this.id = id;
        this.name = name;
    }

    public Pet(String status) {
        this.status = status;
    }

    public Pet(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }

    public Pet(Object[] tags) {
        this.tags = tags;
    }


    //GETTER

    public long getId() { return id; }

    public Object getCategory() { return category; }

    public String getName() { return name; }

    public String[] getPhotoUrls() { return photoUrls; }

    public Object[] getTags() { return tags; }

    public String getStatus() { return status; }



}
