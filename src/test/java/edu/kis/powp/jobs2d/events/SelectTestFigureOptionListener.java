package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.FigureOption;
import edu.kis.powp.jobs2d.commands.CommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final FigureOption figureOption;

	public SelectTestFigureOptionListener(DriverManager driverManager, FigureOption figureOption) {
		this.driverManager = driverManager;
		this.figureOption = figureOption;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figureOption) {
			case JOE_1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case JOE_2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case RECTANGLE:
				CommandFactory.getRectangleCommand().execute(driverManager.getCurrentDriver());
				break;
			case TRIANGLE:
				CommandFactory.getTriangleCommand().execute(driverManager.getCurrentDriver());
				break;
			default:
				break;
		}
	}
}
