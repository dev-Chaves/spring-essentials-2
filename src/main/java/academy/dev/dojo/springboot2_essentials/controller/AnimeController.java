package academy.dev.dojo.springboot2_essentials.controller;

import academy.dev.dojo.springboot2_essentials.domain.Anime;
import academy.dev.dojo.springboot2_essentials.service.AnimeService;
import academy.dev.dojo.springboot2_essentials.util.DataUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

//    private final DataUtil dateUtil;

    private final AnimeService animeService;

    // fazer injeção de dependencia

    @GetMapping()
    public List<Anime> list(){
//        log.info("Requisição recebida em: {}", dateUtil.formatLocalDataTimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }
}
