package pillihuaman.com.base.request;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.googlecode.jmapper.annotations.JGlobalMap;


import java.util.List;


public class ReqColor {

	private String idProduct;
	private List<ImagenDetail> listImagen;

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public List<ImagenDetail> getListImagen() {
		return listImagen;
	}

	public void setListImagen(List<ImagenDetail> listImagen) {
		this.listImagen = listImagen;
	}
}


