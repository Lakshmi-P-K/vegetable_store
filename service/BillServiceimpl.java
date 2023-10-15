package com.nineleaps.vegetablestoresystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.vegetablestoresystem.entity.Bill;
import com.nineleaps.vegetablestoresystem.repository.BillRepository;




@Service
public class BillServiceimpl implements IBillService {
	@Autowired
	private BillRepository billRepository;
	
	

	@Override
	public List<Bill> getAllBill() {
		// TODO Auto-generated method stub
		return billRepository.findAll();
	}

	@Override
	public Bill saveBill(Bill billEntity) {
		// TODO Auto-generated method stub
		return billRepository.save(billEntity);
	}

	@Override
	public Optional<Bill> getBillById(Long billId) {
		// TODO Auto-generated method stub
		return billRepository.findById(billId);
	}

	@Override
	public void deleteBillById(Long billId) {
		// TODO Auto-generated method stub
		billRepository.deleteById(billId);
		
	}

	@Override
	public Bill updateBill(Bill billEntity) {
	
		return billRepository.save(billEntity);
	}
	
	

}
