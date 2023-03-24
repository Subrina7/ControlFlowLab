import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 9;
        System.out.println("Guess my favourite number");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        System.out.println("Your guess was:" + guess);

        if (guess.equals(String.valueOf(secretNumber))){
            System.out.println("Nice, that is my favourite!");
        } else if(secretNumber < Integer.valueOf(guess)){
            System.out.println("Too high!");
        } else if(secretNumber > Integer.valueOf((guess))){
            System.out.println("Too low!");
        }

    }
}
