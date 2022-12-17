package pillihuaman.com.base.request;

import java.util.List;

public class ReqImagenByProduct {

    private String name;
    private int count;
    private int idProduct;
    private String uniqueKeyHash;
    private  String description;
    private List<ImagenDetail> listImagen;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getUniqueKeyHash() {
        return uniqueKeyHash;
    }

    public void setUniqueKeyHash(String uniqueKeyHash) {
        this.uniqueKeyHash = uniqueKeyHash;
    }

    public List<ImagenDetail> getListImagen() {
        return listImagen;
    }

    public void setListImagen(List<ImagenDetail> listImagen) {
        this.listImagen = listImagen;
    }
}
