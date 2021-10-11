package ua.lov.specialisttv.cloneobj;

public class Trailer {
    private String name;
    private Integer weight;

    public Trailer() {
    }

    public Trailer(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

