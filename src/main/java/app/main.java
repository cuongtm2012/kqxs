package app;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import services.SoxoAPI;
import until.Utility;

public class main {
	static Utility util = new Utility();
	static SoxoAPI soxoAPI = new SoxoAPI();

	// get data form rongbachkim & ketqua.net
	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			InputStream input = main.class.getClassLoader().getResourceAsStream("application.properties");
			prop.load(input);

			String url = prop.getProperty("kqxs.rongbachkim.url");
			String chotkq = prop.getProperty("kqxs.rongbachkim.chotso");
			String trendUrl = prop.getProperty("kqxs.rongbachkim.trend");
			String soicauUrl = prop.getProperty("kqxs.rongbachkim.soicau");
			// get data from rongbachkim
			// get list chot ket qua
			soxoAPI.parseChotKQ(chotkq);
			// return ket qua object
			// soxoAPI.ketquasx(url);
			// // return trend array
			// soxoAPI.trendArr(trendUrl);
			// // return cau dep array
			// soxoAPI.caudepArr(soicauUrl);

		} catch (Exception e) {
			System.out.println(e);
		}

		// get data from ketqua.net

	}
}
