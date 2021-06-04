
package pkg13u;

public class User {
    
    private String name;
    private String rang;
      
    public void setName(String name){
        this.name = name; 
    }
    public void setRang(String rang){
        this.rang = rang; 
    }

    public void printInformation(){
    System.out.println("Name: " + name);
    System.out.println("Rang: " + rang);
    
    }
}
