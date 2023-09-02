package Iphone7;

import Aparelho.musica.ReprodutorMusical;
import Aparelho.navegador.NavegadorInternet;
import Aparelho.telefone.AparelhoTelefonico;
import FuncoesIphone.FuncoesIphone;

public class Program {

	public static void main(String[] args) {

		FuncoesIphone funcoes = new FuncoesIphone();
		ReprodutorMusical musica = (ReprodutorMusical) funcoes;
		AparelhoTelefonico telefonico = (AparelhoTelefonico) funcoes;
		NavegadorInternet internet = (NavegadorInternet) funcoes;

		System.out.println("Reprodutor Musical");
		musica.selecionarMusica();
		musica.tocar();
		musica.pausar();
		System.out.println(" ");

		System.out.println("Ligações");
		telefonico.ligar();
		telefonico.atender();
		telefonico.iniciarCorreioVoz();
		System.out.println(" ");

		System.out.println("Acesso á Internet");
		internet.pagina();
		internet.adicionandoNovaPagina();
		internet.atualizaPagina();

	}

}
