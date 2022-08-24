package NCG_23_Aug;

import java.util.ArrayList;
import java.util.List;

public class ConcatStrings {
  public static void main(String args[]) {
    System.out.println("Number of strings passed " + args.length);
    StringBuilder sb = new StringBuilder();

    for (String s : args) {
      sb.append(s);
    }
    System.out.println("Concatenated String = " + sb);
    String lastInput = args[args.length - 1];

    // get index of string article
    int index = 0;
    List<Integer> l = new ArrayList<>();
    while ((index = sb.indexOf(lastInput, index + 1)) != -1) {
      l.add(index);
    }
    System.out.println("Occurrence of string  " + l.size());
  }
}
