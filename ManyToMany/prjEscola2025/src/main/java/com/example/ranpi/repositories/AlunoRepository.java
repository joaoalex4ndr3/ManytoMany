package com.example.ranpi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ranpi.entitis.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
