package app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import domain.chotKQ;
import lode.SoxoAPI;
import lode.Utility;

public class main {

	static String URL = "https://rongbachkim.com/";
	static String chotkq = "https://rongbachkim.com/chot.php?getlist&ngay=%s&lastid=0&lastupdate=0";
	static String trendURL = "https://rongbachkim.com/trend.php?list&alone&day=%s&trendlimit=100";
	static String caudepURL = "https://rongbachkim.com/soicau.html?ngay=%s&limit=6&exactlimit=0&lon=1&nhay=1&db=0";
	static Utility util = new Utility();
	static SoxoAPI soxoAPI = new SoxoAPI();

//	get data form rongbachkim & ketqua.net
	public static void main(String[] args) {
		Date myDate = new Date();
		String todayDateStr = new SimpleDateFormat("yyyy-MM-dd").format(myDate);
		System.out.println(todayDateStr);
//		get data from rongbachkim
//		get list chot ket qua
		chotkq = String.format(chotkq, todayDateStr);
		ArrayList<chotKQ> arrChotKQ = SoxoAPI.parseChotKQ(chotkq);
//		return ket qua object
		URL = String.format(URL, todayDateStr);
		SoxoAPI.ketquasx(URL);
//		return trend array
		trendURL = String.format(trendURL, todayDateStr);
		SoxoAPI.trendArr(trendURL);
//		return cau dep array
		caudepURL = String.format(caudepURL, todayDateStr);
		SoxoAPI.caudepArr(caudepURL);
		
		
		
		
//		get data from ketqua.net
		
	}
}
