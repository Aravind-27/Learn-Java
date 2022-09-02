package NCG_1_Sep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrimEachElement {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("welcome "," to ","hitachi"," vantara");

        List<String> answer = list1.stream().map(String::trim).collect(Collectors.toList());

        System.out.println(answer);
    }
}
