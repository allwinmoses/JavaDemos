package voya.objects.basics;

public class OverloadMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Raj", "programmer");
        employee.calcBonus(2220);
        Employee employee1 = new Employee("Raj", "Manager");
        employee1.calcBonus(2200, 200,"car");
        Employee employee2 = new Employee("Raj", "Manager");
        employee2.calcBonus(2200, "Laptop", 200,200);

//        Scanner scanner = new Scanner(System.in);
//        for(int i=0;i<3; i++){
//            String name = scanner.next();
//            String designation =  scanner.next();
//            Employee employee3 = new Employee(name,designation);
//            if(designation.equals("programmer")) {
//                employee.calcBonus(2200);
//
//            }else if (designation.equals("Manager")){
//                employee.calcBonus(2200,200,"car");}
//            else{
//                employee.calcBonus(2200,"car",200,200);}


        }
    }

