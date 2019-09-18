package validation;

public class DigitsASCIIValidator implements Validator {

    @Override
    public boolean isValid(String input) {
        return (input.length() > 12 || input.length() <= 0);
    }
}
