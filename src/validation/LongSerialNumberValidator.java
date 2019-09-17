package validation;

public class LongSerialNumberValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        try {
            int value = Integer.parseInt(input);
            if ( value > 0 ) return false;
        }catch (NumberFormatException e){
            return true;
        }
        return true;
    }
}
