package src.Activity30_Hashmaps;

public class Main {
    public static void main(String[] args) {
        Hashmaps planetHM = new Hashmaps();

        planetHM.add_Planet("Earth",3958.8);
        planetHM.add_Planet("Mars", 2106.1);
        planetHM.add_Planet("Jupiter", 3760.4);

        planetHM.display_All();

        planetHM.remove_Planet("Earth");

        planetHM.display_All();
    }
}
