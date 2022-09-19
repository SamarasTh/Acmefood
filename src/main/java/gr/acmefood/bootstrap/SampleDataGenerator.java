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
import java.util.PropertyResourceBundle;

@Component
@RequiredArgsConstructor
public class SampleDataGenerator extends BaseComponent implements CommandLineRunner {
    private final ProductCategoryService productCategoryService;
    private final StoreCategoryService storeCategoryService;
    private final AccountService accountService;
    private final StoreService storeService;

    @Override
    public void run(String... args) throws Exception {


        //formatter:off

        ProductCategory productCategory1 = productCategoryService.create(ProductCategory.builder().name("Drink").build());
        ProductCategory productCategory2 = productCategoryService.create(ProductCategory.builder().name("Food").build());
        ProductCategory productCategory3 = productCategoryService.create(ProductCategory.builder().name("Groceries").build());
        ProductCategory productCategory4 = productCategoryService.create(ProductCategory.builder().name("Coffee").build());
        ProductCategory productCategory5 = productCategoryService.create(ProductCategory.builder().name("Alcohol").build());


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


        // Accounts
        Account account1 = Account.builder().
                username("vrail")
                .password("pass")
                .email("vrailpmm@gmail.com")
                .phone("69584475214")
                .fName("Euagelos")
                .lName("Vrailas").age(22).build();
        Account account2 = Account.builder()
                .username("angkaps")
                .password("pass")
                .email("angkaps@gmail.com")
                .phone("69715812302")
                .fName("Angelos")
                .lName("Kapsouros").age(24).build();
        Account account3 = Account.builder()
                .username("Enjoy")
                .password("password")
                .email("saingeor@gmail.com")
                .phone("6971548869")
                .fName("Georgia")
                .lName("Saina").age(21).build();
        Account account4 = Account.builder()
                .username("Joey").password("P@ssw0rd")
                .email("chatzgeorg@gmail.com")
                .phone("697567887902")
                .fName("George")
                .lName("Chatidakis")
                .age(35).build();
        Account account5 = Account.builder()
                .username("chatzi")
                .password("p@@@555sssw0rDD")
                .email("stef1@gmail.com")
                .phone("6972387923")
                .fName("Stefan")
                .lName("Bordea").age(22).build();
        Account account6 = Account.builder()
                .username("stef")
                .password("qwerty213")
                .email("theof@gmail.com")
                .phone("69844814485")
                .fName("George")
                .lName("Theofanous").age(21).build();

        // Burger stores
        Store burgerStore1 = Store.builder()
                .name("Butcher's Burger & steak house ")
                .storeCategory(storeCategories.get(2))
                .address("ΒΕΪΚΟΥ 43")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1658145208_295258@3x.png ")
                .build();
        Store burgerStore2 = Store.builder()
                .name(" Hot hot burger Νέα Φιλαδέλφεια")
                .storeCategory(storeCategories.get(2))
                .address(" Βρυούλων 3")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x263023@3x.png")
                .build();
        Store burgerStore3 = Store.builder()
                .name("1933 Burgers ")
                .storeCategory(storeCategories.get(2))
                .address("Λεωφ. Δεκελείας 10 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257743@3x.png ")
                .build();
        Store burgerStore4 = Store.builder()
                .name(" Μπαρ μπεε κιου")
                .storeCategory(storeCategories.get(2))
                .address("Λ.ΔΕΚΕΛΕΙΑΣ 106, Νέα Φιλαδέλφεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1655992690_294457@3x.png")
                .build();
        Store burgerStore5 = Store.builder()
                .name("Goody's Burger House ")
                .storeCategory(storeCategories.get(2))
                .address("ΔEKEΛEIΑΣ 100, Νέα Φιλαδέλφεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574711542_256508@3x.png ")
                .build();
        Store burgerStore6 = Store.builder()
                .name(" Μέθεξη")
                .storeCategory(storeCategories.get(2))
                .address(" Νεότητος 2, Νέο Ηράκλειο")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x255461@3x.png ")
                .build();
        Store burgerStore7 = Store.builder()
                .name("Σάββας κεμπάπ")
                .storeCategory(storeCategories.get(7))
                .address("Λεωφόρος Δεκελείας 80,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x253721@3x.png")
                .build();
        Store burgerStore8 = Store.builder()
                .name("The Bronx Cantina")
                .storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore9 = Store.builder()
                .name("The Bronx Cantina ")
                .storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore10 = Store.builder()
                .name("The Bronx Cantina ")
                .storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore11 = Store.builder()
                .name("The Bronx Cantina ")
                .storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore12 = Store.builder()
                .name("The Bronx Cantina ")
                .storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();
        Store burgerStore13 = Store.builder()
                .name("The Bronx Cantina ")
                .storeCategory(storeCategories.get(2))
                .address("Boloυ 12 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1643461154_288609@3x.png ")
                .build();

        // COFFEE stores
        Store coffeeStore1 = Store.builder()
                .name("Coffee Science  ")
                .storeCategory(storeCategories.get(3))
                .address("Λεωφόρος Ιωνίας 233")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x252894@3x.png")
                .build();
        Store coffeeStore2 = Store.builder()
                .name(" ST COFFEE ")
                .storeCategory(storeCategories.get(3))
                .address("Αγίων Αναργύρων 35")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1632740114_276750@3x.png ")
                .build();
        Store coffeeStore3 = Store.builder()
                .name("KAME HOUSE")
                .storeCategory(storeCategories.get(3))
                .address(" Λασκαράτου 11 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1641314803_282122@3x.png ")
                .build();
        Store coffeeStore4 = Store.builder()
                .name(" IL Toto Roastery ")
                .storeCategory(storeCategories.get(3))
                .address("28ης Οκτωβρίου 347")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x266847@3x.png")
                .build();
        Store coffeeStore5 = Store.builder()
                .name(" Coffee Berry ")
                .storeCategory(storeCategories.get(3))
                .address(" Χαλκίδος 2,  ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1638358007_284429@3x.png ")
                .build();
        Store coffeeStore6 = Store.builder()
                .name("Coffee Lab ")
                .storeCategory(storeCategories.get(3))
                .address(" Δεκελείας 114 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x258930@3x.png")
                .build();
        Store coffeeStore7 = Store.builder()
                .name("Mikel")
                .storeCategory(storeCategories.get(3))
                .address(" ΠΙΝΔΟΥ 1 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1658925802_261792@3x.png ")
                .build();
        Store coffeeStore8 = Store.builder()
                .name("Γρηγόρης")
                .storeCategory(storeCategories.get(3))
                .address("Αλεξάνδρου 50")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574329855_1@3x.png")
                .build();
        Store coffeeStore9 = Store.builder()
                .name(" Nine Grams ")
                .storeCategory(storeCategories.get(3))
                .address(" Δεκελείας 110, ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257816@3x.png ")
                .build();
        Store coffeeStore10 = Store.builder()
                .name(" Libertine ")
                .storeCategory(storeCategories.get(3))
                .address("ΔΕΚΕΛΕΙΑΣ 114")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1660213098_294778@3x.png  ")
                .build();
        Store coffeeStore11 = Store.builder()
                .name("Uggla")
                .storeCategory(storeCategories.get(3))
                .address("  ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1652800651_293665@3x.png ")
                .build();
        Store coffeeStore12 = Store.builder()
                .name(" Coffee Island ")
                .storeCategory(storeCategories.get(3))
                .address("Πατησίων 378  ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1645628107_coffee-island-new.jpg")
                .build();
        Store coffeeStore13 = Store.builder()
                .name(" Bread & Cup ")
                .storeCategory(storeCategories.get(3))
                .address(" Αλεξάνδρου 50 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1646827732_292211@3x.png ")
                .build();
        Store coffeeStore14 = Store.builder()
                .name("EVEREST")
                .storeCategory(storeCategories.get(3))
                .address(" Αλεξάνδρου 50 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1573163818_250807@3x.png ")
                .build();
        Store coffeeStore15 = Store.builder()
                .name("EVEREST")
                .storeCategory(storeCategories.get(3))
                .address(" Αλεξάνδρου 50 ")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1573163818_250807@3x.png ")
                .build();


        // Souvlaki stores
        Store st1 = Store.builder().name("ΑΥΘΕΝΤΙΚΟΝ")
                .storeCategory(storeCategories.get(1))
                .address("2 9,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257741@3x.png")
                .build();
        Store st2 = Store.builder().name("Οι Σουβλάκες")
                .storeCategory(storeCategories.get(1))
                .address("Λεωφόρος Δεκελείας 57")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x260257@3x.png")
                .build();
        Store st3 = Store.builder().name("H Πόλη")
                .storeCategory(storeCategories.get(1))
                .address("Λ. Δεκελείας 130")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x251107@3x.png")
                .build();
        Store st4 = Store.builder().name("Evripidis Grill")
                .storeCategory(storeCategories.get(1))
                .address("Λεωφόρος Δεκελείας 83")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574@3x.png")
                .build();
        Store st5 = Store.builder().name("Μπάρμπα Αλέξης")
                .storeCategory(storeCategories.get(1))
                .address("Σαλαμίνος 70")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x267109@3x.png")
                .build();
        Store st6 = Store.builder().name("Άγραφα 1977")
                .storeCategory(storeCategories.get(1))
                .address("Τσούντα 49,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x254143@3x.png")
                .build();
        Store st7 = Store.builder().name("Πιτο...μπερδέματα")
                .storeCategory(storeCategories.get(1))
                .address("Λεωφόρος Ηρακλείου 252")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x259864@3x.png")
                .build();
        Store st8 = Store.builder().name("Ο Δήμος")
                .storeCategory(storeCategories.get(1))
                .address("Σαρδέων 4")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x254990@3x.png")
                .build();
        Store st9 = Store.builder().name("Σάββας κεμπάπ")
                .storeCategory(storeCategories.get(1))
                .address("Λεωφόρος Δεκελείας 80,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x253721@3x.png")
                .build();
        Store st10 = Store.builder().name("Ψητό Γεύσεις")
                .storeCategory(storeCategories.get(1))
                .address("Καυταντζόγλου 7")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1650972097_292808@3x.png")
                .build();
        Store st11 = Store.builder().name("Της πόλης το γυροτεχνείο")
                .storeCategory(storeCategories.get(1))
                .address("Πίνδου 47,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257753@3x.png")
                .build();
        Store st12 = Store.builder().name("ΑΥΘΕΝΤΙΚΟΝ")
                .storeCategory(storeCategories.get(1))
                .address("Δεκελείας 9,")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257741@3x.png")
                .build();
        Store st13 = Store.builder().name("Il souvlaki")
                .storeCategory(storeCategories.get(1))
                .address("Πάρσης 25")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1649066818_292810@3x.png")
                .build();
        Store st14 = Store.builder().name("ΑΥΘΕΝΤΙΚΟΝ")
                .storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257741@3x.png")
                .build();
        Store st15 = Store.builder().name("Πιτο...μπερδέματα")
                .storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x259864@3x.png")
                .build();
        Store st16 = Store.builder().name("Evripidis Grill")
                .storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574@3x.png")
                .build();
        Store st17 = Store.builder().name("Evripidis Grill")
                .storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574@3x.png")
                .build();
        Store st18 = Store.builder().name("Evripidis Grill")
                .storeCategory(storeCategories.get(1))
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1574@3x.png")
                .build();

        // Pizza stores
        Store pizzaStore1 = Store.builder().name("Romano Pizza").storeCategory(storeCategories.get(0))
                .address("Λεωφόρος Ηρακλείου 159")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1070@3x.png")
                .build();
        Store pizzaStore2 = Store.builder().name("Το Πεινιρλί της Φιλαδέλφειας").storeCategory(storeCategories.get(0))
                .address("Δεκελείας 74, Νέα Φιλαδέλφεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257296@3x.png")
                .build();
        Store pizzaStore3 = Store.builder().name("Pizza Antonio").storeCategory(storeCategories.get(0))
                .address("Λεωφόρος Ανδρέα Παπανδρέου 80, Ίλιον")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1646991589_290848@3x.png")
                .build();
        Store pizzaStore4 = Store.builder().name("Reception").storeCategory(storeCategories.get(0))
                .address("ΠΑΥΛΟΥ ΝΙΡΒΑΝΑ 85, Κάτω Πατήσια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1657269532_288895@3x.png")
                .build();
        Store pizzaStore5 = Store.builder().name("ALL DAY").storeCategory(storeCategories.get(0))
                .address("Λ. ΗΡΑΚΛΕΙΟΥ 387, Νέο Ηράκλειο")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x269845@3x.png")
                .build();
        Store pizzaStore6 = Store.builder().name("Royal Pizza").storeCategory(storeCategories.get(0))
                .address("Μεσολογγίου 4, Νέα Ιωνία")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1051@3x.png")
                .build();
        Store pizzaStore7 = Store.builder().name("Da Vinci").storeCategory(storeCategories.get(0))
                .address("Νάξου 22, Άγιος Λουκάς")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x252152@3x.png")
                .build();
        Store pizzaStore8 = Store.builder().name("Buono Gusto").storeCategory(storeCategories.get(0))
                .address("Γεωργούλια 6, Άνω Πατήσια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x254012@3x.png")
                .build();
        Store pizzaStore9 = Store.builder().name("Oh mama mia").storeCategory(storeCategories.get(0))
                .address("Πευκών 8, Νέο Ηράκλειο")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x265106@3x.png")
                .build();
        Store pizzaStore10 = Store.builder().name("Pizza picasso").storeCategory(storeCategories.get(0))
                .address("Ι. Δροσοπούλου 256, Άνω Πατήσια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x258322@3x.png")
                .build();
        Store pizzaStore11 = Store.builder().name("Pizza l' artigiano").storeCategory(storeCategories.get(0))
                .address("Λ. ΔΕΚΕΛΕΙΑΣ 3, Νέα Φιλαδέλφεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1635168793_258712@3x.png")
                .build();
        Store pizzaStore12 = Store.builder().name("Milano pizza").storeCategory(storeCategories.get(0))
                .address("Αγνώστων Ηρώων 61, Νέα Ιωνία")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257382@3x.png")
                .build();


//      assign a menu to each store and then create the store
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

        assignProductsToStore(burgerStore1, getListOfProductsForBurgerStores());
        storeService.create(burgerStore1);
        assignProductsToStore(burgerStore2, getListOfProductsForBurgerStores());
        storeService.create(burgerStore2);
        assignProductsToStore(burgerStore3, getListOfProductsForBurgerStores());
        storeService.create(burgerStore3);
        assignProductsToStore(burgerStore4, getListOfProductsForBurgerStores());
        storeService.create(burgerStore4);
        assignProductsToStore(burgerStore5, getListOfProductsForBurgerStores());
        storeService.create(burgerStore5);
        assignProductsToStore(burgerStore6, getListOfProductsForBurgerStores());
        storeService.create(burgerStore6);
        assignProductsToStore(burgerStore7, getListOfProductsForBurgerStores());
        storeService.create(burgerStore7);
        assignProductsToStore(burgerStore8, getListOfProductsForBurgerStores());
        storeService.create(burgerStore8);
        assignProductsToStore(burgerStore9, getListOfProductsForBurgerStores());
        storeService.create(burgerStore9);
        assignProductsToStore(burgerStore10, getListOfProductsForBurgerStores());
        storeService.create(burgerStore10);
        assignProductsToStore(burgerStore11, getListOfProductsForBurgerStores());
        storeService.create(burgerStore11);
        assignProductsToStore(burgerStore12, getListOfProductsForBurgerStores());
        storeService.create(burgerStore12);
        assignProductsToStore(burgerStore13, getListOfProductsForBurgerStores());
        storeService.create(burgerStore13);

        assignProductsToStore(coffeeStore1, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore1);
        assignProductsToStore(coffeeStore2, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore2);
        assignProductsToStore(coffeeStore3, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore3);
        assignProductsToStore(coffeeStore4, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore4);
        assignProductsToStore(coffeeStore5, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore5);
        assignProductsToStore(coffeeStore6, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore6);
        assignProductsToStore(coffeeStore7, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore7);
        assignProductsToStore(coffeeStore8, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore8);
        assignProductsToStore(coffeeStore9, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore9);
        assignProductsToStore(coffeeStore10, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore10);
        assignProductsToStore(coffeeStore11, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore11);
        assignProductsToStore(coffeeStore12, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore12);
        assignProductsToStore(coffeeStore13, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore13);
        assignProductsToStore(coffeeStore14, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore14);
        assignProductsToStore(coffeeStore15, getListOfProductsForCoffeeStores());
        storeService.create(coffeeStore15);

        assignProductsToStore(pizzaStore1, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore1);
        assignProductsToStore(pizzaStore2, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore2);
        assignProductsToStore(pizzaStore3, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore3);
        assignProductsToStore(pizzaStore4, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore4);
        assignProductsToStore(pizzaStore5, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore5);
        assignProductsToStore(pizzaStore6, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore6);
        assignProductsToStore(pizzaStore7, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore7);
        assignProductsToStore(pizzaStore8, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore8);
        assignProductsToStore(pizzaStore9, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore9);
        assignProductsToStore(pizzaStore10, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore10);
        assignProductsToStore(pizzaStore11, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore11);
        assignProductsToStore(pizzaStore12, getListOfProductsForPizzaStores());
        storeService.create(pizzaStore12);


        // assign the same addressList to all accounts
        assignAddressesToAccount(account1, getListOfAddressesForAccounts());
        accountService.create(account1);
        assignAddressesToAccount(account2, getListOfAddressesForAccounts());
        accountService.create(account2);
        assignAddressesToAccount(account3, getListOfAddressesForAccounts());
        accountService.create(account3);
        assignAddressesToAccount(account4, getListOfAddressesForAccounts());
        accountService.create(account4);
        assignAddressesToAccount(account5, getListOfAddressesForAccounts());
        accountService.create(account5);
        assignAddressesToAccount(account6, getListOfAddressesForAccounts());
        accountService.create(account6);
    }

