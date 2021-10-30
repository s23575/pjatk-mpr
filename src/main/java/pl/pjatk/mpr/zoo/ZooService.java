package pl.pjatk.mpr.zoo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service // Po dodaniu tej adnotacji klasa jest "używana"
public class ZooService {
    public Zoo getExampleZoo() {
        Animal tygrys = new Animal(1,"kotowate",Diet.MEAT,Type.LAND,false,100);
        Animal puma = new Animal(2,"kotowate",Diet.MEAT,Type.LAND,false,90);
        List<Animal> animalList = List.of(tygrys, puma);
        return new Zoo(1,"Wesołe","Kraków",true,animalList);
    }

    public Zoo getEmptyZoo() {
        return new Zoo(1,"Wesołe","Kraków",true,null);
    }

    public Zoo getEmptyZooNamed(String nazwa) {
        return new Zoo(1,nazwa,"Kraków",true,null);
    }
}
