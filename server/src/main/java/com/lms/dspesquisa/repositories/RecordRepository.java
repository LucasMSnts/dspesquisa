package com.lms.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
