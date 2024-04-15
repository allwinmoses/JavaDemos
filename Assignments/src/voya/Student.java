package voya;

public class Student {
    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void printDetails() {
        System.out.println("name " + name);
        System.out.println("department " + department);
    }

    String getGrades(int... marks) {
        int sum = 0; //90+80+70=240=80
        for (int mark : marks) {
            sum = sum + mark;  //240
        }
        double avrg = sum /  marks.length;

        if (avrg >= 90) {
            return "A";
        } else if (avrg >= 80) {
            return "B";

        } else if (avrg >= 70) {
            return "D";

        } else if (avrg >= 50) {
            return "E";

        } else {
            return "Fail";
        }
    }
}