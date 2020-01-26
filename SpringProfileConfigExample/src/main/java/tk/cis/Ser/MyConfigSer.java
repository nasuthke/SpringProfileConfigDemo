package tk.cis.Ser;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("service")
public class MyConfigSer {
	private String url;
	private String usrid;
	private String pw;
	
	public MyConfigSer(String url, String userid, String pw) {
		super();
		this.url = url;
		this.usrid = userid;
		this.pw = pw;
	}
	
	

	public MyConfigSer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

	public String getUsrid() {
		return usrid;
	}



	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}



	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}



	@Override
	public String toString() {
		return "MyConfigService [url=" + url + ", userid=" + usrid + ", pw=" + pw + "]";
	}
	
	

}
