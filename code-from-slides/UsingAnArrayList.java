import java.util.ArrayList;

public class UsingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
          
          // Adding elements into the ArrayList
          a.add(1);
          a.add(2);
          a.add(3);
      
          // Printing ArrayList
          System.out.println(a);
          for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
          }
          System.out.println();

          for (Integer x: a) {
            System.out.print(x + " ");
          }
          System.out.println();
    }
}
