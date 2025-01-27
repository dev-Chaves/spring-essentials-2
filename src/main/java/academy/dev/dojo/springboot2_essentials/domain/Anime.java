package academy.dev.dojo.springboot2_essentials.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Anime {
    private String name;
    private long id;
}
