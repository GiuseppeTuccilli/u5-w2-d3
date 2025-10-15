package giuseppetuccilli.u5_w2_d3.autore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {
    @Autowired
    private AutoreService autoreService;

    @GetMapping
    public List<Autore> getAutori() {
        return autoreService.fidAll();
    }

    @GetMapping("/{autId}")
    public Autore getAutore(@PathVariable int autId) {
        return autoreService.findById(autId);
    }

    @PostMapping
    public Autore postAutore(@RequestBody AutorePayload body) {
        return autoreService.saveAutore(body);
    }

    @PutMapping("/{autId}")
    public Autore editAutore(@PathVariable int autId, @RequestBody AutorePayload body) {
        return autoreService.editAutore(autId, body);
    }

    @DeleteMapping("/{autId}")
    public void deleteAutore(@PathVariable int autId) {
        autoreService.deleteAutore(autId);
        System.out.println("autore eliminato");
    }
}
