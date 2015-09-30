package com.jirawat.osgi.command;

import com.jirawat.osgi.api.Echo;
import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

/**
 * User: juttayaya
 * Date: 9/30/15
 * Time: 9:11 AM
 */
@Command(scope = "jirawat", name = "echo",
        description = "Echo Input String",detailedDescription = "Detailed Echo Input String")
public class EchoCommand extends OsgiCommandSupport {
    private Echo echoService;

    @Argument(name="inputString", description = "The Input String",
            required = false, index = 0,
            multiValued = false)
    private String inputString;

    @Override
    protected Object doExecute() throws Exception {
        if ( echoService == null ) {
            System.err.println("ERROR: Initialization of Echo bean failed");
        } else {
            System.out.println(echoService.echo(inputString));
        }

        return null;
    }

    public Echo getEchoService() {
        return echoService;
    }

    public void setEchoService(Echo echoService) {
        this.echoService = echoService;
    }
}
