package repository;

import java.util.ArrayList;

import com.mongodb.BasicDBObject;

import domain.chotKQ;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SoxoRepo {
	public static MongoManager mongo = new MongoManager();

	public static void insertDB(ArrayList<chotKQ> chotKQlist){
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
			mongo.initMongoDB().insert(document);
		}
	}
}
