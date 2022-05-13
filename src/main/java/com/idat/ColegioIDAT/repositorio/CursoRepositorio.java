package com.idat.ColegioIDAT.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ColegioIDAT.model.Curso;


@Repository
public interface CursoRepositorio extends JpaRepository<Curso, Integer> {

}
