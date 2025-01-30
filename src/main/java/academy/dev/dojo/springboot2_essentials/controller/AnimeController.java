package academy.dev.dojo.springboot2_essentials.controller;

import academy.dev.dojo.springboot2_essentials.domain.Anime;
import academy.dev.dojo.springboot2_essentials.service.AnimeService;
import academy.dev.dojo.springboot2_essentials.util.DataUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
public class AnimeController {

    private final DataUtil dateUtil;

    private final AnimeService animeService;

    // fazer injeção de dependencia

    public AnimeController(DataUtil dateUtil, AnimeService animeService) {
        this.dateUtil = dateUtil;
        this.animeService = animeService;
    }

    @GetMapping()
    public ResponseEntity<List<Anime>> list(){
//        log.info("Requisição recebida em: {}", dateUtil.formatLocalDataTimeToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
    }

    // Invés de Of passar Ok;
    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> findById(@PathVariable long id){
       return ResponseEntity.ok(animeService.findById(id));
    }

    // Fazer Get by Id

    // Fazer Post

    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody Anime anime) {
       return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        animeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
