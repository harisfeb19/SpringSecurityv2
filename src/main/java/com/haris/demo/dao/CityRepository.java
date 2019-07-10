package com.haris.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.haris.demo.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
