import java.util.Scanner;
public class Check {
    private static final Scanner scanner = new Scanner(System.in);
    public static int checkValidate(String prompt, int max, int min) {
        System.out.print(prompt);
        int value = scanner.nextInt();

        while (!(value <= max && value >= min)) {

            System.out.print(prompt);
            value = scanner.nextInt();
        }
        return value;

    }
}
