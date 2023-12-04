package com.mobiles.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobiles.Entity.Mobiles;

@Repository
public interface MobilesRepositry extends JpaRepository<Mobiles, Integer> {

}
