package com.idat.ColegioIDAT.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.ColegioIDAT.dto.MallaDTORequest;
import com.idat.ColegioIDAT.dto.MallaDTOResponse;
import com.idat.ColegioIDAT.model.MallaCurricular;
import com.idat.ColegioIDAT.repositorio.MallaRepositorio;

public class MallaServicioImpl implements MallaServicio {

	@Autowired
	public MallaRepositorio repositorio;

	@Override
	public void guardarMalla(MallaDTORequest malla) {

	       MallaCurricular m = new MallaCurricular();
			m.setIdMalla(malla.getIdMallaDTO());
			m.setAnio(malla.getAnioDTO());
			repositorio.save(m);
		
	}

	@Override
	public void editarMalla(MallaDTORequest malla) {
		MallaCurricular m = new MallaCurricular();
m.setIdMalla(malla.getIdMallaDTO());
m.setAnio(malla.getAnioDTO());
repositorio.saveAndFlush(m);
		
	}

	@Override
	public void eliminarMalla(Integer id) {
		 repositorio.deleteById(id);
		
	}

	@Override
	public List<MallaDTOResponse> listarMalla() {
		List<MallaDTOResponse> lista = new ArrayList<MallaDTOResponse>();
		MallaDTOResponse m = null;
		
		for(MallaCurricular malla :repositorio.findAll()) {
			m = new MallaDTOResponse();
			
			m.setIdMallaDTO(malla.getIdMalla());
			m.setAnioDTO(malla.getAnio());
			
			lista.add(m);
		}
		
		return lista;
	}
	

	@Override
	public MallaDTOResponse obtenerMallaId(Integer id) {
		
		MallaCurricular malla = repositorio.findById(id).orElse(null);
		MallaDTOResponse m = new MallaDTOResponse();
		m.setIdMallaDTO(malla.getIdMalla());
		m.setAnioDTO(malla.getAnio());
		
		return m;
	
	}
	
}
