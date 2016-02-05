package repotest.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.ContextConfiguration;
import repotest.app.config.WebConfigExtended;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import repotest.app.server.repository.AddressRepository;
import repotest.app.shared.location.Address;
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
public class AddressTestCase {

    @Autowired
    private AddressRepository<Address> addressRepository;

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
            AddressType addresstype = new AddressType();
            addresstype.setAddressType("WioJCxu296NhhkeiOqLhjm5DOYrN8cNsQmTZup3cD0FJEF3HpM");
            addresstype.setAddressTypeDesc("hwPJQa6EqZBRgw1N545VF5EN5LKBhADjhGdINZiug2RkQhlpRM");
            addresstype.setAddressTypeIcon("jg9hEkxbdlPz7ztpP0mdnNx8A5OCnE7dC8IzKVnR5hBu06FnVc");
            AddressType AddressTypeTest = addresstypeRepository.save(addresstype);
            map.put("AddressTypePrimaryKey", addresstype._getPrimarykey());
            City city = new City();
            city.setCityCode(1);
            city.setCityCodeChar2("m4Gjig6Lajrtt4qeQ6cUOwiKqLR60rJl");
            city.setCityDescription("59su7khQivOqBt8zWwgNnCWP5BFCk8LDu6WERE3LKiKF7Mfiyq");
            city.setCityFlag("bg6hhQCzzkU8XlS0VpGK9YrZ4CQgu4XCdVtYrMK0k047FMHqMA");
            city.setCityLatitude(5);
            city.setCityLongitude(0);
            city.setCityName("sYRlQlGXPpIPCRLE2rCC82hp65xD79iUmrmqUVbhbAPMwKSYu4");
            Country country = new Country();
            country.setCapital("LXnW9hXmjOqEygmWuz94vosLl0XfGege");
            country.setCapitalLatitude(11);
            country.setCapitalLongitude(5);
            country.setCountryCode1("gsO");
            country.setCountryCode2("8rS");
            country.setCountryFlag("ZE0JjcU71qCmvaxbiXlyBQLnPgNpx61wuaxfUSIdQQizxJN7fm");
            country.setCountryName("n2xWNGKCgyTi6FPb3eZ29vMsiuWVz5m07gZaPzW8aGmhRbft9S");
            country.setCurrencyCode("YDw");
            country.setCurrencyName("EOpapCrLfiOmU91AlakgnVdOy477z1UxLJoGX5xZiIUpLTgldW");
            country.setCurrencySymbol("bLtA4qVFEZIkWYwgJmz3ksFrc1LAfiAj");
            country.setIsoNumeric(6);
            Country CountryTest = countryRepository.save(country);
            map.put("CountryPrimaryKey", country._getPrimarykey());
            State state = new State();
            state.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            state.setStateCapital("D2m5rvZKPcKbMSH8P1DMGbUU6BUhdTy7MARYAUfWXXR4sSSERV");
            state.setStateCapitalLatitude(8);
            state.setStateCapitalLongitude(6);
            state.setStateCode(0);
            state.setStateCodeChar2("EUY4M8da9KDlAmkO0lOdpReE5WHqcLRF");
            state.setStateCodeChar3("7Bf5KIZmEqld7ponblJ2yit3ctU9jicn");
            state.setStateDescription("Ntl5wl7FFNabzGU2HgqBfkWCqAoajiM9GGnpX9an7kGBjb9Skb");
            state.setStateFlag("oXuGFMgPa1lUUGG5muc7heS5JWmRkXCinjK5mG6VeG0Q3wxHrq");
            state.setStateName("bTpII3DZ4JsqgFeUU8c4hMHIl7KakQrtzA2ziwmE2kILkeCZL6");
            State StateTest = stateRepository.save(state);
            map.put("StatePrimaryKey", state._getPrimarykey());
            city.setCityCode(1);
            city.setCityCodeChar2("JlEyRGtYxLX6vFd2wy5ZOtF3PkW61jGP");
            city.setCityDescription("SGmT3lYlV047LaJN8V3aKvpMaf6EP9KFWKD5Zhps0f7alkAoKc");
            city.setCityFlag("6fxs1h1Og8lwiSpeffUGiNalWiFXRzZcC0N36wXBW708H084p4");
            city.setCityLatitude(1);
            city.setCityLongitude(2);
            city.setCityName("kZQToqpzBcEs6OTkPsc6w3jeLaEClJeEYY50yzxzryBUHAGYE4");
            city.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            city.setStateId((java.lang.String) StateTest._getPrimarykey()); /* ******Adding refrenced table data */
            City CityTest = cityRepository.save(city);
            map.put("CityPrimaryKey", city._getPrimarykey());
            Address address = new Address();
            address.setAddress1("6ZzVDnu45Ic3XBJuc2gfVvJOBGhNpL6eqk321trPJx0GyRAYT5");
            address.setAddress2("n36Ulbvb5El3p9KYfUotpI0n7Vx2NJfGOi1khUT54kAMQRiA6f");
            address.setAddress3("H4Be7VreCYLljoB26OcLmjmVrfUaKLZaE65kYiDtpXLc0PdWPc");
            address.setAddressLabel("0Ctfy5S8LC0");
            address.setAddressTypeId((java.lang.String) AddressTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCityId((java.lang.String) CityTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setLatitude("3qX0mafRBHoDlM5yb242bEpFwoiacWrWS7ytQIgmvpGSdqB4sj");
            address.setLongitude("I9AgRDtyxp1UCrkDIVCmsNQuS1UryOjAXroctnhd1iapUUCYpo");
            address.setStateId((java.lang.String) StateTest._getPrimarykey());
            address.setZipcode("nrw8aG");
            address.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            address.setEntityValidator(entityValidator);
            address.isValid();
            addressRepository.save(address);
            map.put("AddressPrimaryKey", address._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

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
            org.junit.Assert.assertNotNull(map.get("AddressPrimaryKey"));
            Address address = addressRepository.findById((java.lang.String) map.get("AddressPrimaryKey"));
            address.setAddress1("NPTKlwYY3sQ5odIKqm6eauN8aqaGvHFI8G5VxbUVQo9FgYgMM7");
            address.setAddress2("vIC1JrAtb8GTLFhLh0w5bhvfW8SO66gLMdwKxjf5XP4vb3uSHn");
            address.setAddress3("TczoM1nE9S0bfcUW5L3Gbk1RzsTe7DCahHqSrMpjWAJiUsFlw7");
            address.setAddressLabel("nYmUfc6BN6i");
            address.setLatitude("E5JMLeZICtpxPaLLlQPuYEfOdOeQ1P64THibKIulx6XzFiKgrL");
            address.setLongitude("dV3UnmbRfZrTHFyv3H06lHtxQjxAFZcekaBYIWc9SglatKdoAc");
            address.setVersionId(1);
            address.setZipcode("0s0xrI");
            address.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            addressRepository.update(address);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("AddressPrimaryKey"));
            addressRepository.findById((java.lang.String) map.get("AddressPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByaddressTypeId() {
        try {
            java.util.List<Address> listofaddressTypeId = addressRepository.findByAddressTypeId((java.lang.String) map.get("AddressTypePrimaryKey"));
            if (listofaddressTypeId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBycityId() {
        try {
            java.util.List<Address> listofcityId = addressRepository.findByCityId((java.lang.String) map.get("CityPrimaryKey"));
            if (listofcityId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBycountryId() {
        try {
            java.util.List<Address> listofcountryId = addressRepository.findByCountryId((java.lang.String) map.get("CountryPrimaryKey"));
            if (listofcountryId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBystateId() {
        try {
            java.util.List<Address> listofstateId = addressRepository.findByStateId((java.lang.String) map.get("StatePrimaryKey"));
            if (listofstateId.size() == 0) {
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
            org.junit.Assert.assertNotNull(map.get("AddressPrimaryKey"));
            addressRepository.delete((java.lang.String) map.get("AddressPrimaryKey")); /* Deleting refrenced data */
            cityRepository.delete((java.lang.String) map.get("CityPrimaryKey")); /* Deleting refrenced data */
            stateRepository.delete((java.lang.String) map.get("StatePrimaryKey")); /* Deleting refrenced data */
            countryRepository.delete((java.lang.String) map.get("CountryPrimaryKey")); /* Deleting refrenced data */
            addresstypeRepository.delete((java.lang.String) map.get("AddressTypePrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
