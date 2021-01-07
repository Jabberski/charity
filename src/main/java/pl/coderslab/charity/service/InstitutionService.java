package pl.coderslab.charity.service;

import pl.coderslab.charity.entity.Institution;

import java.util.List;

public interface InstitutionService {
    List<Institution> findAll();
    List<Institution> findEven();
    List<Institution> findOdd();
}

