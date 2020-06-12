package models;

public class Tags {
    private long id;
    private String name;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Tags(String name) {
        this.id = 0;
        this.name = name;
    }
}
