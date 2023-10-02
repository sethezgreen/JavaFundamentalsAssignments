import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    Random randMachine = new Random();

    public int[] getTenRolls() {
        int[] tenRolls;
        tenRolls = new int[10];
        for (int i = 0; i < 10; i++) {
            int roll = (randMachine.nextInt(20) + 1);
            tenRolls[i] = roll;
        }
        return tenRolls;
    }

    public char getRandomLetter() {
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int lettersIndex = randMachine.nextInt(26);
        char randChar = letters[lettersIndex];
        return randChar;
    }

    public String generatePassword() {
        String[] letters;
        letters = new String[8];
        for (int i = 0; i < 8; i++) {
            String letter = String.valueOf(getRandomLetter());
            letters[i] = letter;
            System.out.println(letter);
        }
        System.out.println(Arrays.toString(letters));
        return "success";
    }
}