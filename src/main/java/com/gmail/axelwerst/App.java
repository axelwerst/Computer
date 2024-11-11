package com.gmail.axelwerst;
import com.gmail.axelwerst.Util;


public class App
{
    public void main(String[] args) {

       Computer computer = new Computer();
        computer.setRam(16);
        computer.setCPU(2);
        computer.setRom(1);
        computer.setSYS(String.valueOf(operationSystem.WINDOWS));
        computer.setName("Vasya");
        System.out.println(computer);


        Computer computer1 = new Computer();
        computer1.setRam(16);
        computer1.setCPU(2);
        computer1.setRom(1);
        computer1.setSYS(String.valueOf(operationSystem.WINDOWS));
        computer1.setName("Peter");
        System.out.println(computer1);

        Computer computer2 = new Computer();
        computer2.setRam(8);
        computer2.setCPU(1);
        computer2.setRom(1);
        computer2.setSYS(String.valueOf(operationSystem.WINDOWS));
        computer2.setName("Mccolin");
        System.out.println(computer2);


        System.out.println("comp1 equals comp2: " + computer.equals(computer1));
        System.out.println("comp1 equals comp3: " + computer.equals(computer2));

        System.out.println("comp1 hashCode: " + computer.hashCode());
        System.out.println("comp2 hashCode: " + computer1.hashCode());
        System.out.println("comp3 hashCode: " + computer2.hashCode());

        System.out.println("comp1 and comp2 have equal hash codes: " +
                (computer.hashCode() == computer1.hashCode()));
        System.out.println("comp1 and comp3 have equal hash codes: " +
                (computer.hashCode() == computer2.hashCode()));



        int delet = 0;
        int[] array = new int[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0,};
        Util util = new Util();
        util.setArray(array);
        util.setDelet(delet);
        System.out.println(util);
    }
}
