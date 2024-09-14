

public class Department{

    private String depName;
    private String depHod;

    public void setDepName(String dn){
        this.depName = dn;
    }

    public String getDepName(){
        return depName;
    }

    public void setDepHod(String dh){
        this.depHod = dh;
    }

    public String getDepHod(){
        return depHod;
    }

    public void displayInfo(){
        System.out.println("Department Name : "+  depName);
        System.out.println("Department HOD : "+depHod);
        System.out.println("");
    }

}