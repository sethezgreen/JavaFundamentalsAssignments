import java.util.Arrays;

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();

        System.out.println(Arrays.toString(appTest.getTenRolls()));

        System.out.println(appTest.getRandomLetter());

        System.out.println(appTest.generatePassword());
    }
}