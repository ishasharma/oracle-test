package repotest.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.ContextConfiguration;
import repotest.app.config.WebConfigExtended;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import repotest.app.server.repository.CurrencyRepository;
import repotest.app.shared.location.Currency;
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
import repotest.app.shared.location.Country;
import repotest.app.server.repository.CountryRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfigExtended.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestExecutionListeners({ org.springframework.test.context.support.DependencyInjectionTestExecutionListener.class, org.springframework.test.context.support.DirtiesContextTestExecutionListener.class, org.springframework.test.context.transaction.TransactionalTestExecutionListener.class })
public class CurrencyTestCase {

    @Autowired
    private CurrencyRepository<Currency> currencyRepository;

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
            Country country = new Country();
            country.setCapital("8bdqwCse6uKU76QnlUyVaveWZna25IQG");
            country.setCapitalLatitude(11);
            country.setCapitalLongitude(10);
            country.setCountryCode1("1S3");
            country.setCountryCode2("JGl");
            country.setCountryFlag("qrUf9XdYCzBjH93pBvWlhvfk82LIkHV1drSZdRWKLpq3takfw8");
            country.setCountryName("XuTd82QVYbFCy3Wi2jPPAXyII67KzCFlbf34ERXRBATzEPS5Mt");
            country.setCurrencyCode("SCT");
            country.setCurrencyName("Vs71TEXWXgbdqXJ3cQtiX0s35ZFtkI5xarBMOIuVHJzGyrSVt6");
            country.setCurrencySymbol("0qZg9pjGgnnBtqcNEGYTa6sog7CjZG9B");
            country.setIsoNumeric(11);
            Country CountryTest = countryRepository.save(country);
            map.put("CountryPrimaryKey", country._getPrimarykey());
            Currency currency = new Currency();
            currency.setCountryId((java.lang.String) CountryTest._getPrimarykey());
            currency.setCurrencyCode("SX3plGbVXJBTb6p7tWYHItB9NFf8sFbxQ6nOmmKysNxkg3CW5r");
            currency.setUnicodeDecimal("Tpmwv185JdKAKFJt9tyNuzE0L8kgbRif4O2xvjzYHKPolDkPUA");
            currency.setUnicodeHex("xrQSUAQJnLFkhIxyyam4LXhbDRasa3w9TqhhjACivJ1DNLZiA7");
            currency.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            currency.setEntityValidator(entityValidator);
            currency.isValid();
            currencyRepository.save(currency);
            map.put("CurrencyPrimaryKey", currency._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Autowired
    private CountryRepository<Country> countryRepository;

    @Test
    public void test2Update() {
        try {
            org.junit.Assert.assertNotNull(map.get("CurrencyPrimaryKey"));
            Currency currency = currencyRepository.findById((java.lang.String) map.get("CurrencyPrimaryKey"));
            currency.setCurrencyCode("GWRbzRZfyB3mzMT0uFehRldws1CFI4WSgLcKhs1fAMryd9AyGN");
            currency.setUnicodeDecimal("hUFggTHhevq6cDVChLlSJr7aTz61ka9orKaqL6onpvBzTFvVOW");
            currency.setUnicodeHex("MFksmeWg4aNvu6ao3WERkt0AnZB6vTCg4tUvLQB8vcjbq1Nf8C");
            currency.setVersionId(1);
            currency.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            currencyRepository.update(currency);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBycountryId() {
        try {
            java.util.List<Currency> listofcountryId = currencyRepository.findByCountryId((java.lang.String) map.get("CountryPrimaryKey"));
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
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("CurrencyPrimaryKey"));
            currencyRepository.findById((java.lang.String) map.get("CurrencyPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test4Delete() {
        try {
            org.junit.Assert.assertNotNull(map.get("CurrencyPrimaryKey"));
            currencyRepository.delete((java.lang.String) map.get("CurrencyPrimaryKey")); /* Deleting refrenced data */
            countryRepository.delete((java.lang.String) map.get("CountryPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
