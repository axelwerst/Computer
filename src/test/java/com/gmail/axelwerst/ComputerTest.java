package com.gmail.axelwerst;
    import org.junit.jupiter.api.BeforeAll;
    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.assertEquals;

    class ComputerTest {

            static Computer computer = new Computer();
            static Computer computer1 = new Computer();

            @BeforeAll
            static void setUp() {
                            // given
                computer.setRam(16);
                computer.setCPU(2);
                computer.setRom(1);
                computer.setSYS(String.valueOf(operationSystem.WINDOWS));
                computer.setName("Vasya");


            }
        @Test
        void testToString() {
//                when
            String expected = "Computer{Ram=16gb, Rom=1, CPU=2, SYS='WINDOWS', Name='Vasya'}";
//            then
            assertEquals(expected, computer.toString());

        }

        @Test
        void testEquals() {
//                when
            computer1.setRam(16);
            computer1.setCPU(2);
            computer1.setRom(1);
            computer1.setSYS(String.valueOf(operationSystem.WINDOWS));
            computer1.setName("Peter");

//                then
            assertEquals(computer, computer1);
        }

        @Test
        void testHashCode () {
//                when
            computer1.setRam(16);
            computer1.setCPU(2);
            computer1.setRom(1);
            computer1.setSYS(String.valueOf(operationSystem.WINDOWS));
            computer1.setName("Peter");


            assertEquals((computer.hashCode()),computer1.hashCode());
                }
    }


