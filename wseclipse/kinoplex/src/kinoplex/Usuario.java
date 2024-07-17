package kinoplex;

public class Usuario {

		protected int idUsuario;
		protected String email;
		protected String nome; 
		protected String senha;
		protected int formaDePagamento;

		public Usuario(String email, String nome, String senha, int idUsuario, int formaDePagamento) {
			this.idUsuario = idUsuario;
			this.email = email;
			this.nome = nome;
			this.senha = senha;
			this.formaDePagamento = formaDePagamento;
		}


		public int getidUsuario() {
			return idUsuario;
		}


		public void set(int idUsuario) {
			this.idUsuario = idUsuario;
		}


		public String getemail() {
			return email;
		}


		public void setemail(String email) {
			this.email = email;
		}


		public String getnome() {
			return nome;
		}


		public void setnome(String nome) {
			this.nome = nome;
		}


		public String getsenha() {
			return senha;
		}


		public void setNumTel(String senha) {
			this.senha = senha;
		}


		@Override
		public String toString() {
			return "Usuario E-mail = " + email + ", nome = " + nome + ", senha = " + senha + ", Indentificação = " + idUsuario;
		}
		
}
