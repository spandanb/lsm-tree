package lsm.tree;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is the interface for the persistent  key-value store.
 * This implements the LSM tree
 * */
public class Connection {

    private StoreConfig config;
    // in memory structure holding key value pairs
    private MemTable memTable;
    public Connection(StoreConfig config) {
        this.config = config;

    }

    public KeyAddStatus add(byte[] key, byte[]value) {
        return KeyAddStatus.Success;
    }

    public  KeyDelStatus del(byte[]key) {
        return KeyDelStatus.Success;

    }
    public Optional<byte[]> get(byte[]key) {
        return Optional.empty();
    }

    // todo: this should be implemented via a cursor
    public List<byte[]> listKeys() {
        List<byte[]> keys = new ArrayList<>();
        return keys;
    }



}
