package Aparelho.musica;

public class Mp3 implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Reproduzindo musica");

	}

	@Override
	public void pausar() {
		System.out.println("Musica Pausada");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecione a musica");

	}

}
