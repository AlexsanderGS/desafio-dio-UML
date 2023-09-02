package FuncoesIphone;

import Aparelho.musica.ReprodutorMusical;
import Aparelho.navegador.NavegadorInternet;
import Aparelho.telefone.AparelhoTelefonico;

public class FuncoesIphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

	@Override
	public void ligar() {
		System.out.println("Ligando via Iphone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo via Iphone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz via Iphone");
		
	}

	@Override
	public void pagina() {
		System.out.println("Página da internet aberta via Iphone");
		
	}

	@Override
	public void adicionandoNovaPagina() {
		System.out.println("Adicionando nova página da internet via Iphone");
		
	}

	@Override
	public void atualizaPagina() {
		System.out.println("Atualizando página da internet via Iphone");
		
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música via Iphone");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música via Iphone");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música via Iphone");
		
	}

}
