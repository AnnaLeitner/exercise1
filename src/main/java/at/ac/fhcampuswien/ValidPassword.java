package at.ac.fhcampuswien;
import java.lang.*;

public class ValidPassword {

    public boolean checkPassword(String password){
        return isValid(password) && hasUpperCase(password);
    }

    public boolean isValid(String password) {
        if(password.length() >= 8 && password.length() <= 25){
            return true;
        }else {
            return false;
        }
    }

    public boolean hasUpperCase(String password) {
        char[] charArray = password.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(Character.isUpperCase(charArray[i])){
                return true;
            }
        }
        return false;
    }

    public boolean isNumeric(String password){
        char[] charArray = password.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(Character.isDigit(charArray[i])){
                return true;
            }
        }
        return false;
    }

}
