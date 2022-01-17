package com.nowherefreaj.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nowherefreaj.dsmovie.entities.Score;
import com.nowherefreaj.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
