package tesis.bsc.bsc.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tesis.bsc.bsc.model.Objetivo;

@RepositoryRestResource(collectionResourceRel = "Objetivo", path = "Objetivo")
	public interface ObjetivoRepository extends CrudRepository<Objetivo, Integer> {

}