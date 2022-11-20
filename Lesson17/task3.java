
import java.util.ArrayList;
import java.util.Collections;

public class task3 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        String str1 = "heart";
        String str2 = "earth";
        list1.toArray();
        list2.toArray();

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            list1.add(c);
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            list2.add(c);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        boolean listBool = false;

        if (list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) == list2.get(i)) {
                    listBool = true;
                } else {
                    listBool = false;
                    System.out.println(listBool);
                    return;
                }
            }
        }
        System.out.println(listBool);
    }
}
