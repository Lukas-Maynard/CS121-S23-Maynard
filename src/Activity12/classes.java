package src.Activity12;

public class classes {

    public static class Planet {
        String name;
        String size;
        double distanceFromSun;

        public Planet(String name, String size, double distanceFromSun) {
            this.name = name;
            this.size = size;
            this.distanceFromSun = distanceFromSun;
        }
    }

    public static class Satellite{
        String name;
        String homePlanet;
        double speed;

        public Satellite(String name, String homePlanet, double speed){
            this.name = name;
            this.homePlanet = homePlanet;
            this.speed = speed;
        }
    }

    public static void main(String[] args) {

    }
}
