package lode;

public class main {

	static String chotkq = "https://rongbachkim.com/chot.php?getlist&ngay=2018-06-01&lastid=0&lastupdate=0";
	static Utility util = new Utility();
	static SoxoAPI soxoAPI = new SoxoAPI();

	public static void main(String[] args) {
		soxoAPI.parseChotKQ(chotkq);
	}

}
