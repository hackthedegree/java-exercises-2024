import java.lang.reflect.Array;

public class GenericLinkedList<Item> {
    private Node head;
    private int count;

    private class Node {
        private Item item;
        private Node next;
    }

    public void add(Item item) {
        if (head == null) {
            head = new Node();
            head.item = item;
            head.next = null;
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (x.next == null) {
                    x.next = new Node();
                    x.next.item = item;
                    x.next.next = null;
                    break;
                }
            }
        }
        count++;
    }

    public void remove(Item item) {
        if (head == null) {
            return;
        } else if (head.item.equals(item)) {
            head = head.next;
        } else {
            Node previous = head;
            for (Node x = head; x != null; x = x.next) {
                if (x.item.equals(item)) {
                    previous.next = x.next;
                    break;
                }
                previous = x;
            }
        }
        count--;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Item[] getAll(Class<Item> clazz) {
        Node x = head;
        @SuppressWarnings("unchecked")
        Item[] allValues = (Item[]) Array.newInstance(clazz, count);
        
        int i = 0;
        while (x != null) {
            allValues[i] = x.item;
            x = x.next;
            i++;
        }
        return allValues;
    }

    public static void main(String[] args) {
        GenericLinkedList<String> myList = new GenericLinkedList<String>();
        myList.add("cat");
        myList.add("dog");
        myList.add("fish");
        myList.add("chinchilla");
        myList.add("lizard");
        myList.add("parrot");
        myList.add("rabbit");

        String[] pets = myList.getAll(String.class);

        for (String p: pets) {
            StdOut.print(p + " ");
        }
        StdOut.println();

        myList.remove("parrot");
        myList.remove("fish");
        myList.remove("lizard");

        pets = myList.getAll(String.class);
        for (String p: pets) {
            StdOut.print(p + " ");
        }
        StdOut.println();
    }

}
