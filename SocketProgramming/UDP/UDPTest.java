package SocketProgramming.UDP;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class UDPTest {
    Client client;

    @Before
    public void setup() throws SocketException, UnknownHostException {
        new Server().start();
        client = new Client();
    }

    @Test
    public void whenCanSendAndReceivePacket_thenCorrect() throws IOException {
        String echo = client.sendEcho("hello server");
        assertEquals("hello server", echo);
        echo = client.sendEcho("server is working");
        assertFalse(echo.equals("hello server"));
    }

    @After
    public void tearDown() throws IOException {
        client.sendEcho("end");
        client.close();
    }
}