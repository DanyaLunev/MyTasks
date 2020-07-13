public class Main {
    
    //Generate 3 random numbers
    public static int[] random() {
      int a = 0;
      int b = 10;
      int[] result = new int[3];

      int randomNumber1 = a + (int) (Math.random() * b);
      int randomNumber2 = a + (int) (Math.random() * b);
      int randomNumber3 = a + (int) (Math.random() * b);

      result[0] = randomNumber1;
      result[1] = randomNumber2;
      result[2] = randomNumber3;

      return result;
    }

    //Print random 3 numbers
    public static void printNumbers(int a, int b, int c) {
      System.out.print(a);
      System.out.print("  ");
      System.out.print(b);
      System.out.print("  ");
      System.out.print(c);
    }

    public static void main(String[] args) {
      int[] randomNumbers = new int[3];
      randomNumbers = random();

      printNumbers(randomNumbers[0], randomNumbers[1], randomNumbers[2]);
    }
}