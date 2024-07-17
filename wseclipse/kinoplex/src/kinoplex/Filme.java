package kinoplex;

public class Filme {

		private String titulo;
		private String genero;
		private String sinopse;
		private boolean emCartaz;
		
		public String getTitulo() {
			return titulo;
		}
		
		public Filme(String titulo, String genero, String sinopse, boolean emCartaz) {
			super();
			this.titulo = titulo;
			this.genero = genero;
			this.sinopse = sinopse;
			this.emCartaz = emCartaz;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getSinopse() {
			return sinopse;
		}
		public void setSinopse(String sinopse) {
			this.sinopse = sinopse;
		}
		public boolean isEmCartaz() {
			return emCartaz;
		}
		public void setEmCartaz(boolean emCartaz) {
			this.emCartaz = emCartaz;
		}
		public void criarFilme(String titulo,String genero,String sinopse) {
			
		}
		public String visualizarFilme(String titulo) {
			return titulo;
			
		}
		public String listarFilme() {
			return genero;
			
		}
		public String filtrarFilme(String genero) {
			return genero;
			
		}
		public String toString() {
			return "Título: " + titulo + ", Gênero: " + genero + ", Sinopse: " + sinopse ;
		}

}
