package com.util.map;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new HashMap<>();
        Department department1 = new Department("ISE",1,"Bangalore");
        Department department2 = new Department("CSE",2,"Bangalore");
        Department department3 = new Department("ECE",3,"Chennai");

        map.put(department1, Arrays.asList(new Student("Allwin", "Bangalore")));
        map.put(department2,Arrays.asList(new Student("Moses","Mumbai")));
        map.put(department2,Arrays.asList(new Student("Sui","Lisbon")));

//        Set<Map.Entry<Department,List<Student>>> entries = map.entrySet();

        Set<Department> departments = map.keySet();
        for(Department department : departments){
            System.out.println(department.getDepHead()+" "+department.getDeptName());
            List<Student> students = map.get(department);
            for(Student student:students){
                System.out.println(student.getStudName());
            }

        }









    }
}
