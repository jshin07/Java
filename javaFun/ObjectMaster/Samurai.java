public class Samurai extends Human{
    private static int naumSamurai = 0;

    public Samurai(){
        this.setHealth(200);
        naumSamurai++;
    }

    public Samurai(String name){
        super(name);
        naumSamurai++;
    }

    public void deathBlow(Human human){
        human.setHealth(0);
        this.setHealth(this.getHealth()/2);
        System.out.println(this.getName() + " slayed " + human.getName());
    }

    public void meditate(){
        int gained = this.getHealth()/2;
        this.setHealth(this.getHealth()+ gained);
        System.out.println(this.getName()+ " gained "+ gained+ " health ");
    }

    public static int howMany(){
        return naumSamurai;
    }

}
