package pillihuaman.com.segurity.lib.response;

import org.bson.types.ObjectId;

public class ResponseUser {
    private ObjectId _id;
    private String alias;
    private  int id_system;
    private String mail;
    private String mobil_Phone;
    private String user;
    private String username;
    private   int enabled;
    private int id_rol;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getId_system() {
        return id_system;
    }

    public void setId_system(int id_system) {
        this.id_system = id_system;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobil_Phone() {
        return mobil_Phone;
    }

    public void setMobil_Phone(String mobil_Phone) {
        this.mobil_Phone = mobil_Phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
}
