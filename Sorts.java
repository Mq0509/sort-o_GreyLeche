  import java.util.ArrayList;
  public class Sorts{
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for (int p = 0; p < data.size(); p++) {
      Comparable temp = 0;
      for(int i = (data.size()-1); i > 0; i--) {
        if(data.get(i).compareTo(data.get(i-1)) < 0) {
          temp = data.get(i);
          data.set(i, data.get(i-1));
          data.set(i-1, temp);
        }
      }
    }
  }
  public static void selectionSortV( ArrayList<Comparable> data )
    {
      //note: this version places greatest value at "rightmost" end

      //maxPos will point to position of SELECTION (greatest value)
      int maxPos;

      for(int pass = data.size() - 1; pass > 0; pass--) {
        System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
        maxPos = pass;

        for(int i = 1; i < pass; i++) {
          if (data.get(i).compareTo(data.get(maxPos)) > 0) {
            maxPos = i;
          }
          System.out.println( "maxPos: " + maxPos );//diag
          System.out.println( data );//diag
        }
        Comparable dummy = data.get(pass);
        data.set(pass, data.get(maxPos));
        data.set(maxPos, dummy);

        System.out.println( "after swap: " +  data );//diag
      }
    }//end selectionSort
    public static void insertionSortV( ArrayList<Comparable> data )
      {
        for(int partition = 1; partition < data.size(); partition++) {
          //partition marks first item in unsorted region

          System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
          System.out.println( data );

          //traverse sorted region from right to left
          for(int i = partition; i > 0; i--) {

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
      }//end insertionSortV
}
