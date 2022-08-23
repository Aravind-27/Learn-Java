package NCG_23_Aug;

import java.util.Scanner;

public class StringValidation {
     public static void main(String[] args) {
         for(String s: args){
             boolean numeric = true;
             try {
                 Integer num = Integer.parseInt(s.trim());
             } catch (NumberFormatException e) {
                 numeric = false;
             }
             if(numeric)
                 System.out.println(s.trim() + " is an integer");
             else
                System.out.println(s.trim() + " is not an integer");
        }
     }
 }

