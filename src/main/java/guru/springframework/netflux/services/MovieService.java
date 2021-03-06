package guru.springframework.netflux.services;

import guru.springframework.netflux.domain.Movie;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by jt on 3/6/21.
 */
public interface MovieService {

    Mono<Movie> getMovieById(String id);

    Flux<Movie> getAllMovies();

}
