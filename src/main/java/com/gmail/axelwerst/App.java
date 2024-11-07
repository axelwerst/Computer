package com.gmail.axelwerst;


public class App
{
    public static void main( String[] args ) {

       Computer computer = new Computer();
        computer.setRam(16);
        computer.setCPU(2);
        computer.setRom(1);
        computer.setSYS(String.valueOf(operationSystem.WINDOWS));
        computer.setName("Vasya");
        System.out.println(computer);


    }
}
