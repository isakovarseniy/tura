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
package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.IDataControl;

public interface IBeanFactory {
    public String DEPARTMENTTABLE = "tura4764435e_ca02_4771_a456_6454cada2e94";
    public String EMPLFILES = "tura50f32416_d7ec_41a5_8d7e_405950accbfb";
    public String CONTENTTABLE = "turaf4a4f9dd_de14_42f5_b3bf_1b844653672f";
    public String MAINWINDOW = "turac5f8ac47_356e_4c17_84db_fcf0a5037ca7";
    public String COMPANIES = "tura92ea6c50_dc39_4ba0_bb76_b3ca2e161fe5";
    public String ADDCOMPANY = "tura0233c086_c837_4de8_8900_8b4bb37ced89";
    public String DELCOMPANY = "tura71ffc838_d31e_458b_a18c_3cd49a7efdff";
    public String CREATCOMPANY = "turaa5f90e65_8465_4af8_8ac9_94fba49921ee";
    public String LOCATIONTREE = "turabee23d39_6e59_450f_b696_94cf4c907c86";
    public String ENGLANG = "turaed151a05_5f94_4ab8_827b_96de40759880";
    public String RUSLANG = "turadf481ec2_53e2_40d2_b2ce_fbbb92314208";
    public String MENU = "tura0d49659c_2bb0_4b6f_91a5_3b3da26b6ee7";
    public String EMPLOYINFO = "tura4211cd6a_7dcd_46df_b7b2_9d49c374e0ce";
    public String EMPLOYEETABLE = "turaef04d378_387f_4d8b_9d9c_631f54604252";
    public String EMPLINFO = "tura9f4fda7f_de98_41ad_85de_027aacc547ff";
    public String VEHICLETABLE = "turaa623d141_e215_4d11_96f0_c4f0ed1df6db";
    public String LOGINPAGE = "turabd3e208c_2939_43df_80e6_b18a01db3f98";
    public String USER = "tura0edf522f_a0f5_4a3c_9ce1_6f610063f089";
    public String SIGNIN = "tura46173954_6415_4e2d_bab3_0d307b301f2e";
    public String PASSWORD = "tura5dcaf7d1_e8a5_4b16_a53b_190872877b1f";
    public String POPUPCOMPAMYDETAILS =
        "tura3e4d834d_18ff_49eb_8009_86affb9fff51";
    public String LB1 = "tura553ac141_9292_4bcb_92a6_4e2cadb9a5f6";
    public String CMPNAME = "turaa343ffab_51c0_448b_aff9_a1711681e32f";
    public String DESK = "tura83a48362_b526_4c40_8830_1409325b4726";
    public String MSG1 = "tura04f18521_e6ee_4bf5_b368_46be7e67892e";
    public String MSG2 = "tura7f2833a3_2392_4b4a_b8cd_20b56f2dea71";
    public String OK = "tura80f38c36_1479_42e3_8640_b78c8efd111f";
    public String CANCEL = "tura20e5f690_a78c_4a85_8baf_bb6a51bfa642";
    public String DETAILS = "turace2aedb4_2308_40d7_b9aa_c9819da6e0f4";

    public Long getCmpId();

    public void setCmpId(Long cmpId);

    public String getVar1();

    public void setVar1(String var1);

    public IDataControl getCompany()
        throws org.tura.platform.datacontrol.commons.TuraException;

    public IDataControl getPopupCompanyDCProvider()
        throws org.tura.platform.datacontrol.commons.TuraException;

    public IDataControl getUser()
        throws org.tura.platform.datacontrol.commons.TuraException;

    public IDataControl getTreeRootCountry()
        throws org.tura.platform.datacontrol.commons.TuraException;

    public IDataControl getDepartment()
        throws org.tura.platform.datacontrol.commons.TuraException;

    public IDataControl getEmployee()
        throws org.tura.platform.datacontrol.commons.TuraException;

    public IDataControl getVehicle()
        throws org.tura.platform.datacontrol.commons.TuraException;

    public IDataControl getTreeRootFiles()
        throws org.tura.platform.datacontrol.commons.TuraException;
}
