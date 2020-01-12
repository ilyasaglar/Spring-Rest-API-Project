package com.banka.BankaHarcOdemeApp.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.banka.BankaHarcOdemeApp.Service.BankaService;
import com.banka.BankaHarcOdemeApp.entity.Banka;


@Controller
@RequestMapping("banka")
public class BankaController {
	private final String borcOdemeApiUrl="http://localhost:8484/api/student";
	private static RestTemplate restTemplate = new RestTemplate();
	private List<Banka> borcluList;
	@Autowired
	private BankaService bankaService;

	@GetMapping("/list")
	public String getMusteriList(Model model) {
		borcluList = bankaService.getMusteriList();
		ResponseEntity<Banka[]> responseEntity = 
				restTemplate.getForEntity(borcOdemeApiUrl, Banka[].class);
				
				borcluList = Arrays.asList(responseEntity.getBody());
		model.addAttribute("borcluList", borcluList);
		return "musteri-list";
	}

	@GetMapping("/odeme")
	public String odemeYap(@ModelAttribute("musteriId") int musteriId) {

		Banka musteri = bankaService.getMusteri(musteriId);
		if (musteri.getBorcDurumu().toUpperCase().contains("ODENMEDI")) {
			musteri.setBorcTutari(0);
			musteri.setBorcDurumu("ÖDENDİ");
			
			bankaService.saveMusteri(musteri);
			return "redirect:/banka/list";
		} else

			return "redirect:/banka/list";

	}

}
