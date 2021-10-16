package pl.pjatk.mpr.zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ZooApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZooApplication.class, args);

		Animal tygrys = new Animal(1,"kotowate",Diet.MEAT,Type.LAND,false,100);
		Animal puma = new Animal(2,"kotowate",Diet.MEAT,Type.LAND,false,90);
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(tygrys);
		animalList.add(puma);
		Zoo zoo = new Zoo(1,"Wesołe","Kraków",true,animalList);
		System.out.print(zoo);

	}
	// Tutaj nie pisać
}
