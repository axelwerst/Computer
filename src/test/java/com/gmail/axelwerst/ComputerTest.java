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
                    "Rom=1, " +
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

            //when
            Computer computer0 = new Computer();
            computer0.setRam(16);
            computer0.setCPU(2);
            computer0.setRom(1);
            computer0.setSYS(String.valueOf(operationSystem.WINDOWS));
            computer0.setName("Vasya");
            System.out.println(computer0);


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

            //then
            System.out.println("comp1 equals comp2: " + computer0.equals(computer1));
            System.out.println("comp1 equals comp3: " + computer0.equals(computer2));
            if (computer0.equals(computer1) & !computer0.equals(computer2)) {
                System.out.println("Тест пройдено успішно.");
            }
            System.out.println("comp1 hashCode: " + computer0.hashCode());
            System.out.println("comp2 hashCode: " + computer1.hashCode());
            System.out.println("comp3 hashCode: " + computer2.hashCode());


            System.out.println("comp1 and comp2 have equal hash codes: " +
                    (computer0.hashCode() == computer1.hashCode()));
            System.out.println("comp1 and comp3 have equal hash codes: " +
                    (computer0.hashCode() == computer2.hashCode()));

            if ((computer0.hashCode() == computer1.hashCode()) & !(computer0.hashCode() == computer2.hashCode())) {
                System.out.println("Тест пройдено успішно.");
            }
            }

        }

