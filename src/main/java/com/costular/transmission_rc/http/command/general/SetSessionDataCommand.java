package com.costular.transmission_rc.http.command.general;

import com.costular.transmission_rc.http.command.BodyArguments;
import com.costular.transmission_rc.http.command.Command;

/**
 * Created by costular on 23/07/17.
 */
public class SetSessionDataCommand extends Command {



    public SetSessionDataCommand(BodyArguments arguments) {
        super("session-set", arguments);
    }
}
