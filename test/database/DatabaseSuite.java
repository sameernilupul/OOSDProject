/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author sameernilupul
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({database.DataBaseHandlerTest.class})
public class DatabaseSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
