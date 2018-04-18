package com.senthink.test;

/**
 * Created by lenovo on 2017/12/6.
 */
public class RandAccured {

    private final static int BLOCK_SIZE = 16;

    private final static int BEACON_TIME_SIZE = 4;

    public byte[] getRand() {
        byte[] key = new byte[BLOCK_SIZE];
        for (int i = 0; i < key.length - 1; i++) {
            key[i] = (byte) 0x00;
        }
        return null;
    }

    private byte[] marshal(long beaconTime) {
        byte[] bTBytes = new byte[BEACON_TIME_SIZE];
        bTBytes[0] = (byte) (beaconTime & 0x00FF);
        bTBytes[1] = (byte) ((beaconTime >> 8) & 0x00FF);
        bTBytes[2] = (byte) ((beaconTime >> 16) & 0x00FF);
        bTBytes[3] = (byte) ((beaconTime >> 24) & 0x00FF);
        return bTBytes;
    }
}
