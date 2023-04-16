package pillihuaman.com.base.response;
import java.math.BigInteger;

import com.googlecode.jmapper.annotations.JGlobalMap;

public class RespColor {
	
	private BigInteger idColor;
	private String name;

	public BigInteger getIdColor() {
		return idColor;
	}

	public void setIdColor(BigInteger idColor) {
		this.idColor = idColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


