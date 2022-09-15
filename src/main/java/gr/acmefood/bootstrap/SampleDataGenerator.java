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

    private final StoreCategoryService storeCategoryService;

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
                        .addressList(new ArrayList<>()).fName("Euagelos")
                        .lName("Vrailas").age(22).build(),
                Account.builder().username("angkaps").password("pass")
                        .email("angkaps@gmail.com").phone("69715812302")
                        .addressList(new ArrayList<>()).fName("Angelos")
                        .lName("Kapsouros").age(24).build(),
                Account.builder().username("Enjoy").password("password")
                        .email("saingeor@gmail.com").phone("6971548869")
                        .addressList(new ArrayList<>()).fName("Georgia")
                        .lName("Saina").age(21).build(),
                Account.builder().username("Joey").password("P@ssw0rd")
                        .email("chatzgeorg@gmail.com").phone("697567887902")
                        .addressList(new ArrayList<>()).fName("George")
                        .lName("Chatidakis").age(35).build(),
                Account.builder().username("chatzi").password("p@@@555sssw0rDD")
                        .email("stef1@gmail.com").phone("6972387923")
                        .addressList(new ArrayList<>()).fName("Stefan")
                        .lName("Bordea").age(22).build(),
                Account.builder().username("stef").password("qwerty213")
                        .email("theof@gmail.com").phone("69844814485")
                        .addressList(new ArrayList<>()).fName("George")
                        .lName("Theofanous").age(21).build()

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

