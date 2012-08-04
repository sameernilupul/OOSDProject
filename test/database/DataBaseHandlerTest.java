/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import human.Manager;
import human.User;
import java.util.ArrayList;
import location.*;
import org.junit.*;
import static org.junit.Assert.*;
import request.AgricultureRequest;
import request.Decision;
import request.DomesticRequest;
import request.FactoryRequest;

/**
 *
 * @author sameernilupul
 */
public class DataBaseHandlerTest {
    
    public DataBaseHandlerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertWater method, of class DataBaseHandler.
     */
    @Test
    public void testInsertWater() {
        System.out.println("insertWater");
        int userID = 0;
        int locationID = 0;
        String waterType = "";
        float percentage = 0.0F;
        float waterQuality = 0.0F;
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.insertWater(userID, locationID, waterType, percentage, waterQuality);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWater method, of class DataBaseHandler.
     */
    @Test
    public void testUpdateWater() {
        System.out.println("updateWater");
        int userID = 0;
        int locationID = 0;
        String waterType = "";
        String percentage = "";
        String waterQuality = "";
        String date = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.updateWater(userID, locationID, waterType, percentage, waterQuality, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertLand method, of class DataBaseHandler.
     */
    @Test
    public void testInsertLand() {
        System.out.println("insertLand");
        int userID = 0;
        int locationID = 0;
        float populationDensity = 0.0F;
        float greenPercentage = 0.0F;
        float building = 0.0F;
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.insertLand(userID, locationID, populationDensity, greenPercentage, building);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLand method, of class DataBaseHandler.
     */
    @Test
    public void testUpdateLand() {
        System.out.println("updateLand");
        int userID = 0;
        int locationID = 0;
        String populationDensity = "";
        String greenPercentage = "";
        String building = "";
        String date = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.updateLand(userID, locationID, populationDensity, greenPercentage, building, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAir method, of class DataBaseHandler.
     */
    @Test
    public void testInsertAir() {
        System.out.println("insertAir");
        int userID = 0;
        int locationID = 0;
        float CO2_concentration = 0.0F;
        float O2_concentration = 0.0F;
        float dustLevel = 0.0F;
        float airQualityLevel = 0.0F;
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.insertAir(userID, locationID, CO2_concentration, O2_concentration, dustLevel, airQualityLevel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAir method, of class DataBaseHandler.
     */
    @Test
    public void testUpdateAir() {
        System.out.println("updateAir");
        int userID = 0;
        int locationID = 0;
        String CO2_concentration = "";
        String O2_concentration = "";
        String dustLevel = "";
        String airQualityLevel = "";
        String date = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.updateAir(userID, locationID, CO2_concentration, O2_concentration, dustLevel, airQualityLevel, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertLocation method, of class DataBaseHandler.
     */
    @Test
    public void testInsertLocation_4args() {
        System.out.println("insertLocation");
        int locationID = 0;
        String locname = "";
        float x = 0.0F;
        float y = 0.0F;
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.insertLocation(locationID, locname, x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertLocation method, of class DataBaseHandler.
     */
    @Test
    public void testInsertLocation_3args() {
        System.out.println("insertLocation");
        int locationID = 0;
        float x = 0.0F;
        float y = 0.0F;
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.insertLocation(locationID, x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLand method, of class DataBaseHandler.
     */
    @Test
    public void testGetLand() {
        System.out.println("getLand");
        int locationID = 0;
        DataBaseHandler instance = new DataBaseHandler();
        Land expResult = null;
        Land result = instance.getLand(locationID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllLand method, of class DataBaseHandler.
     */
    @Test
    public void testGetAllLand() {
        System.out.println("getAllLand");
        int locationID = 0;
        DataBaseHandler instance = new DataBaseHandler();
        ArrayList expResult = null;
        ArrayList result = instance.getAllLand(locationID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAir method, of class DataBaseHandler.
     */
    @Test
    public void testGetAir() {
        System.out.println("getAir");
        int locationID = 0;
        DataBaseHandler instance = new DataBaseHandler();
        Air expResult = null;
        Air result = instance.getAir(locationID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAir method, of class DataBaseHandler.
     */
    @Test
    public void testGetAllAir() {
        System.out.println("getAllAir");
        int locationID = 0;
        DataBaseHandler instance = new DataBaseHandler();
        ArrayList expResult = null;
        ArrayList result = instance.getAllAir(locationID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWater method, of class DataBaseHandler.
     */
    @Test
    public void testGetWater() {
        System.out.println("getWater");
        int locationID = 0;
        DataBaseHandler instance = new DataBaseHandler();
        Water expResult = null;
        Water result = instance.getWater(locationID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllWater method, of class DataBaseHandler.
     */
    @Test
    public void testGetAllWater() {
        System.out.println("getAllWater");
        int locationID = 0;
        DataBaseHandler instance = new DataBaseHandler();
        ArrayList expResult = null;
        ArrayList result = instance.getAllWater(locationID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class DataBaseHandler.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        int locationID = 0;
        DataBaseHandler instance = new DataBaseHandler();
        Location expResult = null;
        Location result = instance.getLocation(locationID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class DataBaseHandler.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        int locationID = 0;
        DataBaseHandler instance = new DataBaseHandler();
        Point expResult = null;
        Point result = instance.getPosition(locationID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertManager method, of class DataBaseHandler.
     */
    @Test
    public void testInsertManager() {
        System.out.println("insertManager");
        String userName = "";
        int acsessLevel = 0;
        String name = "";
        String NIC = "";
        String mobileNo = "";
        String email = "";
        String type = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.insertManager(userName, acsessLevel, name, NIC, mobileNo, email, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManager method, of class DataBaseHandler.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        String userName = "";
        DataBaseHandler instance = new DataBaseHandler();
        Manager expResult = null;
        Manager result = instance.getManager(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccepterManagers method, of class DataBaseHandler.
     */
    @Test
    public void testGetAccepterManagers() {
        System.out.println("getAccepterManagers");
        DataBaseHandler instance = new DataBaseHandler();
        ArrayList expResult = null;
        ArrayList result = instance.getAccepterManagers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInspectManagers method, of class DataBaseHandler.
     */
    @Test
    public void testGetInspectManagers() {
        System.out.println("getInspectManagers");
        String userName = "";
        DataBaseHandler instance = new DataBaseHandler();
        ArrayList expResult = null;
        ArrayList result = instance.getInspectManagers(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUser method, of class DataBaseHandler.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        String userName = "";
        int acsessLevel = 0;
        String name = "";
        String NIC = "";
        String mobileNo = "";
        String email = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.insertUser(userName, acsessLevel, name, NIC, mobileNo, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class DataBaseHandler.
     */
    @Test
    public void testGetUser_String() {
        System.out.println("getUser");
        String userName = "";
        DataBaseHandler instance = new DataBaseHandler();
        User expResult = null;
        User result = instance.getUser(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertSugestedLocations method, of class DataBaseHandler.
     */
    @Test
    public void testInsertSugestedLocations() {
        System.out.println("insertSugestedLocations");
        int locationID = 0;
        int requestId = 0;
        String type = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.insertSugestedLocations(locationID, requestId, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugestedLocations method, of class DataBaseHandler.
     */
    @Test
    public void testGetSugestedLocations() {
        System.out.println("getSugestedLocations");
        int requestId = 0;
        String type = "";
        DataBaseHandler instance = new DataBaseHandler();
        ArrayList expResult = null;
        ArrayList result = instance.getSugestedLocations(requestId, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertfactoryRequest method, of class DataBaseHandler.
     */
    @Test
    public void testInsertfactoryRequest() {
        System.out.println("InsertfactoryRequest");
        FactoryRequest request = null;
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.InsertfactoryRequest(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertdomesticrequest method, of class DataBaseHandler.
     */
    @Test
    public void testInsertdomesticrequest() {
        System.out.println("Insertdomesticrequest");
        DomesticRequest request = null;
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.Insertdomesticrequest(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertagriculturerequest method, of class DataBaseHandler.
     */
    @Test
    public void testInsertagriculturerequest() {
        System.out.println("Insertagriculturerequest");
        AgricultureRequest request = new AgricultureRequest(true ,345.0f ,false ,151, "asdf", 5391889," dsf ","sdf");
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = true;
        int result = instance.Insertagriculturerequest(request);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println(result);
    }

    /**
     * Test of getFactoryRequest method, of class DataBaseHandler.
     */
    @Test
    public void testGetFactoryRequest() {
        System.out.println("getFactoryRequest");
        int requestId = 0;
        DataBaseHandler instance = new DataBaseHandler();
        FactoryRequest expResult = null;
        FactoryRequest result = instance.getFactoryRequest(requestId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdomesticrequest method, of class DataBaseHandler.
     */
    @Test
    public void testGetdomesticrequest() {
        System.out.println("getdomesticrequest");
        int requestId = 0;
        DataBaseHandler instance = new DataBaseHandler();
        DomesticRequest expResult = null;
        DomesticRequest result = instance.getdomesticrequest(requestId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgricultureRequest method, of class DataBaseHandler.
     */
    @Test
    public void testGetAgricultureRequest() {
        System.out.println("getAgricultureRequest");
        int requestId = 0;
        DataBaseHandler instance = new DataBaseHandler();
        AgricultureRequest expResult = null;
        AgricultureRequest result = instance.getAgricultureRequest(requestId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InitUser method, of class DataBaseHandler.
     */
    @Test
    public void testInitUser() {
        System.out.println("InitUser");
        String userName = "";
        String password = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.InitUser(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateUser method, of class DataBaseHandler.
     */
    @Test
    public void testValidateUser() {
        System.out.println("validateUser");
        String userName = "";
        String password = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.validateUser(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DataBaseHandler.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DataBaseHandler.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertComplain method, of class DataBaseHandler.
     */
    @Test
    public void testInsertComplain() {
        System.out.println("insertComplain");
        String title = "";
        String discription = "";
        String userEmail = "";
        float x = 0.0F;
        float y = 0.0F;
        String state = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.insertComplain(title, discription, userEmail, x, y, state);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class DataBaseHandler.
     */
    @Test
    public void testGetUser_int() {
        System.out.println("getUser");
        int userId = 0;
        DataBaseHandler instance = new DataBaseHandler();
        User expResult = null;
        User result = instance.getUser(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertDecision method, of class DataBaseHandler.
     */
    @Test
    public void testInsertDecision() {
        System.out.println("InsertDecision");
        int requestId = 0;
        Decision decision = null;
        String type = "";
        DataBaseHandler instance = new DataBaseHandler();
        boolean expResult = false;
        boolean result = instance.InsertDecision(requestId, decision, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
