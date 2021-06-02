package at.ac.fhcampuswien;
import java.lang.*;


public class ValidPassword {

    public boolean checkPassword2(String password){
        return isValid(password) && isUpperLowerAlphaNumeric(password) && specialChar(password);
    }

    public boolean isValid(String password) {
        return password.length() >= 8 && password.length() <= 25;
    }

    public boolean isUpperLowerAlphaNumeric(String password){
        char c;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean numbers = false;
        for(int i=0;i < password.length();i++) {
            c = password.charAt(i);

            if(Character.isDigit(c)) {
                numbers = true;
            }
            else if (Character.isUpperCase(c)) {
                upperCase = true;
            }
            else if (Character.isLowerCase(c)) {
                lowerCase = true;
            }
            if(numbers && upperCase && lowerCase)
                return true;
        }
        return false;
    }

    public boolean specialChar(String password) {
        String specials = "()#$?!%/@";

        for(int i = 0; i < specials.length(); i++){
            if(password.contains(Character.toString(specials.charAt(i)))) {
                return true;
            }

        }
        return false;
    }

    public boolean occurThree(String password){
        char[] charArray = password.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            int count = 0;
            char ci = charArray[i];
            if(Character.isDigit(charArray[i])){
                for (int j = 0; j < charArray.length; j++) {
                    char cj = charArray[j];
                    if (ci == cj) {
                        count++;
                    }else{
                        count = 0;
                    }
                }
                if(count > 3){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean ongoingNumbers(String password) {
        char[] charArray = password.toCharArray();

        for(int i = 0; i < charArray.length; i++){

            if(Character.isDigit(charArray[i])){
                int count = 1;
                for (int j = i+1; j < charArray.length; j++) {

                    if (charArray[j] == charArray[j-1]+1){
                        count++;

                        if(count > 2){
                            return false;
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkPassword(String password) {
        return checkPassword2(password) && occurThree(password) && ongoingNumbers(password);
    }
}
