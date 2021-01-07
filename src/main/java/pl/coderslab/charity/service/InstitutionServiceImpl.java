package pl.coderslab.charity.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class InstitutionServiceImpl implements InstitutionService{

    private final InstitutionRepository institutionRepository;

    @Override
    public List<Institution> findAll() {
        return institutionRepository.findAll();
    }

    @Override
    public List<Institution> findEven() {
        log.debug("Finding even institutions");
        List<Institution> institutions = findAll();
        List<Institution> institutionsEven = new ArrayList<>();
        for (int i = 0; i < institutions.size(); i++) {
            if(i%2==0){
                institutionsEven.add(institutions.get(i));
            }
        }
        return institutionsEven;
    }

    @Override
    public List<Institution> findOdd() {
        log.debug("Finding odd institutions");
        List<Institution> institutions = findAll();
        List<Institution> institutionsOdd = new ArrayList<>();
        for (int i = 0; i < institutions.size(); i++) {
            if(i%2!=0){
                institutionsOdd.add(institutions.get(i));
            }
        }
        return institutionsOdd;
    }
}
