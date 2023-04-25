package Activity36_StringBuilder.src;

import java.util.ArrayList;

public class PlanetList {
    ArrayList<PlanetClass.Planet> planets = new ArrayList<>();

    public void addPlanetToList(PlanetClass.Planet newPlanet){
        planets.add(newPlanet);
    }

    public Object getAllPlanets(){
        StringBuilder AllPlanets = new StringBuilder();
        for(PlanetClass.Planet p : planets){
            AllPlanets.append(p.PrintPlanet());
        }
        return AllPlanets;
    }
}
