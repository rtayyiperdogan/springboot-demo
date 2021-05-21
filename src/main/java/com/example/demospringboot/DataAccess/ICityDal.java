package com.example.demospringboot.DataAccess;

import com.example.demospringboot.Entities.City;

import java.util.List;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 21-May-21, Fri
 **/
public interface ICityDal {
    //Necessart operations for accesing data
    List<City> getAll();//will list all cities
    void add(City city);//will add city to database JSON format
    void update(City city);//will update city in database JSON format
    void delete(City city);//will city city from database JSON format
    City getById(int id);//will return city according to given ID
}
