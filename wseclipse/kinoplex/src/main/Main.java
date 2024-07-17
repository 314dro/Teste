package main;

import java.util.List;
import java.util.Scanner;

import kinoplex.Dados;
import kinoplex.Filme;
import kinoplex.Ingresso;
import kinoplex.Sessao;
import kinoplex.Usuario;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static Dados dados = new Dados();

	public static void main(String[] args) {
		int entrada1 = -1;
		int aux1 = 0;
		int entrada2 = -1;
		int indentificacao;

		/*System.out.println("Digite seus dados: ");
		System.out.println("E-mail: ");
		String email = sc.nextLine();
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Senha: ");
		String senha = sc.nextLine();*/
		System.out.println("Indentificação: (0 para administrador, qualquer outro valor para cliente)");
		indentificacao = sc.nextInt();
		/*System.out.println("Forma de Pagamento: (Sendo 1 para débito, 2 para crédito e 3 para pix, 4 para boleto, 5 para depósito bancário, 6 para dinheiro, 7 para cupom, 8 para carnê, 9 para especial. Caso administrador digite 0");
		int formaDePagamento = sc.nextInt();*/

		if (indentificacao == 0) {
			dados.preencherDados();
			while (entrada1 != 0) {
				System.out.println(imprimirMenuAdm());
				entrada1 = sc.nextInt();
				switch (entrada1) {
				case 0:
					System.out.println("Obrigado por utilizar o sistema. Até logo!");
					break;
				case 1:
					cadastrarUsuario();
					break;
				case 2:
					removerUsuario();
					break;
				case 3:
					System.out.println("Escolha um dos usuários a seguir para editar as informações:\n");
					listarUsuario();
					aux1 = sc.nextInt();
					Usuario u = lerDadosUsuario();
					editar(aux1, u);
					break;
				case 4:
					listarUsuario();
					break;
				case 5:
					cadastrarIngresso();
					break;
				case 6:
					System.out.println("Digite o número do ingresso a ser removido:\n ");
					listarIngressos(dados);
					aux1 = sc.nextInt();
					removerIngresso(dados, aux1);
					break;
				case 7:
					System.out.println("Escolha um dos ingressos a seguir para editar as informações:\n");
					listarIngressos(dados);
					aux1 = sc.nextInt();
					Ingresso i = lerDadosIngresso();
					editarIngresso(dados, aux1, i);
					break;
				case 8:
					listarIngressos(dados);
					break;
				case 9:
					cadastrarFilme();
					break;
				case 10:
					removerFilme();
					break;
				case 11:
					System.out.println("Escolha um dos filmes a seguir para editar as informações:\n");
					listarFilmes();
					aux1 = sc.nextInt();
					Filme f = lerDadosFilme();
					editarFilme(aux1, f);
					break;
				case 12:
					listarFilmes();
					break;
				case 13:
					sc.nextLine();
					System.out.println("Digite por qual gênero pretende buscar");
					String x = sc.nextLine();
					listarFilmesPorGenero(dados, x);
					break;
				case 14:
					cadastrarSessao();
					break;
				case 15:
					removerSessao();
					break;
				case 16:
					System.out.println("Escolha uma das sessões a seguir para editar as informações:\n");
					listarSessoes();
					aux1 = sc.nextInt();
					Sessao s = lerDadosSessao();
					editarSessao(aux1, s);
					break;
				case 17:
					listarSessoes();
					break;

				default:
					System.out.println("\nOpção Inválida!\n");
					break;
				}
			}
		} else {
			dados.preencherDados();
			while (entrada2 != 0) {
				System.out.println(imprimirMenuC());
				entrada2 = sc.nextInt();
				switch (entrada2) {
				case 0:
					System.out.println("Obrigado por utilizar o sistema. Até logo!");
					break;
				case 1:
					removerUsuario();
					break;
				case 2:
					listarUsuario();
					break;
				case 3:
					listarIngressos(dados);
					break;
				case 4:
					listarFilmes();
					break;
				case 5:
					sc.nextLine();
					System.out.println("Digite por qual gênero pretende buscar");
					String x = sc.nextLine();
					listarFilmesPorGenero(dados, x);
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
				}
			}
		}

	}

	public static String imprimirMenuAdm() {
		String saida = new String("Escolha uma das opções a seguir:\n");
		saida = saida + "0 - Sair da aplicacao\n";
		saida = saida + "1 - Cadastrar novo usuário\n";
		saida = saida + "2 - Remover usuário existente\n";
		saida = saida + "3 - Editar usuário existente\n";
		saida = saida + "4 - Listar usuários\n";
		saida = saida + "5 - Cadastrar ingresso\n";
		saida = saida + "6 - Remover ingresso existente\n";
		saida = saida + "7 - Editar ingresso existente\n";
		saida = saida + "8 - Listar ingressos\n";
		saida = saida + "9 - Cadastrar filme\n";
		saida = saida + "10 - Remover filme existente\n";
		saida = saida + "11 - Editar filme existente\n";
		saida = saida + "12 - Listar filmes\n";
		saida = saida + "13 - Buscar filmes por genero\n";
		saida = saida + "14 - Cadastrar sessão\n";
		saida = saida + "15 - Remover sessão existente\n";
		saida = saida + "16 - Editar sessão\n";
		saida = saida + "17 - Listar sessão\n";
		return saida;
	}

	public static String imprimirMenuC() {
		String saida = new String("Escolha uma das opções a seguir:\n");
		saida = saida + "0 - Sair da aplicacao\n";
		saida = saida + "1 - Listar usuários\n";
		saida = saida + "2 - Listar ingressos\n";
		saida = saida + "3 - Listar filmes\n";
		saida = saida + "4 - Buscar filmes por gênero\n";
		return saida;
	}

	public static void cadastrarUsuario() {
		if (dados.getQtdUsuario() < 100) {
			Usuario u = lerDadosUsuario();
			dados.setQtdUsuario(dados.getQtdUsuario() + 1);
			dados.getUsuarios().add(u);
			System.out.println("Usuário cadastrado com sucesso");
		} else {
			System.out.println("Não foi possível cadastrar o usuário");
		}
	}

	public static Usuario lerDadosUsuario() {

		String email;
		String nome;
		String senha;
		int indentificacao;
		int formaDePagamento;

		sc.nextLine();

		System.out.println("Digite o seu e-mail: ");
		email = sc.nextLine();
		System.out.println("Digite o seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite sua senha: ");
		senha = sc.nextLine();
		System.out.println("Se você for um administrador difite sua indentificação, caso contrário, digite 0: ");
		indentificacao = sc.nextInt();
		System.out.println(
				"Se você for um cliente digite sua forma de pagamento, sendo 1 para débito, 2 para crédito e 3 para pix, 4 para boleto, 5 para depósito bancário, 6 para dinheiro, 7 para cupom, 8 para carnê, 9 para especial; caso contrário, digite 0: ");
		formaDePagamento = sc.nextInt();

		if (indentificacao != 0) {

			Usuario u = new Usuario(email, nome, senha, indentificacao, formaDePagamento);
			return u;
		} else {
			Usuario u = new Usuario(email, nome, senha, 0, formaDePagamento);
			return u;
		}
	}

	public static void removerUsuario() {
		System.out.println("Digite o número do usuário a ser removido: ");
		listarUsuario();
		int i = sc.nextInt();

		if (i >= 0 && i < dados.getQtdUsuario()) {
			dados.getUsuarios().remove(i);
			dados.setQtdUsuario(dados.getQtdUsuario() - 1);
			System.out.println("Usuário removido com sucesso.");
		} else {
			System.out.println("O usuário escolhido não existe.");
		}
	}

	public static void swapListaUsuarios(int x) {
		List<Usuario> usuarios = dados.getUsuarios();

		for (int i = x; i < dados.getQtdUsuario() - 1; i++) {
			usuarios.set(i, usuarios.get(i + 1));
		}

		usuarios.remove(dados.getQtdUsuario() - 1);
		dados.setQtdUsuario(dados.getQtdUsuario() - 1);
	}

	public static void editar(int i, Usuario u) {
		List<Usuario> usuarios = dados.getUsuarios();

		if (i < dados.getQtdUsuario() && i >= 0) {
			usuarios.set(i, u);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Número escolhido é inválido");
		}
	}

	public static void listarUsuario() {
		List<Usuario> usuarios = dados.getUsuarios();
		sc.nextLine();

		for (int i = 0; i < dados.getQtdUsuario(); i++) {
			System.out.println(i + " -> " + usuarios.get(i).toString());
		}
	}

	public static Ingresso lerDadosIngresso() {
		System.out.println("Digite o preço do ingresso: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o assento do ingresso: ");
		String assento = sc.nextLine();
		System.out.println("Digite o tipo de ingresso (meia/inteira): ");
		String tipoDeIngresso = sc.nextLine();

		return new Ingresso(preco, assento, tipoDeIngresso);
	}

	public static void cadastrarIngresso() {
		Ingresso novoIngresso = lerDadosIngresso();
		dados.getIngressos().add(novoIngresso);
		dados.setQtdIngresso(dados.getQtdIngresso() + 1);
		System.out.println("Ingresso cadastrado com sucesso!");
	}

	public static void removerIngresso(Dados d, int indice) {
		if (indice >= 0 && indice < d.getQtdIngresso()) {
			d.getIngressos().remove(indice);
			d.setQtdIngresso(d.getQtdIngresso() - 1);
			System.out.println("Ingresso removido com sucesso!");
		} else {
			System.out.println("Índice inválido!");
		}
	}

	public static void editarIngresso(Dados d, int i, Ingresso novoIngresso) {
		if (i >= 0 && i < d.getQtdIngresso()) {
			d.getIngressos().set(i, novoIngresso);
			System.out.println("Ingresso editado com sucesso!");
		} else {
			System.out.println("Índice inválido!");
		}
	}

	public static void cadastrarFilme() {
		Filme f = lerDadosFilme();

		if (dados.getQtdFilme() < 100) {
			dados.getFilmes().add(f);
			dados.setQtdFilme(dados.getQtdFilme() + 1);
			System.out.println("Filme cadastrado com sucesso!\n");
		} else {
			System.out.println("Não foi possível cadastrar o filme!\n");
		}
	}

	public static Filme lerDadosFilme() {
		sc.nextLine();
		System.out.println("Digite o título do filme:");
		String titulo = sc.nextLine();
		System.out.println("Digite o gênero do filme:");
		String genero = sc.nextLine();
		System.out.println("Digite a sinopse do filme:");
		String sinopse = sc.nextLine();

		return new Filme(titulo, genero, sinopse, false);
	}

	public static void removerFilme() {
		System.out.println("Escolha um dos filmes a seguir para ser removido:\n");
		listarFilmes();
		int i = sc.nextInt();

		if (i < dados.getQtdFilme() && i >= 0) {
			swapListaFilmes(i);
			dados.getFilmes().remove(dados.getQtdFilme() - 1);
			dados.setQtdFilme(dados.getQtdFilme() - 1);
			System.out.println("Filme removido com sucesso");
		} else {
			System.out.println("Você escolheu um número inválido!");
		}
	}

	public static void swapListaFilmes(int index) {
		List<Filme> filmes = dados.getFilmes();
		for (int i = index; i < dados.getQtdFilme() - 1; i++) {
			filmes.set(i, filmes.get(i + 1));
		}
	}

	public static void editarFilme(int index, Filme f) {
		List<Filme> filmes = dados.getFilmes();
		if (index < dados.getQtdFilme() && index >= 0) {
			filmes.set(index, f);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Você escolheu um número inválido!");
		}
	}

	public static void listarFilmes() {
		List<Filme> filmes = dados.getFilmes();
		for (int i = 0; i < dados.getQtdFilme(); i++) {
			System.out.println(i + " -> " + filmes.get(i).toString());
		}
	}

	public static void listarFilmesPorGenero(Dados dados, String genero) {
		boolean encontrouFilmes = false;

		for (Filme filme : dados.getFilmes()) {
			if (filme.getGenero().equalsIgnoreCase(genero)) {
				System.out.println(filme.toString());
				encontrouFilmes = true;
			}
		}

		if (!encontrouFilmes) {
			System.out.println("Nenhum filme encontrado para o gênero: " + genero);
		}
	}

	public static void listarIngressos(Dados d) {
		List<Ingresso> ingressos = d.getIngressos();

		for (int i = 0; i < d.getQtdIngresso(); i++) {
			System.out.println(i + " -> " + ingressos.get(i).toString());
		}
	}

	public static void cadastrarSessao() {
		Sessao s = lerDadosSessao();

		if (dados.getQtdSessao() < 100) {
			dados.getSessoes().add(s);
			dados.setQtdSessao(dados.getQtdSessao() + 1);
			System.out.println("Sessão cadastrada com sucesso!\n");
		} else {
			System.out.println("Não foi possível cadastrar a sessão!\n");
		}
	}

	public static Sessao lerDadosSessao() {
		sc.nextLine();
		System.out.println("Digite o horário da sessão:");
		String horario = sc.nextLine();
		System.out.println("Digite a sala da sessão:");
		String sala = sc.nextLine();

		return new Sessao(0, horario, sala, sala);
	}

	public static void removerSessao() {
		System.out.println("Escolha uma das sessões a seguir para ser removida:\n");
		listarSessoes();
		int i = sc.nextInt();

		if (i < dados.getQtdSessao() && i >= 0) {
			swapListaSessoes(i);
			dados.getSessoes().remove(dados.getQtdSessao() - 1);
			dados.setQtdSessao(dados.getQtdSessao() - 1);
			System.out.println("Sessão removida com sucesso!");
		} else {
			System.out.println("Você escolheu um número inválido!");
		}
	}

	private static void swapListaSessoes(int i) {

	}

	public static void editarSessao(int index, Sessao s) {
		List<Sessao> sessoes = dados.getSessoes();
		if (index < dados.getQtdSessao() && index >= 0) {
			sessoes.set(index, s);
			System.out.println("Dados da sessão editados com sucesso!");
		} else {
			System.out.println("Você escolheu um número inválido!");
		}
	}

	public static void listarSessoes() {
	    List<Sessao> sessoes = dados.getSessoes();
	    for (int i = 0; i < dados.getQtdSessao(); i++) {
	        System.out.println(i + " -> " + sessoes.get(i).toString());
	    }
	}
}