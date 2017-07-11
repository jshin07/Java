public class Pokemon{
    private String name;
    private int health;
    private String type;
    private static int count =0;

    public Pokemon(){
        this.name = name;
        this.type = type;
        this.health = health;
        count++;
    }

    public Pokemon(String name,int health,String type){
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
