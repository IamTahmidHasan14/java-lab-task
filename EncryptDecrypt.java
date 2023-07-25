public class EncryptDecrypt {
    private static int[] digits;

    private static void swapDigits() {
        int temp;
        temp = digits[0];
        digits[0] = digits[2];
        digits[2] = t;
        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = t;
    }

    private static int toInt() {
        int s = 0;
        for(int i = 0; i < digits.length; ++i)
            s += digits[i] * Math.pow(10, 4 - (i + 1));
        return s;
    }

    public static int encrypt(int data) {
        digits = new int[4];
        for(int i = 3; i >= 0; --i) {
            digits[i] = data % 10;
            data /= 10;
        }
        for(int i = 0; i < digits.length; ++i)
            digits[i] = (digits[i] + 7) % 10;

        swapDigits();
        return toInt();
    }

    public static int decrypt(int data) {
        digits = new int[4];
        for(int i = 3; i >= 0; --i) {
            digits[i] = data % 10;
            data /= 10;
        }

        swapDigits();
        for(int i = 0; i < digits.length; ++i)
            digits[i] = (digits[i] + 10 - 7) % 10;
            
        return toInt();
    }
}
