package pillihuaman.com.lib.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import pillihuaman.com.lib.request.ReqControl;

import java.util.List;
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class RespControl {
    private ObjectId id;
    private String idCode;
    private String description;
    private String icono;
    private String iconClass;
    private int status;
    private String styleClass;
    private String id_user;
    private String text;
}


