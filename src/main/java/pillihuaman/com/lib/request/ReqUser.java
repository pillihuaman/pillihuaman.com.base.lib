package pillihuaman.com.lib.request;
import lombok.*;
import org.bson.types.ObjectId;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor // Add this annotation for the all-argument constructor
@Builder
@ToString
public class ReqUser  {

	private ObjectId idUser;
	private String alias;
	private  ObjectId idSystem;
	private String email;
	private String mobilPhone;
	private String user;
	private String userName;
	private String apiPassword;
	private String password;
	private String salPassword;
	private   boolean enabled;
	private ObjectId idRol;

}


