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

/**
 * Constants related to the library
 */
public class AuthenticationConstants {

    /**
     * WebView related constants
     */
    public static final class Browser {

        /**
         * Bundle field for Request Message
         */
        public static final String REQUEST_MESSAGE = "com.microsoft.aad.adal:BrowserRequestMessage";

        /**
         * Bundle field for Request info
         */
        public static final String RESPONSE_REQUEST_INFO = "com.microsoft.aad.adal:BrowserRequestInfo";

        /**
         * Bundle field for Response error code
         */
        public static final String RESPONSE_ERROR_CODE = "com.microsoft.aad.adal:BrowserErrorCode";

        /**
         * Bundle field for Response error message
         */
        public static final String RESPONSE_ERROR_MESSAGE = "com.microsoft.aad.adal:BrowserErrorMessage";

        /**
         * Bundle field for Response exception
         */
        public static final String RESPONSE_AUTHENTICATION_EXCEPTION = "com.microsoft.aad.adal:AuthenticationException";

        /**
         * Bundle field for final url
         */
        public static final String RESPONSE_FINAL_URL = "com.microsoft.aad.adal:BrowserFinalUrl";

        /**
         * Bundle field for Response
         */
        public static final String RESPONSE = "com.microsoft.aad.adal:BrokerResponse";

        /**
         * Bundle field for invalid request
         */
        public static final String WEBVIEW_INVALID_REQUEST = "Invalid request";

        /**
         * Bundle field for cancelled request
         */
        public static final String ACTION_CANCEL = "com.microsoft.aad.adal:BrowserCancel";

        /**
         * Bundle field for RequestId
         */
        public static final String REQUEST_ID = "com.microsoft.aad.adal:RequestId";
    }

    /**
     * onActivity result response codes
     */
    public static final class UIResponse {
        /**
         * User cancelled
         */
        public static final int BROWSER_CODE_CANCEL = 2001;

        /**
         * Browser error
         */
        public static final int BROWSER_CODE_ERROR = 2002;

        /**
         * Flow complete
         */
        public static final int BROWSER_CODE_COMPLETE = 2003;

        /**
         * Broker returns full response
         */
        public static final int TOKEN_BROKER_RESPONSE = 2004;

        /**
         * WebView throws Authentication exception. It needs to be send to
         * callback.
         */
        public static final int BROWSER_CODE_AUTHENTICATION_EXCEPTION = 2005;
    }

    /**
     * Request codes to start Authentication activity
     */
    public static final class UIRequest {
        /**
         * Browser Flow constant
         */
        public static final int BROWSER_FLOW = 1001;
    }

    /**
     * Oauth2 protocol related constants
     */
    public static final class OAuth2 {
        /**
         * Authorization code request
         */
        public static final String AUTHORIZATION_CODE = "authorization_code";

        /**
         * ClientId related to the app
         */
        public static final String CLIENT_ID = "client_id";

        /**
         * Authorization code
         */
        public static final String CODE = "code";

        /**
         * Error from Server
         */
        public static final String ERROR = "error";

        /**
         * Error description from Server
         */
        public static final String ERROR_DESCRIPTION = "error_description";

        /**
         * Expires in
         */
        public static final String EXPIRES_IN = "expires_in";

        /**
         * Grant type
         */
        public static final String GRANT_TYPE = "grant_type";

        /**
         * Redirect Uri
         */
        public static final String REDIRECT_URI = "redirect_uri";

        /**
         * Access token from response
         */
        public static final String ACCESS_TOKEN = "access_token";

        /**
         * Refresh token from response
         */
        public static final String REFRESH_TOKEN = "refresh_token";

        /**
         * State send to endpoint
         */
        public static final String STATE = "state";

        static final String ID_TOKEN = "id_token";

        static final String ID_TOKEN_SUBJECT = "sub";

        static final String ID_TOKEN_TENANTID = "tid";

        static final String ID_TOKEN_UPN = "upn";

        static final String ID_TOKEN_GIVEN_NAME = "given_name";

        static final String ID_TOKEN_FAMILY_NAME = "family_name";

        static final String ID_TOKEN_UNIQUE_NAME = "unique_name";

        static final String ID_TOKEN_EMAIL = "email";

