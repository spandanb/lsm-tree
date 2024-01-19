package lsm.tree;

/**
 * This should implement various operations on the connection object.
 * TODO: this should be an interface with a single method: doWork
 * */
public class StoreWorker {
    private Connection conn;

    public StoreWorker(Connection conn) {
        this.conn = conn;
    }

    public void doWork() {

    }
}
