package nasa.orrerybackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // From Lombok for getters/setters
@AllArgsConstructor
@NoArgsConstructor
public class Planet {
    private int id;
    private String name;
    private double diameter;
    private String orbitingObject;
    private double distanceFromSun;
    private double orbitalSpeed;
    private double inclination;
    //name, diameter, distanceFromSun, orbitalSpeed, inclination

}
