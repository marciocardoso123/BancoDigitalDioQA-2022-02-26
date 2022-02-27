package ProjetoBancoDigitalDio;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(150);
		
		Conta poupanca = new ContaPoupanca();
		
		
		cc.transferir(98, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
