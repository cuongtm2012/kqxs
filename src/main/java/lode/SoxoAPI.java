package lode;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import domain.chotKQ;
import domain.ketqua;

public class SoxoAPI {
	static Utility util = new Utility();

	static ArrayList<chotKQ> parseChotKQ(String chotkq) {
		String content = "";
		String lo = "";
		String lodau = "";
		String lodit = "";
		String lobt = "";
		String dedau = "";
		String dedit = "";
		String debt = "";
		String email = "";
		String name = "";
		String rank = "";

		String ratio_de = "";
		String ratio_lo = "";
		String ratio_lobt = "";
		String ratio_debt = "";

		ArrayList<chotKQ> listChotKQ = new ArrayList<chotKQ>();

		try {
			content = util.obtainContent(chotkq);
			JSONObject json = new JSONObject(content);
			JSONArray arrChotKQ = json.getJSONArray("list");
			chotKQ chotKQObj = new chotKQ();

			for (Object object : arrChotKQ) {
				JSONObject obj = (JSONObject) object;

				lo = obj.getString("lo");
				lodau = obj.getString("lodau");
				lodit = obj.getString("lodit");
				lobt = obj.getString("lobt");
				dedau = obj.getString("dedau");
				dedit = obj.getString("dedit");
				debt = obj.getString("debt");
				email = obj.getString("email");
				name = obj.getString("name");
				rank = obj.getString("rank");

				JSONObject ratio = obj.getJSONObject("ratio");
				ratio_de = ratio.getString("de");
				ratio_lo = ratio.getString("lo");
				ratio_lobt = ratio.getString("lobt");
				ratio_debt = ratio.getString("debt");

				// save to Object
				chotKQObj.setLo(lo);
				chotKQObj.setLodau(lodau);
				chotKQObj.setLodit(lodit);
				chotKQObj.setLobt(lobt);
				chotKQObj.setDedau(dedau);
				chotKQObj.setDedit(dedit);
				chotKQObj.setDebt(debt);
				chotKQObj.setEmail(email);
				chotKQObj.setName(name);
				chotKQObj.setRank(rank);
				chotKQObj.setRatio_de(ratio_de);
				chotKQObj.setRatio_lo(ratio_lo);
				chotKQObj.setRatio_lobt(ratio_lobt);
				chotKQObj.setRatio_debt(ratio_debt);

				// Add to List
				listChotKQ.add(chotKQObj);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listChotKQ;
	}

	static ketqua ketquasx(String inputURL) {
		ketqua kq = new ketqua();

		try {
			String content = util.obtainContentBypassShield(inputURL);

			if (!StringUtils.isEmpty(content)) {
				Document doc = Jsoup.parse(content);

				Elements ketquaClass = doc.getElementsByClass("ketqua");

				for (Element element : ketquaClass) {
					String kq_0 = element.getElementsByClass("kq_0").html();
					String kq_1 = element.getElementsByClass("kq_1").html();
					String kq_2 = element.getElementsByClass("kq_2").html();
					String kq_3 = element.getElementsByClass("kq_3").html();
					String kq_4 = element.getElementsByClass("kq_4").html();
					String kq_5 = element.getElementsByClass("kq_5").html();
					String kq_6 = element.getElementsByClass("kq_6").html();
					String kq_7 = element.getElementsByClass("kq_7").html();
					String kq_8 = element.getElementsByClass("kq_8").html();
					String kq_9 = element.getElementsByClass("kq_9").html();
					String kq_10 = element.getElementsByClass("kq_10").html();
					String kq_11 = element.getElementsByClass("kq_11").html();
					String kq_12 = element.getElementsByClass("kq_12").html();
					String kq_13 = element.getElementsByClass("kq_13").html();
					String kq_14 = element.getElementsByClass("kq_14").html();
					String kq_15 = element.getElementsByClass("kq_15").html();
					String kq_16 = element.getElementsByClass("kq_16").html();
					String kq_17 = element.getElementsByClass("kq_17").html();
					String kq_18 = element.getElementsByClass("kq_18").html();
					String kq_19 = element.getElementsByClass("kq_19").html();
					String kq_20 = element.getElementsByClass("kq_20").html();
					String kq_21 = element.getElementsByClass("kq_21").html();
					String kq_22 = element.getElementsByClass("kq_22").html();
					String kq_23 = element.getElementsByClass("kq_23").html();
					String kq_24 = element.getElementsByClass("kq_24").html();
					String kq_25 = element.getElementsByClass("kq_25").html();
					String kq_26 = element.getElementsByClass("kq_26").html();

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
}
