package pillihuaman.com.lib.response;

import lombok.*;
import org.bson.types.ObjectId;

@Builder
@Getter
@Setter
public class ResponseUser {
    private ObjectId _id;
    private String alias;
    private int id_system;
    private String mail;
    private String mobil_Phone;
    private String user;
    private String username;
    private int enabled;
    private int id_rol;
public  ResponseUser(){}

    public ResponseUser(ObjectId _id, String alias, int id_system, String mail, String mobil_Phone, String user, String username, int enabled, int id_rol) {
        this._id = _id;
        this.alias = alias;
        this.id_system = id_system;
        this.mail = mail;
        this.mobil_Phone = mobil_Phone;
        this.user = user;
        this.username = username;
        this.enabled = enabled;
        this.id_rol = id_rol;
    }
}
