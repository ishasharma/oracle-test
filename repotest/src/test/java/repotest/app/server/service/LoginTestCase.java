package repotest.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.ContextConfiguration;
import repotest.app.config.WebConfigExtended;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import repotest.app.server.repository.LoginRepository;
import repotest.app.shared.authentication.Login;
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
import repotest.app.shared.contacts.CoreContacts;
import repotest.app.server.repository.CoreContactsRepository;
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
import repotest.app.shared.authentication.User;
import repotest.app.server.repository.UserRepository;
import repotest.app.shared.authentication.UserAccessDomain;
import repotest.app.server.repository.UserAccessDomainRepository;
import repotest.app.shared.authentication.UserAccessLevel;
import repotest.app.server.repository.UserAccessLevelRepository;
import repotest.app.shared.authentication.PassRecovery;
import repotest.app.shared.authentication.Question;
import repotest.app.server.repository.QuestionRepository;
import repotest.app.shared.authentication.UserData;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfigExtended.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestExecutionListeners({ org.springframework.test.context.support.DependencyInjectionTestExecutionListener.class, org.springframework.test.context.support.DirtiesContextTestExecutionListener.class, org.springframework.test.context.transaction.TransactionalTestExecutionListener.class })
public class LoginTestCase {

    @Autowired
    private LoginRepository<Login> loginRepository;

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
            CoreContacts corecontacts = new CoreContacts();
            corecontacts.setAge(65);
            corecontacts.setApproximateDOB(new java.sql.Date(123456789));
            corecontacts.setDateofbirth(new java.sql.Date(123456789));
            corecontacts.setEmailId("WTR3LwGjXmQ1le2aIqcWmkEGxU1sORQKnPuBbUl7lSwSwLcJmu");
            corecontacts.setFirstName("42N7MQ1gQIWl2WDlDNazJMAXQcCYrfuMLTgOsX1Mcl5O8JfrtC");
            Gender gender = new Gender();
            gender.setGender("JspvsuWZOZKPHqqL289Qc7R0FLjRrXwCXSeaQsi3n9jGgIFmb6");
            Gender GenderTest = genderRepository.save(gender);
            map.put("GenderPrimaryKey", gender._getPrimarykey());
            Language language = new Language();
            language.setAlpha2("Z4");
            language.setAlpha3("eMA");
            language.setAlpha4("KDWw");
            language.setAlpha4parentid(2);
            language.setLanguage("rnH6GA75VF3fdoya2fnmMyiNJBGjylXNjMbB71em7xnDA6r1WO");
            language.setLanguageDescription("rdE9LVQMXON5ggSZrbii9NzTbpylByxwkSrUPbv6pENougm2L4");
            language.setLanguageIcon("ODvxBaLgPQNWPiCiIC0i8tqlaz0RTHYjin2LXxjDwMhtRxU66e");
            language.setLanguageType("JF4HQuDCwEHGe8yJUXI61Hv9ryuEWkkp");
            Language LanguageTest = languageRepository.save(language);
            map.put("LanguagePrimaryKey", language._getPrimarykey());
            Timezone timezone = new Timezone();
            timezone.setCities("60luE1lZNKYKdNz2QQLXKymEM6PvRK4fHOfOq2k8MUwGNuvrY7");
            timezone.setCountry("G1JGQRGn0tifDj2bti48CrBAhNjmDBCdLWFZQYboNyCEINy3Zg");
            timezone.setGmtLabel("5S4z9e5qRmnBsY7pvw9zfakDZoUkkENL8H0tRRi8p4sXByJf4P");
            timezone.setTimeZoneLabel("PFnNPlu1AKa5ToN2VxnlCTvJtlnqTA5MaiJXc1GDDVGuZ02fOm");
            timezone.setUtcdifference(8);
            Title title = new Title();
            title.setTitles("nGfCkGNZ8llr0lVQ7sjyXEL1Vh5gKF4cstLUVdd9wmBh1lWLWp");
            Title TitleTest = titleRepository.save(title);
            map.put("TitlePrimaryKey", title._getPrimarykey());
            corecontacts.setAge(51);
            corecontacts.setApproximateDOB(new java.sql.Date(123456789));
            corecontacts.setDateofbirth(new java.sql.Date(123456789));
            corecontacts.setEmailId("TwMBocHWMkQZurZZ9NSKD5dNAUOCVMEy5fCi39hYFdWiGf2vCz");
            corecontacts.setFirstName("VMHcZi6hVqfPLEHaPT3BaZkF7vCUwr8AeoijmdZGyAypKFydJ7");
            corecontacts.setGenderId((java.lang.String) GenderTest._getPrimarykey()); /* ******Adding refrenced table data */
            corecontacts.setLastName("740ABH2OyFp1eRtCRkS5xqZIxey5dAJUvLITBOQEzp8A6Bjzgd");
            corecontacts.setMiddleName("jCYrw0UI9KqaqLnZDXEilw1fzrYB7bM9esScOkwPEDbNugBw1T");
            corecontacts.setNativeFirstName("i93ubj7eujLqKESYBIxKPRgSI0xAxOpWDHPoXZmSpJM7F6e6al");
            corecontacts.setNativeLanguageCode((java.lang.String) LanguageTest._getPrimarykey()); /* ******Adding refrenced table data */
            corecontacts.setNativeLastName("EopfdCc3go5X5pm8GOXQ5qeUcjw7lrod4Y2TSg4XZ1rxGCf41e");
            corecontacts.setNativeMiddleName("oWXrJ0neHMLeoa6N4rytG3BHVeTKogM3jVd1YqPAmjPO4T79Ag");
            corecontacts.setNativeTitle("NbgG4n0yzxbNvZ7RevfSY39yBy7vuTDsmj1HXh1YvDM7BvUGEW");
            corecontacts.setPhoneNumber("N43osG3lyRWzkNOqL8dV");
            timezone.setTimeZoneId(null);
            corecontacts.setTimezone(timezoneRepository.save(timezone));
            map.put("TimezonePrimaryKey", timezone._getPrimarykey());
            corecontacts.setTitleId((java.lang.String) TitleTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<CommunicationData> listOfCommunicationData = new java.util.ArrayList<CommunicationData>();
            CommunicationData communicationdata = new CommunicationData();
            communicationdata.setCommData("C");
            CommunicationGroup communicationgroup = new CommunicationGroup();
            communicationgroup.setCommGroupDescription("sOf4uzK2MNWFwkQIShQLVdWnv7E5HcXm3vyzJI13OD6DELuRHH");
            communicationgroup.setCommGroupName("76YEzy3sUU8BUb3JXAi0s3pSXTShNfGt4kiV43V6tjhBto7wYx");
            CommunicationGroup CommunicationGroupTest = communicationgroupRepository.save(communicationgroup);
            map.put("CommunicationGroupPrimaryKey", communicationgroup._getPrimarykey());
            CommunicationType communicationtype = new CommunicationType();
            communicationtype.setCommGroupId((java.lang.String) CommunicationGroupTest._getPrimarykey()); /* ******Adding refrenced table data */
            communicationtype.setCommTypeDescription("Vw8EOCNHguCB3sFzMHy4Vcm2beos14z6D8TMDULVjUY9ETZTBW");
            communicationtype.setCommTypeName("1GOvap8kaCA17J1QwHGz8TFHbX8ouoL89eJ7euvIpoYBjuFSzm");
            CommunicationType CommunicationTypeTest = communicationtypeRepository.save(communicationtype);
            map.put("CommunicationTypePrimaryKey", communicationtype._getPrimarykey());
            communicationdata.setCommData("8");
            communicationdata.setCommGroupId((java.lang.String) CommunicationGroupTest._getPrimarykey()); /* ******Adding refrenced table data */
            communicationdata.setCommType((java.lang.String) CommunicationTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            listOfCommunicationData.add(communicationdata);
            corecontacts.addAllCommunicationData(listOfCommunicationData);
            java.util.List<Address> listOfAddress = new java.util.ArrayList<Address>();
            Address address = new Address();
            address.setAddress1("I09jFAgtzo1nwYnitpbnSMW1locwhBfBOuekU32h4EOm9qJpYc");
            address.setAddress2("szNO1kcZtVIruQ2twW60dKsPifOIc7co8khjD4Aag9Mk4Zjqqp");
            address.setAddress3("9WMirDHIzmGkM4YOodOYyNXgxzP353LVbzHwuqALPrtTbb7JLK");
            address.setAddressLabel("Va4TN0MSrMW");
            AddressType addresstype = new AddressType();
            addresstype.setAddressType("gKNeFC4wYk5R70dqeGjB61hPQTUIDwzmo0U7SldkPs4tJjAcIJ");
            addresstype.setAddressTypeDesc("wJ0PX9FfrUSIiZfgc45OYoKCppmzcyOxPFauFvDp0n8OZ9KmJr");
            addresstype.setAddressTypeIcon("EkGQ2KN7xJpJlggnd680gAJ1CObwozysva7sjm6JsHPcgglRPA");
            AddressType AddressTypeTest = addresstypeRepository.save(addresstype);
            map.put("AddressTypePrimaryKey", addresstype._getPrimarykey());
            City city = new City();
            city.setCityCode(2);
            city.setCityCodeChar2("HLZrC8GzjfqjcKFRuRQHA3aSMxYlfBl8");
            city.setCityDescription("I5bwUV11RlkxxXy484xhUbKHyZSbEM6RYRxmIyI6h2XXFDxk3E");
            city.setCityFlag("j3l0miyfnjEJk9hZUT0rTCkpMYcqOzNQOUvrvkwVaBqyqGwyj0");
            city.setCityLatitude(11);
            city.setCityLongitude(11);
            city.setCityName("KA4H79of7Me8V4FNOB4cFM0bcEerEv7oChF8Oen09gzWYpPF1m");
            Country country = new Country();
            country.setCapital("4IYpRWSHeKWSMYAW2Ok2OJTOuMCspUuU");
            country.setCapitalLatitude(6);
            country.setCapitalLongitude(5);
            country.setCountryCode1("Kep");
            country.setCountryCode2("5db");
            country.setCountryFlag("VJ1q1XCKgiWWWivy68AGAlrqI4MTbPko9siKNVqsqvgTiGk4kU");
            country.setCountryName("mtfHZzNZbHjGjk04DxnlTgY2dxWDhltQxApy9ma6RoEIEyuR4V");
            country.setCurrencyCode("N2n");
            country.setCurrencyName("qPBB2qFffz9ejrQp6hugYWmmWSh3asfPwSIV3OFkLVbNDbc0a1");
            country.setCurrencySymbol("03xq5qTmdhBen3aqOnwlbAqm1WgcQnhS");
            country.setIsoNumeric(10);
            Country CountryTest = countryRepository.save(country);
            map.put("CountryPrimaryKey", country._getPrimarykey());
            State state = new State();
            state.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            state.setStateCapital("AkGyV8YZtnC9NS2QHd3tFOiMsC4ixQx1TD6L36bglLbrxJEEoW");
            state.setStateCapitalLatitude(8);
            state.setStateCapitalLongitude(0);
            state.setStateCode(2);
            state.setStateCodeChar2("Bxvvmr0bcP4mcCzrVBgZ5lBXaKAcc0Co");
            state.setStateCodeChar3("AktuiWxZEpxgjqo1j5NQRPBGAqDBzXOk");
            state.setStateDescription("mi657BY34MdoS6ktkbffXO2PsLxfq7NT6Mk8gotY0mhuvXvdNX");
            state.setStateFlag("JVybokxnvVFi5V8BGOWwBg87sdkQIakxuWFnEvZs9ZFLiW25p2");
            state.setStateName("j5EJJ9z60KzWxn0BJ9JWZ8gm88zWQU9XFEyAeSRdKkKytd8RPm");
            State StateTest = stateRepository.save(state);
            map.put("StatePrimaryKey", state._getPrimarykey());
            city.setCityCode(3);
            city.setCityCodeChar2("Rtgvg7UYU6P08bZDk1WLJBwp4OwY7exa");
            city.setCityDescription("4IDJ1hQr4Q70jOeddZSJT5wl4JiHMJ2T8YLaMGO3QJt5QkLDSh");
            city.setCityFlag("Uz0VUahaRJn0qCOTx1HKKiGIwsAHQnHU7dNhfqnvx55LguYkbs");
            city.setCityLatitude(1);
            city.setCityLongitude(5);
            city.setCityName("ZB2OwgoAJP6z27LJjet5wHO1PyCSKSvUNpnAiFCHaN4T22mnbT");
            city.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            city.setStateId((java.lang.String) StateTest._getPrimarykey()); /* ******Adding refrenced table data */
            City CityTest = cityRepository.save(city);
            map.put("CityPrimaryKey", city._getPrimarykey());
            address.setAddress1("VIgv9M5FOEmoi3BDeylyuDR4dpaOXqLSNccMrJ1Rq2oSsWMU3N");
            address.setAddress2("mtMkYntUcdBE133LdgxkpRWLBjngGAkzDI0KWMGK2jeTpX25iZ");
            address.setAddress3("9Vxyke19ljfDXsCdSt4U7y8bYjisteFjKSlvVYJcGssdxX7ilV");
            address.setAddressLabel("1ZROwmkNUIj");
            address.setAddressTypeId((java.lang.String) AddressTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCityId((java.lang.String) CityTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setLatitude("GcCJx9rUjAYYppodH3BDNOH7Br2l9MXl6QIT12P9B0IPzWBNuF");
            address.setLongitude("OQLEZoYtaJnBLRN0lrVpVFr66OOrSCqjr2MOdQiOZ3DGKwqaCt");
            address.setStateId((java.lang.String) StateTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setZipcode("RnF5G8");
            listOfAddress.add(address);
            corecontacts.addAllAddress(listOfAddress);
            User user = new User();
            user.setAllowMultipleLogin(0);
            user.setChangePasswordNextLogin(1);
            user.setGenTempOneTimePassword(1);
            user.setIsDeleted(1);
            user.setIsLocked(0);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(123456789));
            user.setMultiFactorAuthEnabled(1);
            user.setPasswordAlgo("R6oGGATfRndngWCQzKvvDC2mHjGbuJPXarHV6otpZzHXr23gIa");
            user.setPasswordExpiryDate(new java.sql.Timestamp(123456789));
            user.setSessionTimeout(811);
            user.setUserAccessCode(8);
            UserAccessDomain useraccessdomain = new UserAccessDomain();
            useraccessdomain.setDomainDescription("k5t9KOq2N6n91iSrMv9329PLYcIOGqiMgYwnKV4AePwdAWvaBB");
            useraccessdomain.setDomainHelp("TKhhIiyvgQWQi46mWC8vSFnfM4O4H5rj4Lo9NchYivO5zuTyzb");
            useraccessdomain.setDomainIcon("HSBCyAM0k22Pl3UUCpHEhbla1wa09GifQTL6qVv3cgQnTEIedC");
            useraccessdomain.setDomainName("TaDAfB26tPc01b6tjY5eMTPb3GLz1g0JuhRSVuL3vZgP2l2WmZ");
            useraccessdomain.setUserAccessDomain(valueGenerator.getRandomInteger(99999, 0));
            UserAccessDomain UserAccessDomainTest = useraccessdomainRepository.save(useraccessdomain);
            map.put("UserAccessDomainPrimaryKey", useraccessdomain._getPrimarykey());
            UserAccessLevel useraccesslevel = new UserAccessLevel();
            useraccesslevel.setLevelDescription("7bg2nyR75OEumLgpAPrZ8yZ3Dhc25SvW2hc6TpUFAC9xeMgZpR");
            useraccesslevel.setLevelHelp("JqKj7Lwo7VjHDGSZ2zigqGYHE0fepxCyZfjLwedMVMxLIXxXQP");
            useraccesslevel.setLevelIcon("krP82DHfawdKqjlNCbZgERBm0OeNejdcQUbQrBdlNJVVuzG6gP");
            useraccesslevel.setLevelName("ciZLxtIfM9TkVBzTcG67m6T6gTsSrz3CKb6P14Fjz1Iz5XCTm8");
            useraccesslevel.setUserAccessLevel(valueGenerator.getRandomInteger(99999, 0));
            UserAccessLevel UserAccessLevelTest = useraccesslevelRepository.save(useraccesslevel);
            map.put("UserAccessLevelPrimaryKey", useraccesslevel._getPrimarykey());
            user.setAllowMultipleLogin(1);
            user.setChangePasswordNextLogin(0);
            user.setGenTempOneTimePassword(0);
            user.setIsDeleted(0);
            user.setIsLocked(0);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(123456789));
            user.setMultiFactorAuthEnabled(1);
            user.setPasswordAlgo("AKMxiHoAIVs8qce5GTwVP7H2VTMCIthSnFefzK9TIn8T8rmZkp");
            user.setPasswordExpiryDate(new java.sql.Timestamp(123456789));
            user.setSessionTimeout(651);
            user.setUserAccessCode(4);
            user.setUserAccessDomainId((java.lang.String) UserAccessDomainTest._getPrimarykey()); /* ******Adding refrenced table data */
            user.setUserAccessLevelId((java.lang.String) UserAccessLevelTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<PassRecovery> listOfPassRecovery = new java.util.ArrayList<PassRecovery>();
            PassRecovery passrecovery = new PassRecovery();
            passrecovery.setAnswer("Kw4pd9gNYRKeI6ukzn3FKawUAWJcOEnrlCoApUG61IRB29UQH7");
            Question question = new Question();
            question.setLevelid(3);
            question.setQuestion("kAvRpfti5qINWShYRdjwboSQ701cOaqRkKPH3Pp30GdDDB295K");
            question.setQuestionDetails("b");
            question.setQuestionIcon("3PmTV0L2RxP1EeaQeoxGbo6BRzWzvOJ0i4MLKQ4FGlFSuUD2Jf");
            Question QuestionTest = questionRepository.save(question);
            map.put("QuestionPrimaryKey", question._getPrimarykey());
            passrecovery.setAnswer("4FxU4SyRhbr1jdAfeQs85F2FElUQzoY7aUlRfmS9G4QDKppaCP");
            passrecovery.setQuestionId((java.lang.String) QuestionTest._getPrimarykey());
            passrecovery.setUser(user);
            listOfPassRecovery.add(passrecovery);
            user.addAllPassRecovery(listOfPassRecovery);
            UserData userdata = new UserData();
            userdata.setLast5Passwords("N5MrEtfBEmktkBQHJeVsyJZMvyPxw0Au6GwiRMadPYcFqjyEzr");
            userdata.setOneTimePassword("KoMVN8nVT7ntssiflM0CVrjZPhaSDmmJ");
            userdata.setOneTimePasswordExpiry(5);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(123456789));
            userdata.setPassword("bzUYtdAEkJdotWLxPXAI91DVxKiZcwdoUIKWyzk4TLXbsi8I2u");
            userdata.setLast5Passwords("VZKPXPvjNVcvg2dcPZb5ZVGH3orGMCa37jdAU5NO3meUpHYAsl");
            userdata.setOneTimePassword("wCmbm05vLJbrHSrHZATLkKcFbHlFPNdf");
            userdata.setOneTimePasswordExpiry(0);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(123456789));
            userdata.setPassword("H22LBegfHhVppfLsJzl8ia8lOFb3nnj5xEt9PmXIIWgDtu8Zob");
            userdata.setUser(user);
            user.setUserData(userdata);
            Login login = new Login();
            corecontacts.setContactId(null);
            login.setCoreContacts(corecontacts);
            login.setFailedLoginAttempts(10);
            login.setIsAuthenticated(true);
            login.setLoginId("r68gsBnRsVrVmKVuKpxNt7Jdpqk7gHosYxVQRpzb64k9QI7Imw");
            login.setServerAuthImage("m2Fq6eoQhRlJfcw4Qi4r2l9TW2gLISG8");
            login.setServerAuthText("43LWsZfQ7gAUFdyk");
            user.setUserId(null);
            login.setUser(user);
            login.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            login.setEntityValidator(entityValidator);
            login.isValid();
            loginRepository.save(login);
            map.put("LoginPrimaryKey", login._getPrimarykey());
            map.put("CoreContactsPrimaryKey", login.getCoreContacts()._getPrimarykey());
            map.put("UserPrimaryKey", login.getUser()._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Autowired
    private CoreContactsRepository<CoreContacts> corecontactsRepository;

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

    @Autowired
    private UserRepository<User> userRepository;

    @Autowired
    private UserAccessDomainRepository<UserAccessDomain> useraccessdomainRepository;

    @Autowired
    private UserAccessLevelRepository<UserAccessLevel> useraccesslevelRepository;

    @Autowired
    private QuestionRepository<Question> questionRepository;

    @Test
    public void test2Update() {
        try {
            org.junit.Assert.assertNotNull(map.get("LoginPrimaryKey"));
            Login login = loginRepository.findById((java.lang.String) map.get("LoginPrimaryKey"));
            login.setFailedLoginAttempts(0);
            login.setLoginId("vuW8nApo79sPsepVNlfQK4RYHuI0LkjeEvsN9XTcbvzc5KoDtL");
            login.setServerAuthImage("7vokDPLqczghpXqUl3znyjGi6DX64FTv");
            login.setServerAuthText("NSfDHtGxEw8tvM9M");
            login.setVersionId(1);
            login.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            loginRepository.update(login);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("LoginPrimaryKey"));
            loginRepository.findById((java.lang.String) map.get("LoginPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testNQFindUnMappedUser() {
        try {
            loginRepository.FindUnMappedUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNQFindMappedUser() {
        try {
            loginRepository.FindMappedUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4Delete() {
        try {
            org.junit.Assert.assertNotNull(map.get("LoginPrimaryKey"));
            loginRepository.delete((java.lang.String) map.get("LoginPrimaryKey")); /* Deleting refrenced data */
            questionRepository.delete((java.lang.String) map.get("QuestionPrimaryKey")); /* Deleting refrenced data */
            useraccesslevelRepository.delete((java.lang.String) map.get("UserAccessLevelPrimaryKey")); /* Deleting refrenced data */
            useraccessdomainRepository.delete((java.lang.String) map.get("UserAccessDomainPrimaryKey")); /* Deleting refrenced data */
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
