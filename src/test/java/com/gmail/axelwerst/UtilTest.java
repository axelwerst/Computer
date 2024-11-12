/*package com.gmail.axelwerst;

import junit.framework.TestCase;

import java.util.Arrays;

public class UtilTest extends TestCase {

    public static void main(String[] args) {
        //wen
        int[] testArray = {1, 2, 3, 4, 5};
        int numberToRemove = 2;
        //then
        Util util = new Util();
        util.setArray(testArray);
        util.setDelet(numberToRemove);
        System.out.println("Original array: " + Arrays.toString(util.getArray()));
        System.out.println("Modified array: " + Arrays.toString(util.removeNumber()));
        int[] resultExpected = {1, 3, 4, 5};
        if (Arrays.equals(resultExpected, util.removeNumber())) {
            System.out.println("test passt");
        }

                //wen
        int[] testArray1 = {1, 2, 3, 2, 4, 2, 5};
                //then
        Util util1 = new Util();
        util1.setArray(testArray1);
        util1.setDelet(numberToRemove);
        System.out.println("Original array: " + Arrays.toString(util1.getArray()));
        System.out.println("Modified array: " + Arrays.toString(util1.removeNumber()));
                 //result expected [1, 3, 4, 5]
        int[] resultExpected1 = {1, 3, 4, 5};
        if (Arrays.equals(resultExpected1, util1.removeNumber())) {
            System.out.println("test passt");
        }
                    //wen
        int[] testArray4 = {1, 1, 3, 1, 4, 1, 5};
                    //then
        Util util4 = new Util();
        util4.setArray(testArray4);
        util4.setDelet(numberToRemove);
        System.out.println("Original array: " + Arrays.toString(util4.getArray()));
        System.out.println("Modified array: " + Arrays.toString(util4.removeNumber()));
                    //result expected [1, 1, 3, 1, 4, 1, 5]
        int[] resultExpected4 = {1, 1, 3, 1, 4, 1, 5};
        if (Arrays.equals(resultExpected4, util4.removeNumber())) {
            System.out.println("test passt");
        }
                     //wen
        int[] testArray2 = {2, 2, 2, 2, 2, 2, 2};
                    //then
        Util util2 = new Util();
        util2.setArray(testArray2);
        util2.setDelet(numberToRemove);
        System.out.println("Original array: " + Arrays.toString(util2.getArray()));
        System.out.println("Modified array: " + Arrays.toString(util2.removeNumber()));
                     //result expected []
        int[] resultExpected2 = {};
        if (Arrays.equals(resultExpected2, util2.removeNumber())) {
                     //wen
            System.out.println("test passt");
        }
        int[] testArray3 = {};
                    //then
        Util util3 = new Util();
        util3.setArray(testArray3);
        util3.setDelet(numberToRemove);
        System.out.println("Original array: " + Arrays.toString(util3.getArray()));
        System.out.println("Modified array: " + Arrays.toString(util3.removeNumber()));
                     //result expected []
        int[] resultExpected3 = {};
        if (Arrays.equals(resultExpected3, util3.removeNumber())) {
            System.out.println("test passt");
        }
    }
}*/