package ProjetoBancoDigitalDio;
//class conta recebe a implementação da classe interface
//toda classe abstract n pode ser implemnetada só atraves dos filhos
// herança >> o que só o pai sabe é privado já o que ele contou só pra vc é protected e o que todos sabem é public

public abstract class Conta implements iConta{
	//protected tem relação com herança onde class filha tem acesso a metodos da mae
	protected int agencia;
	protected int numero;
	protected double saldo;

	
	//o sequencial e agencia padrão são usados como controle das contas poup e corrente
	private static final int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 1;
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	
	
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;//ou saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;//ou saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		// é sacar d uma conta e depositar em outra
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
}
