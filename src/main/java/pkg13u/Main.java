
package pkg13u;

public class Main {
    public static void main(String[] args){
        Website site = new Website();
        System.out.println("WEBSITE");
        site.setName("Refresher Courses");
        site.setWebsite("https://RefresherCourses.ru");
        site.setAddress("St. Pobeda, h.85");
        site.setOfficePhone("322-666-555");
        site.printInformation();
        System.out.println("");
        
        Teachers tea = new Teachers();
        System.out.println("TEACHERS");
        tea.setSurname("Popov");
        tea.setName("Vasal");
        tea.setPatr("Igorevich");
        tea.setQualification("Magistr");
        tea.setProfession("Historian");
        tea.setPhone("8922-555-88-96");
        tea.setAge("32");
        tea.setGroup("58");
        tea.printInformation(); 
        System.out.println("");
        
        Students stu = new Students();
        System.out.println("STUDENTS");
        stu.setSurname("Litov");
        stu.setName("Victor");
        stu.setPatr("Ignateevich");
        stu.setQualification("Bakalavr");
        stu.setPhone("8936-645-89-63");
        stu.setKurs("Historical");
        stu.setGroup("58");
        stu.printInformation(); 
        System.out.println("");
        
        User use = new User();
        System.out.println("USER");
        use.setName("Leonid");
        use.setRang("Admin");
        use.printInformation();
        System.out.println("");
        
    }  
}



