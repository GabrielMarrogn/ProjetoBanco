public class Agencia extends DadosAgencia {

    private int numeroConta;
    private Double saldo;
    private Cliente titularConta;

    //Getters
    
    
    public int getNumeroConta() {
        return numeroConta;
    }
    public Double getSaldo() {
        return saldo;
    }
    public Cliente getTitularConta() {
        return titularConta;
    }

    //Setters
    
   
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void setTitularConta(Cliente titularConta) {
        this.titularConta = titularConta;
    }

    public Agencia(){
        titularConta = new Cliente();
    }


    //Metodo para depositar dinheiro na conta
    public Double depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
        return saldo;
    }

    //Metodo para sacar dinheiro da conta
    public double sacar (double valorSaque){
        if (saldo > valorSaque){
            saldo = saldo - valorSaque;
        }
        else {
            System.out.println("Saque imposivel");
            System.out.print("Saldo Atual: R$");
        }
        return saldo;
    }

    //verificar saldo da conta 
    public Double getConta(){
        return saldo;
    }
}
