package pl.pjatk.mpr.zoo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {

    @Id // Do tego potrzebny jest bezargumentowy konstruktor
    @GeneratedValue(strategy= GenerationType.IDENTITY) // Do tego potrzebny jest bezargumentowy konstruktor
    private Integer id;
    private String specimen;
    private Diet diet;
    private Type type;
    private boolean hungry;
    private int health;

    public Animal(Integer id, String specimen, Diet diet, Type type, boolean hungry, int health) {
        this.id = id;
        this.specimen = specimen;
        this.diet = diet;
        this.type = type;
        this.hungry = hungry;
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
        return this.hungry;
    }

    public void setHungry(Boolean hungry) {
        this.hungry = hungry;
    }

    public Integer getHealth() {
        return this.health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + this.id +
                ", specimen='" + this.specimen + '\'' +
                ", diet=" + this.diet +
                ", type=" + this.type +
                ", hungry=" + this.hungry +
                ", health=" + this.health +
                '}';
    }

}
