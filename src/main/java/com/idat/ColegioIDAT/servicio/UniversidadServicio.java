package com.idat.ColegioIDAT.servicio;

import java.util.List;

import com.idat.ColegioIDAT.dto.UniversidadDTORequest;
import com.idat.ColegioIDAT.dto.UniversidadDTOResponse;

public interface UniversidadServicio {
	
	public void guardarUniversidad(UniversidadDTORequest universidad);
	public void editarUniversidad(UniversidadDTORequest universidad);
	
	public void eliminarUniversidad(Integer id);
	
	public List<UniversidadDTOResponse> listarUniversidad();
	public UniversidadDTOResponse obtenerUniversidadId(Integer id);

}
