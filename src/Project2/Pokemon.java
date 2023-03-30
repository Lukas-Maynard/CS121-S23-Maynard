package src.Project2;

public class Pokemon {
    private String name;
    private double hitPoints;
    private String move;
    private double movePower;
    private double attackSpeed;

    public Pokemon() {
    }

    private String getName(){return name;}
    private double getHitPoints(){return hitPoints;}
    private String getMove(){return move;}
    private double getMovePower(){return movePower;}
    private double getAttackSpeed(){return attackSpeed;}

    public void setName(String input){this.name = input;}
    public void setHitPoints(double input){this.hitPoints = input;}
    public void setMove(String input){this.move = input;}
    public void setMovePower(double input){this.movePower = input;}
    public void setAttackSpeed(double input){this.attackSpeed = input;}

    public Pokemon(String name,double hitPoints,String move,double movePower, double attackSpeed){
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    public static void PrintStats(Pokemon p){
        System.out.printf("""
                Name: %s
                HP: %.2f
                Move: %s
                Power: %.2f
                ATK SPD: %.2f""",p.name,p.hitPoints,p.move,p.movePower,p.attackSpeed);
    }
}
