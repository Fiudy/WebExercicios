package Lista13;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface repository extends CrudRepository<Prato, Long>{

	//Consulta pelo Id, retorna usuarios
	Optional<Prato> findById(Long id);

}

