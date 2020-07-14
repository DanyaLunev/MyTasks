public class Task1 {

  //Generates 3 random numbers and prints them after two spaces
  public static void random() {
    int min = 0;
    int max = 10;

    int a = min + (int) (Math.random() * max);
    int b = min + (int) (Math.random() * max);
    int c = min + (int) (Math.random() * max);

    System.out.print(a + " " + b + " " + c);
  }
}