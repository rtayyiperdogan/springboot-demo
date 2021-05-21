package com.example.demospringboot.restApi;

import com.example.demospringboot.Business.ICityService;
import com.example.demospringboot.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 21-May-21, Fri
 **/
@RestController
@RequestMapping("/api")
public class CityController {

    private final ICityService cityService;//From business Class

    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("/cities")
    @Transactional
    public List<City> get(){
        return cityService.getAll();
    }
    @PostMapping("/add")
    @Transactional
    public void add(@RequestBody City city) {
        cityService.add(city);
    }
    @PostMapping("/update")
    @Transactional
    public void update(@RequestBody City city) {
        cityService.update(city);
    }
    @PostMapping("/delete")
    @Transactional
    public void delete(@RequestBody City city) {
        cityService.delete(city);
    }

    @GetMapping("/cities/{id}")//it's meaning "I want that parameter"
    @Transactional
    public City getById(@PathVariable int id){
        return cityService.getById(id);
    }
}
