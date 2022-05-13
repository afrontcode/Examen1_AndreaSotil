package com.idat.ColegioIDAT.servicio;

import java.util.List;

import com.idat.ColegioIDAT.dto.ProfesorDTORequest;
import com.idat.ColegioIDAT.dto.ProfesorDTOResponse;

public interface ProfesorServicio {
	public void guardarProfesor(ProfesorDTORequest profesor);
	public void editarProfesor(ProfesorDTORequest profesor);
	
	public void eliminarProfesor(Integer id);
	
	public List<ProfesorDTOResponse> listarProfesor();
	public ProfesorDTOResponse obtenerProfesorId(Integer id);

}
