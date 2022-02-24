package des.kanban.servicios;

import des.kanban.entidades.Proyecto;

public interface ProyectoServicio {

	public Proyecto obtenerProyectoPorId(Long idProyecto);
	
	public Proyecto crearProyecto(Proyecto proyecto);
	
	public Boolean  borrarProyecto(Proyecto proyecto);
	
	public Proyecto modificarProyecto(Proyecto proyecto);
	
	
}