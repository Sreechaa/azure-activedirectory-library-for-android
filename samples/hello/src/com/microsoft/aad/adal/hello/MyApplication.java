// Copyright © Microsoft Open Technologies, Inc.
//
// All Rights Reserved
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// THIS CODE IS PROVIDED *AS IS* BASIS, WITHOUT WARRANTIES OR CONDITIONS
// OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION
// ANY IMPLIED WARRANTIES OR CONDITIONS OF TITLE, FITNESS FOR A
// PARTICULAR PURPOSE, MERCHANTABILITY OR NON-INFRINGEMENT.
//
// See the Apache License, Version 2.0 for the specific language
// governing permissions and limitations under the License.

package com.microsoft.aad.adal.hello;

import com.microsoft.aad.adal.AuthenticationCallback;
import com.microsoft.aad.adal.AuthenticationContext;
import com.microsoft.aad.adal.AuthenticationResult;

import android.app.Application;
import android.content.res.Configuration;
import android.widget.Toast;

public class MyApplication extends Application {

    private static MyApplication singleton;

    public MyApplication getInstance() {
        return singleton;
    }

    private AuthenticationContext mAuthContext;
    protected Runnable activeCallback;
    
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
        try {
            // Provide key info for Encryption
            Utils.setupKeyForSample();
            // init authentication Context
            mAuthContext = new AuthenticationContext(this, Constants.AUTHORITY_URL,
                    false);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Encryption failed", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public AuthenticationContext getAuthContext() {
        return mAuthContext;
    }

    public void setAuthContext(AuthenticationContext mAuthContext) {
        this.mAuthContext = mAuthContext;
    }
}
