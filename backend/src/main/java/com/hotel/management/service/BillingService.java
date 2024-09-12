package com.hotel.management.service;

import com.hotel.management.model.Bill;
import com.hotel.management.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    @Autowired
    private BillRepository billRepository;

    public Bill generateBill(Bill bill) {
        return billRepository.save(bill);
    }
}