    Account assignAddressesToAccount(Account account, List<Address> addresses) {
        addresses.forEach(address -> address.setAccount(account));
        account.setAddressList(addresses);
        return account;
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

    List<Product> getListOfProductsForCoffeeStores() {
        return List.of(
                Product.builder()
                        .name("Espresso")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.10)).build(),
                Product.builder()
                        .name("Cappuccino")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.50)).build(),
                Product.builder()
                        .name("Freddo Espresso")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(2.10)).build(),
                Product.builder()
                        .name("Freddo Cappuccino")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(2.20)).build(),
                Product.builder()
                        .name("Espresso macchiato")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Espresso americano")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Freddo espresso macchiato")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Cappuccino latte")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.70)).build(),
                Product.builder()
                        .name("Freddo cappuccino latte")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Freddo cappuccino με φυτική κρέμα")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(2.90)).build(),
                Product.builder()
                        .name("Nes")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Φίλτρου")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Σοκολάτα ruby")
                        .description("Σοκολάτα ruby")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Σοκολάτα με γεύση μπανάνα")
                        .description("Σοκολάτα με γεύση μπανάνα")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Λευκή σοκολάτα")
                        .description("Λευκή σοκολάτα")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Μαύρη σοκολάτα")
                        .description("Μαύρη σοκολάτα")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build(),
                Product.builder()
                        .name("Lucaccino")
                        .description("14oz. Κρύο ρόφημα με σοκολάτα & espresso")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90)).build()


        );
    }

    List<Product> getListOfProductsForBurgerStores() {
        return List.of(
                Product.builder()
                        .name("Classic Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar, " +
                                "καραμελωμένα κρεμμύδια, ντομάτα, BBQ sauce & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.40))
                        .build(),
                Product.builder()
                        .name("Cheese Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar, ketchup & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40)).build(),
                Product.builder()
                        .name("Honey mustard bacon burge")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar, μπέικον," +
                                " καραμελωμένα κρεμμύδια, ντομάτα, μαγιονέζα & sauce honey mustard")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40)).build(),
                Product.builder()
                        .name("Vegan Burger")
                        .description("Σε ψωμί ολικής άλεσης, ψητά λαχανικά (μελιτζάνες, κολοκυθάκια, μανιτάρια, τρίχρωμες πιπεριές)," +
                                " ντομάτα, καραμελωμένα κρεμμύδια, σάλτσα βασιλικού & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.40)).build(),
                Product.builder()
                        .name("American chicken burger")
                        .description("Σε ψωμί ολικής άλεσης με ψητό φιλέτο κοτόπουλο, μπέικον, πίκλες, ρόκα," +
                                " ντομάτα & διπλή στρώση Philadelphia")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.40)).build(),
                Product.builder()
                        .name("American Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, ketchup & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40)).build(),
                Product.builder()
                        .name("Sweet-Philly Burger")
                        .description("Σε ψωμί american bun, παναρισμένο φιλέτο κοτόπουλο, cheddar," +
                                " Philadelphia, iceberg, ντομάτα & sweet chilli mayo")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40)).build(),
                Product.builder()
                        .name("The XXL Big burger")
                        .description("Σε ψωμί american bun με διπλό φρέσκο μπιφτέκι, cheddar," +
                                " κρεμμύδι, μουστάρδα, ψητή ντομάτα, μαγιονέζα & παρμεζάνα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.40)).build(),
                Product.builder()
                        .name("Black Angus Burger")
                        .description("Σε ψωμί american bun με μπιφτέκι Black Angus 150gr, " +
                                "cheddar, 3 φέτες crispy μπέικον, σάλτσα με κρέμα cheddar & φρέσκα μανιτάρια")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.40)).build(),
                Product.builder()
                        .name("Mushroom Burger")
                        .description("Σε ψωμί american bun με μπιφτέκι από φρέσκα μανιτάρια και cheddar")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40)).build(),
                Product.builder()
                        .name("Double-smashed")
                        .description("Σε ψωμί american bun, διπλό φρέσκο μπιφτέκι, αυγό, cheddar, bacon," +
                                " αγγουράκι τουρσί, ντομάτα, κρεμμύδι & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40)).build(),
                Product.builder()
                        .name("Turkey Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι γαλοπούλας, cheddar," +
                                " ντομάτα, καραμελωμένα κρεμμύδια, BBQ sauce & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.40)).build(),
                Product.builder()
                        .name("Caesar's")
                        .description("Σε ψωμί american bun, ψητό φιλέτο κοτόπουλο, τριμμένη παρμεζάνα, " +
                                "bacon, iceberg, ντομάτα, μαγιονέζα & caesar's sauce")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.40)).build(),
                Product.builder()
                        .name("Mexican Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, Mexican sauce, " +
                                "cheddar, κρεμμύδι, μπέικον & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40)).build(),
                Product.builder()
                        .name("Jack Daniel's Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar," +
                                " ντομάτα, μανιτάρια σωτέ & sauce Jack Daniel's με ανανά")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40)).build(),
                Product.builder()
                        .name("Buffalo Burger")
                        .description("Σε ψωμί american bun με διπλό φρέσκο μπιφτέκι, " +
                                "μαύρη μουστάρδα, ντομάτα, cheddar & καραμελωμένα κρεμμύδια")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.40)).build()
        );
    }

    List<Product> getListOfProductsForPizzaStores() {

        return List.of(
                Product.builder()
                        .name("Πίτσα μαργαρίτα ")
                        .description("Με σάλτσα & τυρί gouda ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40))
                        .build(),
                Product.builder()
                        .name("Πίτσα ζαμπόν ")
                        .description("Με ζαμπόν & τυρί gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.00))
                        .build(),
                Product.builder()
                        .name("Πίτσα special ")
                        .description("Με μπέικον, ζαμπόν, πιπεριά, μανιτάρια σάλτσα,τυρί & φρέσκια ντομάτα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.40))
                        .build(),
                Product.builder()
                        .name("Πίτσα ζαμπόν, μπέικον & τυρί gouda")
                        .description("Πίτσα ζαμπόν, μπέικον & τυρί gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.40))
                        .build(),
                Product.builder()
                        .name("Πίτσα χωριάτικη ")
                        .description("Με φέτα, ντομάτα, πιπεριά, μανιτάρια, ελιές, κρεμμύδι & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(10.00))
                        .build(),
                Product.builder()
                        .name("Πίτσα κοτόπουλο ")
                        .description("Με στήθος κοτόπουλο, σως, ντομάτα, φέτα, πιπεριά & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(.40))
                        .build(),
                Product.builder()
                        .name("Πίτσα πεπερόνι")
                        .description(" Με σάλτσα, ντομάτα, πιπεριά, πεπερόνι, μανιτάρια & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40))
                        .build(),
                Product.builder()
                        .name("Πίτσα καρμπονάρα ")
                        .description("Με ζαμπόν, μπέικον, κρέμα γάλακτος, παρμεζάνα, μανιτάρια & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(10.40))
                        .build(),
                Product.builder()
                        .name(" Πίτσα λουκάνικο τυρί")
                        .description(" Με σάλτσα, λουκάνικο χωριάτικο & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(11.40))
                        .build(),
                Product.builder()
                        .name("Πίτσα φέτα ντομάτα")
                        .description("Με φέτα, ντομάτα & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.40))
                        .build(),
                Product.builder()
                        .name("Πίτσα σουτζούκι")
                        .description(" Με σάλτσα, σουτζούκι, ντομάτα & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(12.40))
                        .build(),
                Product.builder()
                        .name("Πίτσα παστουρμάς")
                        .description("Με σάλτσα, παστουρμά, ντομάτα & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.40))
                        .build()

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

    List<Address> getListOfAddressesForAccounts() {
        return List.of(
                Address.builder().state("Attica").city("N.Filadelfeia")
                        .postalCode(14323).streetName("Venizelou").floor(2)
                        .StreetNumber(1).doorbellName("Papaxronis").build(),
                Address.builder().state("Attica").city("Agia Paraskevi")
                        .postalCode(14346).streetName("Patriarxou Io.").floor(4)
                        .StreetNumber(39).doorbellName("Nikolaou").build(),
                Address.builder().state("Attica").city("Papagou").floor(3)
                        .postalCode(14344).streetName("Nikolaou Plastira")
                        .StreetNumber(15).doorbellName("Fotiou").build(),
                Address.builder().state("Attica").city("Papagou").floor(3)
                        .postalCode(14344).streetName("Nikolaou Plastira")
                        .StreetNumber(15).doorbellName("Fotiou").build(),
                Address.builder().state("Attica").city("Papagou").floor(3)
                        .postalCode(14344).streetName("Nikolaou Plastira")
                        .StreetNumber(15).doorbellName("Fotiou").build()
        );
    }

}
