package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account act;


    @BeforeEach
    void setUp() {
        act = new Account(
                new String[] {"Link","Visa"},
                "10-10-22",
                "11223344",
                "1234");
    }

    @Test
    @DisplayName("Match Accounts")
    void compareTo() {

        Account inputObject = new Account(
                new String[]{"Link"},
                "10-10-22",
                "11223344",
                "1234");

        Account inputObject2 = new Account(
                new String[]{"Visa", "BCR"},
                "10-10-22",
                "11003344",
                "1234");


        assertEquals(0 , act.compareTo(inputObject), "Login failed");
        assertEquals(-1 , act.compareTo(inputObject2), "Login failed");
    }
}