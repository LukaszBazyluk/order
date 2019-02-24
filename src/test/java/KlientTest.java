import org.junit.Test;

import static org.junit.Assert.*;

public class KlientTest {

    @Test
    public void testKlient() {
        //given
        Klient klient = new Klient();

        //when
        klient.setAdres("Błotna");
        klient.setImie("Tomek");
        klient.setNazwisko("Aaaa");
        klient.setPesel(12345678911l);
        //then
        assertEquals(false,klient.isFirma());
        assertEquals("Tomek", klient.getImie());
        assertEquals("Aaaa", klient.getNazwisko());
        assertEquals(12345678911l, klient.getPesel());
    }
    @Test
    public void testFirma(){
        //given
        Klient firma = new Klient();
        //when
        firma.setFirma(true);
        firma.setNazwaFirmy("Kogucik");
        firma.setNip(1234567891);
        //then
        assertEquals(true,firma.isFirma());
        assertEquals("Kogucik", firma.getNazwaFirmy());
        assertEquals(1234567891,firma.getNip());
    }
}