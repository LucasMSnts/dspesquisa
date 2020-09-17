package com.lms.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
