package com.idat.ColegioIDAT.servicio;

import java.util.List;

import com.idat.ColegioIDAT.dto.CursoDTORequest;
import com.idat.ColegioIDAT.dto.CursoDTOResponse;

public interface CursoServicio {

	public void guardarCurso(CursoDTORequest curso);
	public void editarCurso(CursoDTORequest curso);
	
	public void eliminarCurso(Integer id);
	
	public List<CursoDTOResponse> listarCursos();
	public CursoDTOResponse obtenerCursoId(Integer id);
}
