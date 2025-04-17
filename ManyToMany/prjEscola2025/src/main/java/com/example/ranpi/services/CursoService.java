package com.example.ranpi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ranpi.entitis.Curso;
import com.example.ranpi.repositories.CursoRepository;

@Service
public class CursoService {
	private final CursoRepository cursoRepository;
	
	@Autowired
	public CursoService(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}
	
	public Curso findCursoByid(Long id) {
		Optional<Curso> curso = cursoRepository.findById(id);
		return curso.orElse(null);
	}
	
	public List<Curso> findAllCursos() {
		return cursoRepository.findAll();
	}
	
	public Curso saveCursos(Curso curso) {
		return cursoRepository.save(curso);
		
	}

}
