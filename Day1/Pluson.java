package Day1 ;
public class Pluson{
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // add one and done
                return digits;
            }
            digits[i] = 0;     // if 9 → becomes 0, carry 1 to next
        }

        // if all digits were 9 (like 999 → 1000)
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}