        static final String ID_TOKEN_IDENTITY_PROVIDER = "idp";
    }

    /**
     * AAD related constants
     */
    public static final class AAD {

        /**
         * AAD OAuth2 extension strings
         */
        public static final String RESOURCE = "resource";

        /**
         * AAD OAuth2 Challenge strings
         */
        public static final String BEARER = "Bearer";

        /**
         * Login hint to send in Authorization endpoint
         */
        public static final String LOGIN_HINT = "login_hint";

        /**
         * CorrelationID to include in the request for tracking
         */
        public static final String CORRELATION_ID = "correlation_id";

        /**
         * Header field name for CorrelationId
         */
        public static final String CLIENT_REQUEST_ID = "client-request-id";

        /**
         * Header field to indicate to return CorrelationId
         */
        public static final String RETURN_CLIENT_REQUEST_ID = "return-client-request-id";

        /**
         * Query parameter name to send Authorization endpoint for prompt
         */
        public static final String QUERY_PROMPT = "prompt";

        /**
         * Query parameter value to send Authorization endpoint for prompt
         */
        public static final String QUERY_PROMPT_VALUE = "login";

        /**
         * Query parameter name to send Authorization endpoint for
         * identification
         */
        public final static String ADAL_ID_PLATFORM = "x-client-SKU";

        /**
         * Query parameter name to send Authorization endpoint for
         * identification
         */
        public final static String ADAL_ID_VERSION = "x-client-Ver";

        /**
         * Query parameter name to send Authorization endpoint for
         * identification
         */
        public final static String ADAL_ID_CPU = "x-client-CPU";

        /**
         * Query parameter name to send Authorization endpoint for
         * identification
         */
        public final static String ADAL_ID_OS_VER = "x-client-OS";

        /**
         * Query parameter name to send Authorization endpoint for
         * identification
         */
        public final static String ADAL_ID_DM = "x-client-DM";
    }

    /**
     * Broker related constants
     */
    public static final class Broker {

        /**
         * Broker specific request to identify at onActivityResult
         */
        public static final int BROKER_REQUEST_ID = 1177;

        /**
         * Broker request field name
         */
        public static final String BROKER_REQUEST = "com.microsoft.aadbroker.adal.broker.request";

        /**
         * Account type string.
         */
        public static final String BROKER_ACCOUNT_TYPE = "com.microsoft.aadbroker.adal";

        /**
         * Broker background request field name
         */
        public static final String BACKGROUND_REQUEST_MESSAGE = "background.request";

        /**
         * Broker account default name
         */
        public static final String ACCOUNT_DEFAULT_NAME = "Default";

        /**
         * Broker Auth token type string
         */
        public static final String AUTHTOKEN_TYPE = "adal.authtoken.type";

        /**
         * Bundle field name for ClientId
         */
        public static final String ACCOUNT_CLIENTID_KEY = "account.clientid.key";

        /**
         * Bundle field name for Correlationid
         */
        public static final String ACCOUNT_CORRELATIONID = "account.correlationid";

        /**
         * Bundle field name for prompt parameter
         */
        public static final String ACCOUNT_PROMPT = "account.prompt";

        /**
         * Bundle field name for extra query parameter
         */
        public static final String ACCOUNT_EXTRA_QUERY_PARAM = "account.extra.query.param";

        /**
         * Bundle field name for login hint
         */
        public static final String ACCOUNT_LOGIN_HINT = "account.login.hint";

        /**
         * Bundle field name for resource
         */
        public static final String ACCOUNT_RESOURCE = "account.resource";

        /**
         * Bundle field name for redirect
         */
        public static final String ACCOUNT_REDIRECT = "account.redirect";

        /**
         * Bundle field name for authority
         */
        public static final String ACCOUNT_AUTHORITY = "account.authority";

        /**
         * Bundle field name for access token
         */
        public static final String ACCOUNT_ACCESS_TOKEN = "account.access.token";

        /**
         * Bundle field name for expire date
         */
        public static final String ACCOUNT_EXPIREDATE = "account.expiredate";

        /**
         * Bundle field name for result
         */
        public static final String ACCOUNT_RESULT = "account.result";

