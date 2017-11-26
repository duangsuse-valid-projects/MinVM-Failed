package org.duangsue.minvm;

import org.junit.Test;

import java.util.Objects;

import minvm.OpCodes;

/**
 * Created by dse on 17-11-26.
 * Unit tests for OpCodes Class
 */

public class MinVMOpcodesUnit {
    @Test
    void it_works() {
        assert Objects.equals(OpCodes.VEC_INCLUDE.toString(), "vec-include?");
    }
}
