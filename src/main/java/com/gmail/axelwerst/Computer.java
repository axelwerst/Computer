package com.gmail.axelwerst;

import java.util.Objects;

public class Computer {
    public Computer(){
    }
    public Computer(int ram, int rom, int CPU, operationSystem SYS, String name) {
        this.Ram = ram;
        this.Rom = rom;
        this.CPU = CPU;
        this.SYS = SYS;
        this.Name = name;
    }
        int Ram;
        int Rom;
        int CPU;
        operationSystem SYS;
        String Name;


        public void setRam(int ram) {
        Ram = ram;
    }
    public void setRom(int rom) {
        Rom = rom;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public void setSYS(String SYS) {
        this.SYS = operationSystem.valueOf(SYS);
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRam() {
        return Ram;
    }

    public int getRom() {
        return Rom;
    }

    public int getCPU() {
        return CPU;
    }

    public operationSystem getSYS() {
        return SYS;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Ram=" + Ram + "gb"+
                ", Rom=" + Rom +
                ", CPU=" + CPU +
                ", SYS='" + SYS + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Ram == computer.Ram &&
                Objects.equals(Rom, computer.Rom) &&
                Objects.equals(SYS, computer.SYS) &&
                Objects.equals(CPU, computer.CPU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Rom, SYS, CPU, Ram);
    }

}


