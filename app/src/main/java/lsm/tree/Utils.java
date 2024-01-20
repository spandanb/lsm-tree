package lsm.tree;

import java.nio.ByteBuffer;

public class Utils {
    public static byte[] intToBytes(int value) {
        byte[] bytes = ByteBuffer.allocate(Integer.BYTES).putInt(value).array();
        return bytes;
    }

    public static int bytesToInt(byte[] byteArray) {
        ByteBuffer buffer = ByteBuffer.wrap(byteArray);
        return buffer.getInt();
    }
}
