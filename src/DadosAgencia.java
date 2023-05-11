public class DadosAgencia  {
    private int numeroAgencia;
    private String Nomegerente;
    private String CPNJ;

    
    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    public String getNomegerente() {
        return Nomegerente;
    }
    public String getCPNJ() {
        return CPNJ;
    }

    public void setNomegerente(String nomegerente) {
        Nomegerente = nomegerente;
    }
    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public void setCPNJ(String cPNJ) {
        CPNJ = cPNJ;
    }
}
