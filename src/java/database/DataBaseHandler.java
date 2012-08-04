package database;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import human.Manager;
import human.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import location.*;
import request.AgricultureRequest;
import request.Decision;
import request.DomesticRequest;
import request.FactoryRequest;

/**
 *
 * @author Dell
 */
public class DataBaseHandler {

    private Statement statement;
    private Connection con;

    /**
     *
     */
    public DataBaseHandler() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MinistryDataBase", "root", "");
            statement = con.createStatement();
        } catch (Exception e) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     *
     * @param userID
     * @param locationID
     * @param waterType
     * @param percentage
     * @param waterQuality
     * @return
     */
    public boolean insertWater(int userID, int locationID, String waterType, float percentage, float waterQuality) {
        try {
            statement.execute("INSERT INTO `water`(`locationID`, `date`, `dataEnteredBy`, `waterType`, `percentage`, `waterQualityIndex`) "
                    + "VALUES (" + locationID + ",CURDATE()," + userID + "," + "'" + waterType + "'" + "," + percentage + "," + waterQuality + ")");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param userID
     * @param locationID
     * @param waterType
     * @param percentage
     * @param waterQuality
     * @param date
     * @return
     */
    public boolean updateWater(int userID, int locationID, String waterType, String percentage, String waterQuality, String date) {
        String sql = "UPDATE `water` SET `updateTime`=DEFAULT, `locationID`=" + locationID + ",`dataEnteredBy`=" + userID;
        if (waterType != null) {
            sql = sql + ",`waterType`= '" + waterType + "'";
        }
        if (percentage != null) {
            sql = sql + ",`percentage`= " + Float.parseFloat(percentage);
        }
        if (waterQuality != null) {
            sql = sql + ",`waterQualityIndex`= " + Float.parseFloat(waterQuality);
        }
        sql = sql + " WHERE `locationID` = " + locationID + " AND `date` = '" + date + "' ORDER BY updateTime DESC LIMIT 1";
        try {
            statement.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param userID
     * @param locationID
     * @param populationDensity
     * @param greenPercentage
     * @param building
     * @return
     */
    public boolean insertLand(int userID, int locationID, float populationDensity, float greenPercentage, float building) {
        try {
            statement.execute("INSERT INTO `land`(`locationID`, `date`, `dataEnteredBy`, `populationDensity`, `greenPercentage`, `building`) "
                    + "VALUES (" + locationID + ",CURDATE()," + userID + "," + populationDensity + "," + greenPercentage + "," + building + ")");

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param userID
     * @param locationID
     * @param populationDensity
     * @param greenPercentage
     * @param building
     * @param date
     * @return
     */
    public boolean updateLand(int userID, int locationID, String populationDensity, String greenPercentage, String building, String date) {
        String sql = "UPDATE `land` SET `updateTime`=DEFAULT, `locationID`=" + locationID + ",`dataEnteredBy`=" + userID;
        if (populationDensity != null) {
            sql = sql + ",`populationDensity`= " + Float.parseFloat(populationDensity);
        }
        if (greenPercentage != null) {
            sql = sql + ",`percentage`= " + Float.parseFloat(greenPercentage);
        }
        if (building != null) {
            sql = sql + ",`waterQualityIndex`= " + Float.parseFloat(building);
        }
        sql = sql + " WHERE `locationID` = " + locationID + " AND `date` = '" + date + "' ORDER BY updateTime DESC LIMIT 1";
        try {
            statement.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param userID
     * @param locationID
     * @param CO2_concentration
     * @param O2_concentration
     * @param dustLevel
     * @param airQualityLevel
     * @return
     */
    public boolean insertAir(int userID, int locationID, float CO2_concentration, float O2_concentration, float dustLevel, float airQualityLevel) {
        try {
            statement.execute("INSERT INTO `air`(`locationID`, `date`, `dataEnteredBy`, `CO2_concentration`, `O2_concentration`, `dustLevel`, `airQualityLevel`) "
                    + "VALUES (" + locationID + ",CURDATE()," + userID + "," + CO2_concentration + "," + O2_concentration + "," + dustLevel + "," + airQualityLevel + ")");

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param userID
     * @param locationID
     * @param CO2_concentration
     * @param O2_concentration
     * @param dustLevel
     * @param airQualityLevel
     * @param date
     * @return
     */
    public boolean updateAir(int userID, int locationID, String CO2_concentration, String O2_concentration, String dustLevel, String airQualityLevel, String date) {
        String sql = "UPDATE `air` SET `updateTime`=DEFAULT, `locationID`=" + locationID + ",`dataEnteredBy`=" + userID;
        if (CO2_concentration != null) {
            sql = sql + ",`CO2_concentration`= " + Float.parseFloat(CO2_concentration);
        }
        if (O2_concentration != null) {
            sql = sql + ",`O2_concentration`= " + Float.parseFloat(O2_concentration);
        }
        if (dustLevel != null) {
            sql = sql + ",`dustLevel`= " + Float.parseFloat(dustLevel);
        }
        if (airQualityLevel != null) {
            sql = sql + ",`airQualityLevel`= " + Float.parseFloat(airQualityLevel);
        }
        sql = sql + " WHERE `locationID` = " + locationID + " AND `date` = '" + date + "' ORDER BY updateTime DESC LIMIT 1";
        try {
            statement.execute(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param locationID
     * @param locname
     * @param x
     * @param y
     * @return
     */
    public boolean insertLocation(int locationID, String locname, float x, float y) {
        try {
            statement.execute("INSERT INTO `location`(`LocationID`,`name`,`x`,`y`) "
                    + "VALUES (" + locationID + "," + "'" + locname + "'" + "," + x + "," + y + ")");

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param locationID
     * @param x
     * @param y
     * @return
     */
    public boolean insertLocation(int locationID, float x, float y) {
        try {
            statement.execute("INSERT INTO `location`(`LocationID`, `x`, `y`) "
                    + "VALUES (" + locationID + "," + x + "," + y + ")");

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param locationID
     * @return
     */
    public Land getLand(int locationID) {
        try {
            ResultSet rs = statement.executeQuery("select * from land where LocationID = " + locationID);
            rs.last();
            return new Land(rs.getFloat("populationDensity"), rs.getFloat("greenPercentage"), rs.getFloat("building"));
        } catch (SQLException ex) {
            return null;
            //Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param locationID
     * @return
     */
    public ArrayList<Land> getAllLand(int locationID) {
        try {
            ResultSet rs = statement.executeQuery("select * from land where LocationID = " + locationID);
            ArrayList<Land> records = new ArrayList<Land>();
            while (rs.next()) {
                records.add(new Land(rs.getFloat("populationDensity"), rs.getFloat("greenPercentage"), rs.getFloat("building")));
            }
            return records;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param locationID
     * @return
     */
    public Air getAir(int locationID) {
        try {
            ResultSet rs = statement.executeQuery("select * from air where LocationID = " + locationID);
            rs.last();
            return new Air(rs.getFloat("CO2_concentration"), rs.getFloat("O2_concentration"), rs.getFloat("dustLevel"), rs.getFloat("airQualityLevel"));
        } catch (SQLException ex) {
            return null;
            //Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param locationID
     * @return
     */
    public ArrayList<Air> getAllAir(int locationID) {
        try {
            ResultSet rs = statement.executeQuery("select * from air where LocationID = " + locationID);
            ArrayList<Air> records = new ArrayList<Air>();
            while (rs.next()) {
                records.add(new Air(rs.getFloat("CO2_concentration"), rs.getFloat("O2_concentration"), rs.getFloat("dustLevel"), rs.getFloat("airQualityLevel")));
            }
            return records;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param locationID
     * @return
     */
    public Water getWater(int locationID) {
        try {
            ResultSet rs = statement.executeQuery("select * from water where LocationID = " + locationID);
            rs.last();
            return new Water(rs.getString("waterType"), rs.getFloat("percentage"), rs.getFloat("waterQualityIndex"));
        } catch (SQLException ex) {
            return null;
            // Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param locationID
     * @return
     */
    public ArrayList<Water> getAllWater(int locationID) {
        try {
            ArrayList<Water> records = new ArrayList<Water>();
            ResultSet rs = statement.executeQuery("select * from water where LocationID = " + locationID);
            while (rs.next()) {
                records.add(new Water(rs.getString("waterType"), rs.getFloat("percentage"), rs.getFloat("waterQualityIndex")));
            }
            return records;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param locationID
     * @return
     */
    public Location getLocation(int locationID) {
        try {
            ResultSet rs = statement.executeQuery("select * from location where LocationID = " + locationID);
            rs.next();
            float x = rs.getFloat("x");
            float y = rs.getFloat("y");
            return new Location(new Point(x, y), locationID, rs.getString("name"), rs.getString("dataEnteredBy"), rs.getString("date"), getWater(locationID), getAir(locationID), getLand(locationID));
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param locationID
     * @return
     */
    public Point getPosition(int locationID) {
        try {
            ResultSet rs = statement.executeQuery("select * from location where LocationID = " + locationID);
            rs.next();
            float x = rs.getFloat("x");
            float y = rs.getFloat("y");
            return new Point(x, y);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *
     * @param userName
     * @param acsessLevel
     * @param name
     * @param NIC
     * @param mobileNo
     * @param email
     * @param type
     * @return
     */
    public boolean insertManager(String userName, int acsessLevel, String name, String NIC, String mobileNo, String email, String type) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM `logindata` WHERE `username`= '" + userName + "'");
            rs.next();
            statement.execute("INSERT INTO `manager`(`userID`, `userName`, `name`, `NIC`, `mobileNo`, `email`, `acsessLevel`, `type`) "
                    + "VALUES (" + rs.getString("userID") + ",'" + userName + "','" + name + "','" + NIC + "','" + mobileNo + "','" + email + "'," + acsessLevel + ",'" + type + "')");

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param userName
     * @return
     */
    public Manager getManager(String userName) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM `manager` WHERE userName = '" + userName + "'");
            rs.next();
            return new Manager(rs.getString("type"), rs.getString("name"), rs.getString("userName"), rs.getInt("userId"), rs.getString("NIC"), rs.getString("mobileNo"), rs.getString("email"), rs.getInt("acsessLevel"));
        } catch (SQLException ex) {
            return null;
            //Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return null;
    }

    /**
     *
     * @return
     */
    public ArrayList<Manager> getAccepterManagers() {
        try {
            ArrayList<Manager> result = new ArrayList<Manager>();
            ResultSet rs = statement.executeQuery("SELECT * FROM `manager` WHERE type = 'accept'");
            while (rs.next()) {
                result.add(new Manager(rs.getString("type"), rs.getString("name"), rs.getString("userName"), rs.getInt("userId"), rs.getString("NIC"), rs.getString("mobileNo"), rs.getString("email"), rs.getInt("acsessLevel")));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param userName
     * @return
     */
    public ArrayList<Manager> getInspectManagers(String userName) {
        try {
            ArrayList<Manager> result = new ArrayList<Manager>();
            ResultSet rs = statement.executeQuery("SELECT * FROM `manager` WHERE type = 'inspect'");
            while (rs.next()) {
                result.add(new Manager(rs.getString("type"), rs.getString("name"), rs.getString("userName"), rs.getInt("userId"), rs.getString("NIC"), rs.getString("mobileNo"), rs.getString("email"), rs.getInt("acsessLevel")));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param userName
     * @param acsessLevel
     * @param name
     * @param NIC
     * @param mobileNo
     * @param email
     * @return
     */
    public boolean insertUser(String userName, int acsessLevel, String name, String NIC, String mobileNo, String email) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM `logindata` WHERE `username`= '" + userName + "'");
            rs.next();
            //System.out.println("Fassgsgsgsgsgsggsgsgsgsgggsgsgsgsgsgsgsgsgsgsgsgsgsgggsgsgsgsggsgsggsgsgsgsgsg");
            statement.execute("INSERT INTO `user`(`userID`, `userName`, `name`, `NIC`, `mobileNo`, `email`, `acsessLevel`) "
                    + "VALUES (" + rs.getString("userID") + ",'" + userName + "','" + name + "','" + NIC + "','" + mobileNo + "','" + email + "'," + acsessLevel + ")");

            return true;
        } catch (SQLException ex) {

            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    /**
     *
     * @param userName
     * @return
     */
    public User getUser(String userName) {
        //System.out.println("Get User in -----------------------------------------");
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM `user` WHERE userName = '" + userName + "'");
            rs.next();
            return new User(rs.getString("name"), rs.getString("userName"), rs.getInt("userId"), rs.getString("NIC"), rs.getString("mobileNo"), rs.getString("email"), rs.getInt("acsessLevel"));
        } catch (SQLException ex) {
            //System.out.println("Exception -----------------------------------------+++++++++++++++++++");
            return null;
            //Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return null;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     * @param locationID
     * @param requestId
     * @param type
     * @return
     */
    public boolean insertSugestedLocations(int locationID, int requestId, String type) {
        try {
            statement.execute("INSERT INTO `sugestedlocations`(`LocationID`,`requestId`,`type`) "
                    + "VALUES (" + locationID + "," + requestId + ",'" + type + "'" + ")");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param requestId
     * @param type
     * @return
     */
    public ArrayList<Integer> getSugestedLocations(int requestId, String type) {
        try {
            ArrayList<Integer> result = new ArrayList<Integer>();
            ResultSet rs = statement.executeQuery("SELECT * FROM `sugestedlocations` WHERE requestId = " + requestId + " AND type = '" + type + "'");
            while (rs.next()) {
                result.add(rs.getInt("locationId"));
            }
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param request
     * @return
     */
    public boolean InsertfactoryRequest(FactoryRequest request) {
        int userID = request.getuserId();
        String userEmail = request.getUserEmail();
        String discription = request.getDiscription();
        String title = request.getTitle();
        int LocationId = request.getLocationId();
        float emmitedCO2 = request.getEmitedCO();
        float area = request.getArea();
        float emmitedCO = request.getEmitedCO();
        float polutedWater = request.getPolutedWater();
        try {
            statement.execute("INSERT INTO `factoryrequest`(`userID`, `userEmail`, `LocationId`, `emmitedCO2`, `area`, `emmitedCO`, `polutedWater`,`discription`, `title`) "
                    + "VALUES (" + userID + ",'" + userEmail + "'," + LocationId + "," + emmitedCO2 + "," + area + "," + emmitedCO + "," + polutedWater + ",'" + discription + "','" + title + "')");

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param request
     * @return
     */
    public boolean Insertdomesticrequest(DomesticRequest request) {
        int userID = request.getuserId();
        String userEmail = request.getUserEmail();
        String discription = request.getDiscription();
        String title = request.getTitle();
        int LocationId = request.getLocationId();
        int noOfFloors = request.getNoOfFloor();
        float area = request.getArea();
        int noOfOccupants = request.getNoOfOccupans();
        try {
            statement.execute("INSERT INTO `domesticrequest`(`userID`, `userEmail`,`LocationId`, `noOfFloors`, `area`, `noOfOccupants`,`discription`, `title`) "
                    + "VALUES (" + userID + ",'" + userEmail + "'," + "," + LocationId + "," + noOfFloors + "," + area + "," + noOfOccupants + ",'" + discription + "','" + title + "')");

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param request
     * @return
     */
    public int Insertagriculturerequest(AgricultureRequest request) {
        int userID = request.getuserId();
        String userEmail = request.getUserEmail();
        String discription = request.getDiscription();
        String title = request.getTitle();
        int LocationId = request.getLocationId();
        boolean organic = request.isOrganic();
        float area = request.getArea();
        boolean longtime = request.isLongTime();
        try {
            statement.execute("INSERT INTO `agriculturerequest`(`userID`, `userEmail`,`LocationId`, `area`,`organic`, `longtime`,`discription`, `title`) "
                    + "VALUES (" + userID + ",'" + userEmail + "'," + LocationId + "," + area + "," + organic + "," + longtime + ",'" + discription + "','" + title + "')");
            ResultSet rs = statement.executeQuery("SELECT `requestId` FROM `agriculturerequest` WHERE 1 ORDER BY `update` desc limit 1");
            rs.next();
            return rs.getInt("requestId");
        } catch (Exception ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    /**
     *
     * @param requestId
     * @return
     */
    public FactoryRequest getFactoryRequest(int requestId) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM `factoryrequest` WHERE requestId = " + requestId);
            rs.next();
            return new FactoryRequest();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param requestId
     * @return
     */
    public DomesticRequest getdomesticrequest(int requestId) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM `domesticrequest` WHERE requestId = " + requestId);
            rs.next();
            return new DomesticRequest();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param requestId
     * @return
     */
    public AgricultureRequest getAgricultureRequest(int requestId) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM `agriculturerequest` WHERE requestId = " + requestId);
            rs.next();
            return new AgricultureRequest();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public boolean InitUser(String userName, String password) {
        try {
            statement.executeUpdate("INSERT INTO `logindata`(`username`, `password`)"
                    + "VALUES ('" + userName + "','" + password + "')");
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public boolean validateUser(String userName, String password) {
        try {
            ResultSet rs = statement.executeQuery("SELECT `userID`, `username`, `password` FROM `logindata` WHERE userName ='" + userName + "' AND password ='" + password + "'");
            return rs.next();
        } catch (SQLException ex) {
            return false;
        }

    }
//    public boolean isRegionalOfficer(int userId){
//        return true;
//    }
//    public LandRequest getLandRequest(int requestId){
//        try {
//            ResultSet rs = statement.executeQuery("SELECT * FROM `factoryrequest` WHERE requestId = "+requestId);
//            rs.next();
//            return new LandRequest(rs.getFloat("emmitedCO2"), rs.getFloat("area"), rs.getFloat("emmitedO2"), rs.getFloat("polutedWater"), rs.getInt("userID"), rs.getString("userEmail"), rs.getInt("requestId"),new Point(rs.getFloat("x"),rs.getFloat("y")),rs.getInt("locationId"));
//        } catch (SQLException ex) {
//            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;    
//    }
//    

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        DataBaseHandler a = new DataBaseHandler();
        System.out.println(a.Insertagriculturerequest(new AgricultureRequest(true, 12.0F, true, 151, "asas", 5394873, "asas", "asasa")));
        // a.insertComplain("Noise", "Aoi", "asd", 21323.5F, 234324.2F, "sadad");
//        for(int i=0;i<10;i++){
//            System.out.println(system.Security.md5("babaiya"));
//        }
//        
        // a.InitUser("manager0", system.Security.md5("manager0"));
        //System.out.println(a.validateUser("chameera", "babaiya"));
        //System.out.println(system.Security.md5("babaiya"));
        //a.InitUser("amila", system.Security.md5("babaiya"));
        //a.insertUser("amila", 4, "qwe", "qwe", "qwe", "qwe");
        //a.insertLocation(locationID, null, x, y);
    }

    /**
     *
     * @param title
     * @param discription
     * @param userEmail
     * @param x
     * @param y
     * @param state
     * @return
     */
    public boolean insertComplain(String title, String discription, String userEmail, float x, float y, String state) {
        try {
            statement.execute("INSERT INTO `complain`(`title`, `discription`, `userEmail`, `x`, `y`, `state`) "
                    + "VALUES ('" + title + "','" + discription + "','" + userEmail + "'," + x + "," + y + ",'" + state + "')");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     *
     * @param userId
     * @return
     */
    public User getUser(int userId) {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM `user` WHERE userID = '" + userId + "'");
            rs.next();
            return new User(rs.getString("name"), rs.getString("userName"), rs.getInt("userId"), rs.getString("NIC"), rs.getString("mobileNo"), rs.getString("email"), rs.getInt("acsessLevel"));
        } catch (SQLException ex) {
            return null;
            //Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return null;
    }

    /**
     *
     * @param requestId
     * @param decision
     * @param type
     * @return
     */
    public boolean InsertDecision(int requestId, Decision decision, String type) {
        try {
            statement.execute("INSERT INTO `decision`(`requestId`, `approved`, `description`, `requestType`) "
                    + "VALUES (" + requestId + "," + decision.isApproed() + ",'" + decision.getDescription() + "','" + type + "')");
            if (decision.isApproed()) {
                if (type.equals("agri")) {
                    statement.executeUpdate("UPDATE `agriculturerequest` SET `state`=" + 1 + " WHERE requestId = " + requestId);
                } else if (type.equals("home")) {
                    statement.executeUpdate("UPDATE `domesticrequest` SET `state`=" + 1 + " WHERE requestId = " + requestId);
                } else {
                    statement.executeUpdate("UPDATE `factoryrequest` SET `state`=" + 1 + " WHERE requestId = " + requestId);
                }
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void changeUserPassword(String username,String pwNew1){
        String sql = "UPDATE `logindata` SET `password` = "+system.Security.md5(pwNew1)+" where `username` = "+username+";";
        try {
            statement.execute(sql);
            } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
