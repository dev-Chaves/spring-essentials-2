package academy.dev.dojo.springboot2_essentials.service;

import academy.dev.dojo.springboot2_essentials.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    public List<Anime> listAll(){
        return List.of(new Anime("Berserk", 1), new Anime("Monster", 2));
    }
}
