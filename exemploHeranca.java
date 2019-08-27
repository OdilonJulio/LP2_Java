package dominio;

public class Pai {

	private String nomePai;

	public Pai(String nomeP){
		nomePai = nomeP;
	}

	public void nome(){
			System.out.println('O nome do Pai eh: ' + nomePai + ".");
	}

}