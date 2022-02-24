package des.kanban.modelo;

import org.springframework.data.repository.PagingAndSortingRepository;

import des.kanban.entidades.Usuario;

public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{

	Usuario findByNombre_usuario(String nombre_usuario);
	
}
