package pl.pjatk.mpr.zoo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zoo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String location;
    private boolean open;
    @OneToMany
    private List<Animal> animals;

    public Zoo(Integer id, String name, String location, boolean open, List<Animal> animals) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.open = open;
        this.animals = animals;
    }

    public Zoo() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isClosed() {
        return this.open;
    }

    public void setClosed(boolean closed) {
        open = closed;
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", location='" + this.location + '\'' +
                ", open=" + this.open +
                ", animals=" + this.animals.toString() +
                '}';
    }
}
