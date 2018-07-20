package entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class caudep {

	String lotto;
	Date ngaychot;

	public caudep(String lotto, Date ngaychot) {
		super();
		this.lotto = lotto;
		this.ngaychot = ngaychot;
	}

}
