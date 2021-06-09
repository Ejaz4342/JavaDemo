package overloading;

public class Student {
    String studentName="DINESH";
    int studentId=4525;

    void searchStudentDetails(String name){
        if(name.equals(studentName)){
            System.out.println("STUDENT NAME IS "+studentName);
            System.out.println("STUDENT ID IS "+studentId);
        }
        else{
            System.out.println("RECORD NOT FOUND");
        }
    }
    void searchStudentDetails(int id){
        if(id==studentId){
            System.out.println("STUDENT NAME IS "+studentName);
            System.out.println("STUDENT ID IS "+studentId);
        }
        else{
            System.out.println("SORRY RECORD NOT FOUND");
        }
    }

}
