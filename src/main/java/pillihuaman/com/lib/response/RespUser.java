package pillihuaman.com.lib.response;


import lombok.*;
import org.bson.types.ObjectId;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor // Add this annotation for the all-argument constructor
@Builder
@ToString
public class RespUser {
	
	private ObjectId idUser;
	private String alias;
	private  ObjectId idSystem;
	private String mail;
	private String mobilPhone;
	private String user;
	private String userName;
	private   int enabled;
	private ObjectId idRol;

}


