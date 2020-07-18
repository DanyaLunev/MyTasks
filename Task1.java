public class Task1 {

  //Generate random number
  public static int generateRandomNumber(int a, int b) {
    int randomNumber1 = a + (int) (Math.random() * b);
    int result = randomNumber1;

    return result;
  }

  //Print number
  public static void printNumber(int a) {
    System.out.print(a + "  ");
  }

  public static void printXNumber(int x) {
    for (int i = 0; i < x; i++) {
      int randomNumber = generateRandomNumber(0, 10);
      printNumber(randomNumber);
    }
  }

  public static void main(String[] args) {

    printXNumber(40);
  }
}