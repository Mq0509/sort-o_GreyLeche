import java.util.ArrayList;

public class Sorts{
  public static void bubble( ArrayList<Comparable> data ) {
    int comparisons = 0;
    boolean sorted = true;
    for (int p = 0; p < data.size(); p++) {
      Comparable temp = 0;
      for(int i = (data.size()-1); i > 0; i--) {
        comparisons++;
        if(data.get(i).compareTo(data.get(i-1)) < 0) {
          sorted = false;
          temp = data.get(i);
          data.set(i, data.get(i-1));
          data.set(i-1, temp);
        }
      }
      if (sorted) {
        break;
      }
    }
    System.out.println("BubbleSort took " + comparisons + " comparisons to sort the array");
  }

  public static void selection( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end
    int comparisons = 0;
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int pass = data.size() - 1; pass > 0; pass--) {
      maxPos = pass;

      for(int i = 1; i < pass; i++) {
        comparisons++;
        if (data.get(i).compareTo(data.get(maxPos)) > 0) {
          maxPos = i;
        }
      }
        Comparable dummy = data.get(pass);
        data.set(pass, data.get(maxPos));
        data.set(maxPos, dummy);
    }
    System.out.println("SelectionSort took " + comparisons + " comparisons to sort the array");
  }

  public static void insertion( ArrayList<Comparable> data )
  {
    int comparisons = 0;
    for(int partition = 1; partition < data.size(); partition++) {
      //traverse sorted region from right to left
      for(int i = partition; i > 0; i--) {
        comparisons++;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i - 1)) < 0) {
          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable dummy = data.get(i);
          data.set(i, data.get(i - 1));
          data.set(i - 1, dummy);
        }
        else {
          break;
        }
      }
    }
    System.out.println("InsertionSort took " + comparisons + " comparisons to sort the array");
  }
}

