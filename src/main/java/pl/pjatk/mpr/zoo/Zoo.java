package pl.pjatk.mpr.zoo;

import java.util.List;

public class Zoo {
    private Integer id;
    private String name;
    private String location;
    private boolean isClosed;
    private List<Animal> animals;

    public Zoo(Integer id, String name, String location, boolean isClosed, List<Animal> animals) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.isClosed = isClosed;
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
        return this.isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
