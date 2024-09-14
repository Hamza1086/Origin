
public class Campus{

    private String campusName;
    private Department CS;
    private Department SE;

    public void setCampusName(String naam){
        this.campusName = naam;
    }

    public String getCampusName(){
        return campusName;
    }

    public void setDepCS(Department cs){
        this.CS = cs;
    }

    public Department getDepCS(){
        return CS;
    }

    public void setDepSE(Department se){
        this.SE = se;
    }

    public Department getDepSE(){
        return SE;
    }

    public void displayInfo(){
        System.out.println("Campus Name: " + campusName);
    }

}