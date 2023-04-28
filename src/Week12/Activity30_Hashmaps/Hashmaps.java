package src.Week12.Activity30_Hashmaps;

import java.util.HashMap;

public class Hashmaps {
    HashMap<String, Double> planets = new HashMap<>();

    public void add_Planet(String planet, Double radius){
        planets.put(planet, radius);
    }

    public void remove_Planet(String planet){
        planets.remove(planet);
    }

    public double get_Value(String planet){
        return planets.get(planet);
    }

    public void display_Pair(String planet){
        if(planets.containsKey(planet)){
            System.out.printf("Key: %s Value: %.2f", planet, get_Value(planet));
        } else {
            System.out.println("Invalid key/value pair.");
        }
    }

    public void display_All(){
        planets.forEach((key, value) -> System.out.println("Key: "+key+" Value: "+ value));
        System.out.println();
    }
}
