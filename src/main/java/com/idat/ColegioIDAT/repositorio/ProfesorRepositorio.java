package com.idat.ColegioIDAT.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ColegioIDAT.model.Profesor;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Integer> {

}
