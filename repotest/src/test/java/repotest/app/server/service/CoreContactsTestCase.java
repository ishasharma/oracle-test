package repotest.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.ContextConfiguration;
import repotest.app.config.WebConfigExtended;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import repotest.app.server.repository.CoreContactsRepository;
import repotest.app.shared.contacts.CoreContacts;
import org.springframework.beans.factory.annotation.Autowired;
import com.athena.framework.server.helper.RuntimeLogInfoHelper;
import com.athena.framework.server.helper.EntityValidatorHelper;
import com.athena.framework.server.test.RandomValueGenerator;
import java.util.HashMap;
import com.spartan.healthmeter.entity.scheduler.ArtMethodCallStack;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.junit.Before;
import org.junit.After;
import com.athena.framework.shared.entity.web.entityInterface.CommonEntityInterface.RECORD_TYPE;
import org.junit.Test;
import repotest.app.shared.contacts.Gender;
import repotest.app.server.repository.GenderRepository;
import repotest.app.shared.location.Language;
import repotest.app.server.repository.LanguageRepository;
import repotest.app.shared.location.Timezone;
import repotest.app.server.repository.TimezoneRepository;
import repotest.app.shared.contacts.Title;
import repotest.app.server.repository.TitleRepository;
import repotest.app.shared.contacts.CommunicationData;
import repotest.app.shared.contacts.CommunicationGroup;
import repotest.app.server.repository.CommunicationGroupRepository;
import repotest.app.shared.contacts.CommunicationType;
import repotest.app.server.repository.CommunicationTypeRepository;
import repotest.app.shared.location.Address;
import repotest.app.server.repository.AddressRepository;
import repotest.app.shared.location.AddressType;
import repotest.app.server.repository.AddressTypeRepository;
import repotest.app.shared.location.City;
import repotest.app.server.repository.CityRepository;
import repotest.app.shared.location.Country;
import repotest.app.server.repository.CountryRepository;
import repotest.app.shared.location.State;
import repotest.app.server.repository.StateRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfigExtended.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestExecutionListeners({ org.springframework.test.context.support.DependencyInjectionTestExecutionListener.class, org.springframework.test.context.support.DirtiesContextTestExecutionListener.class, org.springframework.test.context.transaction.TransactionalTestExecutionListener.class })
public class CoreContactsTestCase {

    @Autowired
    private CoreContactsRepository<CoreContacts> corecontactsRepository;

    @Autowired
    private RuntimeLogInfoHelper runtimeLogInfoHelper;

    @Autowired
    private EntityValidatorHelper<Object> entityValidator;

    private RandomValueGenerator valueGenerator = new RandomValueGenerator();

    private static HashMap<String, Object> map = new HashMap<String, Object>();

    @Autowired
    private ArtMethodCallStack methodCallStack;

    protected MockHttpSession session;

    protected MockHttpServletRequest request;

    protected MockHttpServletResponse response;

    protected void startSession() {
        session = new MockHttpSession();
    }

    protected void endSession() {
        session.clearAttributes();
        session.invalidate();
        session = null;
    }

    protected void startRequest() {
        request = new MockHttpServletRequest();
        request.setSession(session);
        org.springframework.web.context.request.RequestContextHolder.setRequestAttributes(new org.springframework.web.context.request.ServletRequestAttributes(request));
    }

    protected void endRequest() {
        ((org.springframework.web.context.request.ServletRequestAttributes) org.springframework.web.context.request.RequestContextHolder.getRequestAttributes()).requestCompleted();
        org.springframework.web.context.request.RequestContextHolder.resetRequestAttributes();
        request = null;
    }

    @Before
    public void before() {
        startSession();
        startRequest();
        setBeans();
    }

    @After
    public void after() {
        endSession();
        endRequest();
    }

    private void setBeans() {
        runtimeLogInfoHelper.createRuntimeLogUserInfo(1, "AAAAA", request.getRemoteHost());
        org.junit.Assert.assertNotNull(runtimeLogInfoHelper);
        methodCallStack.setRequestId(java.util.UUID.randomUUID().toString().toUpperCase());
    }

