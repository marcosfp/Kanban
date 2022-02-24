package des.kanban.entidades;

import java.util.List;

public class Usuario {

	Long id_usuario;
	String password;
	String nombre_usuario;
	
	List<Proyecto> proyectos;
	
	List<Tarea> tareas;

	
}
