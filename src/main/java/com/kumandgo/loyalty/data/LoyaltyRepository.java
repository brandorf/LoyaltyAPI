package com.kumandgo.loyalty.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

    public interface LoyaltyRepository extends CrudRepository<LoyaltyRecord, Integer> {

        @Query(value = "SELECT * from \"PX_SHARE\".\"M837\".\"M837_PXUSER\" WHERE \"PXUSER_ID\" = ?", nativeQuery = true)
        LoyaltyRecord findLoyaltyById(int studentId);

    }

