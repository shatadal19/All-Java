import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DiceRoller {
    public static void main(String[] args) {
        // Number of sides on the dice
        int sides = 6;

        // Number of times to roll the dice
        int rolls = 10;

        // Roll the dice and print the results
        rollDice(sides, rolls);
    }

    private static void rollDice(int sides, int rolls) {
        if (sides <= 0 || rolls <= 0) {
            System.out.println("Invalid input. Please provide a positive number of sides and rolls.");
            return;
        }

        Random random = new Random();
        Set<Integer> rolledNumbers = new HashSet<>();

        System.out.println("Rolling a " + sides + "-sided dice " + rolls + " times:");

        for (int i = 0; i < rolls; i++) {
            int result;
            do {
                result = random.nextInt(sides) + 1; // Add 1 to get values from 1 to sides
            } while (rolledNumbers.contains(result));

            rolledNumbers.add(result);

            System.out.println("Number " + (i + 1) + ": " + result+" Week");
        }
    }
}