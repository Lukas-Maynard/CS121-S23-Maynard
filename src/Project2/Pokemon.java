package src.Project2;

public class Pokemon {
    private String name;
    private double hitPoints;
    private String move;
    private double movePower;
    private double attackSpeed;

    private String getName(){return name;}
    private double getHitPoints(){return hitPoints;}
    private String getMove(){return move;}
    private double getMovePower(){return movePower;}
    private double getAttackSpeed(){return attackSpeed;}

    private void setName(String input){this.name = input;}
    private void setHitPoints(double input){this.hitPoints = input;}
    private void setMove(String input){this.move = input;}
    private void setMovePower(double input){this.movePower = input;}
    private void setAttackSpeed(double input){this.attackSpeed = input;}

    public Pokemon(String name,double hitPoints,String move,double movePower, double attackSpeed){
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    public void PrintStats(){
        System.out.printf("""
                Name: %s
                HP: %.2f
                Move: %s
                Power: %.2f
                ATK SPD: %.2f""",name,hitPoints,move,movePower,attackSpeed);
    }
}
