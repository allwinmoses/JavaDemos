package com.util.list;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();

        Customer customer1=new Customer("Allwin",01,"Bangalore");
        customerList.add(customer1);

        Customer customer2=new Customer("Moses",02,"Mumbai");
        customerList.add(customer2);

        Customer customer3=new Customer("Hena",03,"Bangalore");
        customerList.add(customer3);

        Customer customer4=new Customer("Trinita",04,"Delhi");
        customerList.add(customer4);

        for(Customer customer: customerList)
            System.out.println(customer);

        List<Customer> customerCity = new ArrayList<>();
        String city = "Bangalore";
        for(Customer customer: customerList){
            if(customer.getCity().equals("Bangalore")){
                customerCity.add(customer);
            }
        }

        for(Customer customerInBangalore : customerCity){
            System.out.println(customerInBangalore);
        }

    }
}
