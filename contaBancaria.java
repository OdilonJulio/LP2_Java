package dominio;

public class ContaBancaria {

	private String cpf;

	private String agencia;

	private String conta;

	private double saldo;

	public ContaBancaria(String cpf_, String agencia_ , String conta_, String saldo_){
		cpf = cpf_;
		agencia = agencia_;
		conta = conta_;
		saldo = saldo_;
	}

	// Métodos Get's
	public void saldo(){
		System.out.println('O saldo da conta é: ' + saldo + ".");
	}
	



}