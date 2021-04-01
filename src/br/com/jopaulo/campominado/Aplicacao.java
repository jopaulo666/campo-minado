package br.com.jopaulo.campominado;

import br.com.jopaulo.campominado.modelo.Tabuleiro;
import br.com.jopaulo.campominado.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);

	}
}
