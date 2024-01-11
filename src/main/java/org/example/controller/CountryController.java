package org.example.controller;

import org.example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountryController {
    @Autowired
    CountryService countryService;


    @RequestMapping("/countries")
    public ModelAndView getCountries(){
        ModelAndView mv = new ModelAndView("countries");
        mv.addObject("countries", countryService.getCountries());
        return mv;
    }

    @RequestMapping("/addcountry")
    public String addCountryPage(){
        return "addcountry";
    }

    @PostMapping("/addcountry")
    public ModelAndView addCountry(@RequestParam("name") String name){
        countryService.insertCountry(name);
        return getCountries();
    }

    @RequestMapping("/deletecountry/{id}")
    public ModelAndView deleteCountry(@PathVariable("id") int id){
        countryService.deleteCountry(id);
        return getCountries();
    }

    @RequestMapping("/updatecountry/{id}")
    public ModelAndView updateCountryPage(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("updatecountry");
        mv.addObject("country", countryService.getCountryById(id));
        return mv;
    }

    @PostMapping("/updatecountry/{id}")
    public ModelAndView updateCountry(@PathVariable("id") int id, @RequestParam("name") String name){
        countryService.updateCountry(id, name);
        return getCountries();
    }

    @RequestMapping("/viewcountry/{id}")
    public ModelAndView getCountryPage(@PathVariable("id") int id){
        return new ModelAndView("country")
                .addObject("country", countryService.getCountryById(id));
    }
}
