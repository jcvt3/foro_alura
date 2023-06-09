package com.alura.foro.ForoAlura.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;

public interface TopicoRepository extends JpaRepository<Topico,Long> {

    Page<Topico> findByActivoTrue(Pageable paginacion);
}
