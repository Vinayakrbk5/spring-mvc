package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Objects;
import org.springframework.stereotype.Component;
import com.xworkz.spring.dao.CalamityDAO;
import com.xworkz.spring.dto.CalamityDTO;

@Component
public class CalamityServiceImpl implements CalamityService {
	@Autowired
	private CalamityDAO dao;

	@Override
	public Boolean validateAndSave(CalamityDTO entity) {
		System.out.println("Start : service");
		boolean valid = false;
		try {
			if (Objects.nonNull(entity)) {
				if (entity.getPlace() != null && !entity.getPlace().isEmpty()) {
					System.out.println("Place is valid");
					valid = true;
					if (entity.getDate() != null && !entity.getDate().isEmpty() && valid) {
						System.out.println("Date is valid");
						valid = true;
						if (entity.getCalamityType() != null && !entity.getCalamityType().isEmpty() && valid) {
							System.out.println("Calamity type is valid");
							valid = true;
							System.out.println("We are in service method");
						} else {
							valid = false;
							System.out.println("Calamity type is not valid");
						}
					} else {
						valid = false;
						System.out.println("Date is not valid");
					}
				} else {
					valid = false;
					System.out.println("Place is not valid");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (valid == true) {
			System.out.println("Going to call dao now");
			dao.save(entity);
			System.out.println("End : service");
		}

		return valid;
	}
//		

//	}

}
