package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by jt on 12/23/19.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}