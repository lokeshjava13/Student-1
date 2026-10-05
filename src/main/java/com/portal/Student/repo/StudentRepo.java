package com.portal.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.Student.model.StudentLokesh;

@Repository

public interface StudentRepo extends JpaRepository< StudentLokesh,Integer> {

}
