package kinoplex;

public class Sessao {

		private int numSala;
		private String data;
		private String hora;
		private String filme;
		
		public Sessao(int numSala, String data, String hora, String filme) {
			this.numSala = numSala;
			this.data = data;
			this.hora = hora;
			this.filme = filme;
		}
		public int getNumSala() {
			return numSala;
		}
		public void setNumSala(int numSala) {
			this.numSala = numSala;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getHora() {
			return hora;
		}
		public void setHora(String hora) {
			this.hora = hora;
		}
		public String getFilme() {
			return filme;
		}
		public void setFilme(String filme) {
			this.filme = filme;
		}
		
		public String toString() {
			return "Sessao Número da Sala = " + numSala + ", Data = " + data + ", Horário = " + hora + ", Filme = " + filme;
		}


}
