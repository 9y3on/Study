package kr.co.sist.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDomain {
	
	private String model, car_option, maker, car_year;
	private int price;
	private Date hiredate;

}
