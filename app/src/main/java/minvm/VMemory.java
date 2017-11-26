package minvm;

import java.util.Hashtable;

/**
 * Created by dse on 17-11-26.
 * Memory HashTable(String, Object) for MinVM
 */

public class VMemory {
    public static int init_cap = 10;
    public static Class memory_key = String.class;
    public static Class memory_val = Object.class;

    Hashtable<String, Object> memory;

    VMemory() {
        memory = new Hashtable<>(init_cap);
    }
}
