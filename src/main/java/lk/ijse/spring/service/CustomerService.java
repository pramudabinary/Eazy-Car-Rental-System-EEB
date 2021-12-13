package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/13/21
 **/
public interface CustomerService {
    void registerCustomer(CustomerDTO dto);
}
