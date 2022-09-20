package SocketProgramming.TCP;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Test1 {
    Client client;
    @Before
    public void setup() throws IOException {
        client = new Client();
        client.startConnection("127.0.0.1", 4444);
    }
    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect() throws IOException {

        String resp1 = client.sendMessage("hello");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");

        assertEquals("hello", resp1);
        assertEquals("world", resp2);
        assertEquals("!", resp3);
        assertEquals("good bye", resp4);
    }

    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }
    @After
    public void tearDown() throws IOException {
        client.stopConnection();
    }
}
