public class Human {
    private String name = "";
    private int strength =3;
    private int intelligence=3;
    private int stealth=3;
    private int health=100;

    public Human(){}

    public Human(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }


    public void setHealth(int health){
        this.health=health;
    }

    public int getHealth(){
        return health;
    }

    public void attack(Human human){
        human.setHealth(human.getHealth()-strength);
        System.out.println(human.getName()+ " lost "+ strength + " damage to " +human.getName());
    }

    public void setIntelligence(int intelligence){
        this.intelligence=intelligence;
    }

    public int getIntelligence(){
        return intelligence;
    }


    public void setStealth(int Stealth){
        this.stealth=stealth;
    }

    public int getStealth(){
        return stealth;
    }



}
