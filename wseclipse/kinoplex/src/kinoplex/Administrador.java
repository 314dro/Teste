package kinoplex;

public class Administrador extends Usuario {
	

	public Administrador(String email, String nome, String senha, int indentificacao, int formaDePagamento) {
		super(email, nome, senha, indentificacao, formaDePagamento);
		this.indentificacao = indentificacao;
		this.formaDePagamento = formaDePagamento;
	}

	public String toString() {
		return "Administrador [indentificacao=" + indentificacao + ", getIndentificacao()=" + getIndentificacao() + "]";
	}

		private int indentificacao;

		public int getIndentificacao() {
			return indentificacao;
		}

		public void setIndentificacao(int indentificacao) {
			this.indentificacao = indentificacao;
		}

}
