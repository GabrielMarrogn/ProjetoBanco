
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Agencia agencia = new Agencia();

        //Para fins de demostração uma agencia já estara castrado no progama
        agencia.setNumeroAgencia(6666);
        agencia.setNumeroConta(12345678);
        agencia.setSaldo(2000.00);
        agencia.setTitularConta(cliente);
        agencia.setNomegerente("Carlos silva Santos");


        //Construindo uma pequena interface para casdatra daos
        System.out.println("Bem vindo");
        System.out.println("Por favor se cardastre para poder usar nossos servisos");
        System.out.println("");

        //Cadastra nome
        System.out.println("Insira seu nome:");
        String nome = sc.next();
        cliente.setName(nome);

        //Cadastra idade
        System.out.println("Insira sua idade");
        int idade = sc.nextInt();
        cliente.setAge(idade);

        //Cadastra Cpf
        System.out.println("Insira CPF");
        String CPF = sc.next();
        cliente.setCPF(CPF);

        System.out.println("Quanto deseja depositar para abrir sua conta:");
        double conta = sc.nextDouble();
        agencia.setSaldo(conta);


        //Daodos da agencia
        cliente.setDadosAgencia(agencia);

        System.out.println("Deeja Cadastra um endereco. 1 para SIM, 2 para NÃO");
        int resposta = sc.nextInt();
        if (resposta == 1){
            //Criar um pequeno sistema de cadastra endereço
        }
        else{
            System.out.println("Ok, Vamos em frente");
            System.out.println("");
        }


        //Loop para usar as funções da agencia
        int i = 0;
        while(i < 1) {
            double depositar;
            double sacar;

            System.out.println("");
            System.out.println("Por favor selecione sua ação");
            System.out.println("");
            System.out.println("1 para checar Saldo");
            System.out.println("2 para Depositar");
            System.out.println("3 para Sacar");
            System.out.println("4 para ver daos da agencia");
            System.out.println("5 para encerar as operações");

            System.out.println("");

             int operacao = sc.nextInt();

             //Relizar a operacao pegar saldo
            if (operacao == 1){
                System.out.println("");
                System.out.println("Seu saldo é e: R$" +agencia.getConta()); 
                System.out.println("");
            }

            //Realixar operacao depositar
            else if (operacao == 2){
                System.out.println("");
                System.out.println("Por favor insira o valor depositado");
                depositar = sc.nextDouble();
                

                System.out.print("Deposito realizado seu saldo é de agora: R$");
                System.out.println(agencia.depositar(depositar));
                System.out.println("");
            }

            //realizar operacao sacar
            else if (operacao == 3){
                System.out.println("");
                System.out.println("por favor insira o valor a ser sacado:");
                sacar = sc.nextDouble();
                
                System.out.print("Saque realizado seu saldo é de: R$ ");
                System.out.println(agencia.sacar(sacar));
                System.out.println("");
            } 
            else if (operacao == 4){
                System.out.println("");
                System.out.println("Esse é o numero da sua agencia");
                System.out.println(agencia.getNumeroAgencia());
                System.out.println("Esse é o numero da sua conta");
                System.out.println(agencia.getNumeroConta());
                System.out.println("Esse é o nome do seu genrente");
                System.out.println(agencia.getNomegerente());
            
            }
            
            else if (operacao == 5){
                break;
            } 
            
            else {
                System.out.println("Numero invalido, por favor digite um numero valido");
            }
        }

        System.out.println("Obrigado por usar nossos Servisos " +cliente.getName());
          

        sc.close();
    
}
}
