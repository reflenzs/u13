
package pkg13u;

public class Teachers {
    
    private String surname;
    private String name;
    private String patr;
    private String qualification;
    private String profession;
    private String phone;
    private String age;
    private String group;
    
    
    public void setName(String name){
        this.name = name; 
    }
    public void setSurname(String surname){
        this.surname = surname; 
    }
    public void setPatr(String patr){
        this.patr = patr; 
    }
    public void setQualification(String qualification){
        this.qualification = qualification; 
    }
    public void setProfession(String profession){
        this.profession = profession; 
    }
    public void setPhone(String phone){
        this.phone = phone; 
    }
    public void setAge(String age){
        this.age = age; 
    }
    public void setGroup(String group){
        this.group = group; 
    }
    
    public void printInformation(){
    System.out.println("Surname: " + surname);
    System.out.println("Name: " + name);
    System.out.println("Patr: " + patr);
    System.out.println("Qualification: " + qualification);
    System.out.println("Profession: " + profession);
    System.out.println("Phone: " + phone);
    System.out.println("Age: " + age);
    System.out.println("Group: " + group);

   }
}




