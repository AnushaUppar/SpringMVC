package com.ty.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ty.entity.MovieDetails;
import com.ty.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	private static Logger log = LoggerFactory
			.getLogger(MovieController.class.getSimpleName());
	
	@RequestMapping(path = "/movie", method = RequestMethod.GET)
	public ModelAndView standard() {
		return new ModelAndView("movie", "movie", new MovieDetails());
	}
	
	@RequestMapping(path = "/saveMovie", method = RequestMethod.POST)
	public ModelAndView createStandard(@ModelAttribute MovieDetails movieDetails) {
		log.info(movieDetails.toString());
		MovieDetails saveMovie = service.saveMovie(movieDetails);	
		return new ModelAndView("saveMovie","MovieDetails",saveMovie);
	}

}
