package ProjetoBancoDigitalDio;

public interface iConta {
	//interface é uma classe abstrata contendo todos os metodos abstratos
	//metodo que as classe teram que seguir
	void sacar(double valor); 
	void depositar(double valor); 
	void transferir(double valor, Conta contaDestino);
	void imprimirExtrato();
}
