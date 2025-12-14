import java.util.*;

class Student{
    int rollno;
    String name;
    Student(int r , String s){
        this.rollno = r;
        this.name = s;
    }
}

public class ArrayObj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r;
        String s;

        Student[] students = new Student[5];
        for(int i = 0 ; i < students.length ; i++){
            System.out.print("Rollno :");
            r = sc.nextInt();
            System.out.print("Name :");
            s = sc.next();
            students[i] = new Student(r, s);
        }

        for(int i = 0 ; i < students.length ; i++){
            System.out.println(students[i].rollno + " " + students[i].name);
        }
    }
}
