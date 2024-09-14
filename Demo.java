

public class Demo{
    public static void main(String[] args) {

        University cui = new University();
        cui.setName("Comsats Univeristy ");

        // Lahpre Campus
        // For Computer Science 

        cui.setLahoreCampus(new Campus());
        cui.getLahoreCampus().setDepCS(new Department());
        cui.getLahoreCampus().setCampusName("Lahore Campus");
        cui.getLahoreCampus().getDepCS().setDepName("Computer Science");
        cui.getLahoreCampus().getDepCS().setDepHod("Dr Rao Adeel");

        // For Software Engineering

        cui.getLahoreCampus().setDepSE(new Department());
        cui.getLahoreCampus().getDepSE().setDepName("Software Engineering");
        cui.getLahoreCampus().getDepSE().setDepHod("Sir Shahid Bhatti");


        // For Sahiwal Campus
        // Computer Science
        cui.setSahiwalCampus(new Campus());
        cui.getSahiwalCampus().setDepCS(new Department());
        cui.getSahiwalCampus().setCampusName("Sahiwal Campus");
        cui.getSahiwalCampus().getDepCS().setDepName("Computer Science");
        cui.getSahiwalCampus().getDepCS().setDepHod("Miss Fareeha Iftikhar");

        // Software Engineering
        cui.getSahiwalCampus().setDepSE(new Department());
        cui.getSahiwalCampus().getDepSE().setDepName("Software Engineering");
        cui.getSahiwalCampus().getDepSE().setDepHod("Miss Maryam Yaseen");


        // PrintOutputs 

        cui.displayInfo();

        cui.getLahoreCampus().displayInfo();
        cui.getLahoreCampus().getDepCS().displayInfo();
        cui.getLahoreCampus().getDepSE().displayInfo();

        cui.getSahiwalCampus().displayInfo();
        cui.getSahiwalCampus().getDepCS().displayInfo();
        cui.getSahiwalCampus().getDepSE().displayInfo();


    }
}