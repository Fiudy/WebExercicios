package Lista13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pratos")
public class PratoController {

    @Autowired
    private PratoRepository pratoRepository;


    @GetMapping
    public List<Prato> listarPratos() {
        return pratoRepository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Prato> obterPratoPorId(@PathVariable Long id) {
        Optional<Prato> prato = pratoRepository.findById(id);
        return prato.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping
    public ResponseEntity<Prato> criarPrato(@RequestBody Prato prato) {
        Prato novoPrato = pratoRepository.save(prato);
        return new ResponseEntity<>(novoPrato, HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Prato> atualizarPrato(@PathVariable Long id, @RequestBody Prato pratoAtualizado) {
        Optional<Prato> pratoExistente = pratoRepository.findById(id);
        return pratoExistente.map(prato -> {
            prato.setNome(pratoAtualizado.getNome());
            prato.setIngredientes(pratoAtualizado.getIngredientes());
            prato.setTipo(pratoAtualizado.getTipo());
            pratoRepository.save(prato);
            return new ResponseEntity<>(prato, HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPrato(@PathVariable Long id) {
        Optional<Prato> pratoExistente = pratoRepository.findById(id);
        if (pratoExistente.isPresent()) {
            pratoRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
