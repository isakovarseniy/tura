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
	public void A3_A4_A5() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(4,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(3, 3, ElementType.NEW),
					new Element(4, 4, ElementType.NEW),
					new Element(5, 5, ElementType.NEW),
					new Element(6, 3, ElementType.EXISTING),
			});

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	@Test
	public void A5_A4_A3() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(4,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

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
	public void A5_A3_A4() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(4,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(3, 3, ElementType.NEW),
					new Element(4, 4, ElementType.NEW),
					new Element(5, 3, ElementType.EXISTING),
					new Element(7, 5, ElementType.NEW),
					new Element(8, 5, ElementType.EXISTING)

			});

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	

	@Test
	public void A5_A5_A5() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

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
	public void R4_R3_R5() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
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
	public void R5_R3_R4() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
			comparator(control, new Element[] {
					new Element(3, 4, ElementType.EXISTING),
					new Element(4, 7, ElementType.EXISTING)
			});
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	
	
	@Test
	public void R3_R5_R4() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(3, 4, ElementType.EXISTING),
					new Element(4, 7, ElementType.EXISTING)
			});
		
		
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}


	@Test
	public void R3_R4_R5() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(3, 4, ElementType.EXISTING),
					new Element(4, 6, ElementType.EXISTING),
					new Element(5, 8, ElementType.EXISTING)
			});
		
		
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	
	@Test
	public void R4_A3_R5() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
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
	public void R4_A3_R3() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	
	@Test
	public void A3_R3() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
			comparator(control, new Element[] {
					new Element(3, 3, ElementType.EXISTING)
			});

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	

	@Test
	public void A3_R3_A3() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
			comparator(control, new Element[] {
					new Element(3, 3, ElementType.NEW),
					new Element(4, 3, ElementType.EXISTING)
			});

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	
	
	@Test
	public void R1_R6_A3_R3() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(6);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(3);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
			comparator(control, new Element[] {
					new Element(1, 2, ElementType.EXISTING),
					new Element(6, 8, ElementType.EXISTING)
			});


		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	@Test
	public void R6_A3_R1() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(6);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(1, 2, ElementType.EXISTING),
					new Element(2, 3, ElementType.NEW),
					new Element(3, 3, ElementType.EXISTING),
					new Element(6, 7, ElementType.EXISTING)
			});

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	@Test
	public void R1_A3_R6() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(6);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(1, 2, ElementType.EXISTING),
					new Element(3, 3, ElementType.NEW),
					new Element(6, 7, ElementType.EXISTING)
			});

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	@Test
	public void A1_A5_R1_R4() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.add(1,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(1, 1, ElementType.EXISTING),
					new Element(4, 4, ElementType.EXISTING)
			});
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	@Test
	public void A1_R1_R4_A5() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.add(1,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(1, 1, ElementType.EXISTING),
					new Element(4, 5, ElementType.EXISTING),
					new Element(5, 5, ElementType.NEW)
			});
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

	@Test
	public void R4_A1_A5_R1() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(1,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(1, 1, ElementType.EXISTING),
					new Element(4, 5, ElementType.NEW),
					new Element(5, 5, ElementType.EXISTING)
			});
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	
	@Test
	public void R8_R5_R1() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(8);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(1, 2, ElementType.EXISTING),
					new Element(4, 6, ElementType.EXISTING),
					new Element(6, 9, ElementType.EXISTING)
			});
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	

	@Test
	public void U7() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.update(8,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(8, 8, ElementType.EXISTING,true),
			});
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	

	@Test
	public void A1_R1_U3_R4_A5() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.add(1,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(1);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.update(1,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(5,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);

			comparator(control, new Element[] {
					new Element(1, 1, ElementType.EXISTING,true),
					new Element(4, 5, ElementType.EXISTING),
					new Element(5, 5, ElementType.NEW)
			});
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	
	@Test
	public void position() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(4);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(3,null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(5);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(6, null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(6, null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(6, null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.add(6, null);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
			
			comparator(control, new Element[] {
					new Element(3, 3, ElementType.NEW),
					new Element(4, 3, ElementType.EXISTING),
					new Element(5, 6, ElementType.EXISTING),
					new Element(6, 6, ElementType.NEW),
					new Element(7, 6, ElementType.NEW),
					new Element(8, 6, ElementType.NEW),
					new Element(9, 6, ElementType.NEW)
			});
			
             for (int i = 0; i < 15 ; i++){
            	Object obj =  control.getObject(i);
            	logger.info( "position "+ i+" = "  + obj);
             }
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	

	
	@Test
	public void position1() {

		try {
			ShiftControl control = new ShiftControl(logger);

			control.remove(2);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(2);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			control.remove(2);
			control.print(ShiftConstants.SELECT_ORDERBY_ACTUALPOSITION);
			
			
			comparator(control, new Element[] {
					new Element(2, 5, ElementType.EXISTING),
			});
			
             for (int i = 0; i < 10 ; i++){
            	Object obj =  control.getObject(i);
            	logger.info( "position "+ i+" = "  + obj);
             }
			
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
