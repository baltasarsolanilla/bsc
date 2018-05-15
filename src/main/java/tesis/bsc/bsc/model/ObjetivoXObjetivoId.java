package tesis.bsc.bsc.model;

import java.io.Serializable;

import lombok.Data;

public @Data class ObjetivoXObjetivoId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int objetivoAfectado;
	private int objetivoAfectante;
}
