/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.hr.init;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.jpa.simple.model.EmployeeJPA;


public class EmployesesInit {

	private EntityManager em;

	public EmployesesInit(EntityManager em) {
		this.em = em;
	}

	public void init() throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat(
				"dd-MMM-yy");
		em.getTransaction().begin();
		create( (long)100,(long)100,"Steven","King","SKING","515.123.4567",format.parse("17-Jun-87"),"AD_PRES",(float)24000,null,null,(long)10);
		create( (long)101,(long)101,"Neena","Kochhar","NKOCHHAR","515.123.4568",format.parse("21-Sep-89"),"AD_VP",(float)17000,null,(long)100,(long)10);
		create( (long)102,(long)102,"Lex","De Haan","LDEHAAN","515.123.4569",format.parse("13-Jan-93"),"AD_VP",(float)17000,null,(long)100,(long)10);
		create( (long)103,(long)103,"Alexander","Hunold","AHUNOLD","590.423.4567",format.parse("03-Jan-90"),"IT_PROG",(float)9000,null,(long)102,(long)10);
		create( (long)104,(long)104,"Bruce","Ernst","BERNST","590.423.4568",format.parse("21-May-91"),"IT_PROG",(float)6000,null,(long)103,(long)10);
		create( (long)105,(long)105,"David","Austin","DAUSTIN","590.423.4569",format.parse("25-Jun-97"),"IT_PROG",(float)4800,null,(long)103,(long)10);
		create( (long)106,(long)106,"Valli","Pataballa","VPATABAL","590.423.4560",format.parse("05-Feb-98"),"IT_PROG",(float)4800,null,(long)103,(long)10);
		create( (long)107,(long)107,"Diana","Lorentz","DLORENTZ","590.423.5567",format.parse("07-Feb-99"),"IT_PROG",(float)4200,null,(long)103,(long)10);
		create( (long)108,(long)108,"Nancy","Greenberg","NGREENBE","515.124.4569",format.parse("17-Aug-94"),"FI_MGR",(float)12000,null,(long)101,(long)100);
		create( (long)109,(long)109,"Daniel","Faviet","DFAVIET","515.124.4169",format.parse("16-Aug-94"),"FI_ACCOUNT",(float)9000,null,(long)108,(long)100);
		create( (long)110,(long)110,"John","Chen","JCHEN","515.124.4269",format.parse("28-Sep-97"),"FI_ACCOUNT",(float)8200,null,(long)108,(long)100);
		create( (long)111,(long)111,"Ismael","Sciarra","ISCIARRA","515.124.4369",format.parse("30-Sep-97"),"FI_ACCOUNT",(float)7700,null,(long)108,(long)100);
		create( (long)112,(long)112,"Jose Manuel","Urman","JMURMAN","515.124.4469",format.parse("07-Mar-98"),"FI_ACCOUNT",(float)7800,null,(long)108,(long)100);
		create( (long)113,(long)113,"Luis","Popp","LPOPP","515.124.4567",format.parse("07-Dec-99"),"FI_ACCOUNT",(float)6900,null,(long)108,(long)100);
		create( (long)114,(long)114,"Den","Raphaely","DRAPHEAL","515.127.4561",format.parse("07-Dec-94"),"PU_MAN",(float)11000,null,(long)100,(long)30);
		create( (long)115,(long)115,"Alexander","Khoo","AKHOO","515.127.4562",format.parse("18-May-95"),"PU_CLERK",(float)3100,null,(long)114,(long)30);
		create( (long)116,(long)116,"Shelli","Baida","SBAIDA","515.127.4563",format.parse("24-Dec-97"),"PU_CLERK",(float)2900,null,(long)114,(long)30);
		create( (long)117,(long)117,"Sigal","Tobias","STOBIAS","515.127.4564",format.parse("24-Jul-97"),"PU_CLERK",(float)2800,null,(long)114,(long)30);
		create( (long)118,(long)118,"Guy","Himuro","GHIMURO","515.127.4565",format.parse("15-Nov-98"),"PU_CLERK",(float)2600,null,(long)114,(long)30);
		create( (long)119,(long)119,"Karen","Colmenares","KCOLMENA","515.127.4566",format.parse("10-Aug-99"),"PU_CLERK",(float)2500,null,(long)114,(long)30);
		create( (long)120,(long)120,"Matthew","Weiss","MWEISS","650.123.1234",format.parse("18-Jul-96"),"ST_MAN",(float)8000,null,(long)100,(long)50);
		create( (long)121,(long)121,"Adam","Fripp","AFRIPP","650.123.2234",format.parse("10-Apr-97"),"ST_MAN",(float)8200,null,(long)100,(long)50);
		create( (long)122,(long)122,"Payam","Kaufling","PKAUFLIN","650.123.3234",format.parse("01-May-95"),"ST_MAN",(float)7900,null,(long)100,(long)50);
		create( (long)123,(long)123,"Shanta","Vollman","SVOLLMAN","650.123.4234",format.parse("10-Oct-97"),"ST_MAN",(float)6500,null,(long)100,(long)50);
		create( (long)124,(long)124,"Kevin","Mourgos","KMOURGOS","650.123.5234",format.parse("16-Nov-99"),"ST_MAN",(float)5800,null,(long)100,(long)50);
		create( (long)125,(long)125,"Julia","Nayer","JNAYER","650.124.1214",format.parse("16-Jul-97"),"ST_CLERK",(float)3200,null,(long)120,(long)50);
		create( (long)126,(long)126,"Irene","Mikkilineni","IMIKKILI","650.124.1224",format.parse("28-Sep-98"),"ST_CLERK",(float)2700,null,(long)120,(long)50);
		create( (long)127,(long)127,"James","Landry","JLANDRY","650.124.1334",format.parse("14-Jan-99"),"ST_CLERK",(float)2400,null,(long)120,(long)50);
		create( (long)128,(long)128,"Steven","Markle","SMarKLE","650.124.1434",format.parse("08-Mar-00"),"ST_CLERK",(float)2200,null,(long)120,(long)50);
		create( (long)129,(long)129,"Laura","Bissot","LBISSOT","650.124.5234",format.parse("20-Aug-97"),"ST_CLERK",(float)3300,null,(long)121,(long)50);
		create( (long)130,(long)130,"Mozhe","Atkinson","MATKINSO","650.124.6234",format.parse("30-Oct-97"),"ST_CLERK",(float)2800,null,(long)121,(long)50);
		create( (long)131,(long)131,"James","Marlow","JAMRLOW","650.124.7234",format.parse("16-Feb-97"),"ST_CLERK",(float)2500,null,(long)121,(long)50);
		create( (long)132,(long)132,"TJ","Olson","TJOLSON","650.124.8234",format.parse("10-Apr-99"),"ST_CLERK",(float)2100,null,(long)121,(long)50);
		create( (long)133,(long)133,"Jason","Mallin","JMALLIN","650.127.1934",format.parse("14-Jun-96"),"ST_CLERK",(float)3300,null,(long)122,(long)50);
		create( (long)134,(long)134,"Michael","Rogers","MROGERS","650.127.1834",format.parse("26-Aug-98"),"ST_CLERK",(float)2900,null,(long)122,(long)50);
		create( (long)135,(long)135,"Ki","Gee","KGEE","650.127.1734",format.parse("12-Dec-99"),"ST_CLERK",(float)2400,null,(long)122,(long)50);
		create( (long)136,(long)136,"Hazel","Philtanker","HPHILTAN","650.127.1634",format.parse("06-Feb-00"),"ST_CLERK",(float)2200,null,(long)122,(long)50);
		create( (long)137,(long)137,"Renske","Ladwig","RLADWIG","650.121.1234",format.parse("14-Jul-95"),"ST_CLERK",(float)3600,null,(long)123,(long)50);
		create( (long)138,(long)138,"Stephen","Stiles","SSTILES","650.121.2034",format.parse("26-Oct-97"),"ST_CLERK",(float)3200,null,(long)123,(long)50);
		create( (long)139,(long)139,"John","Seo","JSEO","650.121.2019",format.parse("12-Feb-98"),"ST_CLERK",(float)2700,null,(long)123,(long)50);
		create( (long)140,(long)140,"Joshua","Patel","JPATEL","650.121.1834",format.parse("06-Apr-98"),"ST_CLERK",(float)2500,null,(long)123,(long)50);
		create( (long)141,(long)141,"Trenna","Rajs","TRAJS","650.121.8009",format.parse("17-Oct-95"),"ST_CLERK",(float)3500,null,(long)124,(long)50);
		create( (long)142,(long)142,"Curtis","Davies","CDAVIES","650.121.2994",format.parse("29-Jan-97"),"ST_CLERK",(float)3100,null,(long)124,(long)50);
		create( (long)143,(long)143,"Randall","Matos","RMATOS","650.121.2874",format.parse("15-Mar-98"),"ST_CLERK",(float)2600,null,(long)124,(long)50);
		create( (long)144,(long)144,"Peter","Vargas","PVARGAS","650.121.2004",format.parse("09-Jul-98"),"ST_CLERK",(float)2500,null,(long)124,(long)50);
		create( (long)145,(long)145,"John","Russell","JRUSSEL","011.44.1344.429268",format.parse("01-Oct-96"),"SA_MAN",(float)14000,(float)0.4,(long)100,(long)80);
		create( (long)146,(long)146,"Karen","Partners","KPARTNER","011.44.1344.467268",format.parse("05-Jan-97"),"SA_MAN",(float)13500,(float)0.3,(long)100,(long)80);
		create( (long)147,(long)147,"Alberto","Errazuriz","AERRAZUR","011.44.1344.429278",format.parse("10-Mar-97"),"SA_MAN",(float)12000,(float)0.3,(long)100,(long)80);
		create( (long)148,(long)148,"Gerald","Cambrault","GCAMBRAU","011.44.1344.619268",format.parse("15-Oct-99"),"SA_MAN",(float)11000,(float)0.3,(long)100,(long)80);
		create( (long)149,(long)149,"Eleni","Zlotkey","EZLOTKEY","011.44.1344.429018",format.parse("29-Jan-00"),"SA_MAN",(float)10500,(float)0.2,(long)100,(long)80);
		create((long) 150,(long)150,"Peter","Tucker","PTUCKER","011.44.1344.129268",format.parse("30-Jan-97"),"SA_REP",(float)10000,(float)0.3,(long)145,(long)80);
		create( (long)151,(long)151,"David","Bernstein","DBERNSTE","011.44.1344.345268",format.parse("24-Mar-97"),"SA_REP",(float)9500,(float)0.25,(long)145,(long)80);
		create( (long)152,(long)152,"Peter","Hall","PHALL","011.44.1344.478968",format.parse("20-Aug-97"),"SA_REP",(float)9000,(float)0.25,(long)145,(long)80);
		create( (long)153,(long)153,"Christopher","Olsen","COLSEN","011.44.1344.498718",format.parse("30-Mar-98"),"SA_REP",(float)8000,(float)0.2,(long)145,(long)80);
		create( (long)154,(long)154,"Nanette","Cambrault","NCAMBRAU","011.44.1344.987668",format.parse("09-Dec-98"),"SA_REP",(float)7500,(float)0.2,(long)145,(long)80);
		create( (long)155,(long)155,"Oliver","Tuvault","OTUVAULT","011.44.1344.486508",format.parse("23-Nov-99"),"SA_REP",(float)7000,(float)0.15,(long)145,(long)80);
		create( (long)156,(long)156,"Janette","King","JKING","011.44.1345.429268",format.parse("30-Jan-96"),"SA_REP",(float)10000,(float)0.35,(long)146,(long)80);
		create( (long)157,(long)157,"Patrick","Sully","PSULLY","011.44.1345.929268",format.parse("04-Mar-96"),"SA_REP",(float)9500,(float)0.35,(long)146,(long)80);
		create( (long)158,(long)158,"Allan","McEwen","AMCEWEN","011.44.1345.829268",format.parse("01-Aug-96"),"SA_REP",(float)9000,(float)0.35,(long)146,(long)80);
		create( (long)159,(long)159,"Lindsey","Smith","LSMITH","011.44.1345.729268",format.parse("10-Mar-97"),"SA_REP",(float)8000,(float)0.3,(long)146,(long)80);
		create( (long)160,(long)160,"Louise","Doran","LDORAN","011.44.1345.629268",format.parse("15-Dec-97"),"SA_REP",(float)7500,(float)0.3,(long)146,(long)80);
		create( (long)161,(long)161,"Sarath","Sewall","SSEWALL","011.44.1345.529268",format.parse("03-Nov-98"),"SA_REP",(float)7000,(float)0.25,(long)146,(long)80);
		create( (long)162,(long)162,"Clara","Vishney","CVISHNEY","011.44.1346.129268",format.parse("11-Nov-97"),"SA_REP",(float)10500,(float)0.25,(long)147,(long)80);
		create( (long)163,(long)163,"Danielle","Greene","DGREENE","011.44.1346.229268",format.parse("19-Mar-99"),"SA_REP",(float)9500,(float)0.15,(long)147,(long)80);
		create((long) 164,(long)164,"Mattea","Marvins","MMarVINS","011.44.1346.329268",format.parse("24-Jan-00"),"SA_REP",(float)7200,(float)0.1,(long)147,(long)80);
		create( (long)165,(long)165,"David","Lee","DLEE","011.44.1346.529268",format.parse("23-Feb-00"),"SA_REP",(float)6800,(float)0.1,(long)147,(long)80);
		create( (long)166,(long)166,"Sundar","Ande","SANDE","011.44.1346.629268",format.parse("24-Mar-00"),"SA_REP",(float)6400,(float)0.1,(long)147,(long)80);
		create( (long)167,(long)167,"Amit","Banda","ABANDA","011.44.1346.729268",format.parse("21-Apr-00"),"SA_REP",(float)6200,(float)0.1,(long)147,(long)80);
		create( (long)168,(long)168,"Lisa","Ozer","LOZER","011.44.1343.929268",format.parse("11-Mar-97"),"SA_REP",(float)11500,(float)0.25,(long)148,(long)80);
		create( (long)169,(long)169,"Harrison","Bloom","HBLOOM","011.44.1343.829268",format.parse("23-Mar-98"),"SA_REP",(float)10000,(float)0.2,(long)148,(long)80);
		create( (long)170,(long)170,"Tayler","Fox","TFOX","011.44.1343.729268",format.parse("24-Jan-98"),"SA_REP",(float)9600,(float)0.2,(long)148,(long)80);
		create( (long)171,(long)171,"William","Smith","WSMITH","011.44.1343.629268",format.parse("23-Feb-99"),"SA_REP",(float)7400,(float)0.15,(long)148,(long)80);
		create( (long)172,(long)172,"Elizabeth","Bates","EBATES","011.44.1343.529268",format.parse("24-Mar-99"),"SA_REP",(float)7300,(float)0.15,(long)148,(long)80);
		create( (long)173,(long)173,"Sundita","Kumar","SKUMar","011.44.1343.329268",format.parse("21-Apr-00"),"SA_REP",(float)6100,(float)0.1,(long)148,(long)80);
		create( (long)174,(long)174,"Ellen","Abel","EABEL","011.44.1644.429267",format.parse("11-May-96"),"SA_REP",(float)11000,(float)0.3,(long)149,(long)80);
		create( (long)175,(long)175,"Alyssa","Hutton","AHUTTON","011.44.1644.429266",format.parse("19-Mar-97"),"SA_REP",(float)8800,(float)0.25,(long)149,(long)80);
		create( (long)176,(long)176,"Jonathon","Taylor","JTAYLOR","011.44.1644.429265",format.parse("24-Mar-98"),"SA_REP",(float)8600,(float)0.2,(long)149,(long)80);
		create( (long)177,(long)177,"Jack","Livingston","JLIVINGS","011.44.1644.429264",format.parse("23-Apr-98"),"SA_REP",(float)8400,(float)0.2,(long)149,(long)80);
		create( (long)178,(long)178,"Kimberely","Grant","KGRANT","011.44.1644.429263",format.parse("24-May-99"),"SA_REP",(float)7000,(float)0.15,(long)149,null);
		create( (long)179,(long)179,"Charles","Johnson","CJOHNSON","011.44.1644.429262",format.parse("04-Jan-00"),"SA_REP",(float)6200,(float)0.1,(long)149,(long)80);
		create( (long)180,(long)180,"Winston","Taylor","WTAYLOR","650.507.9876",format.parse("24-Jan-98"),"SH_CLERK",(float)3200,null,(long)120,(long)50);
		create( (long)181,(long)181,"Jean","Fleaur","JFLEAUR","650.507.9877",format.parse("23-Feb-98"),"SH_CLERK",(float)3100,null,(long)120,(long)50);
		create( (long)182,(long)182,"Martha","Sullivan","MSULLIVA","650.507.9878",format.parse("21-Jun-99"),"SH_CLERK",(float)2500,null,(long)120,(long)50);
		create( (long)183,(long)183,"Girard","Geoni","GGEONI","650.507.9879",format.parse("03-Feb-00"),"SH_CLERK",(float)2800,null,(long)120,(long)50);
		create( (long)184,(long)184,"Nandita","Sarchand","NSARCHAN","650.509.1876",format.parse("27-Jan-96"),"SH_CLERK",(float)4200,null,(long)121,(long)50);
		create( (long)185,(long)185,"Alexis","Bull","ABULL","650.509.2876",format.parse("20-Feb-97"),"SH_CLERK",(float)4100,null,(long)121,(long)50);
		create( (long)186,(long)186,"Julia","Dellinger","JDELLING","650.509.3876",format.parse("24-Jun-98"),"SH_CLERK",(float)3400,null,(long)121,(long)50);
		create( (long)187,(long)187,"Anthony","Cabrio","ACABRIO","650.509.4876",format.parse("07-Feb-99"),"SH_CLERK",(float)3000,null,(long)121,(long)50);
		create( (long)188,(long)188,"Kelly","Chung","KCHUNG","650.505.1876",format.parse("14-Jun-97"),"SH_CLERK",(float)3800,null,(long)122,(long)50);
		create( (long)189,(long)189,"Jennifer","Dilly","JDILLY","650.505.2876",format.parse("13-Aug-97"),"SH_CLERK",(float)3600,null,(long)122,(long)50);
		create( (long)190,(long)190,"Timothy","Gates","TGATES","650.505.3876",format.parse("11-JUL-98"),"SH_CLERK",(float)2900,null,(long)122,(long)50);
		create( (long)191,(long)191,"Randall","Perkins","RPERKINS","650.505.4876",format.parse("19-Dec-99"),"SH_CLERK",(float)2500,null,(long)122,(long)50);
		create( (long)192,(long)192,"Sarah","Bell","SBELL","650.501.1876",format.parse("04-Feb-96"),"SH_CLERK",(float)4000,null,(long)123,(long)50);
		create( (long)193,(long)193,"Britney","Everett","BEVERETT","650.501.2876",format.parse("03-Mar-97"),"SH_CLERK",(float)3900,null,(long)123,(long)50);
		create( (long)194,(long)194,"Samuel","McCain","SMCCAIN","650.501.3876",format.parse("01-JUL-98"),"SH_CLERK",(float)3200,null,(long)123,(long)50);
		create( (long)195,(long)195,"Vance","Jones","VJONES","650.501.4876",format.parse("17-Mar-99"),"SH_CLERK",(float)2800,null,(long)123,(long)50);
		create( (long)196,(long)196,"Alana","Walsh","AWALSH","650.507.9811",format.parse("24-Apr-98"),"SH_CLERK",(float)3100,null,(long)124,(long)50);
		create( (long)197,(long)197,"Kevin","Feeney","KFEENEY","650.507.9822",format.parse("23-May-98"),"SH_CLERK",(float)3000,null,(long)124,(long)50);
		create( (long)198,(long)198,"Donald","OConnell","DOCONNEL","650.507.9833",format.parse("21-Jun-99"),"SH_CLERK",(float)2600,null,(long)124,(long)50);
		create( (long)199,(long)199,"Douglas","Grant","DGRANT","650.507.9844",format.parse("13-Jan-00"),"SH_CLERK",(float)2600,null,(long)124,(long)50);
		create( (long)200,(long)200,"Jennifer","Whalen","JWHALEN","515.123.4444",format.parse("17-Sep-87"),"AD_ASST",(float)4400,null,(long)101,(long)10);
		create( (long)201,(long)201,"Michael","Hartstein","MHARTSTE","515.123.5555",format.parse("17-Feb-96"),"MK_MAN",(float)13000,null,(long)100,(long)20);
		create( (long)202,(long)202,"Pat","Fay","PFAY","603.123.6666",format.parse("17-Aug-97"),"MK_REP",(float)6000,null,(long)201,(long)20);
		create( (long)203,(long)203,"Susan","Mavris","SMAVRIS","515.123.7777",format.parse("07-Jun-94"),"REP",(float)6500,null,(long)101,(long)40);
		create( (long)204,(long)204,"Hermann","Baer","HBAER","515.123.8888",format.parse("07-Jun-94"),"PR_REP",(float)10000,null,(long)101,(long)70);
		create( (long)205, (long)205,"Shelley","Higgins","SHIGGINS","515.123.8080",format.parse("07-Jun-94"),"AC_MGR",(float)12000,null,(long)101,(long)110);
		em.getTransaction().commit();

	}

	private void create(Long obj_id, Long employeeid,String firstname,String lastname,String email, String phonenumber,Date hiredate,String jobid,Float salary, Float commissionpct, Long managerid, Long departmentid) {
		EmployeeJPA emp = new EmployeeJPA();
		emp.setObjId(obj_id);
		emp.setEmployeeId(employeeid);
		emp.setFirstName(firstname);
		emp.setLastName(lastname);
		emp.setEmail(email);
		emp.setPhoneNumber(phonenumber);
		emp.setHireDate(hiredate);
		emp.setSalary(salary);
		emp.setCommissionPct(commissionpct);
		emp.setManagerId(managerid);
		emp.setDepartmentId(departmentid);
		emp.setParentId(departmentid);
		em.persist(emp);

	}

}
