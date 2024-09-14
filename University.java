
public class University{

    private String uniName;
    private Campus lahoreCampus;
    private Campus sahiwalCampus;

    public void setName(String naam){
        this.uniName = naam;
    }

    public String getName(){
        return uniName;
    }

    public void setLahoreCampus(Campus c1){
        this.lahoreCampus = c1;
    }

    public Campus getLahoreCampus(){
        return lahoreCampus;
    }

    public void setSahiwalCampus(Campus c2){
        this.sahiwalCampus = c2;
    }

    public Campus getSahiwalCampus(){
        return sahiwalCampus;
    }

    public void displayInfo(){
        System.out.println("University Name : " + uniName);
        System.out.println("");
    }

}