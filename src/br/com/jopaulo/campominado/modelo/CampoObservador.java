package br.com.jopaulo.campominado.modelo;

@FunctionalInterface
public interface CampoObservador {

	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
