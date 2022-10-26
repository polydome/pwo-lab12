package pwo.seq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeqTypeTest {
    @Test
    public void testValues() {
        System.out.println("values");
        SeqType[] expResult
                = {SeqType.FIB, SeqType.LUC, SeqType.TRI};
        SeqType[] result = SeqType.values();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testFibFromString() {
        System.out.println("fromString");
        String type = "fibonaci";
        SeqType expResult = SeqType.FIB;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }

    @Test
    public void testLucFromString() {
        System.out.println("fromString");
        String type = "lucas";
        SeqType expResult = SeqType.LUC;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }

    @Test
    public void testTriFromString() {
        System.out.println("fromString");
        String type = "tribonaci";
        SeqType expResult = SeqType.TRI;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFibGenerator() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.FIB;
        Generator result = instance.getGenerator();
        assertEquals(FibonacciGenerator.class, result.getClass());
    }

    @Test
    public void testGetLucGenerator() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.LUC;
        Generator result = instance.getGenerator();
        assertEquals(LucasGenerator.class, result.getClass());
    }

    @Test
    public void testGetTriGenerator() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.TRI;
        Generator result = instance.getGenerator();
        assertEquals(TribonacciGenerator.class, result.getClass());
    }
}