    @Test
    public void test1Save() {
        try {
            Gender gender = new Gender();
            gender.setGender("EDjeUhGH1jmtDMoL0REx4LYWKXnwsf75jH20duFxhn49Go0sz2");
            Gender GenderTest = genderRepository.save(gender);
            map.put("GenderPrimaryKey", gender._getPrimarykey());
            Language language = new Language();
            language.setAlpha2("0u");
            language.setAlpha3("aii");
            language.setAlpha4("6VOM");
            language.setAlpha4parentid(6);
            language.setLanguage("a4JVaLg7Kwcr7XWfr19AM0d73A2eW6G1G4obeP6cpNa0qtPR2X");
            language.setLanguageDescription("KLUTlWtHycbZMHBsfSc31H7uuqmidfhqYtECm9cP4pu16atHw1");
            language.setLanguageIcon("VMbH7HnX3M4QJHOcfsIuosJ8pHvbUQ8FNfyKTYVY72i88MsqEy");
            language.setLanguageType("ZKYtu9PhbdD14a1RA6BbnXgRTFxO9XPt");
            Language LanguageTest = languageRepository.save(language);
            map.put("LanguagePrimaryKey", language._getPrimarykey());
            Timezone timezone = new Timezone();
            timezone.setCities("EJn8TBotRsQHxlaiicbaywyaJvLhC2rwgRykSEGSntYgYcG2ja");
            timezone.setCountry("A2mmwmQKoRHOiMMyjNKHjk7Mn4PBLpbMmpUF5pCtuGBRxvPiBu");
            timezone.setGmtLabel("cEXUhcVNq2j6arTkOqnD1KQhiqjSVzhA7EmerZ9mqKvDjN6Zf1");
            timezone.setTimeZoneLabel("aljxV2UA6C8T05Z9OOtLhCmQMZx21USXIidkmh6atuXqLkR3Lp");
            timezone.setUtcdifference(3);
            Title title = new Title();
            title.setTitles("SCz9QRAC2l38Uv52Xt0Uo3ReOWKJsdwtHA301r866e76D4cv1I");
            Title TitleTest = titleRepository.save(title);
            map.put("TitlePrimaryKey", title._getPrimarykey());
            CoreContacts corecontacts = new CoreContacts();
            corecontacts.setAge(30);
            corecontacts.setApproximateDOB(new java.sql.Date(123456789));
            corecontacts.setDateofbirth(new java.sql.Date(123456789));
            corecontacts.setEmailId("UppVihsxy6Y398qJ6RPghYHT16VlblZZg8FsScqsyliKB0i6B4");
            corecontacts.setFirstName("GzaJmMNI7dRAhbaagQiCeY5hTCt8wR2smON233LSR65ywugi3w");
            corecontacts.setGenderId((java.lang.String) GenderTest._getPrimarykey()); /* ******Adding refrenced table data */
            corecontacts.setLastName("mlZBpXcDuUDynb4LLl9mTPRGlSeIZCYuyT80j0DUIfBt8FNf1q");
            corecontacts.setMiddleName("g2Ybhm9UgN5HwEk0pRNtuUdiLRhb4KLwGX3yp7BCon7bIcyPPN");
            corecontacts.setNativeFirstName("4IsgOmRTgK3AZA5dQJuS0fsWSZIE4DLnhr989hytNYdTZGhhwF");
            corecontacts.setNativeLanguageCode((java.lang.String) LanguageTest._getPrimarykey()); /* ******Adding refrenced table data */
            corecontacts.setNativeLastName("BGrpz0Zbzq4Jmc6c1yYCvi2iOHDGMphIRLAygdd0E4x13ymNKC");
            corecontacts.setNativeMiddleName("gRzdJFnchMMKpl5ExC2mUPkanDpT4Gz890lNNg2EjjabXHX1eH");
            corecontacts.setNativeTitle("fvBJ9GCoOmhuOLDPt5Qi3S33yVQOxwNw0LogEtAMT3T6lSMLWA");
            corecontacts.setPhoneNumber("9adqrG1kLHTjBk6I4t8e");
            corecontacts.setTimezone(timezoneRepository.save(timezone));
            map.put("TimezonePrimaryKey", timezone._getPrimarykey());
            corecontacts.setTitleId((java.lang.String) TitleTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<CommunicationData> listOfCommunicationData = new java.util.ArrayList<CommunicationData>();
            CommunicationData communicationdata = new CommunicationData();
            communicationdata.setCommData("N");
            CommunicationGroup communicationgroup = new CommunicationGroup();
            communicationgroup.setCommGroupDescription("amiLHvuTOHZeHFPhw5nyNYRys3bAsRYAnwuGy5IvAakl6j2t6P");
            communicationgroup.setCommGroupName("1apbCxOJivWoKb8wgmNc3Z1MHj2akLwfV5ztwxzdwAlrz2GVSH");
            CommunicationGroup CommunicationGroupTest = communicationgroupRepository.save(communicationgroup);
            map.put("CommunicationGroupPrimaryKey", communicationgroup._getPrimarykey());
            CommunicationType communicationtype = new CommunicationType();
            communicationtype.setCommGroupId((java.lang.String) CommunicationGroupTest._getPrimarykey()); /* ******Adding refrenced table data */
            communicationtype.setCommTypeDescription("V0SLYrmsHquwG8liVS9KonEqZ8QralmVnU0AYicIind1gSArA9");
            communicationtype.setCommTypeName("v0JwQO7lhfm2kyb2XHDD3dxVQ8xrTkIqcDLcn2lyVaaJ6WDrSg");
            CommunicationType CommunicationTypeTest = communicationtypeRepository.save(communicationtype);
            map.put("CommunicationTypePrimaryKey", communicationtype._getPrimarykey());
            communicationdata.setCommData("9");
            communicationdata.setCommGroupId((java.lang.String) CommunicationGroupTest._getPrimarykey()); /* ******Adding refrenced table data */
            communicationdata.setCommType((java.lang.String) CommunicationTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            listOfCommunicationData.add(communicationdata);
            corecontacts.addAllCommunicationData(listOfCommunicationData);
            java.util.List<Address> listOfAddress = new java.util.ArrayList<Address>();
            Address address = new Address();
            address.setAddress1("duDeo361hoHN1aVtPUfgRDK5FsiInQIALmOgKwPUAc0Fc8iFDo");
            address.setAddress2("ZDu50l2JiuvVRBmsSxrSq2OMnKhCsMhXnfS4IOslvV8tdfDHAn");
            address.setAddress3("p40bSF4WqL4vI14rSrswggvhtXvKBc2PveAyzvxdfanYUjrVEd");
            address.setAddressLabel("76gbUyofxse");
            AddressType addresstype = new AddressType();
            addresstype.setAddressType("MIRFBaqm39WMhuiSoBzbVFpnIsIkZUFFEA4fKQ5zXuMeGvWFN4");
            addresstype.setAddressTypeDesc("QJs2GsFSQluZYclR9i1ueHHUrBg0uDkLZKoaTP0fAsOKmpVQ1G");
            addresstype.setAddressTypeIcon("ZiixfpK4s1iHqWkYD9IzKrQEidnbitaWtuIlbdwXBTCNZFOeQe");
            AddressType AddressTypeTest = addresstypeRepository.save(addresstype);
            map.put("AddressTypePrimaryKey", addresstype._getPrimarykey());
            City city = new City();
            city.setCityCode(1);
            city.setCityCodeChar2("W01E57IxgNxeggwRoFfKZHwdVSWBfTaN");
            city.setCityDescription("2HhOxc1KQGOTz4biDYTuFcna1WyOwPUcQiNTULswv5VOBiw04s");
            city.setCityFlag("Pqg4XRYyWDPD5h7S41B1Qlc1VJTn0c1dWxBmcFHkQ3Eufos5Ih");
            city.setCityLatitude(10);
            city.setCityLongitude(8);
            city.setCityName("oqyVkrOuevk6Fpg67KofiFJO6AxXpOodTuawFMhvOnlRTOp6bV");
            Country country = new Country();
            country.setCapital("Nm5Tj9WNVzCftD0oq0mAF8peOwuS7sAB");
            country.setCapitalLatitude(11);
            country.setCapitalLongitude(4);
            country.setCountryCode1("1wp");
            country.setCountryCode2("Xz0");
            country.setCountryFlag("hiqBEZJJdxhizTry4CO3AnvSYIghEyOGXKZULFMl2J8IKud730");
            country.setCountryName("lYGZOr264VJ2F1u38uvPjayMPG09EucY04eJ5Uj1KEVgp2Uvh8");
            country.setCurrencyCode("cFe");
            country.setCurrencyName("YtQ8wxut37XJftQZaxrol9I6uBo5WiQVHZsr00FxeArCesrPMu");
            country.setCurrencySymbol("PCNpy9EziadKOo2mNC1YcnYbGBNevLtQ");
            country.setIsoNumeric(2);
            Country CountryTest = countryRepository.save(country);
            map.put("CountryPrimaryKey", country._getPrimarykey());
            State state = new State();
            state.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            state.setStateCapital("85SuKnznI4kyQRPk7W3wfBdNsqnMkUKFajZWX4kqFmJrv6VXAT");
            state.setStateCapitalLatitude(11);
            state.setStateCapitalLongitude(9);
            state.setStateCode(1);
            state.setStateCodeChar2("vNXCIWX43YjfWnZSSznB6siUvabLiKAx");
            state.setStateCodeChar3("PpvX3xTYnlLm0fON3rHjA5VF3OtmhNor");
            state.setStateDescription("mFfGmNGfXJKGljmMJvXt9tZh781bMybRioD5w7oeZe0eyffjaB");
            state.setStateFlag("41lFFodaiZ0JXHGVb1JzpkNm6BfUxtDkbKDjWEXPHA46EwHb3Q");
            state.setStateName("9AN671XZDGskmmevZi99PgAGP8dEpoNsFuaKf2qh4kTO1yOksc");
            State StateTest = stateRepository.save(state);
            map.put("StatePrimaryKey", state._getPrimarykey());
            city.setCityCode(1);
            city.setCityCodeChar2("zYLvHooaVuxRtV9NxN0HUwHSAxjrlQLH");
            city.setCityDescription("zm2Vy3JgxBzpHEYP2Z0pTNbg5PkcuyDoF8UziM8k7IkGHn4SSt");
            city.setCityFlag("kPUYEiPYHjNj9mxzM6Dt46T46bf8CigZe7QuRR7EjVMPffkFNt");
            city.setCityLatitude(9);
            city.setCityLongitude(2);
            city.setCityName("SoqeMj23qRxB8XKC1TItqi4GfEyEtEtX5JzkAgfthY0x1LOUEn");
            city.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            city.setStateId((java.lang.String) StateTest._getPrimarykey()); /* ******Adding refrenced table data */
            City CityTest = cityRepository.save(city);
            map.put("CityPrimaryKey", city._getPrimarykey());
            address.setAddress1("xg2N2jHky6rTLuzvD076sbTxZht1tgFgByOtMbVfHhkOUZNO6T");
            address.setAddress2("WQF8PaT8G4vxBcccJwJHVtetTCLXMofjhqxdn3GGajZq02bT7O");
            address.setAddress3("hGP3N6kGA1dn9ZYnoWuPnRgTFCo4oXpVf1WtxwBUS4zEXl5wMw");
            address.setAddressLabel("URf8eoZDuWW");
            address.setAddressTypeId((java.lang.String) AddressTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCityId((java.lang.String) CityTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setLatitude("7SI0TqUdTBGxuxoRj59TZe9Sj70X7CqddszwNR2X2YwVDtJrQ4");
            address.setLongitude("bLEWIVksrV4OmWG5CKbbeeo71bIYnfB9IHMVcoS5AVRGimFqGx");
            address.setStateId((java.lang.String) StateTest._getPrimarykey());
            address.setZipcode("7hrYhU");
            listOfAddress.add(address);
            corecontacts.addAllAddress(listOfAddress);
            corecontacts.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            corecontacts.setEntityValidator(entityValidator);
            corecontacts.isValid();
            corecontactsRepository.save(corecontacts);
            map.put("CoreContactsPrimaryKey", corecontacts._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Autowired
    private GenderRepository<Gender> genderRepository;

    @Autowired
    private LanguageRepository<Language> languageRepository;

    @Autowired
    private TimezoneRepository<Timezone> timezoneRepository;

    @Autowired
    private TitleRepository<Title> titleRepository;

    @Autowired
    private CommunicationGroupRepository<CommunicationGroup> communicationgroupRepository;

    @Autowired
    private CommunicationTypeRepository<CommunicationType> communicationtypeRepository;

    @Autowired
    private AddressRepository<Address> addressRepository;

    @Autowired
    private AddressTypeRepository<AddressType> addresstypeRepository;

    @Autowired
    private CityRepository<City> cityRepository;

    @Autowired
    private CountryRepository<Country> countryRepository;

    @Autowired
    private StateRepository<State> stateRepository;

    @Test
    public void test2Update() {
        try {
            org.junit.Assert.assertNotNull(map.get("CoreContactsPrimaryKey"));
            CoreContacts corecontacts = corecontactsRepository.findById((java.lang.String) map.get("CoreContactsPrimaryKey"));
            corecontacts.setAge(46);
            corecontacts.setApproximateDOB(new java.sql.Date(123456789));
            corecontacts.setDateofbirth(new java.sql.Date(123456789));
            corecontacts.setEmailId("byfqWlnyybw2pHU2Z0GBLtSKAkiMyVWc0KwVk4hT8Aw1VBrMIp");
            corecontacts.setFirstName("DSBsQyoiZld6evPU5d6UfH82a6HZC5kL9RpJZ6L8yt5zfBbJOO");
            corecontacts.setLastName("2NRUtjJvzv8FnoqL811qTbzK225uK24GeS4kxuOmjdYTkTMtdm");
            corecontacts.setMiddleName("nY6NJ8LuINLibj5Rycyqt3x6QJTafTtTc1zZtcE6XSMiWWjvf2");
            corecontacts.setNativeFirstName("UpdiFNjvJRg6v5wlgUtVMyxzUZAIBjGO8PXDUG3wIOkBmalKEw");
            corecontacts.setNativeLastName("QaRXkdrzjVQyeMC4XCWWEwzbZqEGgjbjUclVToYrMC9TVhdPKG");
            corecontacts.setNativeMiddleName("x1eJtrUy86XaT2rL1YMjZebrWWvUH9e608UL8GC4ccUiy39KL1");
            corecontacts.setNativeTitle("rWQoitRSdOj6xE0HplrvrhNeULoLYYXG5lXaVddTPlFk5V6PXy");
            corecontacts.setPhoneNumber("5PemzkQdClCpIgamScqW");
            corecontacts.setVersionId(1);
            corecontacts.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            corecontactsRepository.update(corecontacts);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("CoreContactsPrimaryKey"));
            corecontactsRepository.findById((java.lang.String) map.get("CoreContactsPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBygenderId() {
        try {
            java.util.List<CoreContacts> listofgenderId = corecontactsRepository.findByGenderId((java.lang.String) map.get("GenderPrimaryKey"));
            if (listofgenderId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBynativeLanguageCode() {
        try {
            java.util.List<CoreContacts> listofnativeLanguageCode = corecontactsRepository.findByNativeLanguageCode((java.lang.String) map.get("LanguagePrimaryKey"));
            if (listofnativeLanguageCode.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBytitleId() {
        try {
            java.util.List<CoreContacts> listoftitleId = corecontactsRepository.findByTitleId((java.lang.String) map.get("TitlePrimaryKey"));
            if (listoftitleId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test4Delete() {
        try {
            org.junit.Assert.assertNotNull(map.get("CoreContactsPrimaryKey"));
            corecontactsRepository.delete((java.lang.String) map.get("CoreContactsPrimaryKey")); /* Deleting refrenced data */
            cityRepository.delete((java.lang.String) map.get("CityPrimaryKey")); /* Deleting refrenced data */
            stateRepository.delete((java.lang.String) map.get("StatePrimaryKey")); /* Deleting refrenced data */
            countryRepository.delete((java.lang.String) map.get("CountryPrimaryKey")); /* Deleting refrenced data */
            addresstypeRepository.delete((java.lang.String) map.get("AddressTypePrimaryKey")); /* Deleting refrenced data */
            communicationtypeRepository.delete((java.lang.String) map.get("CommunicationTypePrimaryKey")); /* Deleting refrenced data */
            communicationgroupRepository.delete((java.lang.String) map.get("CommunicationGroupPrimaryKey")); /* Deleting refrenced data */
            titleRepository.delete((java.lang.String) map.get("TitlePrimaryKey")); /* Deleting refrenced data */
            timezoneRepository.delete((java.lang.String) map.get("TimezonePrimaryKey")); /* Deleting refrenced data */
            languageRepository.delete((java.lang.String) map.get("LanguagePrimaryKey")); /* Deleting refrenced data */
            genderRepository.delete((java.lang.String) map.get("GenderPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
