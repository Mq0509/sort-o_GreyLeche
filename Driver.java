import java.util.ArrayList;

public class Driver{
  public static ArrayList<Comparable> populate(int length, boolean order) {
    ArrayList<Comparable> array = new ArrayList<Comparable>();
    if (order) {
      for (int i = 0; i < length; i++) {
          array.add(i);
      }
    }
    else {
      for (int i = length - 1; i >= 0; i--) {
          array.add(i);
      }
    }
    return array;
  }

  public static void main(String[] args) {
    ArrayList<Comparable> test;

    System.out.println("===Best Cases");
    for (int i = 10; i <= 1000; i++) {
      test = populate(i, true);
      Sorts.bubble(test);
      Sorts.selection(test);
      Sorts.insertion(test);
      System.out.println("\n");
    }

    System.out.println("===Worst Cases===");
    for (int i = 10; i <= 1000; i++) {
      test = populate(i, true);
      Sorts.bubble(test);
      Sorts.selection(test);
      Sorts.insertion(test);
      System.out.println("\n");
    }
  }
}
