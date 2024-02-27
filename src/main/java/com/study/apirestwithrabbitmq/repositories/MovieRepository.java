package com.study.apirestwithrabbitmq.repositories;

import com.study.apirestwithrabbitmq.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

}
