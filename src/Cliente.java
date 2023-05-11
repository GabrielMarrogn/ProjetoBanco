public class Cliente {
    private String name;
    private int age;
    private String CPF;
    private Endereco endereco;
    private Agencia dadosAgencia;

    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCPF() {
        return CPF;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Agencia getDadosAgencia() {
        return dadosAgencia;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setDadosAgencia(Agencia dadosAgencia) {
        this.dadosAgencia = dadosAgencia;
    }
}
