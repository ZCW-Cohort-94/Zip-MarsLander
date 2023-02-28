import java.util.Scanner;

public class BurnInputStream implements BurnStream {
    Scanner scanner = new Scanner(System.in);

    @Override
    public int getNextBurn(DescentEvent status) {
        String[] tokens = scanner.nextLine().split(" ");
        if (tokens.length > 0) {
            while (true) {
                try {
                    int burn = Integer.parseInt(tokens[0]);
                    return burn;
                } catch (NumberFormatException e) {
                    System.err.println("Must Enter a Number (0-200)");
                }
            }
        }
        return 0;
    }
}
