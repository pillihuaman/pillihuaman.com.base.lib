package pillihuaman.com.base.response;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

import java.util.List;


@JGlobalMap
@Data
public class RespImagenGeneral {
	private String tokenCol;
	private List<CorouselImage> lstCorouseImages;

}


