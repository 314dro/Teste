package kinoplex;

public class Ingresso {

	public static void main(String[] args) {
		private double preco;
		private String assento;
		private String tipoDeIngresso;
		private Sessao[] sessoes;
		
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
		public String getTipoDeIngresso() {
			return tipoDeIngresso;
		}
		public void setTipoDeIngresso(String tipoDeIngresso) {
			this.tipoDeIngresso = tipoDeIngresso;
		}
		public void criarIngresso(double preco, String assento,Sessao[] sessoes) {
			
		}
		public String visualizarIngresso(double preco, String assento,Sessao[] sessoes) {
			
		}
		public String listarIngresso() {
			
		}
		public Sessao[] getSessoes() {
			return sessoes;
		}
		public void setSessoes(Sessao[] sessoes) {
			this.sessoes = sessoes;
		}
	}

}
