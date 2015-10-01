package com.jirawat.osgi.impl;

import com.jirawat.osgi.api.Echo;

import java.util.Date;

/**
 * User: juttayaya
 * Date: 9/30/15
 * Time: 7:47 AM
 */
public class EchoImpl implements Echo {
    public String echo(String input) {
        if ( input == null ) {
            throw new IllegalArgumentException("Echo input cannot be null");
        }
        return "EchoImpl 1.1:" + input + ":" + new Date();
    }
}
