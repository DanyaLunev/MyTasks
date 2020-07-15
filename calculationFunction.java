public class calculation {
  
    //Print number
    public static void printNumber(int x) {
      System.out.println(x);
    }
    
    //Finds the perimeter of a square
    public static void squarePerimeter(int a) {
      printNumber(a * 4);
    }
  
    //Finds the diameter of the circle
    public static void circleDiameter(int b) {
      printNumber(b * 2);
    }
  
    //Squares a number
    public static int squareNumber(int c) {
      int result = c * c;
      return result;
    }
    
    //Finds the distance to the horizon
    public static void skyline(int d) {
      int radius = 6350;
      int answer = (squareNumber(radius + d) - squareNumber(radius));
      int answer1 = (int) Math.sqrt(answer);
      printNumber(answer1);
    }
  
    //Raises a number to a cube
    public static int cube(int e) {
      int result2 = e * e * e;
      return result2;
    }
  
    //Finds the volume and area of ​​a cube
    public static void volumeAndArea(int f) {
      printNumber(cube(f));
      printNumber(f * f);
    }
  
    //Finds the circumference and area of ​​a circle
    public static void circumference(int g) {
      printNumber(2 * 3 * g);
      printNumber(3 * squareNumber(g));
    }
  
    public static void main(String[] args) {
      
    }
  
  }