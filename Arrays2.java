import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] st = {"1", "4", "0", "5", "6", "3"};
        String str = String.join("", st);
        int r = Integer.parseInt(str) + 1;
        String st1 = Integer.toString(r);
        char[] char1 = st1.toCharArray();
        int[] int1 = new int[char1.length];
        for (int i = 0; i < char1.length; i++) {
            int1[i] = Character.getNumericValue(char1[i]);
        }
        System.out.println(Arrays.toString(int1));
    }
}