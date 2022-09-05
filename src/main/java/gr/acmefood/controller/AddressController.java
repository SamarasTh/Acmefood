package gr.acmefood.controller;

import gr.acmefood.domain.Address;
import gr.acmefood.service.AddressService;
import gr.acmefood.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("Addresses")
public class AddressController extends AbstractController<Address>{

    private final AddressService addressService;
    @Override
    public BaseService<Address> getBaseService() {return addressService;}
}
