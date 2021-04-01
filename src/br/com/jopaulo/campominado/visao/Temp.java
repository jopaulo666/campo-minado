package br.com.jopaulo.campominado.visao;

import br.com.jopaulo.campominado.modelo.Tabuleiro;

public class Temp {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);

		tabuleiro.registrarObservador(e -> {
			if (e.isGanhou()) {
				System.out.println("Parabéns, você ganhou");
			}
			System.out.println("Poxa, você perdeu");
		});

		tabuleiro.abrir(2, 2);
	}

}
