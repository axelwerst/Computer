package com.gmail.axelwerst;

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
                "Ram=" + Ram +
                ", Rom=" + Rom +
                ", CPU=" + CPU +
                ", SYS='" + SYS + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}


