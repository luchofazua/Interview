package sample.validation;

public class ShortSerialNumberValidator implements Acceptable {
    @Override
    public boolean isValid(String input) {
        return false;
    }
}
