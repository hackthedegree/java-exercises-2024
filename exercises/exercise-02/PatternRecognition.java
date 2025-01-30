
public class PatternRecognition {

    // TODO: create the substringSearch static method

    public static void compareIndex(String pattern, int obtained, int expected) {
        if (obtained == expected) {
            System.out.println("Passed: returned the correct index for " + pattern);
        } else {
            System.out.println("Failed: returned the index value " + obtained + " instead of " + expected + " for " + pattern);
        }
    }
    public static void main(String[] args) {
        String text = "they're eating the dogs, the cats";
        int index1 = substringSearch("dogs", text);
        int index2 = substringSearch("cats", text);
        int index3 = substringSearch("eating", text);
        // not present in the text
        int index4 = substringSearch("bark", text);
        int index5 = substringSearch("meow", text);

        compareIndex("dogs", index1, 19);
        compareIndex("cats", index1, 29);
        compareIndex("eating", index1, 8);
        compareIndex("bark", index1, 33);
        compareIndex("meow", index1, 33);
    }
}
