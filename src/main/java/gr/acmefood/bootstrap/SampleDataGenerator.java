package gr.acmefood.bootstrap;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.*;
import gr.acmefood.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SampleDataGenerator extends BaseComponent implements CommandLineRunner {
    private final ProductCategoryService productCategoryService;
    private final ProductService productService;
    private final AddressService addressService;

    private final OrderService orderService;

    private final AccountService accountService;
    private final StoreService storeService;

    @Override
    public void run(String... args) throws Exception {

       //formatter:off

        ProductCategory productCategory1 = productCategoryService.create(ProductCategory.builder().name("Drink").build());
        logger.trace("Product Category {}, created", productCategory1);
        ProductCategory productCategory2 = productCategoryService.create(ProductCategory.builder().name("Food").build());
        logger.trace("Product Category {}, created", productCategory2);
        ProductCategory productCategory3 = productCategoryService.create(ProductCategory.builder().name("Groceries").build());
        logger.trace("Product Category {}, created", productCategory3);
        ProductCategory productCategory4 = productCategoryService.create(ProductCategory.builder().name("Coffee").build());
        logger.trace("Product Category {}, created", productCategory4);
        ProductCategory productCategory5 = productCategoryService.create(ProductCategory.builder().name("Alcohol").build());
        logger.trace("Product Category {}, created", productCategory5);


        Address address1 = addressService.create(
                Address.builder().state("Attica").city("Athens").postalCode(14343).streetName("Benizelou")
                        .StreetNumber(12).doorbellName("Papaxronis").floor(1).build());
        Address address2 = addressService.create(
                Address.builder().state("Attica").city("Athens").postalCode(14343).streetName("Papanastasiou")
                        .StreetNumber(12).doorbellName("Betzou").floor(1).build());
        Address address3 = addressService.create(
                Address.builder().state("Attica").city("Athens").postalCode(14343).streetName("Pireos")
                        .StreetNumber(12).doorbellName("Manolidou").floor(1).build());
        Address address4 = addressService.create(
                Address.builder().state("Attica").city("Athens").postalCode(14343).streetName("Kapsourou")
                        .StreetNumber(12).doorbellName("lakis").floor(1).build());
        Address address5 = addressService.create(
                Address.builder().state("Attica").city("Athens").postalCode(14343).streetName("Ignatiou")
                        .StreetNumber(12).doorbellName("takis").floor(1).build());
        Address address6 = addressService.create(
                Address.builder().state("Attica").city("Athens").postalCode(14343).streetName("Smyrnis")
                        .StreetNumber(12).doorbellName("Makis").floor(1).build());



        Product product1 = productService.create(Product.builder().productCategory(productCategory1).
                name("Coca").price(BigDecimal.valueOf(2.50)).serial("SN-21-1115646423").description("Favourite beverage").build());


        List<Product> souvlakiProducts = List.of(
                Product.builder().serial("SN11111100013121").name("Kalamaki X ")
                        .description("Pork  skewer").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN11114100012").name("Kalamaki K")
                        .description("Chicken skewer ").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().serial("SN1111100013").name("Souvlaki X wrap")
                        .description("Pork meat wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN1111100014").name("Souvlaki K wrap")
                        .description("Chicken meat wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.20)).build(),
                Product.builder().serial("SN1111100015").name("Kebab")
                        .description("Lamb Kebab skewer").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN1111100016").name("Kebab")
                        .description("Lamb Kebab wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.10)).build(),
                Product.builder().serial("SN1111100017").name("Bifteki Mosxarisio")
                        .description("Beef wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(4.10)).build(),
                Product.builder().serial("SN1111100018").name("Chicken kebab")
                        .description("Chicken kebab with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.40)).build()
        );

        List<Product> burgerProducts = List.of(
                Product.builder().serial("SN1111100016").name("Classic Burger")
                        .description("Classic Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(6.40)).build(),
                Product.builder().serial("SN1111100017").name("Cheese Burger")
                        .description("Cheese Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(7.40)).build(),
                Product.builder().serial("SN1111100018").name("BBQ Burger")
                        .description("BBQ Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(8.40)).build(),
                Product.builder().serial("SN1111100019").name("Vegan Burger")
                        .description("Vegan Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(5.40)).build()
        );

        List<Product> coffeeProducts = List.of(
                Product.builder().serial("SN0001110").name("Espresso")
                        .description("Hot espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.10)).build(),
                Product.builder().serial("SN0001111").name("Cappuccino")
                        .description("Hot Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.50)).build(),
                Product.builder().serial("SN0001112").name("Freddo Espresso")
                        .description("Cold espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN0001113").name("Freddo Cappuccino")
                        .description("Cold Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().serial("SN0001114").name("Frappe")
                        .description("Frappe coffee").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.90)).build()
        );


        List<Product> souvlakia = productService.createAll(souvlakiProducts);
        List<Product> burgers = productService.createAll(burgerProducts);
        List<Product> kafedes = productService.createAll(coffeeProducts);
        Store souvlatzidiko = storeService.create(Store.builder().name("Savas").storeCategory(StoreCategory.SOUVLAKI).address("Dekeleias 311").products(souvlakia).build());
        Store burgeradiko = storeService.create(Store.builder().name("BBQ").storeCategory(StoreCategory.BURGER).address("Dekeleias 323").products(burgers).build());
        Store Kafeteria = storeService.create(Store.builder().name("Il Toto").storeCategory(StoreCategory.COFFEE).address("Dekeleias 33").products(kafedes).build());


//        List<Store> souvlakiStores = List.of(
//                Store.builder().name("Soublakes").storeCategory(StoreCategory.SOUVLAKI)
//                        .address("Antypa 10").products(souvlakiProducts).build(),
//                Store.builder().name("BarbaLias").storeCategory(StoreCategory.SOUVLAKI)
//                        .address("Dekeleias 123").products(souvlakiProducts).build(),
//                Store.builder().name("Souvlakoupoli").storeCategory(StoreCategory.SOUVLAKI)
//                        .address("Smyrnis 31").products(souvlakiProducts).build(),
//                Store.builder().name("Poli").storeCategory(StoreCategory.SOUVLAKI)
//                        .address("Labraki 23").products(souvlakiProducts).build()
//        );

//        List<Store> burgerStores = List.of(
//                Store.builder().name("Soublakes").storeCategory(StoreCategory.BURGER)
//                        .address("Antypa 10").products(burgerProducts).build(),
//                Store.builder().name("BarbaLias").storeCategory(StoreCategory.BURGER)
//                        .address("Dekeleias 123").products(burgerProducts).build(),
//                Store.builder().name("Souvlakoupoli").storeCategory(StoreCategory.BURGER)
//                        .address("Smyrnis 31").products(burgerProducts).build(),
//                Store.builder().name("Poli").storeCategory(StoreCategory.BURGER)
//                        .address("Labraki 23").products(burgerProducts).build()
//        );




        List<Address> addressList = List.of(
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
                Account.builder().username("vrail").password("pass")
                        .email("vrailpmm@gmail.com").phone("69584475214")
                        .addressList(addressList).fName("Euagelos").lName("Vrailas").age(22).build(),
                Account.builder().username("angkaps").password("pass")
                        .email("angkaps@gmail.com").phone("69715812302")
                        .addressList(addressList).fName("Angelos").lName("Kapsouros").age(24).build(),
                Account.builder().username("Enjoy").password("password")
                        .email("saingeor@gmail.com").phone("6971548869")
                        .addressList(addressList).fName("Georgia").lName("Saina").age(21).build(),
                Account.builder().username("vrail").password("P@ssw0rd")
                        .email("chatzgeorg@gmail.com").phone("697567887902")
                        .addressList(addressList).fName("George").lName("Chatidakis").age(35).build(),
                Account.builder().username("chatzi").password("p@@@555sssw0rDD")
                        .email("stef1@gmail.com").phone("6972387923")
                        .addressList(addressList).fName("Stefan").lName("Bordea").age(22).build(),
                Account.builder().username("stef").password("qwerty213")
                        .email("theof@gmail.com").phone("69844814485")
                        .addressList(addressList).fName("George").lName("Theofanous").age(21).build()

        );



//        List<Account> persistedAccounts = accountService.createAll(accounts);

        Account account1 = accountService.create(Account.builder().username("vrail").password("pass")
                .email("vrailpmm@gmail.com").phone("69584475214")
                .addressList(addressList).fName("Euagelos").lName("Vrailas").age(22).build());






    }
}
