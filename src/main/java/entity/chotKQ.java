package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class chotKQ {

	String lo;
	String lodau;
	String lodit;
	String lobt;
	String dedau;
	String dedit;
	String debt;
	String email;
	String name;
	String rank;

	String ratio_de;
	String ratio_lo;
	String ratio_lobt;
	String ratio_debt;

	public chotKQ(String lo2, String lodau2, String lodit2, String lobt2, String dedau2, String dedit2, String debt2,
			String email2, String name2, String rank2, String ratio_de2, String ratio_lo2, String ratio_lobt2,
			String ratio_debt2) {
		this.lo = lo2;
		this.lodau = lodau2;
		this.lodit = lodit2;
		this.lobt = lobt2;
		this.dedau = dedau2;
		this.dedit = dedit2;
		this.debt = debt2;
		this.email = email2;
		this.name = name2;
		this.rank = rank2;
		this.ratio_de = ratio_de2;
		this.ratio_lo = ratio_lo2;
		this.ratio_lobt = ratio_lobt2;
		this.ratio_debt = ratio_debt2;
	}
}
