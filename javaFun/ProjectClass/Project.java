public class Project {
    private String name;
    private String description;
    private float cost;

    public Project(){
        this("","");
    }
//create field = name
    public Project(String name){
        this.name = name;
        this.description="";
    }

//create fields = name and description
    public Project(String name, String description){
        this.name= name;
        this.description=description;
    }

    public Project(String name, String description, float cost){
        this.name= name;
        this.description=description;
        this.cost= cost;
    }

//set name that's passed in as a parameter
    public void setName(String name){
        this.name= name;
    }

//to use .getName() method later that will return the name?
    public String getName(){
        System.out.println(name);
        return this.name=name;
    }

//set description that's passed in as a parameter
    public void setDescription(String description){
        this.description=description;
    }

//to use .getDescription() method later that will return the descriptiont that's passed in?
    public String getDescription(){
        this.description=description;
        System.out.println(description);
        return description;
    }

    public void setCost(float cost){
        this.cost= cost;
    }

    public float getCost(){
        this.cost= cost;
        return cost;
    }

    public String elevatorPitch(){
        System.out.println(name + " ($" + cost+ "): " + description);
        return name + " ($" + cost+ "): " + description;
    }


}
