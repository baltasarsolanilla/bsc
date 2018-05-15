package tesis.bsc.bsc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import lombok.Data;


/*
 * Esta tabla es para verificar la herramienta antes de la integración.
 * No tiene umbrales, sus valores van de 0-10.
 */

@Entity
public @Data class Indicador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private float valor;
	
	@OneToMany(mappedBy = "indicador")
	private List<IndicadorXObjetivo> objetivosAsociados;
}
