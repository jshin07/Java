public class Gorilla extends Mammal{
    public void throwFood(){
        this.setEnergyLevel(this.getEnergyLevel() -5);
        System.out.println("Gorilla has thrown food and lost energy by 5");
    }

    public void eatBananas(){
        this.setEnergyLevel(this.getEnergyLevel() +10);
        System.out.println("Gorilla has eaten a banana and gained energy level by 10");
    }

    public void climb(){
        this.setEnergyLevel(this.getEnergyLevel() -10);
        System.out.println("Gorilla has climed a tree and lost energy by 5");
    }
}
