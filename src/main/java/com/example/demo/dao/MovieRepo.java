package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.MovieModel;



public interface MovieRepo extends JpaRepository<MovieModel, Integer>{

}


