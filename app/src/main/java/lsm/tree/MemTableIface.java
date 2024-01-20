package lsm.tree;

interface MemTableIface {
    public <K, V> MemTableAddStatus add(byte[] key, byte[] value);

    public <K> MemTableDeleteStatus delete(byte[] key);

    public <K> MemTableFindStatus find(byte[] key);

}
