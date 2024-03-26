package stoplightSim;

import mvc.*;

public class ChangeCommand extends Command {

    public ChangeCommand(Model model) {
        super(model);
    }

    public void execute() {
        Stoplight light = (Stoplight)getModel();
        light.change();
    }

}