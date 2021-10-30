package pl.pjatk.mpr.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController // Dodatkowe zachowanie schowane pod tego typu klasami; jeden wielki "kubeł" obsługujący zapytania
@RequestMapping("/zoo") // Na jaki adres ma zostać wysłane zapytanie

public class ZooRestController {

    // @Autowired // Ale to nie jest najlepsze rozwiązanie
    private final ZooService zooService; // Bez final i bez konstruktora to będzie zwracać error (NullPointerException i "500");

    public ZooRestController(ZooService zooService) {
        this.zooService = zooService;
    }

    @GetMapping("/example")
    public ResponseEntity<Zoo> getExampleZoo() {
        return ResponseEntity.ok(zooService.getExampleZoo());
    }

    @GetMapping("/empty")
    public ResponseEntity<Zoo> getEmptyZoo() {
        return ResponseEntity.ok(zooService.getEmptyZoo());
    }

    @GetMapping("/named")
    public ResponseEntity<Zoo> getEmptyZooNamed() {
        return ResponseEntity.ok(zooService.getEmptyZooNamed("Przykładowa nazwa"));
    }

}
