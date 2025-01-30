public class LinkedList {
    private Node head;
    private int count;

    private class Node {
        private String item;
        private Node next;
    }

    public LinkedList() {
        head = null;
        count = 0;
    }

    public void add(String item) {
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

    public void remove(String item) {
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

    public String[] getAllStrings() {
        Node x = head;
        String[] allValues = new String[count];
        int i = 0;
        while (x != null) {
            allValues[i] = x.item;
            x = x.next;
            i++;
        }
        return allValues;
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.add("cat");
        myList.add("dog");
        myList.add("fish");
        myList.add("chinchilla");
        myList.add("lizard");
        myList.add("parrot");
        myList.add("rabbit");
        String[] pets = myList.getAllStrings();
        for (String p: pets) {
            StdOut.print(p + " ");
        }
        StdOut.println();

        myList.remove("parrot");
        myList.remove("fish");
        myList.remove("lizard");

        pets = myList.getAllStrings();
        for (String p: pets) {
            StdOut.print(p + " ");
        }
        StdOut.println();
        
    }

}
