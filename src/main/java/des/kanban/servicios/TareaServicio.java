package des.kanban.servicios;

import des.kanban.entidades.Tarea;

public interface TareaServicio {

	public Tarea obtenerTareaPorId(Long idTarea);
	
	public Tarea crearTarea(Long idProyecto,Tarea tarea);
	
	public Boolean  borrarTarea(Tarea tarea);
	
	public Tarea modificarTarea(Tarea tarea);
	
	
	
}
