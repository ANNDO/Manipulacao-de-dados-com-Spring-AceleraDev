package com.challenge.service.interfaces;

import com.challenge.entity.Company;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface CompanyServiceInterface extends ServiceInterface<Company> {

    Optional<Company> findById(Long id);

    List<Company> findByAccelerationId(Long accelerationId);

    List<Company> findByUserId(Long userId);

    Company save(Company object);

}
