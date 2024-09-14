package kr.co.sist.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WebMemberDomain {
	private String id, name, birth, tel, email, gender, zipcode, addr1, addr2, info,  ip, input_date;

}
