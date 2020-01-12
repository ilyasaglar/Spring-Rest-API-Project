package com.banka.BankaHarcOdemeApp.Service;

import java.util.List;

import com.banka.BankaHarcOdemeApp.entity.Banka;

public interface BankaService {
	public List<Banka> getMusteriList();
	public void saveMusteri(Banka musteri);
	public Banka getMusteri(int musteriId);
	public void deleteMusteri(int musteriId);
	
}
