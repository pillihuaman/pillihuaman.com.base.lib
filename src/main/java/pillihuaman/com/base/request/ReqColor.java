package pillihuaman.com.base.request;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Getter;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import java.math.BigInteger;
import java.util.List;


@JGlobalMap
@Getter
@Setter
public class ReqColor {

	private ObjectId idProduct;
	private List<ImagenDetail> listImagen;

	public ObjectId getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(ObjectId idProduct) {
		this.idProduct = idProduct;
	}

	public List<ImagenDetail> getListImagen() {
		return listImagen;
	}

	public void setListImagen(List<ImagenDetail> listImagen) {
		this.listImagen = listImagen;
	}
}


