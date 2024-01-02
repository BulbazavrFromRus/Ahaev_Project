package org.example;


import org.example.database.DataBase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ServerTest {
    private Server server;
    private DataBase dataBase;


    @Before
    public void setUp() {
        dataBase = new DataBase();
        server = new Server(dataBase);
        server.init();
    }
    
    @Test
    public void addStudent() {
        String str = server.accept("{\"name\":\"Danila\"," +
                        "\"lastName\":\"Bulbakov\"," +
                        "\"middleName\":\"Andreevich\"," +
                        "\"groupId\":\"1\"," +
                        "\"status\":\"ACTIVE\"},",
                "addStudent");

        String expectedStr = "{\"httpStatus\":201,\"data\":{\"success\":true,\"data\":{\"id\":1},\"codeError\":null,\"errorMessage\":null,\"errosList\":null}}";

        assertEquals(expectedStr, str);

    }
}
