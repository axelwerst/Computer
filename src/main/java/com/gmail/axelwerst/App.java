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

        int delet = 0;
        int[] array = new int[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0,};
        Util util = new Util();
        util.setArray(array);
        util.setDelet(delet);
        System.out.println(util);
    }
}
