package app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.caudep;
import domain.chotKQ;
import domain.ketqua;
import lombok.AllArgsConstructor;
import repository.SoxoRepo;
import services.SoxoAPI;

@SpringBootApplication 
@EnableAutoConfiguration
@AllArgsConstructor
public class MainApplication  {
	static String URL = "https://rongbachkim.com/";
	static String chotkq = "https://rongbachkim.com/chot.php?getlist&ngay=%s&lastid=0&lastupdate=0";
	static String trendURL = "https://rongbachkim.com/trend.php?list&alone&day=%s&trendlimit=100";
	static String caudepURL = "https://rongbachkim.com/soicau.html?submit=1&setmode=full&exactlimit=0&limit=5&ngay=%s&nhay=1&lon=0";
//	get data form rongbachkim & ketqua.net
	public static void main(String[] args) {
		Date myDate = new Date();
		String todayDateStr = new SimpleDateFormat("yyyy-MM-dd").format(myDate);
		System.out.println(todayDateStr);
//		get data from rongbachkim
//		get list chot ket qua
		chotkq = String.format(chotkq, todayDateStr);
		ArrayList<chotKQ> arrChotKQ = SoxoAPI.parseChotKQ(chotkq);
		SoxoRepo.insertChotKQ(arrChotKQ);
//		return ket qua object
		URL = String.format(URL, todayDateStr);
		ketqua kq = SoxoAPI.ketquasx(URL);
		kq.setNgaychot(todayDateStr);
		SoxoRepo.insertKetQua(kq);
//		return trend array
		trendURL = String.format(trendURL, todayDateStr);
		SoxoAPI.trendArr(trendURL);
//		return cau dep array
		caudepURL = String.format(caudepURL, todayDateStr);
		List<String> listCaudep = SoxoAPI.caudepArr(caudepURL);
		caudep cd = new caudep();
		cd.setNgaychot(todayDateStr);
		cd.setListCaudep(listCaudep);
		SoxoRepo.insertCauDep(cd);
	}
}
