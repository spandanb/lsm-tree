package lsm.tree;

import java.util.Optional;

/**
 * This should implement various operations on the connection object.
 * TODO: this should be an interface with a single method: doWork.
 * This way we can implement many different workloads
 * */
public class StoreWorker {
    private Connection conn;

    public StoreWorker(Connection conn) {
        this.conn = conn;
    }

    public void doWork() {
        // this should do work
        // and verify results
        // e.g.
        conn.put(Utils.intToBytes(1), Utils.intToBytes(1));
        System.out.println(String.format("Put: key: 1, value: 1"));
        byte[] valueBytes = conn.get(Utils.intToBytes(1)).get();
        int value = Utils.bytesToInt(valueBytes);
        System.out.println(String.format("Get: key: 1, value: %d", value));




    }
}
