public class NameValidator implements Validator {

    private String value;

    public NameValidator(String value) {
        this.value = value;
    }

    public boolean valid() {
        return !value.matches(".*\\d+.*");
    }
}
