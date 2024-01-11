package org.example.controller;

import org.example.service.CityService;
import org.example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CityController {
    @Autowired
    CityService cityService;
    @Autowired
    CountryService countryService;

    @RequestMapping("/cities")
    public ModelAndView getCities(){
        return new ModelAndView("cities").addObject("cities", cityService.getCities());
    }

    @RequestMapping("/citiesbycountryid/{id}")
    public ModelAndView getCitiesByCountryId(@PathVariable("id") int countryId){
        return new ModelAndView("cities").addObject("cities", cityService.getCitiesByCountryId(countryId));
    }

    @RequestMapping("/addcity")
    public ModelAndView addCityPage(){
        return new ModelAndView("addcity").addObject("countries", countryService.getCountries());
    }

    @PostMapping("/addcity")
    public ModelAndView addCity(@RequestParam("name") String name, @RequestParam("countryid") int countryId){
        cityService.insertCity(countryId, name);
        return getCities();
    }

    @RequestMapping("/deletecity/{id}")
    public ModelAndView deleteCity(@PathVariable("id") int id){
        cityService.deleteCity(id);
        return getCities();
    }

    @RequestMapping("/viewcity/{id}")
    public ModelAndView viewCity(@PathVariable("id") int id){
        return new ModelAndView("city").addObject("city", cityService.getCityById(id));
    }
}
