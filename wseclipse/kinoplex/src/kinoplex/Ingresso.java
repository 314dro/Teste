package kinoplex;

public class Ingresso {
	
	private double preco;
	private String assento;
	private String tipoDeIngresso;
	
	public Ingresso(double preco, String assento, String tipoDeIngresso2) {
		super();
		this.preco = preco;
		this.tipoDeIngresso = tipoDeIngresso2;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String escolhaDeAssento) {
		this.assento = escolhaDeAssento;
	}		
	public String toString() {
		return "Ingresso: Preço = " + preco + ", Assento = " + assento + ", Tipo De Ingresso = " + tipoDeIngresso;
	}

	public String getTipoDeIngresso() {
		return tipoDeIngresso;
	}

	public void setTipoDeIngresso(String tipoDeIngresso) {
		this.tipoDeIngresso = tipoDeIngresso;
	}
}
