package com.company;

public class User {
    private String name;
    private int age;

    public void setName(String userName){
        if(userName.isEmpty()){
            System.out.println("Вы ввели пустое значение!");
        }else{
            name = userName;
        }

    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        age = userAge;
    }
    public int getAge(){
        return age;
    }
}