//        STORE CATEGORIES

        List<StoreCategory> storeCategories = List.of(
                StoreCategory.builder().name("Pizza")
                        .imgUrl("assets/img/service/1.png").build(),
                StoreCategory.builder().name("Σουβλάκια")
                        .imgUrl("assets/img/service/8.png").build(),
                StoreCategory.builder().name("Burger")
                        .imgUrl("assets/img/service/3.png").build(),
                StoreCategory.builder().name("Καφές")
                        .imgUrl("assets/img/service/9.png").build(),
                StoreCategory.builder().name("Κινέζικο")
                        .imgUrl("assets/img/service/2.png").build(),
                StoreCategory.builder().name("Ζυμαρικά")
                        .imgUrl("assets/img/service/4.png").build(),
                StoreCategory.builder().name("Vegetarian")
                        .imgUrl("assets/img/service/5.png").build(),
                StoreCategory.builder().name("Μεξικάνικο")
                        .imgUrl("assets/img/service/6.png").build(),
                StoreCategory.builder().name("Mαγειρευτά")
                        .imgUrl("assets/img/service/7.png").build(),
                StoreCategory.builder().name("Γλυκά")
                        .imgUrl("assets/img/service/10.png").build(),
                StoreCategory.builder().name("Super Market")
                        .imgUrl("assets/img/service/11.png").build(),
                StoreCategory.builder().name("Sushi")
                        .imgUrl("assets/img/service/12.png").build()
        );

        storeCategoryService.createAll(storeCategories);

        //        STORES
        //        SOUVLAKI


        //    BURGERS
        Store burgerStore1 = Store.builder().name("Butcher's Burger & steak house ").storeCategory(storeCategories.get(2))
                .address("ΒΕΪΚΟΥ 43")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1658145208_295258@3x.png ")
                .build();
        Store burgerStore2 = Store.builder().name(" Hot hot burger Νέα Φιλαδέλφεια").storeCategory(storeCategories.get(2))
                .address(" Βρυούλων 3")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x263023@3x.png")
                .build();
        Store burgerStore3 = Store.builder().name("1933 Burgers ").storeCategory(storeCategories.get(2))
                .address("Λεωφ. Δεκελείας 10 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257743@3x.png ")
                .build();
        Store burgerStore4 = Store.builder().name(" Μπαρ μπεε κιου").storeCategory(storeCategories.get(2))
                .address("Λ.ΔΕΚΕΛΕΙΑΣ 106, Νέα Φιλαδέλφεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1655992690_294457@3x.png")
                .build();
        Store burgerStore5 = Store.builder().name("Goody's Burger House ").storeCategory(storeCategories.get(2))
                .address("ΔEKEΛEIΑΣ 100, Νέα Φιλαδέλφεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574711542_256508@3x.png ")
                .build();
        Store burgerStore6 = Store.builder().name(" Μέθεξη").storeCategory(storeCategories.get(2))
                .address(" Νεότητος 2, Νέο Ηράκλειο")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x255461@3x.png ")
                .build();
        Store burgerStore7 = Store.builder().name("Σάββας κεμπάπ").storeCategory(storeCategories.get(7))
                .address("Λεωφόρος Δεκελείας 80,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x253721@3x.png")
                .build();
        Store burgerStore8 = Store.builder().name("The Bronx Cantina ").storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore9 = Store.builder().name("The Bronx Cantina ").storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore10 = Store.builder().name("The Bronx Cantina ").storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore11 = Store.builder().name("The Bronx Cantina ").storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore12 = Store.builder().name("The Bronx Cantina ").storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore13 = Store.builder().name("The Bronx Cantina ").storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();

        // COFFEE
        Store coffeeStore1 = Store.builder().name("Coffee Science  ").storeCategory(storeCategories.get(3))
                .address("Λεωφόρος Ιωνίας 233")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x252894@3x.png")
                .build();
        Store coffeeStore2 = Store.builder().name(" ST COFFEE ").storeCategory(storeCategories.get(3))
                .address("Αγίων Αναργύρων 35")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1632740114_276750@3x.png ")
                .build();
        Store coffeeStore3 = Store.builder().name("KAME HOUSE").storeCategory(storeCategories.get(3))
                .address(" Λασκαράτου 11 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1641314803_282122@3x.png ")
                .build();
        Store coffeeStore4 = Store.builder().name(" IL Toto Roastery ").storeCategory(storeCategories.get(3))
                .address("28ης Οκτωβρίου 347")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x266847@3x.png")
                .build();
        Store coffeeStore5 = Store.builder().name(" Coffee Berry ").storeCategory(storeCategories.get(3))
                .address(" Χαλκίδος 2,  ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1638358007_284429@3x.png ")
                .build();
        Store coffeeStore6 = Store.builder().name("Coffee Lab ").storeCategory(storeCategories.get(3))
                .address(" Δεκελείας 114 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x258930@3x.png")
                .build();
        Store coffeeStore7 = Store.builder().name("Mikel").storeCategory(storeCategories.get(3))
                .address(" ΠΙΝΔΟΥ 1 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1658925802_261792@3x.png ")
                .build();
        Store coffeeStore8 = Store.builder().name("Γρηγόρης").storeCategory(storeCategories.get(3))
                .address("Αλεξάνδρου 50")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574329855_1@3x.png")
                .build();
        Store coffeeStore9 = Store.builder().name(" Nine Grams ").storeCategory(storeCategories.get(3))
                .address(" Δεκελείας 110, ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257816@3x.png ")
                .build();
        Store coffeeStore10 = Store.builder().name(" Libertine ").storeCategory(storeCategories.get(3))
                .address("ΔΕΚΕΛΕΙΑΣ 114")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1660213098_294778@3x.png  ")
                .build();
        Store coffeeStore11 = Store.builder().name("Uggla").storeCategory(storeCategories.get(3))
                .address("  ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1652800651_293665@3x.png ")
                .build();
        Store coffeeStore12 = Store.builder().name(" Coffee Island ").storeCategory(storeCategories.get(3))
                .address("Πατησίων 378  ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1645628107_coffee-island-new.jpg")
                .build();
        Store coffeeStore13 = Store.builder().name(" Bread & Cup ").storeCategory(storeCategories.get(3))
                .address(" Αλεξάνδρου 50 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1646827732_292211@3x.png ")
                .build();
        Store coffeeStore14 = Store.builder().name("EVEREST").storeCategory(storeCategories.get(3))
                .address(" Αλεξάνδρου 50 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1573163818_250807@3x.png ")
                .build();


