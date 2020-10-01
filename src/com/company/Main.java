package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in); // to initiate inputs

    public static void main(String[] args) {

        int[] basicArray = {1,2,3,4,5,6,7,8,9,10};//initializing array
        System.out.println(basicArray[1]);// PRINTING THE ARRAY VALUE AT POSITIONS
        System.out.println(basicArray[4]);
        System.out.println(basicArray[3]);

        //ANOTHER WAY TO ADD VALUES TO ARRAY IS FOR LOOP
        int[] anotherArray = new int[10]; //adding values to the array
        for (int i = 0; i<10; i++){
            anotherArray[i] = i*10;
        }
        //Printing results
        for (int i = 0; i< 10; i++){
            System.out.println("Position " + i + " = " + anotherArray[i]);
        }
        //another way to add values with for loops is to use "length" field of the array inside the loop
        int[] moreArray = new int[10];
        for (int i = 0; i <anotherArray.length; i++){
            moreArray[i] = i;
        }
        for (int i = 0; i<moreArray.length; i++){
            System.out.println("Position " + i + " = " + moreArray[i]);
        }

        //call the method below to print the array
        printArray(moreArray);

        // call the function to add values from the user... Method initiated below
        getIntFromCounsel(5);
        printArray(getIntFromCounsel(5));// call function inside another function
        //use the method below to calculate the average value of the array
        double arrayAver = average(getIntFromCounsel(5));
        System.out.println("The average of the array is: " + arrayAver);
    }
        //creating a method to print the array
        public static void printArray(int[] array){ //using array int type as parameter
            for (int i = 0; i < array.length; i++){
                System.out.println("Position " + i + " = " + array[i]);
            }
        }
        //Create method to take values from users (counsel)
        public static int[] getIntFromCounsel(int num){
            System.out.println("Enter " + num + " integer values. \r" );
            int[] array = new int[num];
            for (int i = 0; i<array.length; i++){
                array[i] = scanner.nextInt();
            }
            return array;
        }

        // create a method to calculate the avarage of the array's values

        public static double average(int[] array){
            int sum = 0;
            for (int i = 0; i< array.length; i++){
                sum += array[i];
            }
            return (double) sum / (double) array.length;
        }

}
