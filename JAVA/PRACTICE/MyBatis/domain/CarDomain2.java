package kr.co.sist.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDomain2 {
	
	private String model, car_img, car_option, car_year;
	private int cc, price;
	private Date hiredate;

}
