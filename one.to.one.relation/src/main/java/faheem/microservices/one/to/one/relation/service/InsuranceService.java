package faheem.microservices.one.to.one.relation.service;

import faheem.microservices.one.to.one.relation.entity.Insurance;
import faheem.microservices.one.to.one.relation.exception.InsuranceNotFoundException;
import faheem.microservices.one.to.one.relation.repository.InsuranceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InsuranceService {

    @Autowired
    InsuranceRepository insuranceRepository;

    public Insurance saveInsurance(Insurance insurance){
        log.info("InsuranceService.saveInsurance() method is called...");
        return insuranceRepository.save(insurance);
    }

    public Insurance getInsuranceById(int insuranceId) throws InsuranceNotFoundException {
        log.info("InsuranceService.getInsuranceById() method is called...");
        if(insuranceRepository.findById(insuranceId).isPresent()){
            log.info("insurance found for id : {}",insuranceId);
            return insuranceRepository.findById(insuranceId).get();
        }
        else{
            log.info("Insurance not found for id : {}",insuranceId);
            throw new InsuranceNotFoundException("insurance not exists");
        }
    }
}
