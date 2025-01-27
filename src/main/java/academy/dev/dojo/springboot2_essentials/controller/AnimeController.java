package academy.dev.dojo.springboot2_essentials.controller;

import academy.dev.dojo.springboot2_essentials.domain.Anime;
import academy.dev.dojo.springboot2_essentials.util.DataUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("animes")
public class AnimeController {

    private DataUtil dateUtil;

    public AnimeController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }
    // fazer injeção de dependencia

    @GetMapping(path = "list")

    public List<Anime> list(){



        return List.of(new Anime("Berserk"), new Anime("Monster")
        );
    }
}
