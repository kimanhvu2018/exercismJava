import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
class Scrabble {

    Scrabble(String word) {
        HashMap<Character, Integer> letterVals = new HashMap<>();

        letterVals.put('A', 1);
        letterVals.put('B', 3);
        letterVals.put('C', 3);
        letterVals.put('D', 2);
        letterVals.put('E', 1);
        letterVals.put('F', 4);
        letterVals.put('G', 2);
        letterVals.put('H', 4);
        letterVals.put('I', 1);
        letterVals.put('J', 8);
        letterVals.put('K', 5);
        letterVals.put('L', 3);
        letterVals.put('M', 3);
        letterVals.put('N', 1);
        letterVals.put('O', 1);
        letterVals.put('P', 3);
        letterVals.put('Q', 10);
        letterVals.put('R', 1);
        letterVals.put('S', 1);
        letterVals.put('T', 1);
        letterVals.put('U', 1);
        letterVals.put('V', 4);
        letterVals.put('W', 4);
        letterVals.put('X', 8);
        letterVals.put('Y', 4);
        letterVals.put('Z', 10);

        word = word.toUpperCase();
        char[] lettersword = word.toCharArray();
        Iterator<Character> itr = letterVals.keySet().iterator();
        int score = 0;

        int getScore() {

            for (int i = 0; i < lettersword.length; i++) {
                while (itr.hasNext()) {
                    char next = itr.next();
                    if (next == lettersword[i]) {
                        score += letterVals.get(next);
                    }
                }

        }
        return score;

    }
    }
}
