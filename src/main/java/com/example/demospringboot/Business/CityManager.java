package com.example.demospringboot.Business;

import com.example.demospringboot.DataAccess.ICityDal;
import com.example.demospringboot.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Recep Tayyip Erdogan
 * @since : 21-May-21, Fri
 **/
@Service
public class CityManager implements ICityService {

    private ICityDal cityDal;
    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    @Override
    public List<City> getAll() {
        return this.cityDal.getAll();
    }

    @Override
    public void add(City city) {
        this.cityDal.add(city);
    }

    @Override
    public void update(City city) {
        this.cityDal.update(city);
    }

    @Override
    public void delete(City city) {
        this.cityDal.delete(city);
    }

    @Override
    public City getById(int id) {
        return this.cityDal.getById(id);
    }

}
