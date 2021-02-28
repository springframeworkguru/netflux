package guru.springframework.netflux.domain;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jt on 2/28/21.
 */
@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Movie {
    private String id;

    @NonNull
    private String title;
}
