package kyh.lektion2;

public class Main {

  public static void main(String[] args) {
    System.out.println("lektion 2 -- en uppdatering");
    räkna(10);
  }

  private static void räkna(int n) {
    for (; n > 0; --n)  System.out.print(n);
    System.out.println("---");
  }
}
