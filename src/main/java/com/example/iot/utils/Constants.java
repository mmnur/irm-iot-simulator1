package com.example.iot.utils;

public class Constants
{
	public final static String PKI_ALGORITHM = "RSA";
	public final static String SIGNATURE_ALGORITHM = "\"SHA256withRSA\"";
	public final static int PKI_KEYSIZE = 2048;
	
	public static final String URL_LIST_USERS = "/users";
    public static final String URL_ADD_USER = "/user";
    
	public static final String URL_LIST_SCOPES = "/scopes";
    public static final String URL_ADD_SCOPE = "/scope";
    
	public static final String URL_LIST_POLICIES = "/policies";
    public static final String URL_ADD_POLICY = "/policy";	
}
