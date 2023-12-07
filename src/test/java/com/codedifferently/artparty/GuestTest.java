package com.codedifferently.artparty;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuestTest {
    @Test
    public void guestConstructorTest01(){
        Guest guest = new Guest("Tariq", "Hook", "tariq@codedifferently.com");
        String expected = "ID: null; Guest name: Hook, Tariq; Guest email: tariq@codedifferently.com";
        String actual = guest.toString();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void guestConstructorTest02(){
        Guest guest = new Guest(2L, "302-555-5555", "Art Party");
        Assertions.assertEquals(2L, guest.getId());
    }
    @Test
    public void getAndSetID(){
        Guest guest = new Guest(1L, "302-111-1111", "Lecture");
        guest.setId(3L);
        Long expected = 3L;
        Long actual = guest.getId();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getAndSetFirstName(){
        Guest guest = new Guest("Tariq", "Hook", "tariq@codedifferently.com");
        guest.setFirstName("Stephanie");
        String expected = "Stephanie";
        String actual = guest.getFirstName();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getAndSetLastName(){
        Guest guest = new Guest("Tariq", "Hook", "tariq@codedifferently.com");
        guest.setLastName("Williams");
        String expected = "Williams";
        String actual = guest.getLastName();
        Assertions.assertEquals(expected, actual);
    }
}
