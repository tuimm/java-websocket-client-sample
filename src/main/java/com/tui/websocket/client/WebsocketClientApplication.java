package com.tui.websocket.client;

import com.tui.websocket.client.sample.MySampleClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class WebsocketClientApplication {

  public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
    SpringApplication.run(WebsocketClientApplication.class, args);
    var sampleClient = new MySampleClient();
    if (sampleClient.getClientSession().isOpen()) {
    //Thread.sleep(100000);
    //sampleClient.getClientSession().close();
    }

  }

}
