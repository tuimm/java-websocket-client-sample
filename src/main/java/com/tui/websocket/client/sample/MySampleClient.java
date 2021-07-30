package com.tui.websocket.client.sample;

import lombok.Getter;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.net.URI;
import java.util.concurrent.ExecutionException;

public class MySampleClient extends TextWebSocketHandler {
  @Getter
  private WebSocketSession clientSession;

  public MySampleClient() throws ExecutionException, InterruptedException {
    var webSocketClient = new StandardWebSocketClient();
    var webSocketHeader = new WebSocketHttpHeaders();
    webSocketHeader.add("HeaderAuth1", "headerValue1");
    this.clientSession = webSocketClient.doHandshake(this, webSocketHeader, URI.create("wss://gxqh6obc4a.execute-api.eu-central-1.amazonaws.com/test?bookingId=0000")).get();
  }

  @Override
  protected void handleTextMessage(WebSocketSession session, TextMessage message) {
    System.out.println(message.getPayload());
  }

}
