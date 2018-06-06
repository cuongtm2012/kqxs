package app;

import lode.SoxoAPI;
import lode.Utility;

public class main {

	static String URL = "https://rongbachkim.com/";
	static String chotkq = "https://rongbachkim.com/chot.php?getlist&ngay=2018-06-01&lastid=0&lastupdate=0";
	static Utility util = new Utility();
	static SoxoAPI soxoAPI = new SoxoAPI();

//	get data form rongbachkim & ketqua.net
	public static void main(String[] args) {
//		get data from rongbachkim
//		get list chot ket qua
		soxoAPI.parseChotKQ(chotkq);
//		return ket qua object
		soxoAPI.ketquasx(URL);
//		return trend array
		soxoAPI.trendArr(URL);
//		return cau dep array
		soxoAPI.caudepArr(URL);
		
		
		
		
//		get data from ketqua.net
		
	}
}
