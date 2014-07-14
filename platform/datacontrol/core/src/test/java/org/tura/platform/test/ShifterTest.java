package org.tura.platform.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ElementType;
import org.tura.platform.datacontrol.shift.ShiftConstants;
import org.tura.platform.datacontrol.shift.ShiftControl;

public class ShifterTest {
	
	private static Logger logger;	
	static{
		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);		
		ConsoleHandler handler = new ConsoleHandler(); 
		handler.setFormatter(new LogFormatter());
		logger.addHandler(handler);
		logger.setLevel(Level.INFO);
	}

	@Test
	public void addRow1() {

		try {
			ShiftControl control = new ShiftControl();

			control.add(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.add(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.add(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);

			comparator(control, new Element[] {
					new Element(3, 3, ElementType.NEW),
					new Element(4, 3, ElementType.EXISTING),
					new Element(5, 4, ElementType.NEW),
					new Element(6, 4, ElementType.EXISTING),
					new Element(7, 5, ElementType.NEW),
					new Element(8, 5, ElementType.EXISTING)

			});

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void addRow2() {

		try {
			ShiftControl control = new ShiftControl();

			control.add(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.add(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.add(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);

			comparator(control, new Element[] {
					new Element(5, 5, ElementType.NEW),
					new Element(6, 5, ElementType.NEW),
					new Element(7, 5, ElementType.NEW),
					new Element(8, 5, ElementType.EXISTING)

			});
		
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void removeRow1() {

		try {
			ShiftControl control = new ShiftControl();

			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			
			comparator(control, new Element[] {
					new Element(3, 5, ElementType.EXISTING),
					new Element(5, 8, ElementType.EXISTING)
			});
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void removeRow2() {

		try {
			ShiftControl control = new ShiftControl();

			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(2);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);

			comparator(control, new Element[] {
					new Element(1, 4, ElementType.EXISTING)
			});
		
		
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void mix1() {

		try {
			ShiftControl control = new ShiftControl();

			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.add(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			
			comparator(control, new Element[] {
					new Element(3, 3, ElementType.NEW),
					new Element(4, 3, ElementType.EXISTING),
					new Element(5, 6, ElementType.EXISTING)
			});
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void mix2() {

		try {
			ShiftControl control = new ShiftControl();

			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.add(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	
	@Test
	public void mix3() {

		try {
			ShiftControl control = new ShiftControl();

			control.add(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			
			assertEquals(control.getShiftTracker().size() , 0);

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	

	@Test
	public void mix4() {

		try {
			ShiftControl control = new ShiftControl();

			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(6);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.add(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			
			comparator(control, new Element[] {
					new Element(1, 2, ElementType.NEW),
					new Element(6, 8, ElementType.EXISTING)
			});


		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	@Test
	public void mix5() {

		try {
			ShiftControl control = new ShiftControl();

			control.add(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.add(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);
			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION,logger);

			assertEquals(control.getShiftTracker().size() , 0);
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	

	private void comparator(ShiftControl contorl, Element[] array) {
		assertEquals(contorl.getShiftTracker().size(), array.length);
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i], contorl.getShiftTracker().get(i));
		}

	}

}
