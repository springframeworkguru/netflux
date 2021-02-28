package guru.springframework.netflux.repositories;

import guru.springframework.netflux.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by jt on 2/28/21.
 */
public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
