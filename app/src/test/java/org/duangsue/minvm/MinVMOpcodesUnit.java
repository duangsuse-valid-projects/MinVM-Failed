package org.duangsue.minvm;

import org.junit.Assert;
import org.junit.Test;

import minvm.OpCodes;

/**
 * Created by dse on 17-11-26.
 * Unit tests for OpCodes Class
 */

public class MinVMOpcodesUnit {
    public MinVMOpcodesUnit() {}
    @Test
    public void it_works() {
        Assert.assertEquals(OpCodes.NEW_BYTE.toString(), "new-byte");
        Assert.assertEquals(OpCodes.NEW_BOOL_TRUE.toString(), "new-true");
        Assert.assertEquals(OpCodes.NEW_ARRAY_RANGE.toString(), "new-array-range");
        Assert.assertEquals(OpCodes.CALL_AX.toString(), "call-Ax");
        Assert.assertEquals(OpCodes.CALL_ARESULT.toString(), "call-Aresult");
        Assert.assertEquals(OpCodes.GET.toString(), "get");
        Assert.assertEquals(OpCodes.RAISEIF.toString(), "raiseif");
        Assert.assertEquals(OpCodes.TAG.toString(), ":tag");
        Assert.assertEquals(OpCodes.GOTOIFERR.toString(), "gotoiferr");
        Assert.assertEquals(OpCodes.IMPLEVAL.toString(), "impl:");
        Assert.assertEquals(OpCodes.CALC_ADD.toString(), "calc-add");
        Assert.assertEquals(OpCodes.OP_IS_A.toString(), "op-is_a?");
        Assert.assertEquals(OpCodes.MAP_HAS_KEY.toString(), "map-has_key?");
        Assert.assertEquals(OpCodes.STR_LEN.toString(), "str-len");
        Assert.assertEquals(OpCodes.BEGIN.toString(), "begin");
        Assert.assertEquals(OpCodes.SCOPE_END.toString(), ":scope_end");
        Assert.assertEquals(OpCodes.LINE.toString(), ":line");
        Assert.assertEquals(OpCodes.OP_LT.toString(), "op-lt?");
        Assert.assertEquals(OpCodes.OP_NE.toString(), "op-ne?");
        Assert.assertEquals(OpCodes.NEW_OBJECT.toString(), "new");
        Assert.assertEquals(OpCodes.LAMBDAEVAL.toString(), "lambda:");
    }
    @Test
    public void assertSpecialNull() throws Exception {
        java.lang.reflect.Field special = null;
        special = OpCodes.class.getDeclaredField("special");
        special.setAccessible(true);
        assert special.get(OpCodes.SLEEP) == null;
    }
}
