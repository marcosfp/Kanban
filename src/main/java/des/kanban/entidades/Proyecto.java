package des.kanban.entidades;

import java.util.List;

public class Proyecto {

	Long id_proyecto;
	String nombre;
	String descripcion;
	
	List<Tarea> tareas;
	
	List<Usuario> trabajadores;

}
