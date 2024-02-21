package org.example.bj_h_api.Controller;


import org.example.bj_h_api.Model.Android;
import org.example.bj_h_api.Service.AndroidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/android")
public class AndroidController {
    @Autowired
    AndroidService androidService;


    @GetMapping
    public List<Android> getAllAndroid() {
        return androidService.getAllAndroid();
    }

    @GetMapping("/{id}")
    public Android getAndroidById(@PathVariable int id) {
        return androidService.getAndroidById(id);
    }

    @PostMapping
    void createAndroid(@RequestBody Android android) {
        androidService.saveOrUpdateAndroid(android);
    }

    @PutMapping("/{id}")
    void saveOrUpdateAndroid(@RequestBody Android updAndroid) {
        androidService.saveOrUpdateAndroid(updAndroid);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteAndroid(@PathVariable int id) {
        Android android = androidService.getAndroidById(id);
        if (android != null) {
            androidService.deleteAndroid(id);
            return true;
        }
        return false;
    }
}
