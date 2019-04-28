package edu.unicen.tallerjava.demodocker.usuario;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "usuario", path = "users")
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

	List<Usuario> findByLastName(@Param("name") String name);

}