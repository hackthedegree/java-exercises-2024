import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        // Create a Hashtable of String keys and Integer values
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements to the Hashtable
        hashtable.put("Bob", 1);
        hashtable.put("Alice", 2);
        hashtable.put("Barker", 3);
        hashtable.put("Thabo", 3);

        // Displaying the Hashtable elements
        System.out.println("Hashtable Elements: " + hashtable);

        for (String key: hashtable.keySet()) {
            System.out.println(key + ": " + hashtable.get(key));
        }
    }
}
