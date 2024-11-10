package com.gmail.axelwerst;

    import java.util.UUID;

    public class ComputerTest {
        public static void main(String[] args) {
            //when
            Computer computer = new Computer();
            computer.setRam(16);
            computer.setCPU(2);
            computer.setRom(1);
            computer.setSYS(String.valueOf(operationSystem.WINDOWS));
            computer.setName("Vasya");

            //then

            String expectedOutput = "Computer{" +
                    "Ram=16gb, " +
                    "Rom=1, "+
                    "CPU=2, " +
                    "SYS='WINDOWS', " +
                    "Name='Vasya'" +
                    "}";

            //
            if (computer.toString().equals(expectedOutput)) {
                System.out.println("Тест пройдено успішно.");
            } else {
                System.out.println("Тест не пройдено.");
                System.out.println("Очікувалося: " + expectedOutput);
                System.out.println("Отримано:    " + computer.toString());
            }
        }
    }

