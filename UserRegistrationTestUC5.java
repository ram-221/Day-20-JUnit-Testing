package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import com.bridglabz.UserRegistrationUC5;

public class UserRegistrationTestUC5 {
	
	UserRegistrationUC5 userRegistration =new UserRegistrationUC5();

	@Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Ramesh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("rames@");
        Assert.assertEquals(false, result);
    }
    
    /*
     * method to check Last name
     */

    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Rames");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("rames");
        Assert.assertEquals(false, result);
    }
    
    /*
	 * methods to check mail addresss
	 */
    
        @Test
    	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.emailAddress("Rameshc@bl.co.in");
    		Assert.assertEquals(true, result);
    	}

    	@Test
    	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
    		boolean result = userRegistration.emailAddress("abc()*@gmail.com");
    		Assert.assertEquals(false, result);
    }
    
    	/*
    	 * test cases for mobile number validation
    	 */
    	@Test
    	public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.phoneNumber("91843151021");
    		Assert.assertEquals(true, result);
    	}

    	@Test
    	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
    		boolean result = userRegistration.phoneNumber("+91 9060670390");
    		Assert.assertEquals(false, result);
    	}

    	/*
    	 * method to validate password
    	 */
    	@Test
    	public void givenPassword_WhenInFormat_ShouldReturnTrue() {
    		boolean result = userRegistration.passwordRule1("karnatak");
    		Assert.assertEquals(true, result);
    	}
    	@Test
    	public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
    		boolean result = userRegistration.passwordRule1("abcd");
    		Assert.assertEquals(false, result);
    	}

}
