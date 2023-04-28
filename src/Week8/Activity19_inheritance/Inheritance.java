/*
**************************************************************
            Activity #19 - Inheritance
            Name: Lukas Maynard
            Data Structures Date: Date of Submission (3/14/2023)
 *************************************************************
        Basic setup for class interference.
 *************************************************************
*/
package src.Week8.Activity19_inheritance;

public class Inheritance {

    public class CelestialObject{
        String name;
        double size;
        boolean HasWater;

        public double getSize() {
            return size;
        }
        public void setSize(double size) {
            this.size = size;
        }
        public boolean isHasWater() {
            return HasWater;
        }
        public void setHasWater(boolean hasWater) {
            HasWater = hasWater;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public class Planet extends CelestialObject{
        String OrbitingStar;

        public String getOrbitingStar() {
            return OrbitingStar;
        }
        public void setOrbitingStar(String orbitingStar) {
            OrbitingStar = orbitingStar;
        }
    }

    public class Moon extends CelestialObject{
        String OrbitingPlanet;

        public String getOrbitingPlanet() {
            return OrbitingPlanet;
        }
        public void setOrbitingPlanet(String orbitingPlanet) {
            OrbitingPlanet = orbitingPlanet;
        }
    }

}
