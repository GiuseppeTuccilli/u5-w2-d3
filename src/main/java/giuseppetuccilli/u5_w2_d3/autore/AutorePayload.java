package giuseppetuccilli.u5_w2_d3.autore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AutorePayload {
    private String nome;
    private String cognome;
    private String email;
    private String dataNascita;
    private String avatar = "https://ui-avatars.com/api/?name=Mario+Rossi";
}
