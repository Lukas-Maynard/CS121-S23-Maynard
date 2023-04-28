package src.Week14.Activity36_StringBuilder.src;

import Activity36_StringBuilder.src.PlanetClass;
import Activity36_StringBuilder.src.PlanetList;

public class Main{
    public static void main(String[] args) {
        PlanetList planetList = new PlanetList();

        // create planets
        PlanetClass.Planet planet1 = new PlanetClass.Planet("Venus",3760.4,0.7);
        planet1.PrintPlanet();
        PlanetClass.Planet planet2 = new PlanetClass.Planet("Jupiter",43441.0,5.2);
        planet2.PrintPlanet();

        // add planets to arrayList
        planetList.addPlanetToList(planet1);
        planetList.addPlanetToList(planet2);

        // get and print all planets in arrayList
        System.out.println(planetList.getAllPlanets());
    }
}
