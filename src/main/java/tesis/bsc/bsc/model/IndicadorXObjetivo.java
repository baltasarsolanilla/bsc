package tesis.bsc.bsc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;



@Entity
@IdClass(IndicadorXObjetivoId.class)
public @Data class IndicadorXObjetivo {
	@Id 
	@ManyToOne
	@JoinColumn(name = "indicador_id", referencedColumnName = "id")
	private Indicador indicador;
	
	@Id 
	@ManyToOne
	@JoinColumn(name = "objetivo_id", referencedColumnName = "id")
	private Objetivo objetivo;
	
	private float peso;

}
