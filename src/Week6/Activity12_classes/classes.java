/*
**************************************************************
                    Activity #22 - Classes
                    Name: Lukas Maynard
                    Data Structures Date: Date of Submission (2/14/2023)
 *************************************************************
        Uses classes and constructors to create objects, methods are used for output.
 *************************************************************
            classes::main()
        Parameters: None
        Calls constructors to make objects

            classes:: class Planets()
        Parameters: None
        Constructor used to make an object/instance, a method used for output.

            classes:: class Satellite()
        Parameters: None
        Constructor used to make an object/instance, a method used for output.
 *************************************************************
*/
package src.Week6.Activity12_classes;

public class classes {

    public static class Planet {
        String name;
        double sizeRadius;
        double distanceFromSun;

        public Planet(String name, double sizeRadius, double distanceFromSun) {
            this.name = name;
            this.sizeRadius = sizeRadius;
            this.distanceFromSun = distanceFromSun;
        }

        public void PrintPlanet(){
            System.out.println("Planet Name: "+name);
            System.out.println("Radius(miles): "+sizeRadius);
            System.out.println("Distance from the Sun(AU): "+distanceFromSun);
            System.out.println("-------------------");
        }
    }
    public static class Satellite{
        String name;
        String homePlanet;
        double speed;
        int deployedYear;

        public Satellite(String name, String homePlanet, double speed, int year){
            this.name = name;
            this.homePlanet = homePlanet;
            this.speed = speed;
            this.deployedYear = year;
        }

        public void PrintSatellite(){
            System.out.println("Satellite Name: "+name);
            System.out.println("Home planet: "+homePlanet);
            System.out.println("Speed(orbital miles/s): "+speed);
            System.out.println("Deployed in: "+deployedYear);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        Planet planet1 = new Planet("Venus",3760.4,0.7);
        planet1.PrintPlanet();

        Planet planet2 = new Planet("Jupiter",43441.0,5.2);
        planet2.PrintPlanet();

        Satellite satellite1 = new Satellite("Sputnik 1","Earth",4.971,1957);
        satellite1.PrintSatellite();

        Satellite satellite2 = new Satellite("Galileo","Jupiter",29.83,1989);
        satellite2.PrintSatellite();
    }
}