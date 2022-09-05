package gr.acmefood.service;

import gr.acmefood.domain.Address;
import gr.acmefood.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl extends BaseServiceImpl<Address> implements AddressService{

    private final AddressRepository addressRepository;

    @Override
    public JpaRepository<Address, Long> getRepository() {
        return addressRepository;
    }
}
