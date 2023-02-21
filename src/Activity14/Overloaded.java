package src.Activity14;

public class Overloaded {

    public static class Planet {
        private String name;
        private double sizeRadius;
        private double distanceFromSun;
        private double orbitalPeriod;
        // getters
        private String getName() {
            return name;
        }
        private double getSizeRadius() {
            return sizeRadius;
        }
        private double getDistanceFromSun() {
            return distanceFromSun;
        }
        private double getOrbitalPeriod() {
            return orbitalPeriod;
        }
        // setters
        private void setName(String name) {
            this.name = name;
        }
        private void setSizeRadius(double sizeRadius) {
            this.sizeRadius = sizeRadius;
        }
        private void setDistanceFromSun(double distanceFromSun) {
            this.distanceFromSun = distanceFromSun;
        }
        private void setOrbitalPeriod(double orbitalPeriod) {
            this.orbitalPeriod = orbitalPeriod;
        }
        // default constructor
        public Planet() {
            name = "Default Planet name";
            sizeRadius = 0;
            distanceFromSun = 0;
            orbitalPeriod = 0;
        }
        // constructor with 1 parameter
        public Planet(String name) {
            this.name = name;
            sizeRadius = 0;
            distanceFromSun = 0;
            orbitalPeriod = 0;
        }
        // constructor with 4 parameters
        public Planet(String name, double sizeRadius, double distanceFromSun, double orbitalPeriod) {
            this.name = name;
            this.sizeRadius = sizeRadius;
            this.distanceFromSun = distanceFromSun;
            this.orbitalPeriod = orbitalPeriod;
        }

        public void PrintPlanet() {
            System.out.println("Planet Name: " + name);
            System.out.println("Radius(miles): " + sizeRadius);
            System.out.println("Distance from the Sun(AU): " + distanceFromSun);
            System.out.println("Orbital period: " + orbitalPeriod);
            System.out.println("-------------------");
        }
        // here is a method and an overloaded method
        public void PlanetCalculation(double sizeRadius){
            double diameter = sizeRadius*2;
            System.out.printf("Diameter: %.2f\n", diameter);
        }
        public void PlanetCalculation(double sizeRadius, double distanceFromSun){
            double diameter = sizeRadius*2;
            double distanceFromEarth = Math.abs(distanceFromSun - 1);
            System.out.printf("Diameter: %.2f\n", diameter);
            System.out.printf("Distance from Earth (AU): %.2f\n", distanceFromEarth);
        }

    }
        public static void main(String[] args) {
            // default constructor
            Planet planet0 = new Planet();
            planet0.PrintPlanet();
            // constructor with 1 parameter
            Planet planet1 = new Planet("Unknown planet");
            planet1.PrintPlanet();
            // constructor with 4 parameters
            Planet planet2 = new Planet("Venus",3760.4,0.7,225);
            planet2.PrintPlanet();

            Planet planet3 = new Planet("Jupiter",43441.0,5.2,4333);
            planet3.PrintPlanet();
            // regular method
            System.out.println("--------");
            planet2.PlanetCalculation(planet2.sizeRadius);
            // overloaded method
            System.out.println("--------");
            planet2.PlanetCalculation(planet2.sizeRadius, planet2.distanceFromSun);
            System.out.println("--------");
            planet3.PlanetCalculation(planet3.sizeRadius, planet3.distanceFromSun);
            // "AU" is astronomical units

            System.exit(0);
    }
}