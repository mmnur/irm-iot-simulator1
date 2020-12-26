package com.example.iot.error;

public class IoTException extends Exception
{
	private static final long serialVersionUID = 3L;

	public IoTException()
	{
        super();
    }

    public IoTException(String message)
    {
        super(message);
    }

    public IoTException(Throwable cause)
    {
        super(cause);
    }
    
    public IoTException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
