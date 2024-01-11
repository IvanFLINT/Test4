import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int [] arr = {1, 4, 0, 5, 6, 3};
        int temp = 0;
        for (int i : arr) {
            temp = 10 * temp + i;
        }
        int r = temp + 1;
        String st1 = Integer.toString(r);
        char[] char1 = st1.toCharArray();
        int[] int1 = new int[char1.length];
        for (int i = 0; i < char1.length; i++) {
            int1[i] = Character.getNumericValue(char1[i]);
        }
        System.out.println(Arrays.toString(int1));
    }
}