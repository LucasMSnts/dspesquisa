package com.lms.dspesquisa.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lms.dspesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

	@Query("SELECT obj FROM Record obj WHERE "
			+ "(coalesce(:minDate) IS NULL OR obj.moment >= :minDate) AND "
			+ "(coalesce(:maxDate) IS NULL OR obj.moment <= :maxDate)") // para verificar se é nulo no PostgreSQL -> coalesce(var)
	Page<Record> findByMoments(Instant minDate, Instant maxDate, Pageable pageable);

}
