package com.example.dcp.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.dcp.model.UserDetails;


public interface UserRepo extends JpaRepository<UserDetails, Integer> {


}
