package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/13/21
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Customer {

//    @Transient
//    public static final String SEQUENCE_NAME="users_sequence";

    @Id
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
