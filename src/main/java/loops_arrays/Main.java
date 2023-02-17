package loops_arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in); // вызов метода сканнер
        System.out.print("Enter array size");
        int size = console.nextInt(); // иниц переменной сайз - размер массива

        int [] myArray = new int[size]; // создание нового массива с размером сайз

        for (int i = 0; i < myArray.length; i++){ // наполнение массива элементами
            System.out.println("Enter the value:  ");
            myArray[i] = console.nextInt();
        }
        System.out.print("Your array is");
        for (int x: myArray) {

            System.out.print("[" + x + "]");
        }
        System.out.println();


    }
}


