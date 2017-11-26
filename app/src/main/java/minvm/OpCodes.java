package minvm;

/**
 * Created by dse on 17-11-26.
 * MinVM OpCodes
 * OpCode is command used by MinVM to tell the VM what to do
 * OpCode Categories:
 * New, Call, Get, Move, Delete, Flow, Calc, Op, Extra
 */

//TODO add unit tests
public enum OpCodes {
    //New
    //Java Primitives
    NEW_BYTE,
    NEW_CHAR,
    NEW_LONG,
    NEW_INT,
    NEW_SHORT,
    NEW_DOUBLE,
    NEW_FLOAT,
    NEW_BOOL_TRUE,
    NEW_BOOL_FALSE,

    //Array
    NEW_ARRAY,
    NEW_ARRAY_RANGE,

    //Objects
    NEW_OBJECT,

    //Call
    CALL,
    CALL_X,
    CALL_ERROR,
    CALL_AX,
    CALL_ARESULT,
    CALL_AERROR,

    //Get
    GET,
    GET_STACK,
    GET_VARS,
    GET_CLASS,
    GET_METHOD,
    GET_FIELD,
    GET_ACCESSIBLE,

    GET_RESULT,
    GET_ERROR,

    GET_INDEX,

    //Move
    MOVE,
    MOVE_ERROR,
    MOVE_RESULT,
    MOVE_FIELD,
    MOVE_INDEX,
    MOVE_ACCESSIBLE,

    //Delete
    DELETE,
    DELETE_ERROR,
    DELETE_RESULT,
    DELETE_INDEX,
    DELETE_ENV,

    //Flow Control
    RAISE,
    RAISEIF,

    LEAVE,
    LEAVEIF,

    TAG,

    GOTO,
    GOTOIF,
    GOTOIFNOT,
    GOTOIFERR,

    JUMP,
    JUMPIF,
    JUMPIFNOT,
    JUMPIFERR,

    RETURN,
    RETURNIF,
    RETURN_VOID,
    RETURN_VOIDIF,

    SLEEP,

    IFEVAL,
    IFNOTEVAL,
    IFERROREVAL,

    IMPLEVAL,
    LAMBDAEVAL,

    GO,
    BEGIN,

    //Calc
    //Math
    CALC_ADD,
    CALC_SUB,
    CALC_MUL,
    CALC_DIV,

    CALC_PWR,
    CALC_REM,
    CALC_NEG,

    //Logical
    CALC_AND,
    CALC_OR,
    CALC_NOT,
    CALC_XOR,
    //Binary
    CALC_BAND,
    CALC_BOR,
    CALC_BNOT,
    CALC_BXOR,

    //Other Operations
    OP_CONVERT,
    OP_LEN,
    OP_NULL,
    OP_IS_A,

    OP_EQ,
    OP_EQZ,

    OP_NE,
    OP_NEZ,

    OP_GT,
    OP_GTZ,

    OP_LT,
    OP_LTZ,

    //Extra Struct
    MAP_NEW,
    MAP_ADD,
    MAP_INDEX,
    MAP_MOVE,
    MAP_DELETE,
    MAP_HAS_KEY,
    MAP_HAS_VAL,
    MAP_LOCATE,
    MAP_LEN,

    STR_NEW,
    STR_INCLUDE,
    STR_LOCATE,
    STR_CAT,
    STR_INSERT,
    STR_INDEX,
    STR_MOVE,
    STR_DELETE,
    STR_TRIM,
    STR_REPLACE,
    STR_START_WITH,
    STR_END_WITH,
    STR_LEN,

    VEC_NEW,
    VEC_TOP,
    VEC_PUSH,
    VEC_POP,

    VEC_ADD,
    VEC_INDEX,
    VEC_MOVE,
    VEC_DELETE,
    VEC_INCLUDE,
    VEC_LOCATE,
    VEC_LEN;

    static {
        NEW_BOOL_TRUE.special = "new-true";
        NEW_BOOL_FALSE.special = "new-false";
        NEW_OBJECT.special = "new";

        CALL_AX.special = "call-Ax";
        CALL_ARESULT.special = "call-Aresult";
        CALL_AERROR.special = "call-Aerror";

        GET_ACCESSIBLE.special = "get-accessible?";

        IFEVAL.special = "if:";
        IFNOTEVAL.special = "ifnot:";
        IFERROREVAL.special = "iferr:";

        IMPLEVAL.special = "impl:";
        LAMBDAEVAL.special = "lambda:";

        OP_NULL.special = "op-null?";
        OP_IS_A.special = "op-is_a?";

        OP_EQ.special = "op-eq?";
        OP_EQZ.special = "op-eqz?";

        OP_NE.special = "op-ne?";
        OP_NEZ.special = "op-nez?";

        OP_GT.special = "op-gt?";
        OP_GTZ.special = "op-gtz?";

        OP_LT.special = "op-lt?";
        OP_LTZ.special = "op-ltz?";

        MAP_HAS_KEY.special = "map-has_key?";
        MAP_HAS_VAL.special = "map-has_val?";

        STR_INCLUDE.special = "str-include?";
        STR_START_WITH.special = "str-start_with?";
        STR_END_WITH.special = "str-end_with?";

        VEC_INCLUDE.special = "vec-include?";
    }

    private String special;

    public String toString() {
        return this.special == null ? name().toLowerCase().replace("_", "-") : this.special;
    }
}
