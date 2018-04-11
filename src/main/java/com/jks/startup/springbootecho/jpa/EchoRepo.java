package com.jks.startup.springbootecho.jpa;

import com.jks.startup.springbootecho.model.EchoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EchoRepo extends JpaRepository<EchoUser, Long>{
}
