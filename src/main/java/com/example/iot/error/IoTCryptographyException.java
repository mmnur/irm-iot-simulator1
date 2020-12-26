package com.example.iot.error;

public class IoTCryptographyException extends IoTException
{
	private static final long serialVersionUID = 4L;

	public IoTCryptographyException()
	{
        super();
    }

    public IoTCryptographyException(String message)
    {
        super(message);
    }

    public IoTCryptographyException(Throwable cause)
    {
        super(cause);
    }
    
    public IoTCryptographyException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
