package giuseppetuccilli.u5_w2_d3.exeptions;

public class NotFoundExeption extends RuntimeException {
    public NotFoundExeption(int id) {
        super("risorse con id " + id + " non presente nel db");
    }
}