        /**
         * Bundle field name for token removal request
         */
        public static final String ACCOUNT_REMOVE_TOKENS = "account.remove.tokens";

        /**
         * Bundle field value for token removal request
         */
        public static final String ACCOUNT_REMOVE_TOKENS_VALUE = "account.remove.tokens.value";

        /**
         * Bundle field name for multi-resource token
         */
        public static final String MULTI_RESOURCE_TOKEN = "account.multi.resource.token";

        /**
         * Bundle field name for account name
         */
        public static final String ACCOUNT_NAME = "account.name";

        /**
         * Bundle field name for userinfo's userid
         */
        public static final String ACCOUNT_USERINFO_USERID = "account.userinfo.userid";

        /**
         * Bundle field name for userinfo's given name
         */
        public static final String ACCOUNT_USERINFO_GIVEN_NAME = "account.userinfo.given.name";

        /**
         * Bundle field name for userinfo's family name
         */
        public static final String ACCOUNT_USERINFO_FAMILY_NAME = "account.userinfo.family.name";

        /**
         * Bundle field name for userinfo's identity provider
         */
        public static final String ACCOUNT_USERINFO_IDENTITY_PROVIDER = "account.userinfo.identity.provider";

        /**
         * Bundle field name for userinfo's displayable flag
         */
        public static final String ACCOUNT_USERINFO_USERID_DISPLAYABLE = "account.userinfo.userid.displayable";

        /**
         * Bundle field name for userinfo's tenantid
         */
        public static final String ACCOUNT_USERINFO_TENANTID = "account.userinfo.tenantid";

        /**
         * Key name for UID cache lookup
         */
        public static final String ACCOUNT_UID_CACHES = "account.uid.caches";

        /**
         * Prefix for user data
         */
        public static final String USERDATA_PREFIX = "userdata.prefix";

        /**
         * Key name for UID
         */
        public static final String USERDATA_UID_KEY = "calling.uid.key";

        /**
         * Key name to look up available cache keys
         */
        public static final String USERDATA_CALLER_CACHEKEYS = "userdata.caller.cachekeys";

        /**
         * Cache key prefix
         */
        public static final String CALLER_CACHEKEY_PREFIX = "|";

        /**
         * Constant to specify client TLS is not supported
         */
        public static final String CLIENT_TLS_NOT_SUPPORTED = " Client-TLS-not-supported";

        /**
         * Client TLS Redirect Urn
         */
        public static final String CLIENT_TLS_REDIRECT = "urn:http-auth:PKeyAuth";

        /**
         * Challenge TLS incapable header name
         */
        public static final String CHALLANGE_TLS_INCAPABLE = "x-ms-client-TLS-not-supported";

        /**
         * Challenge request header
         */
        public static final String CHALLANGE_REQUEST_HEADER = "WWW-Authenticate";

        /**
         * Challenge response header
         */
        public static final String CHALLANGE_RESPONSE_HEADER = "Authorization";

        /**
         * Challenge response type
         */
        public static final String CHALLANGE_RESPONSE_TYPE = "PKeyAuth";

        /**
         * Challenge response token
         */
        public static final String CHALLANGE_RESPONSE_TOKEN = "AuthToken";

        /**
         * Challenge response context
         */
        public static final String CHALLANGE_RESPONSE_CONTEXT = "Context";

        /**
         * Certificate authorities are passed with delimiter
         */
        public static final String CHALLANGE_REQUEST_CERT_AUTH_DELIMETER = ",";

        /**
         * Apk package name that will install AD-Authenticator. It is used to
         * query if this app installed or not from package manager
         */
        public static final String PACKAGE_NAME = "com.microsoft.aadbroker";

        /**
         * Signature info for AD-Authenticator installing app to verify broker
         * component
         */
        public static final String SIGNATURE = "HcArzSmaOsvXP3gYIEMHHVrmozI=\n";
    }

    /**
     * Package name for ADAL
     */
    public static final String ADAL_PACKAGE_NAME = "com.microsoft.aad.adal";

    /**
     * The Constant ENCODING_UTF8.
     */
    public static final String ENCODING_UTF8 = "UTF_8";

    /**
     * Default expiration time
     */
    public static final int DEFAULT_EXPIRATION_TIME_SEC = 3600;
}
