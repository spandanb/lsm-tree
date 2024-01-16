package lsm.tree;

import java.nio.ByteBuffer;

public class MemTable implements MemTableIface {


    public MemTableAddStatus add(byte[] key, byte[] value) {
        // store results
        return MemTableAddStatus.Success;
    }
    public <K> MemTableDeleteStatus  delete(byte[] key) {
        return MemTableDeleteStatus.Success;
    }

    public <K> MemTableFindStatus  find(byte[] key) {
        return MemTableFindStatus.Success;
    }

}
