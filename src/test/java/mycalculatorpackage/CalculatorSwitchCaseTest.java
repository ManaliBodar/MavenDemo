package mycalculatorpackage;

import static org.junit.Assert.*;


import org.junit.Test;



public class CalculatorSwitchCaseTest {
	
	CalculatorSwitchCase objCalcTest = new CalculatorSwitchCase();
	 /**
     * Test method for {@link Calculator#doMath(java.lang.String, double, double)}.
     */
	
	    @Test
	    public void test() {
//	        assertTrue(objCalcTest.doMath("1", 5, 7) == 12.0);
//	        assertTrue(objCalcTest.doMath("2", 5, 7) == -2.0);
//	        assertTrue(objCalcTest.doMath("3", 5, 7) == (5.0/7.0));
        assertTrue(objCalcTest.doMath("4", 5.0, 7.0) == (5.0*7.0));
	    }


}
