package voya;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name :");
        String name1= scanner.nextLine();

        System.out.println("Department :");
        String dept = scanner.nextLine();

        System.out.println("Enter no of subjects :");
        int  sub= scanner.nextInt();
        int[] marks1 = new int[sub]; //int[] arr={};
        System.out.println("Marks for each subject: ");

        for(int i=0; i<sub;i++){
            System.out.println(i+1);
            marks1[i] = scanner.nextInt();
        }
        Student std1 = new Student(name1,dept);
        std1.printDetails();
        System.out.println(std1.getGrades(marks1));

        System.out.println("Name :");
        String name2= scanner.nextLine();

        System.out.println("Department :");
        String dept2 = scanner.nextLine();

        System.out.println("Enter no of subjects :");
        int  sub2= scanner.nextInt();
        int[] marks2 = new int[sub2];
        System.out.println("Marks for each subject: ");
        for(int i=0; i<sub;i++){
            System.out.println(i+1);
            marks2[i] = scanner.nextInt();
        }


        Student std2 = new Student(name1,dept);
        std2.printDetails();
        System.out.println(std2.getGrades(marks2));
    }
}
