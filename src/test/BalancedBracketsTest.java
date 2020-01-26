package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void pairOfBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launchcode]"));;
    }
    @Test
    public void pairOfBracketsAtBeginReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]launchcode"));;
    }
    @Test
    public void pairOfBracketsInMiddleReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("launch[code]"));;
    }
    @Test
    public void pairOfBracketsAtEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("launchcode[]"));;
    }
    @Test
    public void noPairOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));;
    }
    @Test
    public void onlyOneOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));;
    }
    @Test
    public void pairOfBracketsInReverseReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));;
    }
    @Test
    public void onlyOneClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));;
    }
    @Test
    public void noClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code"));;
    }
    @Test
    public void noOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code]"));;
    }
    @Test
    public void pairOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));;
    }
}
