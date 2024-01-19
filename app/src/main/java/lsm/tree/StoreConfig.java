package lsm.tree;

public class StoreConfig {
    // local directory where data is stored
    private String dataDir;

    public StoreConfig(String dataDir) {
        this.dataDir = dataDir;
    }

    @Override
    public String toString() {
        return "StoreConfig{" +
                "dataDir='" + dataDir + '\'' +
                '}';
    }
}
