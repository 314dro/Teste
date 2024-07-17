package kinoplex;

import java.util.ArrayList;
import java.util.List;

public class Dados {
	public String toString() {
	    return "Dados [ingressos=" + ingressos + ", sessões=" + sessoes + ", filmes=" + filmes + ", usuarios=" + usuarios
	            + ", Quantidade de Ingressos=" + qtdIngresso + ", Quantidade de Sessões=" + qtdSessao
	            + ", Quantidade de Filmes=" + qtdFilme + ", Quantidade de usuários=" + qtdUsuario + "]";
	}
	
	private List<Sessao> sessoes = new ArrayList<>();
    private List<Ingresso> ingressos = new ArrayList<>();
    private List<Filme> filmes = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private int qtdIngresso = 0;
    private int qtdSessao = 0;
    private int qtdFilme = 0;
    private int qtdUsuario = 0;

    

	public List<Sessao> getSessoes() {
		return sessoes;
	}



	public void setSessoes(List<Sessao> sessoes) {
		this.sessoes = sessoes;
	}



	public List<Ingresso> getIngressos() {
		return ingressos;
	}



	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}



	public List<Filme> getFilmes() {
		return filmes;
	}



	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}



	public List<Usuario> getUsuarios() {
		return usuarios;
	}



	public void setUsuarios(List<Usuario> usuarios) {
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



	public void preencherDados() {
        for (int i = 0; i < 9; i++) {
            String s = String.valueOf(i);

            sessoes.add(new Sessao(i, "Data: 25/".concat(s) + "/2023", "Horário: ".concat(s) + ":00",
                    "Filme: Filme Genérico".concat(s)));
            ingressos.add(new Ingresso(i, "A1".concat(s), "Tipo".concat(s)));
            filmes.add(new Filme(" Título Genérico".concat(s), " Gênero Genérico".concat(s),
                    "Sinópse: Sinópse Genérica".concat(s), false));
            usuarios.add(new Usuario("User".concat(s) + "@gmail.com", "Nome Genérico".concat(s),
                    "Identificação".concat(s), i, i));

            qtdIngresso++;
            qtdSessao++;
            qtdFilme++;
            qtdUsuario++;
        }
    }

}
