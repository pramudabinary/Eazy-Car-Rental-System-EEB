package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/12/21
 **/
@RestController
@RequestMapping("api/v1/customer")
public class CustomerFormController {

    @Autowired
    private CustomerService service;

    public void registerCustomer(@RequestBody CustomerDTO dto){
        service.registerCustomer(dto);
    }
}
