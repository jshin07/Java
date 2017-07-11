public class Mammal{
    private int energyLevel =100;

    public Mammal(){}

    public void setEnergyLevel(int energyLevel){
        this.energyLevel= energyLevel;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }

    public void displayEnergy(){
        System.out.println("Totla energy level left: "+ energyLevel);
    }

}
