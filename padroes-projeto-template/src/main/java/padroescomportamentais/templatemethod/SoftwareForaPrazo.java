package padroescomportamentais.templatemethod;

public class SoftwareForaPrazo extends Software {
    public String verificarPrazo() {
        if (this.getDiasAtrasado() >= 30) {
            return "Atrasado";
        }
        else {
            return "Entregue";
        }
    }
}
