package kinoplex;

public class Cliente extends Usuario {

		private int formaDePagamento;
		
		public Cliente(String email, String nome, String senha, int indentificacao, int formaDePagamento) {
			super(email, nome, senha, indentificacao, formaDePagamento);
			this.formaDePagamento = formaDePagamento;
		}
		public String toString() {
			return "Cliente [formaDePagamento=" + formaDePagamento + ", idUsuario=" + idUsuario + ", email=" + email + ", nome="
					+ nome + ", senha=" + senha + ", getFormaDePagamento()=" + getFormaDePagamento()
					+ ", getidUsuario()="
					+ getidUsuario() + ", getemail()=" + getemail() + ", getnome()=" + getnome() + ", getsenha()="
					+ getsenha() + "]";
		}
		public int getFormaDePagamento() {
			return formaDePagamento;
		}
		public void setFormaDePagamento(int formaDePagamento) {
			this.formaDePagamento = formaDePagamento;
		}
		public void trocarSenha() {
			
		}
}
