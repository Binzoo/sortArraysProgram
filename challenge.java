package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class challenge {


    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        printArray();
    }
    public static int [] getInteger(){
        System.out.println("The size fo the array");
        int size = input.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void printArray(){
        int [] newArray = getInteger();
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        System.out.println(sortArray(newArray));
    }

    public static String sortArray(int [] newSortArray){
        for (int i = 0; i < newSortArray.length; i++) {
            for (int j = 0; j < newSortArray.length; j++) {
                if((newSortArray[i] > newSortArray[j])){
                    int temp = newSortArray[i];
                    newSortArray[i] = newSortArray[j];
                    newSortArray[j] = temp;
                }
            }
        }

        return "Sorted array is: " + Arrays.toString(newSortArray);
    }
}
