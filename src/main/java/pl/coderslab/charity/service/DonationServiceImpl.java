package pl.coderslab.charity.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.repository.DonationRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class DonationServiceImpl implements DonationService {

    private final DonationRepository donationRepository;

    @Override
    public int getSumOfBags() {
        Integer bags = donationRepository.sumOfBags();
        if(bags==null) bags=0;
        return bags;
    }

    @Override
    public long getDonationCount() {
        return donationRepository.count();
    }
}
