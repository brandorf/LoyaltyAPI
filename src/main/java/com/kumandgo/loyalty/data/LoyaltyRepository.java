package com.kumandgo.loyaltyapi.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

    public interface LoyaltyRepository extends CrudRepository<LoyaltyRecord, Long> {

        @Query(value = "SELECT STUDENT_ID as \"student_id\", STUDENT_NAME as \"student_name\", CLASS_ID as \"class_id\" FROM STUDENT WHERE STUDENT_ID = ?", nativeQuery = true)
        LoyaltyRecord findStudentById(Long studentId);

    }

