package NCG_23_Aug;

import java.util.regex.Pattern;

public class EmailVerificationCLI {
    // Java program to check if an email address is valid using Regex.
        public static boolean isValid(String email)
        {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            Pattern pat = Pattern.compile(emailRegex);
            if (email == null)
                return false;
            return pat.matcher(email).matches();
        }

        public static void main(String[] args)
        {
            for(String i : args){
                if (isValid(i))
                    System.out.println(i + " - Valid");
                else
                    System.out.println(i + " - InValid");
            }
        }
    }

