import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Klient {

    private String imie;
    private String nazwisko;
    private String nazwaFirmy;
    private int nip;
    private boolean firma;
    private long pesel;
    private String adres;

}
