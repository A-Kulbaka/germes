package com.mycompany.germes.application.model;

import java.lang.reflect.Field;

public class Runner {

    private String s = "mister";
    public Runner() {
        if (System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
        }
    }

    public void sayHi(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.sayHi();
        Field[] declaredFields = runner.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            declaredField.setAccessible(true);
        }

        runner.sayHi();

    }
    ацуацуацуацуацуацуацуацуац
}



grrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr