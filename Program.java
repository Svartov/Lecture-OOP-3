package sample;

import java.util.Scanner;


public class Program {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student student = new Student("Davyd", "Visko",Gender.Man, 0, "231");
        Group group = new Group();

        getGroup(student, group);


        System.out.println(student.getName());
        System.out.println(student.getLastName());


    }

    public static void getGroup(Student student, Group group){
        try {
            group.addStudent(student);
            System.out.println("Complete");
            System.out.println(group);
        }catch (GroupOverflowException  e){
            e.printStackTrace();
        }
    }


}
