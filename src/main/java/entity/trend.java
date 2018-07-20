package entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class trend {
	String lotto;
	Date ngaychot;

	public trend(String lotto, Date ngaychot) {
		super();
		this.lotto = lotto;
		this.ngaychot = ngaychot;
	}
}
