package practical.pkg5;

public class StudentDriver {
    public static void main(String[] args) {

        Student s=new Student();      
        s.setSchool("FASC");
        s.setName("Jane");
        s.setStudentID("A12345");
              
        boolean result= Student.validateStudentID(s);
        if(result==true){
            System.out.println(s.getName() + "(" + s.getStudentID() +")" +" is a valid student ID");
        }else{
             System.out.println(s.getName()+ "(" +s.getStudentID()+")" +" is not a valid student id");
        }            
        

        Student s2=new Student(); 
        s2.setSchool("FOCS");
        s2.setName("Andy");
        s2.setStudentID("B12345");
              
        boolean result2= Student.validateStudentID(s2);
        if(result2==true){
            System.out.println(s2.getName() + "(" + s2.getStudentID() +")" +" is a valid student ID");
        }else{
             System.out.println(s2.getName()+ "(" +s2.getStudentID()+")" +" is not a valid student id");
        }           
    }
}
