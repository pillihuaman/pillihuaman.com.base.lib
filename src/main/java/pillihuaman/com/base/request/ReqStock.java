package pillihuaman.com.base.request;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;
import pillihuaman.com.base.response.RespColor;
import pillihuaman.com.base.response.RespSize;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component
public class ReqStock implements Serializable {
    private static final long serialVersionUID = 1L;
    @BsonId
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId _id;
    private String idProduct;
    private Date expirationDate;
    private Date creationDate;
    private List<ReqSize> size;


    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<ReqSize> getSize() {
        return size;
    }

    public void setSize(List<ReqSize> size) {
        this.size = size;
    }


}