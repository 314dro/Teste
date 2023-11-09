package kinoplex;

public class Dados {

	public static void main(String[] args) {
		private Ingresso[] ingressos;
		private Sessao[] sessoes;
		private Filme[] filmes;
		private Usuario[] usuarios;
		private int qtdIngresso;
		private int qtdSessao;
		private int qtdFilme;
		private int qtdUsuario;
		public Ingresso[] getIngressos() {
			return ingressos;
		}
		public void setIngressos(Ingresso[] ingressos) {
			this.ingressos = ingressos;
		}
		public Sessao[] getSessoes() {
			return sessoes;
		}
		public void setSessoes(Sessao[] sessoes) {
			this.sessoes = sessoes;
		}
		public Filme[] getFilmes() {
			return filmes;
		}
		public void setFilmes(Filme[] filmes) {
			this.filmes = filmes;
		}
		public Usuario[] getUsuarios() {
			return usuarios;
		}
		public void setUsuarios(Usuario[] usuarios) {
			this.usuarios = usuarios;
		}
		public int getQtdIngresso() {
			return qtdIngresso;
		}
		public void setQtdIngresso(int qtdIngresso) {
			this.qtdIngresso = qtdIngresso;
		}
		public int getQtdSessao() {
			return qtdSessao;
		}
		public void setQtdSessao(int qtdSessao) {
			this.qtdSessao = qtdSessao;
		}
		public int getQtdFilme() {
			return qtdFilme;
		}
		public void setQtdFilme(int qtdFilme) {
			this.qtdFilme = qtdFilme;
		}
		public int getQtdUsuario() {
			return qtdUsuario;
		}
		public void setQtdUsuario(int qtdUsuario) {
			this.qtdUsuario = qtdUsuario;
		}
		public void retirarFilme(String titulo,String genero,String sinopse) {
		}
		public void retirarSessao(String data,String hora,String filme,int numSala) {
		}

	}

}