//        List<Store> persistedSouvlakiStores = storeService.createAll(souvlakiStores);
//        List<Store> persistedBurgerStores = storeService.createAll(burgerStores);
//        List<Store> persistedCoffeeStores = storeService.createAll(coffeeStores);

//        Store persistedSouvlakiStore1 = storeService.create(souvlakiStore1);
//        Store persistedSouvlakiStore2 = storeService.create(souvlakiStore2);
//        Store persistedSouvlakiStore3 = storeService.create(souvlakiStore3);
//        Store persistedSouvlakiStore4 = storeService.create(souvlakiStore4);
//        Store persistedSouvlakiStore5 = storeService.create(souvlakiStore5);
//        Store persistedSouvlakiStore6 = storeService.create(souvlakiStore6);
//        Store persistedSouvlakiStore7 = storeService.create(souvlakiStore7);
//        Store persistedSouvlakiStore8 = storeService.create(souvlakiStore8);
//        Store persistedSouvlakiStore9 = storeService.create(souvlakiStore9);
//        Store persistedSouvlakiStore10 = storeService.create(souvlakiStore10);
//        Store persistedSouvlakiStore11 = storeService.create(souvlakiStore11);
//        Store persistedSouvlakiStore12 = storeService.create(souvlakiStore12);
//        Store persistedSouvlakiStore13 = storeService.create(souvlakiStore13);
//        Store persistedSouvlakiStore14 = storeService.create(souvlakiStore14);
//        Store persistedSouvlakiStore15 = storeService.create(souvlakiStore15);
//        Store persistedSouvlakiStore16 = storeService.create(souvlakiStore16);
//        Store persistedSouvlakiStore17 = storeService.create(souvlakiStore17);
//
//        Store persistedBurgerStore1 = storeService.create(burgerStore1);
//        Store persistedBurgerStore2 = storeService.create(burgerStore2);
//        Store persistedBurgerStore3 = storeService.create(burgerStore3);
//        Store persistedBurgerStore4 = storeService.create(burgerStore4);
//        Store persistedBurgerStore5 = storeService.create(burgerStore5);
//        Store persistedBurgerStore6 = storeService.create(burgerStore6);
//        Store persistedBurgerStore7 = storeService.create(burgerStore7);
//        Store persistedBurgerStore8 = storeService.create(burgerStore8);
//        Store persistedBurgerStore9 = storeService.create(burgerStore9);
//        Store persistedBurgerStore10 = storeService.create(burgerStore10);
//        Store persistedBurgerStore11 = storeService.create(burgerStore11);
//        Store persistedBurgerStore12 = storeService.create(burgerStore12);
//        Store persistedBurgerStore13 = storeService.create(burgerStore13);
//
//        Store persistedCoffeeStore1 = storeService.create(coffeeStore1);
//        Store persistedCoffeeStore2 = storeService.create(coffeeStore2);
//        Store persistedCoffeeStore3 = storeService.create(coffeeStore3);
//        Store persistedCoffeeStore4 = storeService.create(coffeeStore4);
//        Store persistedCoffeeStore5 = storeService.create(coffeeStore5);
//        Store persistedCoffeeStore6 = storeService.create(coffeeStore6);
//        Store persistedCoffeeStore7 = storeService.create(coffeeStore7);
//        Store persistedCoffeeStore8 = storeService.create(coffeeStore8);
//        Store persistedCoffeeStore9 = storeService.create(coffeeStore9);
//        Store persistedCoffeeStore10 = storeService.create(coffeeStore10);
//        Store persistedCoffeeStore11 = storeService.create(coffeeStore12);
//        Store persistedCoffeeStore12 = storeService.create(coffeeStore11);
//        Store persistedCoffeeStore13 = storeService.create(coffeeStore13);
//        Store persistedCoffeeStore14 = storeService.create(coffeeStore14);


        //        PRODUCTS


