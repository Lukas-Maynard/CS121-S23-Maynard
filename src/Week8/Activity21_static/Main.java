package src.Week8.Activity21_static;

public class Main {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth",1, 3958.8);
        planet1.display();
        Planet planet2 = new Planet("Saturn",83,36184.0);
        planet2.display();

        System.out.println("\nPlanet amount: "+Planet.getPlanetAmount());

    }
}
