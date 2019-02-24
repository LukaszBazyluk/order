import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Klient {

    private String imie;
    private String nazwisko;
    private String nazwaFirmy;
    private long nip;
    private boolean firma;
    private long pesel;
    private String adres;

    public Klient(String imie, String nazwisko, long pesel, String adres) {
        this.imie = sprawdzCzyNiePuste(imie, "Imię");
        this.nazwisko = sprawdzCzyNiePuste(nazwisko, "Nazwisko");
        if (PeselValidator.valid(pesel)) {
            this.pesel = pesel;
        } else {
            throw new IllegalArgumentException("Niepoprawny PESEL");
        }

        this.adres = sprawdzCzyNiePuste(adres, "Adres");
    }

    public Klient(String nazwaFirmy, long nip, String adres) {
        this.firma = true;
        this.nazwaFirmy = sprawdzCzyNiePuste(nazwaFirmy, "Nazwa firmy");
        if (NipValidator.valid(nip)) {
            this.nip = nip;
        } else {
            throw new IllegalArgumentException("Niepoprawny NIP");
        }
        this.adres = sprawdzCzyNiePuste(adres, "Adres");
    }

    private String sprawdzCzyNiePuste(String value, String message) {
        if (value != null && value.length() > 0) {
            return value;
        } else {
            throw new IllegalArgumentException("Pole: '" + message + "' nie może być puste");
        }
    }
}
