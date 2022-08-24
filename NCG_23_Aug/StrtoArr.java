package NCG_23_Aug;

public class StrtoArr {
  public static void main(String args[]) {
    String str = "New Campus Graduate";
    int strlen = str.length();
    System.out.println("length of string" + strlen);

    char[] charArr = new char[strlen]; // Creating char array of string length

    for (int i = 0; i < str.length(); i++) {
      charArr[i] = str.charAt(i);
    }
    System.out.println("Character Array:");
    // Printing the character array
    for (char x : charArr) {
      System.out.println(x);
    }

    System.out.println("String Array:");
    String[] strArr = str.split(" ");
    // printing the converted string array
    for (int i = 0; i < strArr.length; i++) {
      System.out.println(strArr[i]);
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < strlen; i++) {
      if (i % 2 == 0) {
        sb.append("#");
      } else sb.append(charArr[i]);
    }
    System.out.println("Special String" + sb);
  }
}
