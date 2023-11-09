package kinoplex;

public abstract class Usuario {

	public static void main(String[] args) {
		protected int idUsuario;
		protected String email;
		protected String nome; 
		protected String senha;

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
		
		public String toString() {
			return "to do";
		}
	}

}
