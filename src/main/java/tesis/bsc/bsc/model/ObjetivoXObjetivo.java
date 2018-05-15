package tesis.bsc.bsc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;


@Entity
@IdClass(ObjetivoXObjetivoId.class)
public @Data class ObjetivoXObjetivo {
	@Id 
	@ManyToOne
	@JoinColumn(name = "objetivo_afectado_id", referencedColumnName = "id")
	private Objetivo objetivoAfectado;
	
	@Id 
	@ManyToOne
	@JoinColumn(name = "objetivo_afectante_id", referencedColumnName = "id")
	private Objetivo objetivoAfectante;
	
	private float peso;

}
