package kyh.lektion2;

public class Main {
  public static void main(String[] args) {
    System.out.println("Lektion 2 -- En uppdatering");
    räkna(10);
  }

  private static void räkna(int n) {
    for (; n > 0; --n)  System.out.print(n);
    System.out.println("---");
  }
}
