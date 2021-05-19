package at.ac.fhcampuswien;
import java.lang.*;

public class ValidPassword {

    public boolean checkPassword(String password){
        return isValid(password) && hasUpperCase(password);
    }

    public boolean isValid(String password) {
        return password.length() >= 8 && password.length() <= 25;
    }

    public boolean hasUpperCase(String password) {
        char[] charArray = password.toCharArray();
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumeric(String password) {
        char charArray[] = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(charArray[i])) {
                return true;
            }
        }
        return false;
    }
    public boolean isAlpha(String password) {
        char charArray[] = password.toCharArray();
        for(int i = 0; i < password.length(); i++){
            if(Character.isLetter(charArray[i])){
                return true;
            }
        }
        return false;
    }

    public boolean isAlphaNumeric(String password){
        return isNumeric(password) && isAlpha(password);
    }




}
