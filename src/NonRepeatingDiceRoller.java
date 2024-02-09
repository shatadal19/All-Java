import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NonRepeatingDiceRoller {
    public static void main(String[] args) {
        int numberOfDice = 6; // Change this value to the desired number of dice

        List<Integer> diceNumbers = new ArrayList<>();
        for (int i = 1; i <= numberOfDice; i++) {
            diceNumbers.add(i);
        }

        Collections.shuffle(diceNumbers);

        Random random = new Random();
        for (int i = 0; i < numberOfDice; i++) {
            int randomNumber = diceNumbers.get(i);
            System.out.println("Dice " + (i + 1) + ": " + randomNumber);
        }
    }
}
