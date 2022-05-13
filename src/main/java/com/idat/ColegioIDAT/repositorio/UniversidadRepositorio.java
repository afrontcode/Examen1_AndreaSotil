package com.idat.ColegioIDAT.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ColegioIDAT.model.Universidad;

@Repository
public interface UniversidadRepositorio extends JpaRepository<Universidad, Integer> {

}
