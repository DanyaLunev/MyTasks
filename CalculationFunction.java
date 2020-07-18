//package com.denl;

public class CalculationFunction {
  
  //Print number
  public static void printNumber(int x) {
    System.out.print(x);
  }
  
  public static void printNumber(double x) {
    System.out.print(x);
  }

  //Finds the perimeter of a square
  public static int squarePerimeter(int x) {
    return x * 4;
  }

  //Finds the diameter of the circle
  public static int circleDiameter(int x) {
    return x * 2;
  }

  //Squares a number
  public static int pow2(int x) {
    int result = x * x;
    //int result = (int) Math.pow(c, 2);

    return result;
  }
  
  public static double pow2(double x) {
    double result = x * x;
    //int result = (int) Math.pow(c, 2);

    return result;
  }

  //Finds the distance to the horizont
  //[(R+h)^2 - R^2]^1/2
  public static int skyline(int height) {
    int radius = 6350;
    int answer = (pow2(radius + height) - pow2(radius));
    answer = (int) Math.sqrt(answer);
    
    return answer;
  }

  //Raises a number to a cube
  public static int pow3(int x) {
    return x * x * x;
    //return result2;
  }

  //Finds the volume and area of ​​a cube
  public static int volumeCube(int x) {
    return pow3(x);
  }

  //
  public static int areaCube(int x) {
    return pow2(x);
  }

  //Finds the circumference and area of ​​a circle
  public static double circleCircumference(double x) {
    return 2 * Math.PI * x;
  }

  public static double circleArea(double x) {
    return Math.PI * pow2(x);
  }

  public static void main(String[] args) {
    printNumber(squarePerimeter(7));
    //printNumber(circleDiameter(4));
    //printNumber(skyline(4));
    //printNumber(volumeCube(1));
    //printNumber(areaCube(2));
    //printNumber(circleCircumference(4));
    //printNumber(circleArea(4));

  }

}