import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PeselValidatorTest {
    @Test
    public void testPoprawnyPesel() {
        //given
        List<Long> pesle = new ArrayList<Long>();
        pesle.add(54021422963l);
        pesle.add(54061839521l);
        pesle.add(89010932215l);
        pesle.add(73061354153l);
        pesle.add(89010932215l);
        pesle.add(47111417532l);
        pesle.add(52122026943l);
        pesle.add(99032631311l);
        pesle.add(94111639248l);


        //when
        for (Long a1 : pesle) {
            boolean valid = PeselValidator.valid(a1);
            assertTrue(valid);
        }

        //then

    }

    @Test
    public void testZlyPesel() {
        //given
        long pesel = 92022673119l;
        //when
        boolean valid = PeselValidator.valid(pesel);
        //then
        assertFalse(valid);
    }

}