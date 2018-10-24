package com.itapgo.girl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author LiaoZhengHan
 * @date 2018年10月23日
 */
@RestController
public class GirlController {
	
	private @Autowired GirlRepository girlRepository;

	@GetMapping("listGirl")
	public List<Girl> listGirl(){
		return girlRepository.findAll();
	}
	
	@PostMapping("addGirl")
	public Girl addGirl(@RequestParam("cupSize") String cupSize,
			@RequestParam("age") Integer age,
			@RequestParam("name") String name
			) {
		
		Girl girl = new Girl();
		girl.setAge(age);
		girl.setCupSize(cupSize);
		girl.setName(name);
		
		return girlRepository.save(girl);
	}
}
