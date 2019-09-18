package validation;

public class VersionValidator implements Validator {


    @Override
    public boolean isValid(String input) {
        if(!input.matches("^[0-9]{1,3}[.][0-9]{1,3}$")){
            return true;
        }
        String[] values = input.split("\\.");

        try{
            for (String value :  values) {
                byte number = Byte.parseByte(value);
                if ( number < 0 ) return true;
            }
        }catch (NumberFormatException e){
            return true;
        }

        return false;
    }
}
