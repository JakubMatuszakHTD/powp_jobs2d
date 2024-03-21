package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.HashMap;
import java.util.List;

public class ComplexCommands implements DriverCommand {
    private final List<DriverCommand> driverCommandList;

    public ComplexCommands(List<DriverCommand> driverCommandList) {
        this.driverCommandList = driverCommandList;
    }

    @Override
    public void execute(Job2dDriver driver) {
        driverCommandList.forEach(driverCommand -> driverCommand.execute(driver));
    }
}
