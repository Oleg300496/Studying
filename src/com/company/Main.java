package com.company;

public class Main {
    public static void main(String[]args){
        User user1 = new User();

        user1.setName("Олег");
        user1.setAge(26);

        String Name = user1.getName();
        int Age = user1.getAge();

        System.out.println(Name +" - "+ Age);
    }
}
