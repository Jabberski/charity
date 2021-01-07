package pl.coderslab.charity.service;

import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;

import java.util.List;

public interface DonationService {
    int getSumOfBags();
    long getDonationCount();
    void saveDonation(Donation donation);
}
