public class Endereco {
    private String nomeRua;
    private int    numero;
    private String Complemento;
    private String bairro;
    private String CEP;

    //Getters
    public String getNomeRua() {
        return nomeRua;
    }
    public int getNumeroDaCasa() {
        return numero;
    }
    public String getComplemento() {
        return Complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCEP() {
        return CEP;
    }

    //Setters
    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }
    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numero = numeroDaCasa;
    }
    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }
}
