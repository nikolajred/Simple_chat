package com.nikolaj.chat.network;

public interface TCPCOnnectionListener {
    void onConnectionReady(TCPConnection tcpConnection);
    void onReceiveString(TCPConnection tcpConnection, String value);
    void disConnect(TCPConnection tcpConnection);
    void onException(TCPConnection tcpConnection, Exception e);
}
