import com.sessions.model.Vehicle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vehicle vehicle = new Vehicle();
        vehicle.setColor("red");
        System.out.println(vehicle.getColor());
    }
}