
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        while (!userInput.equals("end")) {
            userInput = scanner.nextLine();
            try {
                int input = Mathclass.cubed(userInput);
                System.out.println(input);
            } catch (Exception e) {
                System.out.println(userInput);
            }

        }
    }

}
