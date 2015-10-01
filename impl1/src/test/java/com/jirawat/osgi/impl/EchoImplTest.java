package com.jirawat.osgi.impl;

import com.jirawat.osgi.api.Echo;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

/**
 * User: juttayaya
 * Date: 9/30/15
 * Time: 7:51 AM
 */
public class EchoImplTest {
    @Test(expected = IllegalArgumentException.class)
    public void testNull() {
        final Echo echo = new EchoImpl();
        final String output = echo.echo(null);
    }

    @Test
    public void testBlank() {
        final Echo echo = new EchoImpl();
        final String output = echo.echo("  ");

        assertThat(output, startsWith("EchoImpl 1.1:  "));
    }

    @Test
    public void testInput1() {
        final Echo echo = new EchoImpl();
        final String output = echo.echo("test1");

        assertThat(output, startsWith("EchoImpl 1.1:test1"));
    }

    @Test
    public void testInput2() {
        final Echo echo = new EchoImpl();
        final String output = echo.echo("test2");

        assertThat(output, startsWith("EchoImpl 1.1:test2"));
    }

}
