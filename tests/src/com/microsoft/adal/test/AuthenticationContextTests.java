package com.microsoft.adal.test;

import com.microsoft.adal.AuthenticationContext;

import android.test.AndroidTestCase;

public class AuthenticationContextTests extends AndroidTestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testConstructor()
    {
        AuthenticationContext context = new AuthenticationContext(getContext(), "authority", false);
        
    }
}