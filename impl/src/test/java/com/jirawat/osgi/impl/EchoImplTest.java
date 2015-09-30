package com.jirawat.osgi.impl;

import com.jirawat.osgi.api.Echo;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.startsWith;
/**
 * User: juttayaya
 * Date: 9/30/15
 * Time: 7:51 AM
 */
public class EchoImplTest {
    @Test
    public void testNull() {
        final Echo echo = new EchoImpl();
        final String output = echo.echo(null);

        assertThat(output, startsWith("EchoImpl:null"));
    }

    @Test
    public void testBlank() {
        final Echo echo = new EchoImpl();
        final String output = echo.echo("  ");

        assertThat(output, startsWith("EchoImpl:  "));
    }

    @Test
    public void testInput1() {
        final Echo echo = new EchoImpl();
        final String output = echo.echo("test1");

        assertThat(output, startsWith("EchoImpl:test1"));
    }

    @Test
    public void testInput2() {
        final Echo echo = new EchoImpl();
        final String output = echo.echo("test2");

        assertThat(output, startsWith("EchoImpl:test2"));
    }

}
