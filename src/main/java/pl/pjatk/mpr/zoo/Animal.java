package pl.pjatk.mpr.zoo;

public class Animal {

    private Integer id;
    private String specimen;
    private Diet diet;
    private Type type;
    private boolean isHungry;
    private int health;

    public Animal(Integer id, String specimen, Diet diet, Type type, boolean isHungry, int health) {
        this.id = id;
        this.specimen = specimen;
        this.diet = diet;
        this.type = type;
        this.isHungry = isHungry;
        this.health = health;
    }

    public Animal() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecimen() {
        return this.specimen;
    }

    public void setSpecimen(String specimen) {
        this.specimen = specimen;
    }

    public Diet getDiet() {
        return this.diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Boolean getHungry() {
        return this.isHungry;
    }

    public void setHungry(Boolean hungry) {
        isHungry = hungry;
    }

    public Integer getHealth() {
        return this.health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
