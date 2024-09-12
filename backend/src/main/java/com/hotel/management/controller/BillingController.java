package com.hotel.management.controller;

import com.hotel.management.model.Bill;
import com.hotel.management.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping
    public Bill generateBill(@RequestBody Bill bill) {
        return billingService.generateBill(bill);
    }
}
