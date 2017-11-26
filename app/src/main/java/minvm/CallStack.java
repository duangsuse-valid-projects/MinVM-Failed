package minvm;

import java.util.Vector;

/**
 * Created by dse on 17-11-26.
 * CallStack implementation for MinVM
 */

public class CallStack {
    public static Class stack_type = long.class;

    Vector<Long> stack;

    CallStack() {
        stack = new Vector<Long>(VMemory.init_cap);
    }
}
