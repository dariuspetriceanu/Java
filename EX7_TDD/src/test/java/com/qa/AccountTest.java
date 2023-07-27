package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account act;
    @BeforeEach
    void setUp() {
        act = new Account(new String[]{"Link", "Visa"}, "10-10-2022",
                "11223344","1234");
    }
    @DisplayName("Match Accounts")
    @Test
    void compareTo() {
        Account inputObject =  new Account(new String[]{"Link"}, "10-10-2022",
                "11223344", "1234");
        Account inputObject1 =  new Account(new String[]{"Linkk"}, "10-10-2022",
                "11223344", "1234");
        assertEquals(0,act.compareTo(inputObject),"Login Failed");
        assertEquals(-1, act.compareTo(inputObject1), "Login Failed");
    }

}