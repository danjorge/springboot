/**
 * 
 */
package br.com.alura.listavip.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.listavip.model.Convidado;

/**
 * @author daniel.souza
 *
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, Long>{

}
