package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse iCourse = () -> {
            String[] webCourses = {"html,css,bootstrap"};
            return webCourses;
        };
        String[] webCourses = iCourse.showCourses();
        for(String webc: webCourses)
            System.out.println(webc);

        ICourse iCourse1 = () -> {
            String[] cloud = {"aws, googlecloud,azure"};
            return cloud;
        };
        String[] cloud = iCourse1.showCourses();
        for(String weba: cloud)
            System.out.println(weba);



    }
}
