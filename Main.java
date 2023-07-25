public class Main {
    public static void main(String[] args) {
        int data = Integer.parseInt(args[0]);

        int encrypted = EncryptDecrypt.encrypt(data);
        System.out.printf("encrypted = %d\n", encrypted);

        int decrypted = EncryptDecrypt.decrypt(encrypted);
        System.out.printf("decrypted = %d\n", decrypted);
    }
}
