package com.lms.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
