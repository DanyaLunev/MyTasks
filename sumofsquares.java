/*
Определите процедуру, которая принимает в качестве аргументов три числа и возвращает сумму
квадратов двух бо́льших из них.
*/

import java.util.Arrays;

class sumofsquares {
  
  //Print one number
  public static void printNumber(int x) {
    System.out.print(x);
  }
  
  //Elevates to a power
  public static int pow2(int x) {
    return (int)Math.pow(x, 2);
  }

  //Fold two numbers
  public static int addition(int x, int y) {
    return x + y;
  }

  public static int maxNumbers(int array[]) {
    Arrays.sort(array);
    for (int i = array.length - 2; i < array.length; i++) {
      printNumber(array[i]);
    }
  }

  public static void main(String[] args) {
    int 
    printNumber(maxNumbers([1, 2, 3, 4, 5]));
  }
}