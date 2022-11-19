
import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        Map<Character, Integer> letters = new HashMap<Character, Integer>();

        ArrayList<Character> tempArray = new ArrayList<Character>();

        tempArray.add('A');
        tempArray.add('A');
        tempArray.add('B');
        tempArray.add('C');
        tempArray.add('B');
        tempArray.add('A');

        for (int i = 0; i < tempArray.size(); i++) {
            Character tempChar = tempArray.get(i);

            if (!letters.containsKey(tempChar)) {
                letters.put(tempChar, 1);
            } else {
                letters.put(tempChar, letters.get(tempChar) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
