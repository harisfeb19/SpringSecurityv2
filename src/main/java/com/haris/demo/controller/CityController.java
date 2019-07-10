package com.haris.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.haris.demo.model.City;
import com.haris.demo.dao.*;

@Controller
public class CityController {

	@Autowired
	CityRepository cityrep;
	
	@RequestMapping(value = "/cityview")
	public ModelAndView View(@RequestParam int id) {
			ModelAndView mv = new ModelAndView("city.jsp");
			City city = cityrep.findById(id).orElse(null);
			mv.addObject(city);
			return mv;
	}
	
	@RequestMapping("/cities")
	@ResponseBody
	public List<City> getCities() {

		return cityrep.findAll();
	}
	
	@RequestMapping("/addcity")
	public ModelAndView CityFoam() {
		
		return new ModelAndView("addcity.jsp");
		
	}
	
	@RequestMapping("/savecity")
	public ModelAndView SaveCity(City city) {
		
		ModelAndView mv = new ModelAndView("addcity.jsp");
		cityrep.save(city);
		return mv;
	}
}
