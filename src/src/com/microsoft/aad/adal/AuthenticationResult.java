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

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * Authentication result
 */
public class AuthenticationResult implements Serializable {

    /**
     * Serial version number for serialization
     */
    private static final long serialVersionUID = 2243372613182536368L;

    /**
     * Status for authentication
     */
    public enum AuthenticationStatus {
        /**
         * User cancelled login activity
         */
        Cancelled,
        /**
         * request has errors
         */
        Failed,
        /**
         * token is acquired
         */
        Succeeded,
    }

    private String mCode;

    private String mAccessToken;

    private String mRefreshToken;

    private String mTokenType;

    private Date mExpiresOn;

    private String mErrorCode;

    private String mErrorDescription;

    private boolean mIsMultiResourceRefreshToken;

    private UserInfo mUserInfo;

    private String mTenantId;

    private AuthenticationStatus mStatus = AuthenticationStatus.Failed;

    AuthenticationResult() {
        mCode = null;
    }

    AuthenticationResult(String code) {
        mCode = code;
        mStatus = AuthenticationStatus.Succeeded;
        mAccessToken = null;
        mRefreshToken = null;
    }

    AuthenticationResult(String accessToken, String refreshToken, Date expires, boolean isBroad,
            UserInfo userInfo) {
        mCode = null;
        mAccessToken = accessToken;
        mRefreshToken = refreshToken;
        mExpiresOn = expires;
        mIsMultiResourceRefreshToken = isBroad;
        mStatus = AuthenticationStatus.Succeeded;
        mUserInfo = userInfo;
    }

    AuthenticationResult(String accessToken, String refreshToken, Date expires, boolean isBroad) {
        mCode = null;
        mAccessToken = accessToken;
        mRefreshToken = refreshToken;
        mExpiresOn = expires;
        mIsMultiResourceRefreshToken = isBroad;
        mStatus = AuthenticationStatus.Succeeded;
    }

    AuthenticationResult(String errorCode, String errDescription) {
        mErrorCode = errorCode;
        mErrorDescription = errDescription;
        mStatus = AuthenticationStatus.Failed;
    }

    /**
     * Creates result from {@link TokenCacheItem}
     * 
     * @param cacheItem
     * @return AuthenticationResult
     */
    static AuthenticationResult createResult(final TokenCacheItem cacheItem) {

        if (cacheItem == null) {
            AuthenticationResult result = new AuthenticationResult();
            result.mStatus = AuthenticationStatus.Failed;
            return result;
        }

        return new AuthenticationResult(cacheItem.getAccessToken(), cacheItem.getRefreshToken(),
                cacheItem.getExpiresOn(), cacheItem.getIsMultiResourceRefreshToken(),
                cacheItem.getUserInfo());
    }

    /**
     * Uses access token to create header for web requests
     * 
     * @return AuthorizationHeader
     */
    public String createAuthorizationHeader() {
        return AuthenticationConstants.AAD.BEARER + " " + getAccessToken();
    }

    /**
     * Access token to send to the service in Authorization Header
     * @return Access token
     */
    public String getAccessToken() {
        return mAccessToken;
    }

    /**
     * Refresh token to get new tokens
     * @return Refresh token
     */
    public String getRefreshToken() {
        return mRefreshToken;
    }

    /**
     * Token type
     * @return Access token type
     */
    public String getAccessTokenType() {
        return mTokenType;
    }

    /**
     * Epoch time for expiresOn
     * @return Date(Epoch time)
     */
    public Date getExpiresOn() {
        return mExpiresOn;
    }

    /**
     * Multi-resource refresh tokens can be used to request token for another
     * resource
     * @return True if token has multi-resource refresh token feature
     */
    public boolean getIsMultiResourceRefreshToken() {
        return mIsMultiResourceRefreshToken;
    }

    /**
     * UserInfo returned from IdToken 
     * @return UserInfo derived from id_token field
     */
    public UserInfo getUserInfo() {
        return mUserInfo;
    }

    /**
     * Set userinfo after refresh from previous idtoken
     * 
     * @param userinfo
     */
    void setUserInfo(UserInfo userinfo) {
        mUserInfo = userinfo;
    }

    /**
     * Gets tenantId
     */
    public String getTenantId() {
        return mTenantId;
    }

    /**
     * Gets result status
     */
    public AuthenticationStatus getStatus() {
        return mStatus;
    }

    String getCode() {
        return mCode;
    }

    void setCode(String code) {
        mCode = code;
    }

    /**
     * Gets error code
     */
    public String getErrorCode() {
        return mErrorCode;
    }

    /**
     * Gets error description
     */
    public String getErrorDescription() {
        return mErrorDescription;
    }

    /**
     * Gets error log info
     */
    public String getErrorLogInfo() {
        return " ErrorCode:" + getErrorCode() + " ErrorDescription:" + getErrorDescription();
    }

    /**
     * Gets expire status
     */
    public boolean isExpired() {
        Date validity = getCurrentTime().getTime();

        if (mExpiresOn != null && mExpiresOn.before(validity))
            return true;

        return false;
    }

    private static Calendar getCurrentTime() {
        Calendar timeNow = Calendar.getInstance();
        return timeNow;
    }
}