//        List<Product> souvlakiProducts = List.of(
//                Product.builder().name("Καλαμάκι Χοιρινό")
//                        .description("Συνοδεύεται από ψωμάκι ")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Kαλαμάκι Κοτόπουλο")
//                        .description("Συνοδεύεται από ψωμάκι ")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.20)).build(),
//                Product.builder().name("Τυλιχτό Γύρο Χοιρινό")
//                        .description("Πίτα γύρος χοιρινός με τα υλικά της επιλογής σας")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Τυλιχτό Γύρο Κοτόπουλο")
//                        .description("Τυλιχτό Γύρο Κοτόπουλο με υλικά της επιλογής σας")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(3.20)).build(),
//                Product.builder().name("Κεμπάπ")
//                        .description("Συνοδεύεται από ψωμάκι")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Κεμπάπ σε πίτα")
//                        .description("Πίτα κεμπάπ με τα υλικά της επιλογής σας")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(3.10)).build(),
//                Product.builder().name("Μπιφτέκι μοσχαρίσιο σε πίτα")
//                        .description("Πίτα μπιφτέκι μοσχαρίσιο με τα υλικά της επιλογής σας")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(4.10)).build(),
//                Product.builder().name("Λουκάνικο χοιρινό σε πίτα")
//                        .description("Πίτα λουκάνικο χοιρινό με τα υλικά της επιλογής σας")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(3.40)).build(),
//                Product.builder().name("Καλαμάκι μοσχαρίσιο σε πίτα")
//                        .description("Με Καλαμάκι μοσχαρίσιο, ντομάτα, μαρούλι ,πατάτες & BBQ sauce")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Μπιφτέκι κοτόπουλο")
//                        .description("Συνοδεύεται από ψωμάκι")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Λουκάνικο χοιρινό Τρικάλων")
//                        .description("Συνοδεύεται από ψωμάκι")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Καλαμάκι μανιτάρι")
//                        .description("Συνοδεύεται από ψωμάκι")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Μπιφτέκι λαχανικών")
//                        .description("Συνοδεύεται από ψωμάκι")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Φαλάφελ σε πίτα")
//                        .description("Πίτα φαλάφελ με τα υλικά της επιλογής σα")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Χαλούμι & μανιτάρι σε πίτα")
//                        .description("Χαλούμι & μανιτάρι σε πίτα")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().name("Οικολογικό σε πίτα")
//                        .description("Οικολογικό")
//                        .productCategory(productCategory2)
//                        .store(souvlakiStore1)
//                        .price(BigDecimal.valueOf(2.10)).build()
//        );

