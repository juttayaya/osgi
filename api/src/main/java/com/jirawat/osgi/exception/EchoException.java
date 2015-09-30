package com.jirawat.osgi.exception;

/**
 * User: juttayaya
 * Date: 9/30/15
 * Time: 6:59 AM
 */
public class EchoException extends RuntimeException {
    static final long serialVersionUID = -4815162342007L;

    public EchoException() {
        super();
    }

    public EchoException(String message) {
        super(message);
    }

    public EchoException(String message, Throwable cause) {
        super(message, cause);
    }

    public EchoException(Throwable cause) {
        super(cause);
    }

}
