package gr.acmefood.bootstrap;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.*;
import gr.acmefood.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
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


        List<Account> accounts = List.of(
                Account.builder().username("vrail").password("pass")
                        .email("vrailpmm@gmail.com").phone("69584475214")
                        .addressList(new ArrayList<>()).fName("Euagelos").lName("Vrailas").age(22).build(),
                Account.builder().username("angkaps").password("pass")
                        .email("angkaps@gmail.com").phone("69715812302")
                        .addressList(new ArrayList<>()).fName("Angelos").lName("Kapsouros").age(24).build(),
                Account.builder().username("Enjoy").password("password")
                        .email("saingeor@gmail.com").phone("6971548869")
                        .addressList(new ArrayList<>()).fName("Georgia").lName("Saina").age(21).build(),
                Account.builder().username("Joey").password("P@ssw0rd")
                        .email("chatzgeorg@gmail.com").phone("697567887902")
                        .addressList(new ArrayList<>()).fName("George").lName("Chatidakis").age(35).build(),
                Account.builder().username("chatzi").password("p@@@555sssw0rDD")
                        .email("stef1@gmail.com").phone("6972387923")
                        .addressList(new ArrayList<>()).fName("Stefan").lName("Bordea").age(22).build(),
                Account.builder().username("stef").password("qwerty213")
                        .email("theof@gmail.com").phone("69844814485")
                        .addressList(new ArrayList<>()).fName("George").lName("Theofanous").age(21).build()

        );


        List<Address> addressList = List.of(
                Address.builder().state("Attica").city("N.Filadelfeia")
                        .postalCode(14323).streetName("Venizelou").floor(2)
                        .StreetNumber(1).doorbellName("Papaxronis").account(accounts.get(1)).build(),
                Address.builder().state("Attica").city("Agia Paraskevi")
                        .postalCode(14346).streetName("Patriarxou Io.").floor(4)
                        .StreetNumber(39).doorbellName("Nikolaou").account(accounts.get(2)).build(),
                Address.builder().state("Attica").city("Papagou").floor(3)
                        .postalCode(14344).streetName("Nikolaou Plastira")
                        .StreetNumber(15).doorbellName("Fotiou").account(accounts.get(3)).build()
        );

        accountService.createAll(accounts);

        addressService.createAll(addressList);


        List<Product> souvlakiProducts1 = List.of(
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

        List<Product> souvlakiProducts2 = List.of(
                Product.builder().serial("SN111111024").name("Kalamaki X ")
                        .description("Pork  skewer").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN11114436612").name("Kalamaki K")
                        .description("Chicken skewer ").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().serial("SN11116546").name("Souvlaki X wrap")
                        .description("Pork meat wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN11112360014").name("Souvlaki K wrap")
                        .description("Chicken meat wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.20)).build(),
                Product.builder().serial("SN11143543566").name("Kebab")
                        .description("Lamb Kebab skewer").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN11123523523").name("Kebab")
                        .description("Lamb Kebab wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.10)).build(),
                Product.builder().serial("SN14553512").name("Bifteki Mosxarisio")
                        .description("Beef wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(4.10)).build(),
                Product.builder().serial("SN1111252354").name("Chicken kebab")
                        .description("Chicken kebab with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.40)).build()
        );

        List<Product> souvlakiProducts3 = List.of(
                Product.builder().serial("SN111343121").name("Kalamaki X ")
                        .description("Pork  skewer").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN11116710012").name("Kalamaki K")
                        .description("Chicken skewer ").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().serial("SN1112356673").name("Souvlaki X wrap")
                        .description("Pork meat wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN1113462434").name("Souvlaki K wrap")
                        .description("Chicken meat wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.20)).build(),
                Product.builder().serial("SN11123567015").name("Kebab")
                        .description("Lamb Kebab skewer").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN1111435634016").name("Kebab")
                        .description("Lamb Kebab wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.10)).build(),
                Product.builder().serial("SN111231257917").name("Bifteki Mosxarisio")
                        .description("Beef wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(4.10)).build(),
                Product.builder().serial("SN11111078678").name("Chicken kebab")
                        .description("Chicken kebab with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.40)).build()
        );

        List<Product> souvlakiProducts4 = List.of(
                Product.builder().serial("SN1117891").name("Kalamaki X ")
                        .description("Pork  skewer").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN11546542").name("Kalamaki K")
                        .description("Chicken skewer ").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().serial("SN111234563").name("Souvlaki X wrap")
                        .description("Pork meat wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN111348756344").name("Souvlaki K wrap")
                        .description("Chicken meat wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.20)).build(),
                Product.builder().serial("SN111235431").name("Kebab")
                        .description("Lamb Kebab skewer").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN111143853457").name("Kebab")
                        .description("Lamb Kebab wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.10)).build(),
                Product.builder().serial("SN111221316").name("Bifteki Mosxarisio")
                        .description("Beef wrapped with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(4.10)).build(),
                Product.builder().serial("SN11112311072348").name("Chicken kebab")
                        .description("Chicken kebab with ingredients of your choice").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(3.40)).build()
        );

        List<Product> burgerProducts1 = List.of(
                Product.builder().serial("SN11111023116").name("Classic Burger")
                        .description("Classic Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(6.40)).build(),
                Product.builder().serial("SN111143543517").name("Cheese Burger")
                        .description("Cheese Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(7.40)).build(),
                Product.builder().serial("SN11111345348").name("BBQ Burger")
                        .description("BBQ Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(8.40)).build(),
                Product.builder().serial("SN1111345346019").name("Vegan Burger")
                        .description("Vegan Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(5.40)).build()
        );
        List<Product> burgerProducts2 = List.of(
                Product.builder().serial("SN111123131316").name("Classic Burger")
                        .description("Classic Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(6.40)).build(),
                Product.builder().serial("SN111432342347").name("Cheese Burger")
                        .description("Cheese Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(7.40)).build(),
                Product.builder().serial("SN114363454354368").name("Chicken Burger")
                        .description("BBQ Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(8.40)).build(),
                Product.builder().serial("SN11112321456234").name("Crab Burger")
                        .description("Vegan Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(5.40)).build()
        );
        List<Product> burgerProducts3 = List.of(
                Product.builder().serial("SN11213767213566").name("Classic Burger")
                        .description("Classic Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(6.40)).build(),
                Product.builder().serial("SN115464464353527").name("Nugget Burger")
                        .description("Nugget Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(7.40)).build(),
                Product.builder().serial("SN145111525234").name("BBQ Burger")
                        .description("BBQ Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(8.40)).build(),
                Product.builder().serial("SN11156165768").name("Texas Burger")
                        .description("Texas Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(5.40)).build()
        );
        List<Product> burgerProducts4 = List.of(
                Product.builder().serial("SN111110023425016").name("Classic Burger")
                        .description("Classic Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(6.40)).build(),
                Product.builder().serial("SN1111355600017").name("America Burger")
                        .description("America Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(7.40)).build(),
                Product.builder().serial("SN11111001241566018").name("BBQ Burger")
                        .description("BBQ Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(8.40)).build(),
                Product.builder().serial("SN1546436369").name("California Burger")
                        .description("California Burger with fries").productCategory(productCategory2)
                        .price(BigDecimal.valueOf(5.40)).build()
        );

        List<Product> coffeeProducts1 = List.of(
                Product.builder().serial("SN032135602340").name("Espresso")
                        .description("Hot espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.10)).build(),
                Product.builder().serial("SN0004661111").name("Cappuccino")
                        .description("Hot Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.50)).build(),
                Product.builder().serial("SN0003423121112").name("Freddo Espresso")
                        .description("Cold espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN000152323113").name("Freddo Cappuccino")
                        .description("Cold Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().serial("SN0001122215114").name("Frappe")
                        .description("Frappe coffee").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.90)).build()
        );

        List<Product> coffeeProducts2 = List.of(
                Product.builder().serial("SN006786782340").name("Espresso")
                        .description("Hot espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.10)).build(),
                Product.builder().serial("SN023567001111").name("Cappuccino")
                        .description("Hot Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.50)).build(),
                Product.builder().serial("SN001245101112").name("Freddo Espresso")
                        .description("Cold espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN023255001113").name("Freddo Cappuccino")
                        .description("Cold Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().serial("SN00112301114").name("Frappe")
                        .description("Frappe coffee").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.90)).build()
        );
        List<Product> coffeeProducts3 = List.of(
                Product.builder().serial("SN002340213213").name("Espresso")
                        .description("Hot espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.10)).build(),
                Product.builder().serial("SN0001111575").name("Cappuccino")
                        .description("Hot Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.50)).build(),
                Product.builder().serial("SN0001112567").name("Freddo Espresso")
                        .description("Cold espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN0001113567657").name("Freddo Cappuccino")
                        .description("Cold Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().serial("SN000111423424").name("Frappe")
                        .description("Frappe coffee").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.90)).build()
        );
        List<Product> coffeeProducts4 = List.of(
                Product.builder().serial("SN002340").name("Espresso")
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

        List<Product> coffeeProducts5 = List.of(
                Product.builder().serial("SN090002340").name("Espresso")
                        .description("Hot espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.10)).build(),
                Product.builder().serial("SN00900001111").name("Cappuccino")
                        .description("Hot Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.50)).build(),
                Product.builder().serial("SN009090001112").name("Freddo Espresso")
                        .description("Cold espresso one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().serial("SN000097670001113").name("Freddo Cappuccino")
                        .description("Cold Capuccino one dose").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().serial("SN0001114").name("Frappe")
                        .description("Frappe coffee").productCategory(productCategory4)
                        .price(BigDecimal.valueOf(1.90)).build()
        );

        List<Product> souvlakia1 = productService.createAll(souvlakiProducts1);
        List<Product> souvlakia2 = productService.createAll(souvlakiProducts2);
        List<Product> souvlakia3 = productService.createAll(souvlakiProducts3);
        List<Product> souvlakia4 = productService.createAll(souvlakiProducts4);

        List<Product> burgers1 = productService.createAll(burgerProducts1);
        List<Product> burgers2 = productService.createAll(burgerProducts2);
        List<Product> burgers3 = productService.createAll(burgerProducts3);
        List<Product> burgers4 = productService.createAll(burgerProducts4);

        List<Product> coffees1 = productService.createAll(coffeeProducts1);
        List<Product> coffees2 = productService.createAll(coffeeProducts2);
        List<Product> coffees3 = productService.createAll(coffeeProducts3);
        List<Product> coffees4 = productService.createAll(coffeeProducts4);
        List<Product> coffees5 = productService.createAll(coffeeProducts5);


        List<Store> souvlakiStores = List.of(
                Store.builder().name("Soublakes").storeCategory(StoreCategory.SOUVLAKI)
                        .address("Antypa 10").products(souvlakiProducts1).build(),
                Store.builder().name("BarbaLias").storeCategory(StoreCategory.SOUVLAKI)
                        .address("Dekeleias 123").products(souvlakiProducts2).build(),
                Store.builder().name("Souvlakoupoli").storeCategory(StoreCategory.SOUVLAKI)
                        .address("Smyrnis 31").products(souvlakiProducts3).build(),
                Store.builder().name("Poli").storeCategory(StoreCategory.SOUVLAKI)
                        .address("Labraki 23").products(souvlakiProducts4).build()
        );

        List<Store> burgerStores = List.of(
                Store.builder().name("BBQ").storeCategory(StoreCategory.BURGER)
                        .address("Antypa 10").products(burgerProducts1).build(),
                Store.builder().name("1933 Burgers").storeCategory(StoreCategory.BURGER)
                        .address("Dekeleias 123").products(burgerProducts2).build(),
                Store.builder().name("Goodys BurgerHouse").storeCategory(StoreCategory.BURGER)
                        .address("Simple Burgers 31").products(burgerProducts3).build(),
                Store.builder().name("Poli").storeCategory(StoreCategory.BURGER)
                        .address("Labraki 23").products(burgerProducts4).build()
        );

        List<Store> coffeeStores = List.of(
                Store.builder().name("Il Toto").storeCategory(StoreCategory.COFFEE)
                        .address("Antypa 10").products(coffeeProducts1).build(),
                Store.builder().name("Baratin").storeCategory(StoreCategory.COFFEE)
                        .address("Dekeleias 123").products(coffeeProducts2).build(),
                Store.builder().name("Goodys BurgerHouse").storeCategory(StoreCategory.COFFEE)
                        .address("Smyrnis 31").products(coffeeProducts3).build(),
                Store.builder().name("Coffee Island").storeCategory(StoreCategory.COFFEE)
                        .address("Labraki 23").products(coffeeProducts4).build(),
                Store.builder().name("Coffee Beelding").storeCategory(StoreCategory.COFFEE)
                        .address("Ionias 23").products(coffeeProducts5).build()
        );


        List<Store> persistedSouvlakiStores = storeService.createAll(souvlakiStores);
        List<Store> persistedBurgerStores = storeService.createAll(burgerStores);
        List<Store> persistedCoffeeStores = storeService.createAll(coffeeStores);


        //var x = storeService.findByStoreCategory(StoreCategory.SOUVLAKI);
        //x.forEach(i -> logger.info("{}", i.getName()));


    }
}
