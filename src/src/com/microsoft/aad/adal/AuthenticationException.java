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

package com.microsoft.aad.adal;

import android.content.Context;

/**
 * ADAL exception
 */
public class AuthenticationException extends RuntimeException {
    static final long serialVersionUID = 1;

    protected ADALError mCode;

    /**
     * Constructs a new AuthenticationException
     */
    public AuthenticationException() {
    }

    /**
     * Constructs a new AuthenticationException with ADALError
     * @param code
     */
    public AuthenticationException(ADALError code) {
        mCode = code;
    }

    /**
     * @param code Error code
     * @param details Details related to the error such as query string, request
     *            info
     */
    public AuthenticationException(ADALError code, String details) {
        super(details);
        mCode = code;
    }

    /**
     * 
     * @param code  Error code
     * @param details Error message detail
     * @param throwable Exception
     */
    public AuthenticationException(ADALError code, String details, Throwable throwable) {
        super(details, throwable);
        mCode = code;
    }

    /**
     * Gets ADAL error code
     * @return ADALError
     */
    public ADALError getCode() {
        return mCode;
    }

    @Override
    public String getMessage() {
        return getLocalizedMessage(null);
    }

    /**
     * Gets localized message
     * @param context
     * @return Localized message
     */
    public String getLocalizedMessage(Context context) {
        if (!StringExtensions.IsNullOrBlank(super.getMessage())) {
            return super.getMessage();
        }
        if (mCode != null) {
            return mCode.getLocalizedDescription(context);
        }

        return null;
    }
}
