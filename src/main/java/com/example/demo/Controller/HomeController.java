package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.Model.MovieModel;
import com.example.demo.dao.MovieRepo;


@Controller
public class HomeController {
	
	@Autowired
	MovieRepo repo;
	
	@RequestMapping("/AddMovies")
	public String AddMovies() {
		return "AddMovies.jsp";
	}
	
	@RequestMapping("/submitMovies")
	public String submitMovies(MovieModel movie_model) {
		repo.save(movie_model);
		return "redirect:";
	}
	
	@GetMapping("/")
	@ResponseBody
	public List<MovieModel> movies() {
		List<MovieModel> movies= repo.findAll();
//		System.out.println(movies.get(0));
		return movies;
		
	}
}
