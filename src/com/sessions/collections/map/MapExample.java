package com.sessions.collections.map;

import com.sessions.model.Vehicle;

import java.util.*;

public class MapExample {
    // map stores in key-value format pair
    // keys will be unique, value can be duplicate
    // there is no order
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();map.put("k1", 1);// add or put value to map using a key
        map.put("k2", 1);
        map.put("k3", 1);
        map.put("k1", 2);
        map.put("k1", 3);
        map.put("k2", 4);

        map.containsKey("k2"); // whether a key already exists or not in the map
        map.containsValue(3); // whether a value already exists or not in the map

        map.remove("k2"); // to remove a value from the map

        Set<Map<String, List<Vehicle>>> mapSet = new HashSet<>();
        Map<String, List<Vehicle>> mapOfListOfVehicles = new HashMap<>();
        List<Vehicle> vehicleList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Vehicle v = new Vehicle();
            if(i % 2 == 0) {
                v.setType("heavy");
            } else {
                v.setType("sedan");
            }
            v.setColor("color" + i);
            vehicleList.add(v);
        }

        List<Vehicle> heavyVehicleList = new ArrayList<>();
        List<Vehicle> sedanVehicleList = new ArrayList<>();

        for (Vehicle vehicle: vehicleList) {
            if(vehicle.getType() == "sedan") {
                sedanVehicleList.add(vehicle);
            } else {
                heavyVehicleList.add(vehicle);
            }
        }

        mapOfListOfVehicles.put("heavy", heavyVehicleList);
        mapOfListOfVehicles.put("sedan", sedanVehicleList);

        mapSet.add(mapOfListOfVehicles);

        System.out.println("Total Heavy Vehicles " + mapOfListOfVehicles.get("heavy").size());
        System.out.println("Total Sedan Vehicles " + mapOfListOfVehicles.get("sedan").size());

    }
}
