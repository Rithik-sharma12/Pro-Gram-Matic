class Student{
    String name;
    static int rollno = 1; 
    Student(String name){
        this.name = name;
        rollno++;
    }
}


public class Roll {
    public static void main(String[] args){
        Student s1 = new Student("Alice");
        System.out.println("Name: " + s1.name + ", Roll No: " + Student.rollno);
        
        Student s2 = new Student("Bob");
        System.out.println("Name: " + s2.name + ", Roll No: " + Student.rollno);
        
        Student s3 = new Student("Charlie");
        System.out.println("Name: " + s3.name + ", Roll No: " + Student.rollno);

    }
}
