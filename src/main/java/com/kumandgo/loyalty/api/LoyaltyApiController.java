package com.kumandgo.loyalty.api;

import com.kumandgo.loyalty.data.LoyaltyRecord;
import com.kumandgo.loyalty.data.LoyaltyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class LoyaltyApiController implements LoyaltyApi {

    @Autowired
    LoyaltyRepository studentRepository;

    public ResponseEntity<LoyaltyRecord> getLoyaltyById(Integer studentId) {
        return new ResponseEntity<>(studentRepository.findLoyaltyById(studentId), HttpStatus.OK);
    }

}