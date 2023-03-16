package src.Activity21_static;

public class Planet {
    String name;
    int moonCount;
    double sizeRadius;
    static int PlanetAmount = 0;

        public Planet(String name,int moonCount,double sizeRadius){
            this.name = name;
            this.moonCount = moonCount;
            this.sizeRadius = sizeRadius;
            PlanetAmount+=1;
    }

        public static int getPlanetAmount(){
            return PlanetAmount;
    }

        public void display(){
            System.out.printf("""
                    Name: %s
                    Moon count: %d
                    Radius: %.2f
                    """,this.name, this.moonCount, this.sizeRadius);
        }

}
