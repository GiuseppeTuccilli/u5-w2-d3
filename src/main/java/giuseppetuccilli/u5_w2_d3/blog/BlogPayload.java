package giuseppetuccilli.u5_w2_d3.blog;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BlogPayload {

    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoLettura;
    private String cover;
    private int idAutore;

    public BlogPayload(String categoria, String titolo, String contenuto, int tempoLettura, String cover, int idAut) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoLettura = tempoLettura;
        this.cover = cover;
        this.idAutore = idAut;

    }
}
