package com.hexaware.fastXBus.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.fastXBus.dto.BusOperatorsDTO;
import com.hexaware.fastXBus.entity.BusOperators;
import com.hexaware.fastXBus.repository.IBusOperatorsRepository;


@Service
public class BusOperatorsService implements IBusOperatorsService {
	
	@Autowired
	IBusOperatorsRepository repository;
	@Autowired
	RestTemplate restTemplate;

	private static final Logger logger = LoggerFactory.getLogger(PaymentHistoryService.class);
	@Override
	public BusOperators createBusOperators(BusOperatorsDTO busoperatorsdto) {
		BusOperators busoperator=new BusOperators();
		busoperator.setOperatorId(busoperatorsdto.getOperatorId());
		busoperator.setOperatorName(busoperatorsdto.getOperatorName());
		busoperator.setContactPhone(busoperatorsdto.getContactPhone());
		busoperator.setRating(busoperatorsdto.getRating());
		busoperator.setUserId(busoperatorsdto.getUserId());
		busoperator.setPassword(busoperatorsdto.getPassword());
		busoperator.setRole(busoperatorsdto.getRoles());
		return repository.save(busoperator);
	}

	@Override
	public BusOperators updateBusOperators(BusOperatorsDTO busoperatorsdto, Long operatorId) {
	    // Find the existing bus operator by ID
	    Optional<BusOperators> operatorOptional = repository.findById(operatorId);
	    
	    if (operatorOptional.isPresent()) {
	        // Get the existing bus operator
	        BusOperators existingOperator = operatorOptional.get();
	        
	        // Update the fields with new values from DTO
	        existingOperator.setOperatorName(busoperatorsdto.getOperatorName());
	        existingOperator.setContactPhone(busoperatorsdto.getContactPhone());
	        existingOperator.setRating(busoperatorsdto.getRating());
	        existingOperator.setUserId(busoperatorsdto.getUserId());
	        existingOperator.setPassword(busoperatorsdto.getPassword());
	        existingOperator.setRole(busoperatorsdto.getRoles());
	        
	        // Save the updated bus operator
	        return repository.save(existingOperator);
	    } else {
	    	logger.error("BusOperator not found");
	        return null;
	    }
	}


	@Override
	public void  deleteBusOperators(Long operatorId) {
		repository.deleteById(operatorId);
	}

	@Override
	public BusOperatorsDTO getBusOperatorsById(Long OperatorId) {
		
		BusOperators busoperators=repository.findById(OperatorId).orElse(new BusOperators());
		return new BusOperatorsDTO(busoperators.getOperatorId(),busoperators.getOperatorName(),busoperators.getPassword(),busoperators.getContactPhone(),busoperators.getRating(),busoperators.getUserId(),busoperators.getRole());
	}

	@Override
	public List<BusOperators> getAllBusOperators() {
		return repository.findAll(Sort.by("operatorName"));
	}

	@Override
	public Optional<BusOperators> findByOperatorname(String operatorName) {
		// TODO Auto-generated method stub
		return repository.findByOperatorname(operatorName);
	}

}
	
