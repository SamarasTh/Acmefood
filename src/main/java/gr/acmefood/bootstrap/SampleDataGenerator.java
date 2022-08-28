package gr.acmefood.bootstrap;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.Account;
import gr.acmefood.domain.Address;
import gr.acmefood.domain.ProductCategory;
import gr.acmefood.service.AccountService;
import gr.acmefood.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SampleDataGenerator extends BaseComponent implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        //formatter:off
        List<Address> addresList = List.of(
           Address.builder().state("Attica").city("N.Filadelfeia")
                   .postalCode(14323).streetName("Venizelou")
                   .StreetNumber(1).doorbellName("Papaxronis").build(),
           Address.builder().state("Attica").city("Agia Paraskevi")
                   .postalCode(14346).streetName("Patriarxou Ioakeim")
                   .StreetNumber(39).doorbellName("Nikolaou").build(),
           Address.builder().state("Attica").city("Papagou")
                   .postalCode(14344).streetName("Nikolaou Plastira")
                   .StreetNumber(15).doorbellName("Fotiou").build()
                );


        List<Account> accounts = List.of(
                Account.builder().username("ths1311").password("pass")
                        .email("ths1311@gmail.com").phone("6971587902")
                        .addressList(addresList).build(),
                Account.builder().username("angkaps").password("password")
                        .email("Kapsang@gmail.com").phone("697123422984")
                        .addressList(addresList).build(),
                Account.builder().username("Joey").password("pass123123")
                        .email("EnJoey@gmail.com").phone("69754683004")
                        .addressList(addresList).build(),
                Account.builder().username("Vrailas").password("pP@ssw0rd")
                        .email("vagvral@gmail.com").phone("69715234244")
                        .addressList(addresList).build(),
                Account.builder().username("Sergios").password("passtopassfo13124")
                        .email("serg@gmail.com").phone("69715853543")
                        .addressList(addresList).build(),
                Account.builder().username("Alexandra").password("alexpassfo2022")
                        .email("alex@gmail.com").phone("69715853500")
                        .addressList(addresList).build()

        );

    }
}
