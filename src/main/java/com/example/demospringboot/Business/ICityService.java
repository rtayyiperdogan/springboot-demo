package com.example.demospringboot.Business;

import com.example.demospringboot.Entities.City;

import java.util.List;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 21-May-21, Fri
 **/
public interface ICityService {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
