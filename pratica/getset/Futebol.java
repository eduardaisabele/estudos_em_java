package pratica.getset;

public class Futebol {
    private String nomeTime;

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String meuTime) {
        this.nomeTime = meuTime;
    }

    public void mostraTime() {
        System.out.println(getNomeTime() );
    }
}
