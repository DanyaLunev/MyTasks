/*
Определите процедуру, которая принимает в качестве аргументов три числа и возвращает сумму
квадратов двух бо́льших из них.
*/

import java.util.Arrays;

class Sumofsquares {
  
  //Print one number
  public static void printNumber(int x) {
    System.out.print(x);
  }
  
  //Elevates to a power
  public static int pow2(int x) {
    return (int) Math.pow(x, 2);
  }

  //Fold two numbers
  public static int addition(int x, int y) {
    return x + y;
  }

  //Find two MAX Numbers
  public static int[] maxNumbers(int arr[]) {
    Arrays.sort(arr);

    int[] result = new int[2];
    int length = arr.length;
    
    result[0] = arr[length - 1];
    result[1] = arr[length - 2];

    return result;
  }

  public static int powSum(int x, int y) {
    x = pow2(x);
    y = pow2(y);
    
    return addition(x, y);
  }

  public static void main(String[] args) {
    int[] arr = {1, 7, 4, 3, 6, 5, 2, 1};
    int[] maxAndMin = new int[2];

    maxAndMin = maxNumbers(arr);
    int powSumma = powSum(maxAndMin[0], maxAndMin[1]);

    printNumber(powSumma);
  }
}