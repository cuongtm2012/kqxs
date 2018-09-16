package util;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Utility {

	private WebClient webClient;
	static int WEBTIMEOUT = 10000;

	public static String obtainContent(String url) {
		String content = null;
		URLConnection connection = null;
		try {
			connection = new URL(url).openConnection();
			connection.addRequestProperty("User-Agent", "Chrome");
			connection.setConnectTimeout(WEBTIMEOUT);
			connection.setReadTimeout(WEBTIMEOUT);
			Scanner scanner = new Scanner(connection.getInputStream());
			scanner.useDelimiter("\\Z");
			content = scanner.next();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return content;
	}

	public String obtainContentBypassShield(String url) {
		String result = null;
		try {
			Page page = webClient.getPage(url);
			result = ((HtmlPage) page).asXml();
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return result;
	}

}
