package nasa.orrerybackend.service;

import nasa.orrerybackend.dto.PlanetDTO;
import nasa.orrerybackend.entity.Planet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanetService {

    public List<PlanetDTO> getPlanets(){
        // maybe using List is overkill.
        List<PlanetDTO> planets = new ArrayList<>();

        planets.add(newPlanet(1,"Mercury",20,"Sun",120,100,1));
        planets.add(newPlanet(2,"Venus",20,"Sun",140,100,1));
        planets.add(newPlanet(3,"Earth",20,"Sun",160,100,1));
        planets.add(newPlanet(4,"Mars",20,"Sun",180,100,1));
        planets.add(newPlanet(5,"Jupiter",20,"Sun",200,100,1));
        planets.add(newPlanet(6,"Saturn",20,"Sun",220,100,1));
        planets.add(newPlanet(7,"Uranus",20,"Sun",240,100,1));
        planets.add(newPlanet(8,"Neptune",20,"Sun",260,100,1));
        return planets;
    }

    public PlanetDTO newPlanet(int id, String name, double diameter, String orbitingObject, double distanceFromSun, double orbitalSpeed, double inclination){
        return new PlanetDTO(id,name,diameter,orbitingObject, distanceFromSun, orbitalSpeed, inclination);
    }



}
