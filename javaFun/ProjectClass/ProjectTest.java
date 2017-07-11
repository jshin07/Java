import java.util.ArrayList;

public class ProjectTest{

    public static void main(String[] args) {
        Project proj1 = new Project();
        proj1.setName("Python Track");
        proj1.setDescription("Learn Python");
        proj1.setCost(50.00f);
        // proj1.getName();
        // proj1.getDescription();
        // proj1.elevatorPitch();

        Project proj2= new Project();
        proj2.setName("Java Track");
        proj2.setDescription("Learn Java");
        proj2.setCost(80.00f);
        // proj2.getName();
        // proj2.getDescription();
        // proj2.elevatorPitch();

        Project proj3= new Project();
        proj3.setName("MEAN Track");
        proj3.setDescription("Learn MEAN");
        proj3.setCost(100.00f);
        // proj3.getName();
        // proj3.getDescription();
        // proj3.elevatorPitch();

        Project proj4= new Project();
        proj4.setName("Career Support");
        proj4.setDescription("Get support on job search");
        // proj4.getName();
        // proj4.getDescription();
        // proj4.elevatorPitch();

        Project proj5= new Project("Coding Dojo", "Learn to Code", 1000.00f);
        // proj5.getName();
        // proj5.getDescription();
        // proj5.elevatorPitch();

        Portfolio portfolio = new Portfolio();
        portfolio.setProject(proj1);
        portfolio.setProject(proj2);
        portfolio.setProject(proj3);
        portfolio.setProject(proj4);
        portfolio.setProject(proj5);

        portfolio.showPortfolio();




    }


}
