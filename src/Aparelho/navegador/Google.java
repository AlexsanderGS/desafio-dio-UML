package Aparelho.navegador;

public class Google implements NavegadorInternet {

	@Override
	public void pagina() {
		System.out.println("Página do Google aberta!");
		
	}

	@Override
	public void adicionandoNovaPagina() {
		System.out.println("Adicionando nova página");
		
	}

	@Override
	public void atualizaPagina() {
		System.out.println("Atualizando página");
		
	}

}
