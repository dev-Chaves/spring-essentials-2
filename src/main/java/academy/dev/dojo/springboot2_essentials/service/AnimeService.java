package academy.dev.dojo.springboot2_essentials.service;

import academy.dev.dojo.springboot2_essentials.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Service
public class AnimeService {

    private static List<Anime> animes;

    static {
        animes = new ArrayList<>(List.of(new Anime("Berserk", 1L), new Anime("Monster", 2L)));
    }

    public List<Anime> listAll(){
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream()
                .filter(anime -> (long) anime.getId() == id)
                .findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Anime not Found"));
        };

    public Anime save(Anime anime){

        anime.setId(ThreadLocalRandom.current().nextLong(3, 1000));
        animes.add(anime);
        return anime;
    }

    }