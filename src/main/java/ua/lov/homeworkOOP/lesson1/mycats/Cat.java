package ua.lov.homeworkOOP.lesson1.mycats;

public class Cat {
    private String breed;
    private String color;
    private String catName;
    private int years;
    private double weight;
    private boolean sex;
    private boolean playful;


    public Cat(String breed, String color, String catName, int years, double weight, boolean sex) {
        super();
        this.breed = breed;
        this.color = color;
        this.catName = catName;
        this.years = years;
        this.weight = weight;
        this.sex = sex;
    }
    public Cat() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return color;
    }
    public String getCatName() {
        return catName;
    }
    public int getYears() {
        return years;
    }
    public double getWeight() {
        return weight;
    }
    public boolean isSex() {
        return sex;
    }

    public void setPlayful(boolean playful) {
        this.playful = playful;
    }



    public String play() {

        if (playful)
            return "This cat is playful";
        return "This cat not  playful";
    }

    public String eatsMeat(boolean b) {
        if(b)
            return(this.catName + " loves eats meat");
        return (this.catName + " eats everything");
    }



    @Override
    public String toString() {
        return "Cat [breed=" + breed + ", color=" + color + ", catname=" + catName + ", years=" + years + ", weight="
                + weight + ", sex=" + sex + ", playful=" + playful + "]";
    }
}
