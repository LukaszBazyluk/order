import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EmptyValidatorTest {

    @Test
    public void testValid() {
        List<Validator> validators = new ArrayList<Validator>();
        validators.add(new NameValidator("Jan"));
        validators.add(new NameValidator("Jan10"));
        validators.add(new EmptyValidator("test"));
        validators.add(new EmptyValidator(""));
        validators.add(new EmptyValidator(null));
        validators.add(new PeselValidator(1221221212121l));
        validators.add(new NipValidator(13443434343l));

        for (Validator validator : validators) {
            System.out.println(validator.getClass().getSimpleName());
            System.out.println(validator.valid());
        }
    }


}