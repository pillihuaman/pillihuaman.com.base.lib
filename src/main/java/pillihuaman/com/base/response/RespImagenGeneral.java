package pillihuaman.com.base.response;

import com.googlecode.jmapper.annotations.JGlobalMap;

import java.util.List;

public class RespImagenGeneral {
	private String tokenCol;
	private List<CorouselImage> lstCorouseImages;

	public String getTokenCol() {
		return tokenCol;
	}

	public void setTokenCol(String tokenCol) {
		this.tokenCol = tokenCol;
	}

	public List<CorouselImage> getLstCorouseImages() {
		return lstCorouseImages;
	}

	public void setLstCorouseImages(List<CorouselImage> lstCorouseImages) {
		this.lstCorouseImages = lstCorouseImages;
	}
}


