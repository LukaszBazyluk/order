public class EmptyValidator implements Validator {

    private String value;

    public EmptyValidator(String value) {
        this.value = value;
    }

    public boolean valid() {
        return value != null && value.length() != 0;
    }
}
