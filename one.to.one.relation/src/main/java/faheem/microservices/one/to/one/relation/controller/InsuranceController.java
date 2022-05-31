package faheem.microservices.one.to.one.relation.controller;

import faheem.microservices.one.to.one.relation.entity.Insurance;
import faheem.microservices.one.to.one.relation.exception.InsuranceNotFoundException;
import faheem.microservices.one.to.one.relation.service.InsuranceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class InsuranceController {

    @Autowired
    InsuranceService insuranceService;

    @PostMapping("/add")
    public Insurance addInsurance(@RequestBody Insurance insurance){
        log.info("InsuranceController.addInsurance() method called...");
        return insuranceService.saveInsurance(insurance);
    }

    @GetMapping("/getInsurance")
    public Insurance getInsurance(@PathVariable("insuranceId") int insuranceId) throws InsuranceNotFoundException {
        log.info("InsuranceController.getInsurance() method called...");
        return insuranceService.getInsuranceById(insuranceId);
    }
}
