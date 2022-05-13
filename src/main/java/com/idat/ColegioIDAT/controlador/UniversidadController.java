package com.idat.ColegioIDAT.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ColegioIDAT.dto.UniversidadDTORequest;
import com.idat.ColegioIDAT.dto.UniversidadDTOResponse;
import com.idat.ColegioIDAT.servicio.UniversidadServicio;

@RestController
@RequestMapping("/universidad")
public class UniversidadController {
	
	@Autowired
	private UniversidadServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<UniversidadDTOResponse>> listarUniversidad(){
		
		return new ResponseEntity<List<UniversidadDTOResponse>>(servicio.listarUniversidad(), HttpStatus.CREATED);  
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody UniversidadDTORequest universidad){
		
		
		
		servicio.guardarUniversidad(universidad);
		return  new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(path = "/listar/{id}" , method = RequestMethod.GET)
	public ResponseEntity<UniversidadDTOResponse> listarPorId(@PathVariable Integer id) {
		
		UniversidadDTOResponse p = servicio.obtenerUniversidadId(id);
		if(p != null)
			return new ResponseEntity<UniversidadDTOResponse>(p, HttpStatus.OK);
		
		return new ResponseEntity<UniversidadDTOResponse>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody UniversidadDTORequest universidad){
		
		UniversidadDTOResponse p = servicio.obtenerUniversidadId(universidad.getIdUniversidadDTO());

		if(p != null) {
			servicio.editarUniversidad(universidad);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		UniversidadDTOResponse p = servicio.obtenerUniversidadId(id);
		if(p != null) {
			servicio.eliminarUniversidad(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

		
	}

}
