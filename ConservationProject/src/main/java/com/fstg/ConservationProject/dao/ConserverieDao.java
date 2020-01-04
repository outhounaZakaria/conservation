package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.Concerverie;
@Repository

public interface ConserverieDao extends JpaRepository<Concerverie , Long> {

}
