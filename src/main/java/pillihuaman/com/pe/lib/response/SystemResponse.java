package pillihuaman.com.pe.lib.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.awt.*;

@Data
@Builder
@AllArgsConstructor
public class SystemResponse {
    private String id; // You can use String for the ID here
    private String name;
    private String version;
    private Menu mainMenu;
    private String timezone;
    private boolean isActive;
    private String contactEmail;
    private String supportPhone;
}
