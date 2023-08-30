import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println(countPi(n));
    }

    private static String countPi(String string) {
        if (string.length() < 2){
            return string;
        }
        if (string.substring(0, 2).equals("pi")) {
            return "3.14" + countPi(string.substring(2));
        } else {
            return string.charAt(0) + countPi(string.substring(1));
        }
    }
}