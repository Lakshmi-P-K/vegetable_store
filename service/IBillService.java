package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import com.nineleaps.vegetablestoresystem.entity.Bill;



public interface IBillService {
	public List<Bill> getAllBill();

	public Bill saveBill(Bill billEntity);

	public Optional<Bill> getBillById(Long billId);

	public void deleteBillById(Long billId);

	public Bill updateBill(Bill billEntity);

}
