package com.jks.startup.springbootecho.jpa;

import com.jks.startup.springbootecho.model.EchoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EchoRepo extends JpaRepository<EchoUser, Long>{
}
