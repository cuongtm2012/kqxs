package repository;

import java.util.ArrayList;

import com.mongodb.BasicDBObject;

import domain.caudep;
import domain.chotKQ;
import domain.ketqua;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SoxoRepo {
	public static MongoManager mongo = new MongoManager();

	public static void insertChotKQ(ArrayList<chotKQ> chotKQlist) {
		try {
			for (chotKQ chotKQ2 : chotKQlist) {
				BasicDBObject document = new BasicDBObject();
				document.put("lo", chotKQ2.getLo());
				document.put("lodau", chotKQ2.getLodau());
				document.put("lodit", chotKQ2.getLodit());
				document.put("lobt", chotKQ2.getLobt());
				document.put("dedau", chotKQ2.getDedau());
				document.put("dedit", chotKQ2.getDedit());
				document.put("debt", chotKQ2.getDebt());
				document.put("email", chotKQ2.getEmail());
				document.put("name", chotKQ2.getName());
				document.put("rank", chotKQ2.getRank());

				document.put("ratio_de", chotKQ2.getRatio_de());
				document.put("ratio_lo", chotKQ2.getRatio_lo());
				document.put("ratio_lobt", chotKQ2.getRatio_lobt());
				document.put("ratio_debt", chotKQ2.getDebt());
				mongo.chotKQ().insert(document);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertKetQua(ketqua kq) {
		try {
			BasicDBObject document = new BasicDBObject();
			document.put("kq0", kq.getKq0());
			document.put("kq1", kq.getKq1());
			document.put("kq2", kq.getKq1());
			document.put("kq3", kq.getKq1());
			document.put("kq4", kq.getKq1());
			document.put("kq5", kq.getKq1());
			document.put("kq6", kq.getKq1());
			document.put("kq7", kq.getKq1());
			document.put("kq8", kq.getKq1());
			document.put("kq9", kq.getKq1());
			document.put("kq10", kq.getKq1());
			document.put("kq11", kq.getKq1());
			document.put("kq12", kq.getKq1());
			document.put("kq13", kq.getKq1());
			document.put("kq14", kq.getKq1());
			document.put("kq15", kq.getKq1());
			document.put("kq16", kq.getKq1());
			document.put("kq17", kq.getKq1());
			document.put("kq18", kq.getKq1());
			document.put("kq19", kq.getKq1());
			document.put("kq20", kq.getKq1());
			document.put("kq21", kq.getKq1());
			document.put("kq22", kq.getKq1());
			document.put("kq23", kq.getKq1());
			document.put("kq24", kq.getKq1());
			document.put("kq25", kq.getKq1());
			document.put("kq26", kq.getKq1());
			document.put("ngaychot", kq.getNgaychot());
			mongo.ketqua().insert(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertCauDep(caudep cd) {
		try {
			BasicDBObject document = new BasicDBObject();
			document.put("listcaudep", cd.getListCaudep());
			document.put("ngaychot", cd.getNgaychot());
			mongo.caudep().insert(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
