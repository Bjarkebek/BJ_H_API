package org.example.bj_h_api.Service;

import org.example.bj_h_api.Model.Android;
import org.example.bj_h_api.Repository.AndroidRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AndroidService {
    @Autowired
    AndroidRepo repo;


    public List<Android> getAllAndroid() {
        List<Android> Androids = new ArrayList<Android>();
        repo.findAll().forEach(Androids::add);
        return Androids;
    }

    public Android getAndroidById(int id) {
        return repo.findById(id).get();
    }

    public void saveOrUpdateAndroid(Android android) { repo.save(android); }

    //deleting a specific record
    public void deleteAndroid(int id) {
        repo.deleteById(id);
    }
}
