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
        return "EchoImpl:" + input + ":" + new Date();
    }
}
