/*
**************************************************************
            Project #2 - Pokemon Class
            Name: Lukas Maynard
            Data Structures Date: Date of Submission (3/30/2023)
 *************************************************************
            Pokemon::Object
        Holds data for pokemon in an object

            Pokemon::PrintStats
        returns a formatted string with pokemon data
 *************************************************************
*/
package src.Project2;

public class Pokemon {
    private String name;
    private double hitPoints;
    private String move;
    private double movePower;
    private double attackSpeed;

    public void setName(String input){this.name = input;}
    public void setHitPoints(double input){this.hitPoints = input;}
    public void setMove(String input){this.move = input;}
    public void setMovePower(double input){this.movePower = input;}
    public void setAttackSpeed(double input){this.attackSpeed = input;}
/*
Unused get Statements and Constructor
        private String getName(){return name;}
        private double getHitPoints(){return hitPoints;}
        private String getMove(){return move;}
        private double getMovePower(){return movePower;}
        private double getAttackSpeed(){return attackSpeed;}

    public Pokemon(String name,double hitPoints,String move,double movePower, double attackSpeed){
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }
 */
    public static String PrintStats(Pokemon p){
        return String.format("""
                Name: %s
                HP: %.2f
                Move: %s
                Power: %.2f
                ATK SPD: %.2f""",p.name,p.hitPoints,p.move,p.movePower,p.attackSpeed);
    }
}
