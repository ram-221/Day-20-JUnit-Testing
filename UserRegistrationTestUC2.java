package com.bridgelabz;

import org.junit.Assert;

import org.junit.Test;

import com.bridglabz.UserRegistrationUC2;

public class UserRegistrationTestUC2 {

	UserRegistrationUC2 userRegistration = new UserRegistrationUC2();
	 
    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Ramesh");
        Assert.assertEquals(true, result);
    }

	@Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("ramas@");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Malli");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("malli");
        Assert.assertEquals(false, result);

    }
}
