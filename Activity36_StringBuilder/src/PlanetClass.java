package Activity36_StringBuilder.src;

public class PlanetClass {

    public static class Planet {
        String name;
        double sizeRadius;
        double distanceFromSun;

        public Planet(String name, double sizeRadius, double distanceFromSun) {
            this.name = name;
            this.sizeRadius = sizeRadius;
            this.distanceFromSun = distanceFromSun;
        }

        public String PrintPlanet() {
            return String.format("Planet Name: %s\nRadius(miles): %.2f\nDistance from the Sun(AU): %.2f\n\n",name,sizeRadius,distanceFromSun);
        }
    }
}