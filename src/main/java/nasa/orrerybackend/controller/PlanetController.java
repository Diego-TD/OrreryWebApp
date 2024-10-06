package nasa.orrerybackend.controller;

import nasa.orrerybackend.dto.PlanetDTO;
import nasa.orrerybackend.entity.Planet;
import nasa.orrerybackend.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @GetMapping("/planets")
    public ResponseEntity<List<PlanetDTO>> getPlanets(){
        return ResponseEntity.ok().body(planetService.getPlanets());
    }
}
