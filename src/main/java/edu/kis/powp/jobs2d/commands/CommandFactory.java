package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
    public static DriverCommand getRectangleCommand() {
        List<DriverCommand> driverCommandList = new ArrayList<>();

        driverCommandList.add(new SetPositionCommand(100, 100));
        driverCommandList.add(new OperateToCommand(100, -100));
        driverCommandList.add(new OperateToCommand(-100, -100));
        driverCommandList.add(new OperateToCommand(-100, 100));
        driverCommandList.add(new OperateToCommand(100, 100));

        return new ComplexCommands(driverCommandList);
    }

    public static DriverCommand getTriangleCommand() {
        List<DriverCommand> driverCommandList = new ArrayList<>();

        driverCommandList.add(new SetPositionCommand(-100, -100));
        driverCommandList.add(new OperateToCommand(0, 100));
        driverCommandList.add(new OperateToCommand(100, -100));
        driverCommandList.add(new OperateToCommand(-100, -100));

        return new ComplexCommands(driverCommandList);
    }
}
