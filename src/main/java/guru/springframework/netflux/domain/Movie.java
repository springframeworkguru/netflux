package guru.springframework.netflux.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jt on 2/28/21.
 */
@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {
    private String id;

    @NonNull
    private String title;
}