//        List<Product> burgerProducts = List.of(
//                Product.builder().serial("SN11111023116").name("Classic Burger")
//                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar, " +
//                                "καραμελωμένα κρεμμύδια, ντομάτα, BBQ sauce & μουστάρδα")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(6.40))
//                        .build(),
//                Product.builder().serial("SN111143543517").name("Cheese Burger")
//                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar, ketchup & μουστάρδα")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(7.40)).build(),
//                Product.builder().serial("SN11111345348").name("Honey mustard bacon burge")
//                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar, μπέικον," +
//                                " καραμελωμένα κρεμμύδια, ντομάτα, μαγιονέζα & sauce honey mustard")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(8.40)).build(),
//                Product.builder().serial("SN1111345346019").name("Vegan Burger")
//                        .description("Σε ψωμί ολικής άλεσης, ψητά λαχανικά (μελιτζάνες, κολοκυθάκια, μανιτάρια, τρίχρωμες πιπεριές)," +
//                                " ντομάτα, καραμελωμένα κρεμμύδια, σάλτσα βασιλικού & μουστάρδα")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(5.40)).build(),
//                Product.builder().serial("SN111110023425016").name("American chicken burger")
//                        .description("Σε ψωμί ολικής άλεσης με ψητό φιλέτο κοτόπουλο, μπέικον, πίκλες, ρόκα," +
//                                " ντομάτα & διπλή στρώση Philadelphia")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(6.40)).build(),
//                Product.builder().serial("SN1111355600017").name("American Burger")
//                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, ketchup & μουστάρδα")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(7.40)).build(),
//                Product.builder().serial("SN11111001241566018").name("Sweet-Philly Burger")
//                        .description("Σε ψωμί american bun, παναρισμένο φιλέτο κοτόπουλο, cheddar," +
//                                " Philadelphia, iceberg, ντομάτα & sweet chilli mayo")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(8.40)).build(),
//                Product.builder().serial("SN1546436369").name("The XXL Big burger")
//                        .description("Σε ψωμί american bun με διπλό φρέσκο μπιφτέκι, cheddar," +
//                                " κρεμμύδι, μουστάρδα, ψητή ντομάτα, μαγιονέζα & παρμεζάνα")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(5.40)).build(),
//                Product.builder().serial("SN111123131316").name("Black Angus Burger")
//                        .description("Σε ψωμί american bun με μπιφτέκι Black Angus 150gr, " +
//                                "cheddar, 3 φέτες crispy μπέικον, σάλτσα με κρέμα cheddar & φρέσκα μανιτάρια")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(6.40)).build(),
//                Product.builder().serial("SN111432342347").name("Mushroom Burger")
//                        .description("Σε ψωμί american bun με μπιφτέκι από φρέσκα μανιτάρια και cheddar")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(7.40)).build(),
//                Product.builder().serial("SN114363454354368").name("Double-smashed")
//                        .description("Σε ψωμί american bun, διπλό φρέσκο μπιφτέκι, αυγό, cheddar, bacon," +
//                                " αγγουράκι τουρσί, ντομάτα, κρεμμύδι & μουστάρδα")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(8.40)).build(),
//                Product.builder().serial("SN11112321456234").name("Turkey Burger")
//                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι γαλοπούλας, cheddar," +
//                                " ντομάτα, καραμελωμένα κρεμμύδια, BBQ sauce & μουστάρδα")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(5.40)).build(),
//                Product.builder().serial("SN11213767213566").name("Caesar's")
//                        .description("Σε ψωμί american bun, ψητό φιλέτο κοτόπουλο, τριμμένη παρμεζάνα, " +
//                                "bacon, iceberg, ντομάτα, μαγιονέζα & caesar's sauce")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(6.40)).build(),
//                Product.builder().serial("SN115464464353527").name("Mexican Burger")
//                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, Mexican sauce, " +
//                                "cheddar, κρεμμύδι, μπέικον & μουστάρδα")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(7.40)).build(),
//                Product.builder().serial("SN145111525234").name("Jack Daniel's Burger")
//                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar," +
//                                " ντομάτα, μανιτάρια σωτέ & sauce Jack Daniel's με ανανά")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(8.40)).build(),
//                Product.builder().serial("SN11156165768").name("Buffalo Burger")
//                        .description("Σε ψωμί american bun με διπλό φρέσκο μπιφτέκι, " +
//                                "μαύρη μουστάρδα, ντομάτα, cheddar & καραμελωμένα κρεμμύδια")
//                        .productCategory(productCategory2)
//                        .price(BigDecimal.valueOf(5.40)).build()
//        );
//
//
//        List<Product> coffeeProducts = List.of(
//                Product.builder().serial("SN032135602340").name("Espresso")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(1.10)).build(),
//                Product.builder().serial("SN0004661111").name("Cappuccino")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(1.50)).build(),
//                Product.builder().serial("SN0003423121112").name("Freddo Espresso")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(2.10)).build(),
//                Product.builder().serial("SN000152323113").name("Freddo Cappuccino")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(2.20)).build(),
//
//                Product.builder().serial("SN0001122215114").name("Espresso macchiato")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Espresso americano")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Freddo espresso macchiato")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Cappuccino latte")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(1.70)).build(),
//                Product.builder().serial("SN0001122215114").name("Freddo cappuccino latte")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Freddo cappuccino με φυτική κρέμα")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(2.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Nes")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Φίλτρου")
//                        .description("Lucaffe Exquisit 100% arabica premium")
//                        .productCategory(productCategory4)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//
//                Product.builder().serial("SN0001122215114").name("Σοκολάτα ruby")
//                        .description("Σοκολάτα ruby").productCategory(productCategory1)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Σοκολάτα με γεύση μπανάνα")
//                        .description("Σοκολάτα με γεύση μπανάνα").productCategory(productCategory1)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Λευκή σοκολάτα")
//                        .description("Λευκή σοκολάτα").productCategory(productCategory1)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Μαύρη σοκολάτα")
//                        .description("Μαύρη σοκολάτα").productCategory(productCategory1)
//                        .price(BigDecimal.valueOf(1.90)).build(),
//                Product.builder().serial("SN0001122215114").name("Lucaccino")
//                        .description("14oz. Κρύο ρόφημα με σοκολάτα & espresso").productCategory(productCategory1)
//                        .price(BigDecimal.valueOf(1.90)).build()
//
//
//        );

