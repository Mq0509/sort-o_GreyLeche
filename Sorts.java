import java.util.Arrays;
import java.util.ArrayList;

public class Driver{
  public static void main(String[] args) {
    ArrayList a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    ArrayList b = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

    System.out.println("Best case for bubble sort");
    Sorts.bubble(a);
    System.out.println("Worst case for bubble sort");
    Sorts.bubble(b);
    
    System.out.println("Best case for selection sort");
    Sorts.selection(a);
    System.out.println("Worst case for selection sort");
    Sorts.selection(b);
    
    System.out.println("Best case for insertion sort");
    Sorts.insertion(a);
    System.out.println("Worst case for selection sort");
    Sorts.insertion(b);
  }
}

