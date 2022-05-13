package com.idat.ColegioIDAT.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ColegioIDAT.model.MallaCurricular;

@Repository
public interface MallaRepositorio extends JpaRepository<MallaCurricular, Integer>{

}
