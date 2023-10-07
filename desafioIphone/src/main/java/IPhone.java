	package main.java;

import main.java.AparelhoCelular.Celular;
import main.java.Navegador.Internet;
import main.java.ReprodutorMusica.Musica;
import main.java.Telefone.AparelhoTelefonico;

public class IPhone extends Celular implements AparelhoTelefonico, Internet, Musica {
	
	public IPhone(boolean ligado) {
		super(ligado);
	}

	@Override
	public void tocar() {
		System.out.println("Reprodução resumida");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Faixa " + musica + " selecionada.");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo: " + url);
	}

	@Override
	public void adicionarNovaAba(String novaUrl) {
		System.out.println("Nova aba aberta: " + novaUrl);
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação.");
	}

	@Override
	public void iniciarCorreioVoz(int nrMensagens) {
		System.out.println("Acessando o Correio de Voz. Você tem " + nrMensagens + " mensagens de voz.");
	}

	@Override
	public void ligarAparelho() {
		this.ligado = true;
	}

	@Override
	public void desligar() {
		this.ligado = false;
	}

}
