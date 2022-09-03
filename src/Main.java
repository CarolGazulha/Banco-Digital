public class Main {

    public static void main(String[] args){

       Cliente caroline = new Cliente();
       caroline.setNome("Caroline");

        Conta cc = new ContaCorrente(caroline);
        cc.depositar(100);

        Conta poupanca = new Contapoupanca(caroline);

        cc.transferir(100, poupanca);

        cc.imprimirInfosComum();
        poupanca.imprimirInfosComum();
    }
}
