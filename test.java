class Etudiant
{
    //les attributs 
    private String firstname;
    private String lastname;
    private int age;

//Les constructeurs
public Etudiant(){}
//Les constructeurs
public Etudiant(String fname,String lname,int age){
    this.firstname=fname;
    this.lastname=lname;
    this.age=age;
}
 //Les Accesseurs
    //Les getters
   public String getFirstName(){return this.firstname;} 
   public String geLastName(){return this.lastname;} 
   public int getage(){ return this.age;} 

   //Les setters
   public void setFirstName(String firstname_){ this.firstname=firstname_;} 
   public void setLastName(String lastname_){ this.lastname=lastname_;} 
   public void setAge(int age_){ this.age=age_;} 

   //les methodes 
   public String Action1(){ return "Bonjour je m applle "+this.geLastName();} 

   public String Action2(){  return "Bonjour j ai "+this.getage();} 

}
class Voiture 
{
    //les attributs
    private String name;
    private int model;
    //les constructeurs
    public Voiture (){}
    //les getters
    public String getname(){return this.name;} 
    public int getmodel(){return this.model;} 
    //les setters
    public void setName(String name_){ this.name=name_;} 
    public void setmodel(int model_){ this.model=model_;}
    //les methodes
    public void action1(){ System.out.println("3wj rwayd");}
}


class Main {
    public static void main(String[] args) {
        Etudiant e1=new Etudiant();
        Voiture  v1=new Voiture();
        e1.setFirstName("Mohamed");
        System.out.println("etudiant s appelle "+e1.getFirstName());
        v1.setmodel(1991);
        System.out.println("la voiture est de model "+v1.getmodel());
    }