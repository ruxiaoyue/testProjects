package com.senthink.test.designParttern.reactor;

import java.io.IOException;
import java.nio.channels.SocketChannel;

/**
 * Created by lenovo on 2018/3/19.
 */
public class Acceptor implements Runnable{

    private ReactorExample reactorExample;

    public Acceptor(ReactorExample reactorExample) {
        this.reactorExample = reactorExample;
    }
    @Override
    public void run() {
        try{
            SocketChannel socketChannel = reactorExample.serverSocketChannel.accept();
            if (socketChannel!=null) {
                new SocketReaderHander(reactorExample.selector,socketChannel);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
