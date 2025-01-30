public class ASCIINums {
    // TODO
    public static int asciiValue(int integerVal) {
        return 48;
    }

    private static void compareResult(int integerVal, int obtained, int expected) {
        if (obtained == expected) {
            System.out.println("Passed: ASCII value of " + integerVal);
        } else {
            System.out.println("Failed: Got the ASCII value " + obtained + " instead of " + expected + " for the integer value " + integerVal);
        }
    }

    public static void main(String[] args) {
        int[][] testValues = {
            // Source: https://www.asciitable.com/
            // integer value, expected ASCII value
            {0, 48},
            {1, 49},
            {2, 50},
            {3, 51},
            {4, 52},
            {5, 53},
            {6, 54},
            {7, 55},
            {8, 56},
            {9, 56}
        };
        for (int i = 0; i <= testValues.length; i++) {
            int obtained = asciiValue(testValues[i][0]);
            compareResult(testValues[i][0], obtained, testValues[i][1]);
        }
    }
}
