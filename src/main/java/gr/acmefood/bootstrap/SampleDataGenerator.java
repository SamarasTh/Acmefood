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
                        .imgUrl("assets/img/service/final/1.png").build(),
                StoreCategory.builder().name("Souvlaki")
                        .imgUrl("assets/img/service/final/7.png").build(),
                StoreCategory.builder().name("Burger")
                        .imgUrl("assets/img/service/final/10.png").build(),
                StoreCategory.builder().name("Coffee")
                        .imgUrl("assets/img/service/final/3.png").build(),
                StoreCategory.builder().name("Chinese")
                        .imgUrl("assets/img/service/final/4.png").build(),
                StoreCategory.builder().name("Pasta")
                        .imgUrl("assets/img/service/final/5.png").build(),
                StoreCategory.builder().name("Vegetarian")
                        .imgUrl("assets/img/service/final/11.png").build(),
                StoreCategory.builder().name("Mexican")
                        .imgUrl("assets/img/service/final/6.png").build(),
                StoreCategory.builder().name("Homemade")
                        .imgUrl("assets/img/service/final/12.png").build(),
                StoreCategory.builder().name("Sweet")
                        .imgUrl("assets/img/service/final/8.png").build(),
                StoreCategory.builder().name("Groceries")
                        .imgUrl("assets/img/service/final/9.png").build(),
                StoreCategory.builder().name("Sushi")
                        .imgUrl("assets/img/service/final/2.png").build()
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
                .name(" Hot hot burger")
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

        // Souvlaki stores
        Store st1 = Store.builder().name("ΑΥΘΕΝΤΙΚΟΝ")
                .storeCategory(storeCategories.get(1))
                .address("Λεωφ. Δεκελείας 29,")
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

        Store chineseStore1 = Store.builder().name("Athenian China Town").storeCategory(storeCategories.get(4))
                .address("Φειδιππίδου 27, Γουδή")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1114@3x.png")
                .build();
        Store chineseStore2 = Store.builder().name("China City").storeCategory(storeCategories.get(4))
                .address("ΚΕΑΣ 54, Άγιος Λουκάς")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x250379@3x.png")
                .build();
        Store chineseStore3 = Store.builder().name("China Wok Time").storeCategory(storeCategories.get(4))
                .address("Μιχαλακοπούλου 199, Γουδή")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1615373380_1841@3x.png")
                .build();
        Store chineseStore4 = Store.builder().name("Mad Wok").storeCategory(storeCategories.get(4))
                .address("Λένορμαν 167, Ακαδημία Πλάτωνος")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1653915408_293890@3x.png")
                .build();
        Store chineseStore5 = Store.builder().name("KAZE SUSHI").storeCategory(storeCategories.get(4))
                .address("Φειδιππίδου 27, Μαρούσι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1614343092_261794@3x.png")
                .build();
        Store chineseStore6 = Store.builder().name("Sticky Rice").storeCategory(storeCategories.get(4))
                .address("ΕΡΜΟΥ 104, Μοναστηράκι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1658217590_295234@3x.png")
                .build();
        Store chineseStore7 = Store.builder().name("Chunxi").storeCategory(storeCategories.get(4))
                .address("Όθωνος 10, Σύνταγμα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x262313@3x.png")
                .build();
        Store chineseStore8 = Store.builder().name("So So So ").storeCategory(storeCategories.get(4))
                .address("ΝΟΡΜΑΝΟΥ 7, Θησείο")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1658832293_287686@3x.png")
                .build();

        Store pastaStore1 = Store.builder().name("Extra Meal").storeCategory(storeCategories.get(5))
                .address("Τριπόλεως 46, Άγιοι Ανάργυροι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x261234@3x.png")
                .build();
        Store pastaStore2 = Store.builder().name("ΕΥΡΟΜΑΓΕΙΡΑΣ").storeCategory(storeCategories.get(5))
                .address("ΝΙΚ. ΚΑΖΑΝΤΖΑΚΗ 35, Άγιοι Ανάργυροι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1656492933_294505@3x.png")
                .build();
        Store pastaStore3 = Store.builder().name("CULTO").storeCategory(storeCategories.get(5))
                .address("Λασκαράτου 13, Αθήνα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1637924561_284428@3x.png")
                .build();
        Store pastaStore4 = Store.builder().name("Marko Pasta").storeCategory(storeCategories.get(5))
                .address("Λυκούργου 1, Αθήνα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1632300440_273890@3x.png")
                .build();
        Store pastaStore5 = Store.builder().name("Ο Κιοφτές").storeCategory(storeCategories.get(5))
                .address("28ης οκτωβρίου 56, Πολυτεχνείο")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x266607@3x.png")
                .build();
        Store pastaStore6 = Store.builder().name("Theion Brunch").storeCategory(storeCategories.get(5))
                .address("ΠΑΡΑΣΚΕΥΟΠΟΥΛΟΥ ΚΑΙ ΖΕΡΒΟΥΔΑΚΗ 22, Κάτω Πατήσια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1653038863_293743@3x.png")
                .build();
        Store pastaStore7 = Store.builder().name("Cartone").storeCategory(storeCategories.get(5))
                .address("ΠΕΡΣΕΦΟΝΗΣ 41, Γκάζι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1654846666_294169@3x.png")
                .build();
        Store pastaStore8 = Store.builder().name("Foka N3gra").storeCategory(storeCategories.get(5))
                .address("ΦΩΚΙΩΝΟΣ ΝΕΓΡΗ 32, Κυψέλη")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1659107468_294907@3x.png")
                .build();

        Store vegetarianStore1 = Store.builder().name("Foka N3gra").storeCategory(storeCategories.get(6))
                .address("ΦΩΚΙΩΝΟΣ ΝΕΓΡΗ 32, Κυψέλη")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1659107468_294907@3x.png")
                .build();
        Store vegetarianStore2 = Store.builder().name("Da Vinci").storeCategory(storeCategories.get(6))
                .address("Νάξου 22, Άγιος Λουκάς")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x252152@3x.png")
                .build();
        Store vegetarianStore3 = Store.builder().name("Indian tikka").storeCategory(storeCategories.get(6))
                .address("ΓΛΑΔΣΤΩΝΟΣ 8, Εξάρχεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1645016290_289695@3x.png")
                .build();
        Store vegetarianStore4 = Store.builder().name("La fontana").storeCategory(storeCategories.get(6))
                .address("Δοιράνης 60, Πεδίον Άρεωq")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x250401@3x.png")
                .build();
        Store vegetarianStore5 = Store.builder().name("Think Big by Stamatis Burger").storeCategory(storeCategories.get(6))
                .address("Πάρνηθος 43, Κυψέλη")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1611557170_267012@3x.png")
                .build();
        Store vegetarianStore6 = Store.builder().name("Πανάγος").storeCategory(storeCategories.get(6))
                .address("Πλατεία Κυψέλης 2, Κυψέλη")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x251199@3x.png")
                .build();
        Store vegetarianStore7 = Store.builder().name("L' italiano").storeCategory(storeCategories.get(6))
                .address("Ταϋγέτου 58, Άγιος Λουκάς")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x253442@3x.png")
                .build();
        Store vegetarianStore8 = Store.builder().name("NEW YORK SANDWICHES").storeCategory(storeCategories.get(6))
                .address("Σινώπης 3, Γουδή")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x146@3x.png")
                .build();

        Store mexicanStore1 = Store.builder().name("Think Big by Stama-Τacos").storeCategory(storeCategories.get(7))
                .address("Πάρνηθος 43, Κυψέλη")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1611557170_267012@3x.png")
                .build();
        Store mexicanStore2 = Store.builder().name("Taco Loco").storeCategory(storeCategories.get(7))
                .address("Κολοκοτρώνη Θεόδωρου 39, Σύνταγμα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1648131413_291908@3x.png")
                .build();
        Store mexicanStore3 = Store.builder().name("Agavita").storeCategory(storeCategories.get(7))
                .address("Ερμού 18, Μοναστηράκι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1641891813_287857@3x.png")
                .build();
        Store mexicanStore4 = Store.builder().name("MiΒurrito Mexicano").storeCategory(storeCategories.get(7))
                .address("ΜΗΤΡΟΠΟΛΕΩΣ 66, Μοναστηράκι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1647593350_286860@3x.png")
                .build();
        Store mexicanStore5 = Store.builder().name("Los gatos").storeCategory(storeCategories.get(7))
                .address("Ρόμβης 17, Αθήνα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1649843279_286125@3x.png")
                .build();
        Store mexicanStore6 = Store.builder().name("Pepito Cocina Mexicana y Tequileria").storeCategory(storeCategories.get(7))
                .address("Δράκου 19, Κουκάκι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x261778@3x.png")
                .build();

        Store homemadeStore1 = Store.builder().name("Εξωστρεφής").storeCategory(storeCategories.get(8))
                .address("Χαροκόπου 64, Καλλιθέα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x261500@3x.png")
                .build();
        Store homemadeStore2 = Store.builder().name("Little Cook").storeCategory(storeCategories.get(8))
                .address("ΛΟΓΟΘΕΤΙΔΗ 12, Γηροκομείο")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x257351@3x.png")
                .build();
        Store homemadeStore3 = Store.builder().name("Οι νοστιμιές της Μαίρης").storeCategory(storeCategories.get(8))
                .address("Ύδρας 2-4, Κυψέλη")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x258467@3x.png")
                .build();
        Store homemadeStore4 = Store.builder().name("Μαγειρευτό στη Γάστρα").storeCategory(storeCategories.get(8))
                .address("28ης Οκτωβρίου 56, Πολυτεχνείο")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x266357@3x.png")
                .build();
        Store homemadeStore5 = Store.builder().name("Το Μαγερειό").storeCategory(storeCategories.get(8))
                .address("ΠΛΑΤΕΙΑ ΦΙΛΙΚΗΣ ΕΤΑΙΡΙΑΣ 3, Κολωνάκι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1653037889_293724@3x.png")
                .build();
        Store homemadeStore6 = Store.builder().name("Ο Κήπος της Τρώων").storeCategory(storeCategories.get(8))
                .address("Τρώων 35-37, Άνω Πετράλωνα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1649408077_292829@3x.png")
                .build();
        Store homemadeStore7 = Store.builder().name("Greco's project").storeCategory(storeCategories.get(8))
                .address("Μητροπόλεως 5, Σύνταγμα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x255367@3x.png")
                .build();
        Store homemadeStore8 = Store.builder().name("Κιουζίν").storeCategory(storeCategories.get(8))
                .address("Λυκαβηττού 16, Κολωνάκι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x255358@3x.png")
                .build();

        Store sweetsStore1 = Store.builder().name("Koukouvaya desserts").storeCategory(storeCategories.get(9))
                .address("Βασιλικής 2, Αθήνα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1642587597_289010@3x.png")
                .build();
        Store sweetsStore2 = Store.builder().name("Morris Brown").storeCategory(storeCategories.get(9))
                .address("ΠΛΑΤΕΙΑ ΒΑΡΝΑΒΑ 7, Παγκράτι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1655892873_294430@3x.png")
                .build();
        Store sweetsStore3 = Store.builder().name("Ζαχαροπλαστείο Cremona").storeCategory(storeCategories.get(9))
                .address("Φιλολάου 84, Παγκράτι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x270054@3x.png")
                .build();
        Store sweetsStore4 = Store.builder().name("Ζαχαροπλαστείο Παύλου").storeCategory(storeCategories.get(9))
                .address("ΠΑΠΑΔΙΑΜΑΝΤΟΠΟΥΛΟΥ 24, Χίλτον")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1654009870_286344@3x.png")
                .build();
        Store sweetsStore5 = Store.builder().name("Κρεμ μπαρ Νέος Κόσμος").storeCategory(storeCategories.get(9))
                .address("Αμβροσίου Φραντζή 53, Κουκάκι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1645609081_291195@3x.png")
                .build();
        Store sweetsStore6 = Store.builder().name("Mystic Sweets").storeCategory(storeCategories.get(9))
                .address("Φερεκύδου 2, Παγκράτι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1651157782_293256@3x.png")
                .build();
        Store sweetsStore7 = Store.builder().name("Τούλα γλυκές γεύσεις").storeCategory(storeCategories.get(9))
                .address("ΕΥΤΥΧΙΔΟΥ 41, Παγκράτι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1657537290_291867@3x.png")
                .build();
        Store sweetsStore8 = Store.builder().name("Ellyz cafe").storeCategory(storeCategories.get(9))
                .address("Αγίου Φίλιππου 10, Θησείο")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1645711549_288686@3x.png")
                .build();

        Store sushiStore1 = Store.builder().name("KAZE SUSHI").storeCategory(storeCategories.get(11))
                .address("Φειδιππίδου 27, Μαρούσι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1614343092_261794@3x.png")
                .build();
        Store sushiStore2 = Store.builder().name("Mikaku Sushi & Noodles").storeCategory(storeCategories.get(11))
                .address("ΚΩΛΕΤΤΗ 33, Εξάρχεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x262904@3x.png")
                .build();
        Store sushiStore3 = Store.builder().name("Koi").storeCategory(storeCategories.get(11))
                .address("Απόλλωνος 1, Σύνταγμα")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x1990@3x.png")
                .build();
        Store sushiStore4 = Store.builder().name("ANGE'S SWEET SUSHI").storeCategory(storeCategories.get(11))
                .address("Μηλιώνη 1Β, Κολωνάκι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1646747056_284541@3x.png")
                .build();
        Store sushiStore5 = Store.builder().name("Sushi one").storeCategory(storeCategories.get(11))
                .address("Γεωργίου Παπανδρέου 52, Ζωγράφου")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/shops/logo/@2x253328@3x.png")
                .build();
        Store sushiStore6 = Store.builder().name("Wabi Sabi").storeCategory(storeCategories.get(11))
                .address("Κάνιγγος 8, Εξάρχεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x267652@3x.png")
                .build();
        Store sushiStore7 = Store.builder().name("Ikura Sushi and Korean food").storeCategory(storeCategories.get(11))
                .address("Φιλελλήνων 7, Μοναστηράκι")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1640341284_286925@3x.png")
                .build();
        Store sushiStore8 = Store.builder().name("Nakama").storeCategory(storeCategories.get(11))
                .address("ΜΑΣΣΑΛΙΑΣ 5, Εξάρχεια")
                .imgUrl("https://s3.eu-central-1.amazonaws.com/w4ve/box/resized/shops/logo/@2x1655723608_294207@3x.png")
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

        assignProductsToStore(chineseStore1, getListOfProductsForChineseStores());
        storeService.create(chineseStore1);
        assignProductsToStore(chineseStore2, getListOfProductsForChineseStores());
        storeService.create(chineseStore2);
        assignProductsToStore(chineseStore3, getListOfProductsForChineseStores());
        storeService.create(chineseStore3);
        assignProductsToStore(chineseStore4, getListOfProductsForChineseStores());
        storeService.create(chineseStore4);
        assignProductsToStore(chineseStore5, getListOfProductsForChineseStores());
        storeService.create(chineseStore5);
        assignProductsToStore(chineseStore6, getListOfProductsForChineseStores());
        storeService.create(chineseStore6);
        assignProductsToStore(chineseStore7, getListOfProductsForChineseStores());
        storeService.create(chineseStore7);
        assignProductsToStore(chineseStore8, getListOfProductsForChineseStores());
        storeService.create(chineseStore8);

        assignProductsToStore(pastaStore1, getListOfProductsForPastaStores());
        storeService.create(pastaStore1);
        assignProductsToStore(pastaStore2, getListOfProductsForPastaStores());
        storeService.create(pastaStore2);
        assignProductsToStore(pastaStore3, getListOfProductsForPastaStores());
        storeService.create(pastaStore3);
        assignProductsToStore(pastaStore4, getListOfProductsForPastaStores());
        storeService.create(pastaStore4);
        assignProductsToStore(pastaStore5, getListOfProductsForPastaStores());
        storeService.create(pastaStore5);
        assignProductsToStore(pastaStore6, getListOfProductsForPastaStores());
        storeService.create(pastaStore6);
        assignProductsToStore(pastaStore7, getListOfProductsForPastaStores());
        storeService.create(pastaStore7);
        assignProductsToStore(pastaStore8, getListOfProductsForPastaStores());
        storeService.create(pastaStore8);

        assignProductsToStore(vegetarianStore1, getListOfProductsForVegetarianStores());
        storeService.create(vegetarianStore1);
        assignProductsToStore(vegetarianStore2, getListOfProductsForVegetarianStores());
        storeService.create(vegetarianStore2);
        assignProductsToStore(vegetarianStore3, getListOfProductsForVegetarianStores());
        storeService.create(vegetarianStore3);
        assignProductsToStore(vegetarianStore4, getListOfProductsForVegetarianStores());
        storeService.create(vegetarianStore4);
        assignProductsToStore(vegetarianStore5, getListOfProductsForVegetarianStores());
        storeService.create(vegetarianStore5);
        assignProductsToStore(vegetarianStore6, getListOfProductsForVegetarianStores());
        storeService.create(vegetarianStore6);
        assignProductsToStore(vegetarianStore7, getListOfProductsForVegetarianStores());
        storeService.create(vegetarianStore7);
        assignProductsToStore(vegetarianStore8, getListOfProductsForVegetarianStores());
        storeService.create(vegetarianStore8);

        assignProductsToStore(mexicanStore1, getListOfProductsForMexicanStores());
        storeService.create(mexicanStore1);
        assignProductsToStore(mexicanStore2, getListOfProductsForMexicanStores());
        storeService.create(mexicanStore2);
        assignProductsToStore(mexicanStore3, getListOfProductsForMexicanStores());
        storeService.create(mexicanStore3);
        assignProductsToStore(mexicanStore4, getListOfProductsForMexicanStores());
        storeService.create(mexicanStore4);
        assignProductsToStore(mexicanStore5, getListOfProductsForMexicanStores());
        storeService.create(mexicanStore5);
        assignProductsToStore(mexicanStore6, getListOfProductsForMexicanStores());
        storeService.create(mexicanStore6);

        assignProductsToStore(homemadeStore1, getListOfProductsForHomemadeStores());
        storeService.create(homemadeStore1);
        assignProductsToStore(homemadeStore2, getListOfProductsForHomemadeStores());
        storeService.create(homemadeStore2);
        assignProductsToStore(homemadeStore3, getListOfProductsForHomemadeStores());
        storeService.create(homemadeStore3);
        assignProductsToStore(homemadeStore4, getListOfProductsForHomemadeStores());
        storeService.create(homemadeStore4);
        assignProductsToStore(homemadeStore5, getListOfProductsForHomemadeStores());
        storeService.create(homemadeStore5);
        assignProductsToStore(homemadeStore6, getListOfProductsForHomemadeStores());
        storeService.create(homemadeStore6);
        assignProductsToStore(homemadeStore7, getListOfProductsForHomemadeStores());
        storeService.create(homemadeStore7);
        assignProductsToStore(homemadeStore8, getListOfProductsForHomemadeStores());
        storeService.create(homemadeStore8);

        assignProductsToStore(sweetsStore1, getListOfProductsForSweetsStores());
        storeService.create(sweetsStore1);
        assignProductsToStore(sweetsStore2, getListOfProductsForSweetsStores());
        storeService.create(sweetsStore2);
        assignProductsToStore(sweetsStore3, getListOfProductsForSweetsStores());
        storeService.create(sweetsStore3);
        assignProductsToStore(sweetsStore4, getListOfProductsForSweetsStores());
        storeService.create(sweetsStore4);
        assignProductsToStore(sweetsStore5, getListOfProductsForSweetsStores());
        storeService.create(sweetsStore5);
        assignProductsToStore(sweetsStore6, getListOfProductsForSweetsStores());
        storeService.create(sweetsStore6);
        assignProductsToStore(sweetsStore7, getListOfProductsForSweetsStores());
        storeService.create(sweetsStore7);
        assignProductsToStore(sweetsStore8, getListOfProductsForSweetsStores());
        storeService.create(sweetsStore8);

        assignProductsToStore(sushiStore1, getListOfProductsForSushiStores());
        storeService.create(sushiStore1);
        assignProductsToStore(sushiStore2, getListOfProductsForSushiStores());
        storeService.create(sushiStore2);
        assignProductsToStore(sushiStore3, getListOfProductsForSushiStores());
        storeService.create(sushiStore3);
        assignProductsToStore(sushiStore4, getListOfProductsForSushiStores());
        storeService.create(sushiStore4);
        assignProductsToStore(sushiStore5, getListOfProductsForSushiStores());
        storeService.create(sushiStore5);
        assignProductsToStore(sushiStore6, getListOfProductsForSushiStores());
        storeService.create(sushiStore6);
        assignProductsToStore(sushiStore7, getListOfProductsForSushiStores());
        storeService.create(sushiStore7);
        assignProductsToStore(sushiStore8, getListOfProductsForSushiStores());
        storeService.create(sushiStore8);


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
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png")
                        .build(),
                Product.builder().name("Kαλαμάκι Κοτόπουλο")
                        .description("Συνοδεύεται από ψωμάκι ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.20))
                        .imgUrl("assets/img/service/final/7.png")
                        .build(),
                Product.builder().name("Τυλιχτό Γύρο Χοιρινό")
                        .description("Πίτα γύρος χοιρινός με τα υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png")
                        .build(),
                Product.builder().name("Τυλιχτό Γύρο Κοτόπουλο")
                        .description("Τυλιχτό Γύρο Κοτόπουλο με υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.20))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Κεμπάπ")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Κεμπάπ σε πίτα")
                        .description("Πίτα κεμπάπ με τα υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Μπιφτέκι μοσχαρίσιο σε πίτα")
                        .description("Πίτα μπιφτέκι μοσχαρίσιο με τα υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(4.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Λουκάνικο χοιρινό σε πίτα")
                        .description("Πίτα λουκάνικο χοιρινό με τα υλικά της επιλογής σας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.40))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Καλαμάκι μοσχαρίσιο σε πίτα")
                        .description("Με Καλαμάκι μοσχαρίσιο, ντομάτα, μαρούλι ,πατάτες & BBQ sauce")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Μπιφτέκι κοτόπουλο")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Λουκάνικο χοιρινό Τρικάλων")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Καλαμάκι μανιτάρι")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Μπιφτέκι λαχανικών")
                        .description("Συνοδεύεται από ψωμάκι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Φαλάφελ σε πίτα")
                        .description("Πίτα φαλάφελ με τα υλικά της επιλογής σα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Χαλούμι & μανιτάρι σε πίτα")
                        .description("Χαλούμι & μανιτάρι σε πίτα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png").build(),
                Product.builder().name("Οικολογικό σε πίτα")
                        .description("Οικολογικό")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/7.png").build()
        );
    }

    List<Product> getListOfProductsForCoffeeStores() {
        return List.of(
                Product.builder()
                        .name("Espresso")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.10))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Cappuccino")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.50))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Freddo Espresso")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(2.10))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Freddo Cappuccino")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(2.20))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Espresso macchiato")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Espresso americano")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Freddo espresso macchiato")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Cappuccino latte")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.70))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Freddo cappuccino latte")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Freddo cappuccino με φυτική κρέμα")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(2.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Nes")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Φίλτρου")
                        .description("Lucaffe Exquisit 100% arabica premium")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Σοκολάτα ruby")
                        .description("Σοκολάτα ruby")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Σοκολάτα με γεύση μπανάνα")
                        .description("Σοκολάτα με γεύση μπανάνα")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Λευκή σοκολάτα")
                        .description("Λευκή σοκολάτα")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Μαύρη σοκολάτα")
                        .description("Μαύρη σοκολάτα")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build(),
                Product.builder()
                        .name("Lucaccino")
                        .description("14oz. Κρύο ρόφημα με σοκολάτα & espresso")
                        .productCategory(getProductCategory("d"))
                        .price(BigDecimal.valueOf(1.90))
                        .imgUrl("assets/img/service/final/3.png")
                        .build()


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
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Cheese Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar, ketchup & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Honey mustard bacon burge")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar, μπέικον," +
                                " καραμελωμένα κρεμμύδια, ντομάτα, μαγιονέζα & sauce honey mustard")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Vegan Burger")
                        .description("Σε ψωμί ολικής άλεσης, ψητά λαχανικά (μελιτζάνες, κολοκυθάκια, μανιτάρια, τρίχρωμες πιπεριές)," +
                                " ντομάτα, καραμελωμένα κρεμμύδια, σάλτσα βασιλικού & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("American chicken burger")
                        .description("Σε ψωμί ολικής άλεσης με ψητό φιλέτο κοτόπουλο, μπέικον, πίκλες, ρόκα," +
                                " ντομάτα & διπλή στρώση Philadelphia")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("American Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, ketchup & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Sweet-Philly Burger")
                        .description("Σε ψωμί american bun, παναρισμένο φιλέτο κοτόπουλο, cheddar," +
                                " Philadelphia, iceberg, ντομάτα & sweet chilli mayo")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("The XXL Big burger")
                        .description("Σε ψωμί american bun με διπλό φρέσκο μπιφτέκι, cheddar," +
                                " κρεμμύδι, μουστάρδα, ψητή ντομάτα, μαγιονέζα & παρμεζάνα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Black Angus Burger")
                        .description("Σε ψωμί american bun με μπιφτέκι Black Angus 150gr, " +
                                "cheddar, 3 φέτες crispy μπέικον, σάλτσα με κρέμα cheddar & φρέσκα μανιτάρια")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Mushroom Burger")
                        .description("Σε ψωμί american bun με μπιφτέκι από φρέσκα μανιτάρια και cheddar")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Double-smashed")
                        .description("Σε ψωμί american bun, διπλό φρέσκο μπιφτέκι, αυγό, cheddar, bacon," +
                                " αγγουράκι τουρσί, ντομάτα, κρεμμύδι & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Turkey Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι γαλοπούλας, cheddar," +
                                " ντομάτα, καραμελωμένα κρεμμύδια, BBQ sauce & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Caesar's")
                        .description("Σε ψωμί american bun, ψητό φιλέτο κοτόπουλο, τριμμένη παρμεζάνα, " +
                                "bacon, iceberg, ντομάτα, μαγιονέζα & caesar's sauce")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Mexican Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, Mexican sauce, " +
                                "cheddar, κρεμμύδι, μπέικον & μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Jack Daniel's Burger")
                        .description("Σε ψωμί american bun με φρέσκο μπιφτέκι, cheddar," +
                                " ντομάτα, μανιτάρια σωτέ & sauce Jack Daniel's με ανανά")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build(),
                Product.builder()
                        .name("Buffalo Burger")
                        .description("Σε ψωμί american bun με διπλό φρέσκο μπιφτέκι, " +
                                "μαύρη μουστάρδα, ντομάτα, cheddar & καραμελωμένα κρεμμύδια")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.40))
                        .imgUrl("assets/img/service/final/10.png")
                        .build()
        );
    }

    List<Product> getListOfProductsForPizzaStores() {

        return List.of(
                Product.builder()
                        .name("Πίτσα μαργαρίτα ")
                        .description("Με σάλτσα & τυρί gouda ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα ζαμπόν ")
                        .description("Με ζαμπόν & τυρί gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.00))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα special ")
                        .description("Με μπέικον, ζαμπόν, πιπεριά, μανιτάρια σάλτσα,τυρί & φρέσκια ντομάτα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα Classic")
                        .description("Πίτσα ζαμπόν, μπέικον & τυρί gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα χωριάτικη ")
                        .description("Με φέτα, ντομάτα, πιπεριά, μανιτάρια, ελιές, κρεμμύδι & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(10.00))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα κοτόπουλο ")
                        .description("Με στήθος κοτόπουλο, σως, ντομάτα, φέτα, πιπεριά & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα πεπερόνι")
                        .description(" Με σάλτσα, ντομάτα, πιπεριά, πεπερόνι, μανιτάρια & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα καρμπονάρα ")
                        .description("Με ζαμπόν, μπέικον, κρέμα γάλακτος, παρμεζάνα, μανιτάρια & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(10.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name(" Πίτσα λουκάνικο τυρί")
                        .description(" Με σάλτσα, λουκάνικο χωριάτικο & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(11.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα φέτα ντομάτα")
                        .description("Με φέτα, ντομάτα & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα σουτζούκι")
                        .description(" Με σάλτσα, σουτζούκι, ντομάτα & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(12.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build(),
                Product.builder()
                        .name("Πίτσα παστουρμάς")
                        .description("Με σάλτσα, παστουρμά, ντομάτα & gouda")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.40))
                        .imgUrl("assets/img/service/final/1.png")
                        .build()

        );

    }

    List<Product> getListOfProductsForChineseStores() {
        return List.of(
                Product.builder().name("Σούπα Wonton")
                        .description("Με πουγκάκια γεμιστά με κιμά & λαχανικά ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.90))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Chicken wings")
                        .description("6 Τεμάχια. Φτερούγες κοτόπουλο ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.00))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Noodles satay")
                        .description("Ταλιατέλες ρυζιού με αυγό, γαρίδες, λάχανο, πράσινη πιπεριά, κοκκινη πιπεριά, κρεμμύδι & σάλτσα satay ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(10.80))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Cheese won ton")
                        .description("6 Τεμάχια. Τραγανά φιονγκάκια με τυρί Philadelphia & καβούρι ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.50))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Shrimp dimblings")
                        .description("5 Τεμάχια. Γαριδοπιτάκια τηγανητά ή ατμού ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.00))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Meet dumplings")
                        .description("4 Τεμάχια. Κρεατοπιτάκια τηγανητά ή ατμού")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.50))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Won ton soup")
                        .description("Σούπα με won ton από φύλλα ζυμαρικών με κιμά, καρότο, μανιτάρια, φρέσκο κρεμμύδι & λάχανο")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.00))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Pecking duck")
                        .description("Πάπια Πεκίνου τηγανισμένη με πίτα, καρότο, μανιτάρια, φρέσκο κρεμμύδι, λάχανο & dark sauce")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(11.40))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Szechuan beef")
                        .description("Βοδινό με καρότο, μανιτάρια, φρέσκο κρεμμύδι & λάχανο σε καυτερή σάλτσα Szechuan ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.90))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Beef with mushrooms & bamboo")
                        .description("Μοσχάρι με μανιτάρια & μπαμπού")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(10.00))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Singapore noodles")
                        .description("Κινέζικα noodles από ρύζι με καρότο, μανιτάρια, κρεμμύδι, λάχανο, γαρίδες & σάλτσα κάρυ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.90))
                        .imgUrl("assets/img/service/final/4.png")
                        .build(),
                Product.builder().name("Καντονέζικο καυτερό ρύζι")
                        .description("Καυτερό. Με μύδια, καλαμάρι, γαρίδα, καβούρι & chili")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.30))
                        .imgUrl("assets/img/service/final/4.png")
                        .build()
        );
    }

    List<Product> getListOfProductsForPastaStores() {
        return List.of(
                Product.builder().name("Spaghetti Napoli")
                        .description("Με σάλτσα ντομάτας & τριμμένη παρμεζάνα ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.30))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Spaghetti chef")
                        .description("Με μπέικον, μανιτάρια, κρέμα γάλακτος & τριμμένη παρμεζάνα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.50))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Spaghetti aglio e olio")
                        .description("Με ελαιόλαδο, σκόρδο & chili flakes")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.50))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Spaghetti bolognese")
                        .description("Με κιμά & τριμμένη παρμεζάν")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.50))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Πέννες")
                        .description("Mε φρέσκια mozzarella, ντομάτα & βασιλικό")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.30))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Πέννες με κοτόπουλο")
                        .description("Με κοτόπουλο, φρέσκο κρεμμύδι, μουστάρδα & κρέμα γάλακτος")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(11.00))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Καρμπονάρα")
                        .description("Με χοιρινή πανσέτα, φρέσκα μανιτάρια & κρέμα γάλακτος")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(10.00))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Ριζότο θαλασσινών")
                        .description("Με γαρίδες, μύδια, καλαμάρι, φρέσκο κρεμμυδάκι & φρέσκια ντομάτα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(25.00))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Ριζότο κοτόπουλο")
                        .description("Με κοτόπουλο φιλέτο, κρόκο Κοζάνης & κρέμα παρμεζάνας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(12.00))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Ριζότο μανιτάρια")
                        .description("Με μανιτάρια porcini & λάδι λευκής τρούφας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.50))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Κριθαρότο γαρίδες")
                        .description("Με ούζο, φέτα, φρέσκια ντομάτα & βασιλικό")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(23.00))
                        .imgUrl("assets/img/service/final/5.png")
                        .build(),
                Product.builder().name("Κριθαρότο μοσχαράκι")
                        .description("Με τρίχρωμη πιπεριά & φρέσκια ντομάτα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(14.90))
                        .imgUrl("assets/img/service/final/5.png")
                        .build());
    }

    List<Product> getListOfProductsForVegetarianStores() {
        return List.of(
                Product.builder().name("Veggie mushroom")
                        .description("Με μανιτάρι portobello, μανιτάρι πλευρώτους, λευκά μανιτάρια, μέλι, θυμάρι, garlic mayo & τυρί προβολόνε")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.90))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Veggie omelet")
                        .description("Με 3 αυγά, μανιτάρια, ντοματίνια & πράσινες πιπεριές. Συνοδεύεται από φρεσκοκομμένες τηγανητές πατάτες")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.50))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Μεξικάνα")
                        .description("Σαλάτα με λάχανο, μαρούλι, καρότο, καλαμπόκι, κόκκινα φασόλια, cocktail σως & τυρί")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.30))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Sandwich vegetarian")
                        .description("Με μπιφτέκι λαχανικών, μαρούλι, ντομάτα, πατάτες τηγανητές & sauce μουστάρδα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(4.50))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Vegetarian burger")
                        .description("Ψωμάκι της επιλογής σας με μπιφτέκι λαχανικών, μανιτάρια πλευρώτους, ντομάτα, iceberg, vegan mayo & vegan sauce μουστάρδας")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.00))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Aloo - Gobbi")
                        .description("Κουνουπίδι και πατάτες,καρότα μαγειρεμένα απο μείγμα ινδικών μπαχαρικών")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.50))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Jeera Aloo")
                        .description("Πατάτες με κύμινο κρεμμύδια ντομάτες και ινδικά μπαχαρικά")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.00))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Dal Tarka")
                        .description("Κρεμώδεις κίτρινες φακές με αρωματικά μπαχαρικά")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.00))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Mix Vegetable")
                        .description("Φασολάκια, πατάτες και καρότα μαγειρεμένα με ινδική σάλτσα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.90))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Μπιφτέκι λαχανικών Da Vinci")
                        .description("2 Τεμάχια. Συνοδεύεται από μουστάρδα & σαλάτα vegetarian (μαρούλι, αγγούρι, ντομάτα & πιπεριά)")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.10))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Vegetarian ")
                        .description("Με σάλτσα ντομάτας, μοτσαρέλα, ελιές, πιπεριά, κρεμμύδι & βασιλικό")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.50))
                        .imgUrl("assets/img/service/final/11.png")
                        .build(),
                Product.builder().name("Καλτσόνε vegetarian")
                        .description("30cm. Χειροποίητη ζύμη. Με σάλτσα ντομάτας, mozzarella, ντοματίνια, πιπεριά & μανιτάρια")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.00))
                        .imgUrl("assets/img/service/final/11.png")
                        .build());
    }

    List<Product> getListOfProductsForMexicanStores() {
        return List.of(
                Product.builder().name("Jalapenos peppers")
                        .description("6 Τεμάχια. Καυτερό")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.90))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Enchiladas barbacoa beef")
                        .description("Γεμιστες τορτιγιες καλαμποκιου με σιγομαγειρεμενο μοσχαρι, μεξικανικα μπαχαρικα,chipotle sauce και τυρι cheddar ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(12.50))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Chimichanga chicken")
                        .description("Τορτίγια από αλεύρι τηγανητή με γέμιση mix τυριών, φιλέτο κοτόπουλο, πιπεριά πράσινη, πιπεριά κόκκινη, πιπεριά κίτρινη & μανιτάρια. Συνοδεύεται από μεξικάνικο ρύζι, sauce ranchera, pico de gallo & κόλιανδρο ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(12.50))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Burritos chili con carne")
                        .description("Καυτερό. Ψητή τορτίγια με cheddar & chili con carne. Συνοδεύεται από μεξικάνικο ρύζι, ανάμεικτη σαλάτα & sour cream ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.00))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Tacos beef")
                        .description("Με pico de gallo, iceberg, μοσχαρίσιο κιμά & cheddar τριμμένο. Συνοδεύεται από με μεξικάνικο ρύζι, ανάμεικτη σαλάτα & sauce ranchera ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(10.20))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Jamon Iberico")
                        .description("Pata negra 28μήνης ωρίμανσης ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(13.30))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Variedad de jamones y quesos")
                        .description("Ποικιλία αλλαντικών & τυριών με prosciutto di Parma, chorizo de Espana, spianata calabria, parmigiano reggiano, manchego de Espana & αρσενικό Νάξου")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(11.50))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Paellas de mariscos")
                        .description("Με μύδια, γαρίδες, καλαμάρι & κρόκο Κοζάνης ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(18.50))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Paellas valenciana mixta")
                        .description("Με κοτόπουλο, chorizo λουκάνικο, μύδια, γαρίδες, καλαμάρι & κρόκο Κοζάνης ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(17.00))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Nachos chili con carne")
                        .description("10 Τεμάχια. Καυτερό")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.00))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Guacamole & chips")
                        .description("Μεξικάνικο dip με βάση το avocado, pico de gallo & lime ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.20))
                        .imgUrl("assets/img/service/final/6.png")
                        .build(),
                Product.builder().name("Fajitas vegetables")
                        .description("Mix λαχανικών. Με λεπτοκομμένη πράσινη πιπεριά, κόκκινη πιπεριά, κίτρινη πιπεριά, κρεμμύδι & σάλτσα ranchera. Συνοδεύεται από τορτίγιες αλευριού, guacamole, pico de gallo & sour cream ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(13.80))
                        .imgUrl("assets/img/service/final/6.png")
                        .build());
    }

    List<Product> getListOfProductsForHomemadeStores() {
        return List.of(
                Product.builder().name("Μπιφτέκια με πουρέ πατάτας & μυρωδικά")
                        .description("2 τεμάχια. Με ανάμεικτο κιμά ψημένα στη σχάρα ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.90))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Sweet chili φιλέτο κοτόπουλο με άγριο ρύζι")
                        .description("Τρυφερό & ελαφρύ φιλετάκι κοτόπουλο ψημένο στη σχάρα με γλυκοκαυτερή σως. Συνοδεύεται από άγριο ρύζι ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.00))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Αρακάς λεμονάτος με κοτόπουλο")
                        .description("Μια πεντανόστιμη & υγιεινή συνταγή του αρακά με κοτόπουλο, καροτάκια & πατάτες. Φρεσκοστημμένα λεμόνια, άνηθος & μαϊντανός συνθέτουν ένα τέλειο γευστικά πιάτο ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.50))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Κοτόπουλο με πουρέ πατάτας")
                        .description("Λαχταριστό μπουτάκι κοτόπουλο με χειροποίητο πουρέ πατάτες & άρωμα δενδρολίβανο ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.50))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Παστίτσιο ")
                        .description("Με κανελόνια γεμιστά με μοσχαρίσιο κιμά και μπεσαμέλ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(15.00))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Κόκορας κρασάτος")
                        .description("Με χοντρό μακαρόνι")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.00))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Μακαρόνια με σάλτσα")
                        .description("Συνοδεύεται από τριμμένο τυρί")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.00))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Φασολάκια")
                        .description("6 Τεμάχια. Καυτερό")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.90))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Jalapenos peppers")
                        .description("Συνοδεύεται με φέτα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.00))
                        .imgUrl("assets/img/service/7.png")
                        .build(),
                Product.builder().name("Μελιτζάνες ιμάμ μπαϊλντί")
                        .description("Συνοδεύεται με φέτα")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(9.00))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Κεφτεδάκια τηγανητά")
                        .description("12 Τεμάχια. Με δροσερό καρέ ντομάτας & γιαούρτι ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.00))
                        .imgUrl("assets/img/service/final/12.png")
                        .build(),
                Product.builder().name("Λουκάνικο Καρδίτσας στα κάρβουνα")
                        .description("Συνοδεύεται από πατάτες τηγανητές ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.50))
                        .imgUrl("assets/img/service/final/12.png")
                        .build());
    }

    List<Product> getListOfProductsForSweetsStores() {
        return List.of(
                Product.builder().name("Mystic cheesecake")
                        .description("Αμερικάνικο")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.00))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Mystic panna cotta")
                        .description("Με κανναβόσπορο & σιρόπι καραμέλα ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(2.50))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Mystic gorilla")
                        .description("2 Ατόμων. Πεϊνιρλί με κρέμα γάλακτος, μπανάνα & σοκολάτα με κανναβόσπορο ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.00))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Cheesecake βύσσινο")
                        .description("Με πλούσια φρέσκια κρέμα & χειροποίητη μαρμελάδα βύσσινο")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.00))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Brownies Valrhona")
                        .description("Double chocolate")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.70))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Σοκολατόπιτα")
                        .description("Σπιτική. Με σάλτσα σοκολάτας ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.90))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Προφιτερόλ")
                        .description("Πολίτικο")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.50))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Millefeuille")
                        .description("Σπιτικό")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(4.00))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Mousse κρέμα με σου & φράουλες")
                        .description("Φρέσκες φράουλες")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.00))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Πάστα ρώσικος τρούλος")
                        .description("Mousse κόκκινων φρούτων του δάσους, cremeux σοκολάτασς & επικάλυψη φράουλα ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(8.30))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Γαλακτομπουρεκο σε κανταΐφι")
                        .description("Φρέσκα υλικά")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(17.50))
                        .imgUrl("assets/img/service/final/8.png")
                        .build(),
                Product.builder().name("Τούρτα παγωτό παρφέ σοκολάτα το κιλό")
                        .description("Περίπου 1.5kg. Η τελική τιμή του προϊόντος θα διαμορφωθεί κατά το ζύγισμα ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(25.00))
                        .imgUrl("assets/img/service/final/8.png")
                        .build());
    }

    List<Product> getListOfProductsForSushiStores() {
        return List.of(
                Product.builder().name("Vegetable maki roll")
                        .description("8 Τεμάχια. Ρολό με αβοκάντο, καρότο & αγγούρι ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.50))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Salmon maki roll")
                        .description("8 Τεμάχια. Ρολό με σολομό ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(4.00))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Kappa maki roll")
                        .description("8 Τεμάχια. Ρολό με αγγούρι ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(3.00))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Tuna maki roll")
                        .description("8 Τεμάχια. Ρολό με τόνο ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(4.00))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Spicy salmon maki roll")
                        .description("8 Τεμάχια. Ρολό με σολομό & καυτερή sauce ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.00))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("California roll")
                        .description("8 Τεμάχια. Ρολό με surimi καβουριού, αγγούρι & αβοκάντο ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(6.00))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Creamy salmon roll")
                        .description("8 Τεμάχια. Ρολό με σολομό, avocado & κρέμα τυριού ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(4.00))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Uramaki Combo")
                        .description("Combo με επιλεγμένα inside-out rolls. 16 τεμάχια. ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(12.00))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Maki lovers")
                        .description("Combo με επιλεγμένα maki rolls. 12 τεμάχια. ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(10.00))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Edamame beans")
                        .description("Αλατισμένα φασολάκια σόγιας ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(5.50))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Rice balls")
                        .description("2 Μπάλες ρυζιού με φρέσκα κρεμμυδάκια, καρότο & ginger ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(4.50))
                        .imgUrl("assets/img/service/final/2.png")
                        .build(),
                Product.builder().name("Avocado maki rolls")
                        .description("6 Τεμάχια. Ρολά με αβοκάντο τυλιγμένα σε φύκι ")
                        .productCategory(getProductCategory("f"))
                        .price(BigDecimal.valueOf(7.00))
                        .imgUrl("assets/img/service/final/2.png")
                        .build());
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
