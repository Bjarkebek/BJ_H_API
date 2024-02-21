package org.example.bj_h_api.Controller;


import org.example.bj_h_api.Model.IPhone;
import org.example.bj_h_api.Service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/iPhone")
public class IPhoneController {
    @Autowired
    IPhoneService iPhoneService;


    @GetMapping
    public List<IPhone> getAllIPhones() {
        return iPhoneService.getAllIPhones();
    }

    @GetMapping("/{id}")
    public IPhone getIPhoneById(@PathVariable int id) {
        return iPhoneService.getIPhoneById(id);
    }

    @PostMapping
    void createIPhone(@RequestBody IPhone iPhone) {
        iPhoneService.saveOrUpdateIPhone(iPhone);
    }

    @PutMapping("/{id}")
    void saveOrUpdateIPhone(@RequestBody IPhone updIPhone) {
        iPhoneService.saveOrUpdateIPhone(updIPhone);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteIPhone(@PathVariable int id) {
        IPhone iPhone = iPhoneService.getIPhoneById(id);
        if (iPhone != null) {
            iPhoneService.deleteIPhone(id);
            return true;
        }
        return false;
    }
}
