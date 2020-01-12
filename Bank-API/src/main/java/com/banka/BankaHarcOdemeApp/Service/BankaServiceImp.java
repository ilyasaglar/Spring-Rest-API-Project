package com.banka.BankaHarcOdemeApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banka.BankaHarcOdemeApp.dao.BankaRepository;
import com.banka.BankaHarcOdemeApp.entity.Banka;
@Service
public class BankaServiceImp implements BankaService{
	@Autowired
	private BankaRepository bankaRepository ;
	
	@Override
	public List<Banka> getMusteriList() {
		List<Banka> myList = bankaRepository.findAll();
		return myList;
	}

	@Override
	public void saveMusteri(Banka musteri) {
		bankaRepository.save(musteri);
		
	}

	@Override
	public Banka getMusteri(int musteriId) {
		Banka musteri = bankaRepository.getOne(musteriId);
		return musteri;
	}

	@Override
	public void deleteMusteri(int musteriId) {
		bankaRepository.deleteById(musteriId);
		
	}

	

}