//        List<Product> persistedSouvlakia = productService.createAll(souvlakiProducts);
        Store st1 = Store.builder().name("ΑΥΘΕΝΤΙΚΟΝ").storeCategory(storeCategories.get(1))
                .address("2 9,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257741@3x.png")
                .build();
        Store st2 = Store.builder().name("Οι Σουβλάκες").storeCategory(storeCategories.get(1))
                .address("Λεωφόρος Δεκελείας 57")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x260257@3x.png")
                .build();
        Store st3 = Store.builder().name("H Πόλη").storeCategory(storeCategories.get(1))
                .address("Λ. Δεκελείας 130")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x251107@3x.png")
                .build();
        Store st4 = Store.builder().name("Evripidis Grill").storeCategory(storeCategories.get(1))
                .address("Λεωφόρος Δεκελείας 83")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574@3x.png")
                .build();
        Store st5 = Store.builder().name("Μπάρμπα Αλέξης").storeCategory(storeCategories.get(1))
                .address("Σαλαμίνος 70")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x267109@3x.png")
                .build();
        Store st6 = Store.builder().name("Άγραφα 1977").storeCategory(storeCategories.get(1))
                .address("Τσούντα 49,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x254143@3x.png")
                .build();
        Store st7 = Store.builder().name("Πιτο...μπερδέματα").storeCategory(storeCategories.get(1))
                .address("Λεωφόρος Ηρακλείου 252")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x259864@3x.png")
                .build();
        Store st8 = Store.builder().name("Ο Δήμος").storeCategory(storeCategories.get(1))
                .address("Σαρδέων 4")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x254990@3x.png")
                .build();
        Store st9 = Store.builder().name("Σάββας κεμπάπ").storeCategory(storeCategories.get(1))
                .address("Λεωφόρος Δεκελείας 80,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x253721@3x.png")
                .build();
        Store st10 = Store.builder().name("Ψητό Γεύσεις").storeCategory(storeCategories.get(1))
                .address("Καυταντζόγλου 7")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1650972097_292808@3x.png")
                .build();
        Store st11 = Store.builder().name("Της πόλης το γυροτεχνείο").storeCategory(storeCategories.get(1))
                .address("Πίνδου 47,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257753@3x.png")
                .build();
        Store st12 = Store.builder().name("ΑΥΘΕΝΤΙΚΟΝ").storeCategory(storeCategories.get(1))
                .address("Δεκελείας 9,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257741@3x.png")
                .build();
        Store st13 = Store.builder().name("Il souvlaki").storeCategory(storeCategories.get(1))
                .address("Πάρσης 25")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1649066818_292810@3x.png")
                .build();
        Store st14 = Store.builder().name("ΑΥΘΕΝΤΙΚΟΝ").storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257741@3x.png")
                .build();
        Store st15 = Store.builder().name("Πιτο...μπερδέματα").storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x259864@3x.png")
                .build();
        Store st16 = Store.builder().name("Evripidis Grill").storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574@3x.png")
                .build();
        Store st17 = Store.builder().name("Evripidis Grill").storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574@3x.png")
                .build();
        Store st18 = Store.builder().name("Evripidis Grill").storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574@3x.png")
                .build();

        assignProductsToStore(st1, getListOfProductsForSouvlakiStores());
        storeService.create(st1);
        assignProductsToStore(st2, getListOfProductsForSouvlakiStores());
        storeService.create(st2);
        assignProductsToStore(st3, getListOfProductsForSouvlakiStores());
        storeService.create(st3);
        assignProductsToStore(st4, getListOfProductsForSouvlakiStores());
        storeService.create(st4);
        assignProductsToStore(st5, getListOfProductsForSouvlakiStores());
        storeService.create(st5);
        assignProductsToStore(st6, getListOfProductsForSouvlakiStores());
        storeService.create(st6);
        assignProductsToStore(st7, getListOfProductsForSouvlakiStores());
        storeService.create(st7);
        assignProductsToStore(st8, getListOfProductsForSouvlakiStores());
        storeService.create(st8);
        assignProductsToStore(st9, getListOfProductsForSouvlakiStores());
        storeService.create(st9);
        assignProductsToStore(st10, getListOfProductsForSouvlakiStores());
        storeService.create(st10);
        assignProductsToStore(st11, getListOfProductsForSouvlakiStores());
        storeService.create(st11);
        assignProductsToStore(st12, getListOfProductsForSouvlakiStores());
        storeService.create(st12);
