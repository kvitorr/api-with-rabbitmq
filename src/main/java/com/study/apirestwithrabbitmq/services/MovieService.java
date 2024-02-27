package com.study.apirestwithrabbitmq.services;

import com.study.apirestwithrabbitmq.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;



}
