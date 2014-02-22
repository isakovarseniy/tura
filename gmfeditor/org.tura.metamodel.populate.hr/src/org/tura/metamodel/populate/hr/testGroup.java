package org.tura.metamodel.populate.hr;

import java.util.ArrayList;

import org.tura.metamodel.commons.GroupBy;

public class testGroup {

	/**
	 * @param args
	 * @throws Exception 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) throws Exception {

		ArrayList  i = new ArrayList ();
		i.add(1);
		i.add(2);
		i.add(3);
		
		ArrayList  j = new ArrayList ();
		j.add(4);
		j.add(5);
		j.add(6);
		
		
		ArrayList  k = new ArrayList ();
		k.add("1");
		k.add("2");
		k.add("3");

		
		GroupBy g = new GroupBy();
		
		g.add("a. b .  c ", i);
		g.add("a.b.c", j);
		
		g.add("a.b .k ", k);

		Object q =  g.getValue("a.t.c");
		GroupBy qq = g .getGroup("a.b");
		
		
		System.out.println(g.getValue("a.b.c"));
		System.out.println(g.getKeys());
		System.out.println(qq.getKeys());
		
		
	}

}
