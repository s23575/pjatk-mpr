package pl.pjatk.mpr.zoo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Dodatkowe zachowanie schowane pod tego typu klasami; jeden wielki "kubeł" obsługujący zapytania
@RequestMapping("/zoo") // Na jaki adres ma zostać wysłane zapytanie

public class ZooRestController {

    @GetMapping("/example")
    public ResponseEntity<Zoo> getExampleZoo() {
        Animal tygrys = new Animal(1,"kotowate",Diet.MEAT,Type.LAND,false,100);
        Animal puma = new Animal(2,"kotowate",Diet.MEAT,Type.LAND,false,90);
        List<Animal> animalList = List.of(tygrys, puma);
        Zoo zoo = new Zoo(1,"Wesołe","Kraków",true,animalList);
        return ResponseEntity.ok(zoo);
    }

    @GetMapping("/empty")
    public ResponseEntity<Zoo> getEmptyZoo() {
        Zoo zoo = new Zoo(1,"Wesołe","Kraków",true,null);
        return ResponseEntity.ok(zoo);
    }

}
