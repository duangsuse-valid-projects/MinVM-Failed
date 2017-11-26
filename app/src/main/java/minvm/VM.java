package minvm;

import java.lang.reflect.Method;

/**
 * Created by dse on 17-11-26.
 * MinVM Interpreter Implementation
 * Just like BeanShell bsh.Interpreter class
 */

public class VM {
    //Code to execute
    public InstructionSequence instructionSequence;
    //VM call stack
    public CallStack callStack;
    /*
    registers
    x: register
    error: caught error
    result method call result
    */
    public Object x;
    public Throwable error;
    public Object result;
    //VM Should not
    private Lock lock;
    //VM Variables
    private VMemory env;
    //Program counter
    //maybe a big number(if input program is very large), so it's a Long
    private long pc;
    //Trace method that invoked before executing any instruction
    private Method trace;

    VM() {
        lock = new Lock();
        env = new VMemory();
    }
}
