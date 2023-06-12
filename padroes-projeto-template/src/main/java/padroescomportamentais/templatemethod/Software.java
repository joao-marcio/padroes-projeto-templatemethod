package padroescomportamentais.templatemethod;

public abstract class Software {
    private int diasAtrasado;
    protected String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiasAtrasado() {
        return diasAtrasado;
    }

    public void setDiasAtrasado(int diasAtrasado) {
        this.diasAtrasado = diasAtrasado;
    }

    public abstract String verificarPrazo();
    public String getTipo() {
        return "Software";
    }
    public String getInfo() {
        return getTipo() + "{" +
                "Nome='" + this.nome + '\'' +
                ", Software dentro do prazo: " + this.verificarPrazo() +
                '}';
    }
}