//        List<Product> persistedBurgers = productService.createAll(burgerProducts);
//        List<Product> persistedCoffees = productService.createAll(coffeeProducts);
    }

    Store assignProductsToStore(Store store, List<Product> products) {
        products.forEach(product -> product.setStore(store));
        store.setProducts(products);
        return store;
    }

    List<Product> getListOfProductsForSouvlakiStores() {
        return List.of(
                Product.builder().name("Καλαμάκι Χοιρινό")
                        .description("Συνοδεύεται από ψωμάκι ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Kαλαμάκι Κοτόπουλο")
                        .description("Συνοδεύεται από ψωμάκι ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder().name("Τυλιχτό Γύρο Χοιρινό")
                        .description("Πίτα γύρος χοιρινός με τα υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Τυλιχτό Γύρο Κοτόπουλο")
                        .description("Τυλιχτό Γύρο Κοτόπουλο με υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.20)).build(),
                Product.builder().name("Κεμπάπ")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Κεμπάπ σε πίτα")
                        .description("Πίτα κεμπάπ με τα υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.10)).build(),
                Product.builder().name("Μπιφτέκι μοσχαρίσιο σε πίτα")
                        .description("Πίτα μπιφτέκι μοσχαρίσιο με τα υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(4.10)).build(),
                Product.builder().name("Λουκάνικο χοιρινό σε πίτα")
                        .description("Πίτα λουκάνικο χοιρινό με τα υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.40)).build(),
                Product.builder().name("Καλαμάκι μοσχαρίσιο σε πίτα")
                        .description("Με Καλαμάκι μοσχαρίσιο, ντομάτα, μαρούλι ,πατάτες & BBQ sauce")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Μπιφτέκι κοτόπουλο")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Λουκάνικο χοιρινό Τρικάλων")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Καλαμάκι μανιτάρι")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Μπιφτέκι λαχανικών")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Φαλάφελ σε πίτα")
                        .description("Πίτα φαλάφελ με τα υλικά της επιλογής σα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Χαλούμι & μανιτάρι σε πίτα")
                        .description("Χαλούμι & μανιτάρι σε πίτα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder().name("Οικολογικό σε πίτα")
                        .description("Οικολογικό")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10)).build()
        );
    }

    ProductCategory getProductCategory(String category) {

        switch (category) {
            case "f":
                return productCategoryService.findByName("Food");
            case "d":
                return productCategoryService.findByName("Drink");
            case "g":
                return productCategoryService.findByName("Groceries");
            case "c":
                return productCategoryService.findByName("Coffee");
            case "a":
                return productCategoryService.findByName("Alcohol");
            default:
                return null;
        }
    }
}
