package org.example.bj_h_api.Service;

import org.example.bj_h_api.Model.IPhone;
import org.example.bj_h_api.Repository.IPhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IPhoneService {
    @Autowired
    IPhoneRepo repo;


    public List<IPhone> getAllIPhones() {
        List<IPhone> iPhones = new ArrayList<IPhone>();
        repo.findAll().forEach(iPhones::add);
        return iPhones;
    }

    public IPhone getIPhoneById(int id) {
        return repo.findById(id).get();
    }

    public void saveOrUpdateIPhone(IPhone iPhone) {
        repo.save(iPhone);
    }

    //deleting a specific record
    public void deleteIPhone(int id) {
        repo.deleteById(id);
    }
}





