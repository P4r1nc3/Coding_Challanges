// Implement a function that adds two numbers together and returns their sum in binary.
// The conversion can be done before, or after the addition.
// The binary number returned should be a string.

package CodeWars.BinaryAddition;

public class BinaryAddition {
    public static String binaryAddition(int a, int b){
        int dec = a + b;
        String bin = Integer.toBinaryString(dec);
        return bin;
    }
}
