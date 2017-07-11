public class Dragon extends Mammal{

    public Dragon(){
        this.setEnergyLevel(300);
    }

    public void fly(){
        this.setEnergyLevel(this.getEnergyLevel()-50);
        System.out.println("Dragon is flying- consuming 50 energy level");
    }

    public void eatHuman(){
        this.setEnergyLevel(this.getEnergyLevel()+25);
        System.out.println("Dragon is eating a human! Gained 25 energy level");
    }

    public void attackTown(){
        this.setEnergyLevel(this.getEnergyLevel()-100);
        System.out.println("Attcking town! Consuming 100 energy level");
    }

}
