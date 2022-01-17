package com.nowherefreaj.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nowherefreaj.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
