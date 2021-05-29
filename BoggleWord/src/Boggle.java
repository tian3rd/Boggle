import java.util.Random;

public class Boggle {
    static final String[] DICE = {"AJBBOO", "AFFPSK", "ANEAGE", "APSHCO", "QNUMHI", "ZNHRLN", "TDSTYI", "TTWOOA", "TLRYET", "TUMIOC", "EDVLRY", "EDRLXI", "EEGNHW", "EIOTSS", "ERHTWV", "EENUSI"};

    static final int ROW_LENGTH = 4;

    public static void main(String[] args) throws Exception {
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        boolean[] alreadySelected = new boolean[DICE.length];
        for (int i = 0; i < DICE.length; i++) {
            int die = rand.nextInt(DICE.length);
            while (alreadySelected[die]) {
                die = (die + 1) % DICE.length;
            }
            alreadySelected[die] = true;
            int face = rand.nextInt(6);
            char faceChar = DICE[die].charAt(face);
            result.append(faceChar);
            if ((i + 1) % ROW_LENGTH == 0) {
                result.append('\n');
            }
        }
        System.out.println(result.toString());
    }
}
