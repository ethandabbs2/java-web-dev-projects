package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); }
    @Test
    public void BalancedBracketsHasString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Is a string")); }
    @Test
    public void BalancedBracketsReturnsMultipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));}
    @Test
    public void reversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][")); }
    @Test
    public void BalancedBracketsReturnsString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode")); }
    @Test
    public void BalancedBracketsReturnsMultipleReversedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][[")); }
    @Test
    public void BalancedBracketsPartialBalance() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][")); }
    @Test
    public void BalancedBracketsOnlyHasOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[")); }
    @Test
    public void onlyBracketsReturnsTheOtherBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]")); }
    @Test
    public void ReturnsMultipleBracketsOneWay() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]")); }
    @Test
    public void ReturnsMultipleBracketsTheOtherWay() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[")); }
}



