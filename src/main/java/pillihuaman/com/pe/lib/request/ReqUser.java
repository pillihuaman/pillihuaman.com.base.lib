package pillihuaman.com.pe.lib.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pillihuaman.com.pe.lib.dto.ThemesRequest;

import java.io.Serializable;


@Getter
@Setter
@Builder
public class ReqUser implements  Serializable  {

	private String alias;
	private String email;
	private String mobilPhone;
	private String user;
	private String userName;
	private String apiPassword;
	private String password;
	private String salPassword;
	private ThemesRequest themes;
	private  SystemRequest system;

	public ReqUser(String alias, String email, String mobilPhone, String user, String userName, String apiPassword, String password, String salPassword, ThemesRequest themes, SystemRequest system) {
		this.alias = alias;
		this.email = email;
		this.mobilPhone = mobilPhone;
		this.user = user;
		this.userName = userName;
		this.apiPassword = apiPassword;
		this.password = password;
		this.salPassword = salPassword;
		this.themes = themes;
		this.system = system;
	}

	public ReqUser(String alias, String email, String mobilPhone, String user, String userName, String apiPassword, String password, String salPassword) {
		this.alias = alias;
		this.email = email;
		this.mobilPhone = mobilPhone;
		this.user = user;
		this.userName = userName;
		this.apiPassword = apiPassword;
		this.password = password;
		this.salPassword = salPassword;
	}
	public ReqUser(){}
}


