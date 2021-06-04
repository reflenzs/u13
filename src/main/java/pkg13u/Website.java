
package pkg13u;

public class Website {
    
    private String name;
    private String website;
    private String address;
    private String officePhone;
      
    public void setName(String name){
        this.name = name; 
    }
    public void setWebsite(String website){
        this.website = website; 
    }
    public void setAddress(String address){
        this.address = address; 
    }
    public void setOfficePhone(String officePhone){
        this.officePhone = officePhone; 
    }
    
    public void printInformation(){
    System.out.println("Name: " + name);
    System.out.println("Website: " + website);
    System.out.println("Address: " + address);
    System.out.println("Office Phone: " + officePhone);

   }
}

