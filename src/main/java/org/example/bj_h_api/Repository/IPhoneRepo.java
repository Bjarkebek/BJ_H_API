package org.example.bj_h_api.Repository;

import org.springframework.data.repository.CrudRepository;
// or

import org.example.bj_h_api.Model.IPhone;

public interface IPhoneRepo extends CrudRepository<IPhone, Integer> {

}
