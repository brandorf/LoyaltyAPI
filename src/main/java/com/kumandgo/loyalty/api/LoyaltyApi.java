package com.kumandgo.loyalty.api;

import com.kumandgo.loyalty.data.LoyaltyRecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "Loyalty", description = "the Loyalty API")
public interface LoyaltyApi {

    @ApiOperation(value = "", response = LoyaltyRecord.class, tags = {"Loyalty",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "A successful student record", response = LoyaltyRecord.class)})
    @RequestMapping(value = "/loyaltyt", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<LoyaltyRecord> getLoyaltyById(
            @RequestParam("loyaltyId")
            Integer studentId);

}