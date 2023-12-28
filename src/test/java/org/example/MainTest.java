package org.example;

import com.fasterxml.jackson.core.JsonParseException;
import com.sun.security.ntlm.Server;
import modele.Status;

public class MainTest {
    protected static Server server;

    @BeforeAll
    public static void setup() throws JsonParseException {
        server = new Server();
        try {
            server.accept(new JSONObject().put("name", "student0_0").put("idGroup", 0L)
                    .put("status", Status.ACTIVE).toString(), "add student");
            server.executeRequest(new JSONObject().put("name", "student1_0").put("idGroup", 0L)
                    .put("status", StudentStatus.ACTIVE).toString(), "add student");
            server.executeRequest(new JSONObject().put("name", "student2_1").put("idGroup", 1L)
                    .put("status", StudentStatus.ACTIVE).toString(), "add student");

            server.executeRequest(new JSONObject().put("name", "group0").toString(), "add group");
            server.executeRequest(new JSONObject().put("name", "group1").toString(), "add group");
        } catch (Exception e) {
            throw new JsonParseException(e.getMessage());
        }
}
