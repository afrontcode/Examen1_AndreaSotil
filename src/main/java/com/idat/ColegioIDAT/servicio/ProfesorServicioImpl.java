package com.idat.ColegioIDAT.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ColegioIDAT.dto.ProfesorDTORequest;
import com.idat.ColegioIDAT.dto.ProfesorDTOResponse;
import com.idat.ColegioIDAT.model.Profesor;
import com.idat.ColegioIDAT.repositorio.ProfesorRepositorio;

@Service
public class ProfesorServicioImpl implements ProfesorServicio{

	@Autowired
	public ProfesorRepositorio repositorio;
	
	@Override
	public void guardarProfesor(ProfesorDTORequest profesor) {
		Profesor p = new Profesor();
		p.setIdProfesor(profesor.getIdProfesorDTO());
		p.setProfesor(profesor.getProfesorDTO());
		repositorio.save(p);
		
	}

	@Override
	public void editarProfesor(ProfesorDTORequest profesor) {
		Profesor p = new Profesor();
		p.setIdProfesor(profesor.getIdProfesorDTO());
		p.setProfesor(profesor.getProfesorDTO());
		repositorio.saveAndFlush(p);
		
	}

	@Override
	public void eliminarProfesor(Integer id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public List<ProfesorDTOResponse> listarProfesor() {
		List<ProfesorDTOResponse> lista = new ArrayList<ProfesorDTOResponse>();
		ProfesorDTOResponse p = null;
		
		for(Profesor profesor :repositorio.findAll()) {
			p.setIdProfesorDTO(profesor.getIdProfesor());
			p.setProfesorDTO(profesor.getProfesor());
			
			lista.add(p);
		}
		return lista;
	}

	@Override
	public ProfesorDTOResponse obtenerProfesorId(Integer id) {
		Profesor profesor = repositorio.findById(id).orElse(null);
		ProfesorDTOResponse p = new ProfesorDTOResponse();
		p.setIdProfesorDTO(profesor.getIdProfesor());
		p.setProfesorDTO(profesor.getProfesor());
		return p;
	}

}
