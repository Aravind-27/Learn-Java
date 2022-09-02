package NCG_1_Sep;

import java.util.*;

public class RandomSet {
        public static void main(String[] args) {
            List<String> list1 = new ArrayList<String>();
            list1.add("welcome");
            list1.add("to");
            list1.add("hitachi");
            list1.add("vantara");
            System.out.println("List before Shuffle : "+list1);
            Collections.shuffle(list1);
            System.out.println("List after shuffle : "+list1 );
        }
    }