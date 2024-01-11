import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] st = {"1", "4", "0", "5", "6", "3"};
        String str = String.join("", st);
        int r = Integer.parseInt(str) + 1;
        String st1 = Integer.toString(r);
        char[] charArray = st1.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        System.out.println(Arrays.toString(intArray));
    }
}