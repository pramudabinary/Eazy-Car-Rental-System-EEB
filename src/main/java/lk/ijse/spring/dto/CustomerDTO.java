package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/12/21
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private String id;
    private String full_name;
    private String user_name;
    private String address;
    private String email;
    private String contact;
    private String nic;
    private String license;
    private String password;
}
