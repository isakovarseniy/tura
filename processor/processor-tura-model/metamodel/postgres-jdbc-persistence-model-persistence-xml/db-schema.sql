-- 
--   Tura - Application generation solution
--
--   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
--
--
--   This project includes software developed by Arseniy Isakov
--   https://github.com/isakovarseniy/tura
--   All rights reserved. This program and the accompanying materials
--   are made available under the terms of the Eclipse Public License v2.0
--   which accompanies this distribution, and is available at
--   http://www.eclipse.org/legal/epl-v20.html
-- 

    alter table tura.APPLICATION 
       drop constraint FK1uxlt4nh6gddjtgq8db0dcd51;

    alter table tura.APPLICATION 
       drop constraint FK5atlnlgt1cji1y8fqaau6j2if;

    alter table tura.APPLICATIONGROUP 
       drop constraint FK23uxkdis540139p4kpkdbf5s0;

    alter table tura.APPLICATIONGROUP 
       drop constraint FKbjr79mm0s1ax8famj7kc6myof;

    alter table tura.APPLICATIONINFRASTRUCTURELAYER 
       drop constraint FKggbpln1f2dh5xnk9umy6kq3p1;

    alter table tura.APPLICATIONINFRASTRUCTURELAYER 
       drop constraint FKrdnle5ktfmglylx4972yr2o8e;

    alter table tura.APPLICATIONINFRASTRUCTURELAYERS 
       drop constraint FKe99ec9tyw6ritiqq3dl3flf9t;

    alter table tura.APPLICATIONINFRASTRUCTURELAYERS 
       drop constraint FKb1iwbv7gf3fmx0cm615yjy0by;

    alter table tura.APPLICATIONLANGUAGES 
       drop constraint FK1yes90gbo1o488ydir2j3gaiw;

    alter table tura.APPLICATIONLANGUAGES 
       drop constraint FK33ldswebjqsuqo8auw3qnc1qs;

    alter table tura.APPLICATIONMAPPER 
       drop constraint FKsp8kct8ljlfm5qpj88l3bayso;

    alter table tura.APPLICATIONMAPPER 
       drop constraint FKpery4l2njtyucarec7qi74w3c;

    alter table tura.APPLICATIONMAPPERS 
       drop constraint FKbt7x1hc53x6lp3fylax41ifh8;

    alter table tura.APPLICATIONMAPPERS 
       drop constraint FKp70rnwiv8nr6cdpgy21g8ncdy;

    alter table tura.APPLICATIONMESSAGELIBRARIES 
       drop constraint FKd0g69uyakwddi44qit42x4bhj;

    alter table tura.APPLICATIONMESSAGELIBRARIES 
       drop constraint FKrscxntnce5ug3188e2etceicg;

    alter table tura.APPLICATIONMESSAGELIBRARY 
       drop constraint FKcdscnc3n79a8ia2kumcubpgq7;

    alter table tura.APPLICATIONMESSAGELIBRARY 
       drop constraint FKko0n651qhfgc07yq8lmp6pkjo;

    alter table tura.APPLICATIONREALM 
       drop constraint FK8lydo5iscj7jsr2qph824lrsk;

    alter table tura.APPLICATIONREALM 
       drop constraint FK5a3phi8kxt3x1mw9v5vrcr023;

    alter table tura.APPLICATIONREALMS 
       drop constraint FK8tjcysjet45h1b8h8yee8nn6e;

    alter table tura.APPLICATIONREALMS 
       drop constraint FK2v7qhs8ump37kjm09u5ntjj7w;

    alter table tura.APPLICATIONRECIPE 
       drop constraint FK3gds2bnub2ha4hhoqpncnsv2e;

    alter table tura.APPLICATIONRECIPE 
       drop constraint FKeh6kyrsiin2vv79nklhjic7rg;

    alter table tura.APPLICATIONRECIPES 
       drop constraint FKdxo54unemdalvk23ge8ytktpq;

    alter table tura.APPLICATIONRECIPES 
       drop constraint FKbl4sgfwxff3tpqv48nyxeqr71;

    alter table tura.APPLICATIONSTYLE 
       drop constraint FKfqkvppi87xu7y0oy32i3c0feo;

    alter table tura.APPLICATIONSTYLE 
       drop constraint FK2590mo22yynsq33agysdb90hn;

    alter table tura.APPLICATIONSTYLELIBRARIES 
       drop constraint FK3t6aop87b8tdgekfepyt072th;

    alter table tura.APPLICATIONSTYLELIBRARIES 
       drop constraint FKm4x5y0i3dc9s1crv0twusxssd;

    alter table tura.APPLICATIONUILAYER 
       drop constraint FK5n7efyt465hr5vrvk22ot1bkn;

    alter table tura.APPLICATIONUILAYER 
       drop constraint FK83lecstg3f0q45q53u39si0x9;

    alter table tura.APPLICATIONUIPACKAGE 
       drop constraint FKqlykg39fvncrcvcyefbqhshiw;

    alter table tura.APPLICATIONUIPACKAGE 
       drop constraint FKstjlm4bhyj4i8omdpw19hqh90;

    alter table tura.AREAREF 
       drop constraint FKma0ydn419tg4000fvdmdqaacb;

    alter table tura.AREAREF 
       drop constraint FKr1sc7o5l9ok4qmwgjqx3n6nbx;

    alter table tura.AREAREF 
       drop constraint FKl1hm0854tcukdwnr3hn00e48a;

    alter table tura.AREAREF 
       drop constraint FKme7mclsvpbrv4yn53225tm5lj;

    alter table tura.AREAREF 
       drop constraint FK7q05dcq55fy6i077ia07pgno8;

    alter table tura.AREAREF 
       drop constraint FK3r3n99sd2hw2rc2oajer0o4pd;

    alter table tura.AREAREF 
       drop constraint FKi0hb3o7ne0elxheoj53faaycv;

    alter table tura.ARTIFACT 
       drop constraint FKs1au6cae5sphedvuj83h43mkp;

    alter table tura.ARTIFACT 
       drop constraint FKiahtxwbanhyueng8snxhpw2oy;

    alter table tura.ARTIFACTGROUP 
       drop constraint FKixhskgptuchu8fu2hx4tadc8q;

    alter table tura.ARTIFACTGROUP 
       drop constraint FKorhmjxlhwyfi9w8moakvq7t1p;

    alter table tura.ARTIFACTREF 
       drop constraint FKbh4ia6i5cqsmb7ijay4kd6v64;

    alter table tura.ARTIFICIALFIELD 
       drop constraint FKtiu4uesb9edi28pd7er3co9o7;

    alter table tura.ARTIFICIALFIELD 
       drop constraint FK247r71ulfwxsf7jfl8y1ke8hk;

    alter table tura.ARTIFICIALFIELD 
       drop constraint FK4k3cn136cnrvv82m0r7io2d0q;

    alter table tura.ATTRIBUTE 
       drop constraint FKfi98y1ld38tiqd785k621had8;

    alter table tura.ATTRIBUTE 
       drop constraint FKmrosmnhpkpgjera9ujc3edp1u;

    alter table tura.ATTRIBUTE 
       drop constraint FKkjujmo6mfre3kex2cisi4fclx;

    alter table tura.ATTRIBUTE 
       drop constraint FKftu1hlggdm2emcrjslknnc967;

    alter table tura.ATTRIBUTECONNECTOR 
       drop constraint FKcqh8h3nk3wnmyriomoeoc2h3f;

    alter table tura.ATTRIBUTECONNECTOR 
       drop constraint FK9qy0o49h84yudp2uaqq9lotgv;

    alter table tura.ATTRIBUTECONNECTOR 
       drop constraint FKqx6b0h1jnggmqxwvierxt2qqd;

    alter table tura.ATTRIBUTECONNECTOR 
       drop constraint FK5e7jvcmryfnw24ycgrfab9fga;

    alter table tura.ATTRIBUTECONNECTOR 
       drop constraint FKcy5ivqlm7l8n1nyb4uj6l5mu7;

    alter table tura.ATTRIBUTEPOINTER 
       drop constraint FK9fo3bfwgwmqatd52s0d3nu364;

    alter table tura.ATTRIBUTEPOINTER 
       drop constraint FKl9wmitn927dejpyq0bh65r1b0;

    alter table tura.ATTRIBUTEPOINTER 
       drop constraint FK659if0g844ilbecxisafa3bir;

    alter table tura.CALCULATEDFIELD 
       drop constraint FKh3i0hfkiuuu8214rweocviuui;

    alter table tura.CALCULATEDFIELD 
       drop constraint FKg4qxidlkk7kydesiyrd7v7lkj;

    alter table tura.CALCULATEDFIELD 
       drop constraint FK4y1qg05n962mtglsn40498i5o;

    alter table tura.CALCULATEDFIELD 
       drop constraint FKbwd7xdwvdeg5k7xs063v6dnu2;

    alter table tura.CALCULATEDFIELD 
       drop constraint FK2e5lp9xiw695fltehavpnt9c;

    alter table tura.CANVASFRAME 
       drop constraint FKe9fov6mj4x9xl5d1o8sxbgeld;

    alter table tura.CANVASFRAME 
       drop constraint FKhiwtxxma88ttefw2y5vqkfk2r;

    alter table tura.CANVASFRAME 
       drop constraint FKddkla4ma50vl1227a8if9uvmb;

    alter table tura.CANVASFRAME 
       drop constraint FKsjkb6xlndbuq9og9j4s5vwdma;

    alter table tura.CANVASFRAME 
       drop constraint FKjkwpsrsdxnb2tudjwe5a9aedy;

    alter table tura.CANVASFRAME 
       drop constraint FKf443k8dbijpeuny53fjo3pbng;

    alter table tura.CANVASFRAME 
       drop constraint FKduuv4lx88l8b2frjohpgo5f0q;

    alter table tura.CANVASFRAME 
       drop constraint FK342vqsgee7lc6nx6p7vdd46yr;

    alter table tura.CANVASFRAME 
       drop constraint FKk4qvag66qb83k0j4i5ilhm7pm;

    alter table tura.CANVASFRAME 
       drop constraint FKlw2p5k7p8dxalbsvpp6bo6xpd;

    alter table tura.CANVASFRAME 
       drop constraint FKe2sv81q027m8uh02ltdse743a;

    alter table tura.CANVASFRAME 
       drop constraint FKd1oxnqyl5yj093q2nhvs5wras;

    alter table tura.CANVASFRAME 
       drop constraint FKj1mufxhndp82a73rig2fyf3rr;

    alter table tura.CLASSIFIER 
       drop constraint FK6ch6q1rfnw8bw8cyfhwat3f1t;

    alter table tura.CLASSIFIER 
       drop constraint FKo8x2ef4hfjp4w34r2475uifen;

    alter table tura.CLASSIFIER 
       drop constraint FK56rg5ewctno5ulkkqqxsct5ke;

    alter table tura.COLUMN 
       drop constraint FKkgfn8bcl0381rncdgcwg2guwo;

    alter table tura.COLUMN 
       drop constraint FKav7r54hs6y4tbmuh0bkk30wco;

    alter table tura.COLUMN 
       drop constraint FK2d1e4v4mm93wxjspbm7e4rg3v;

    alter table tura.COLUMN 
       drop constraint FKrf3detmf6u0351w2b96yws4ad;

    alter table tura.COLUMN 
       drop constraint FK1ef4kb5n943s6kv4quy7fuj6h;

    alter table tura.COLUMN 
       drop constraint FKhtd36lieb63m2jj3ri0oxjww8;

    alter table tura.COLUMN 
       drop constraint FK6ipo91885dkre1durvlamc7h9;

    alter table tura.COLUMN 
       drop constraint FKq6aoma5qfc66e7fugbx0bfo1i;

    alter table tura.COLUMN 
       drop constraint FK8ekpptpj538ng9irm74gq2jwv;

    alter table tura.COMPONENT 
       drop constraint FKa74ujrkcbf7o0gu3qla0njra9;

    alter table tura.COMPONENT 
       drop constraint FKlbm2nfsvixx06wisuuussst2v;

    alter table tura.COMPONENT 
       drop constraint FKd4iwd39qg15b5366k34inp0fi;

    alter table tura.COMPONENT 
       drop constraint FKhtn00ie8lvrn6k4ymo1dj0j0v;

    alter table tura.COMPONENT 
       drop constraint FK3hqs77hqdii20osalf7gakdoe;

    alter table tura.COMPONENT 
       drop constraint FKpewok349oy3slk0fqgrmxjday;

    alter table tura.COMPONENT 
       drop constraint FKnkrf08hfeabrgjalwqp1is186;

    alter table tura.CONFIGEXTENSION 
       drop constraint FK8m7g4sogxigy6qlxgiwq50c03;

    alter table tura.CONFIGEXTENSION 
       drop constraint FKavhal30dex6akl7xnxvicx815;

    alter table tura.CONFIGEXTENSION 
       drop constraint FKpkp298cgg9twybdylo96hoj5q;

    alter table tura.CONFIGEXTENSION 
       drop constraint FK22uet4df0qsl89buek4tewpmb;

    alter table tura.CONFIGHASH 
       drop constraint FKca0tp3ncc1plnlix0uy2tf5ac;

    alter table tura.CONFIGHASH 
       drop constraint FKqp3erkqessy5oticfer5i8pew;

    alter table tura.CONFIGHASHWITHNICKNAME 
       drop constraint FKepbnr71mfpraq9w3s7dre068r;

    alter table tura.CONFIGHASHWITHNICKNAME 
       drop constraint FK3dkhr0s9i2ncp0gdsvun6ikat;

    alter table tura.CONFIGHASHWITHNICKNAME 
       drop constraint FK6wcadg8wjfkofcmawqr2wkh0b;

    alter table tura.CONFIGURATION 
       drop constraint FKnyd16hh2qnjk0o7gry9lwbxab;

    alter table tura.CONFIGURATION 
       drop constraint FKk2cc8d8411aii0abnm9k9db71;

    alter table tura.CONFIGVARIABLE 
       drop constraint FKil6nra1xicwrv0b9k6l2as19v;

    alter table tura.CONFIGVARIABLE 
       drop constraint FK6c02ep03immq88qv0i24vddn1;

    alter table tura.CONFIGVARIABLEWITHNICKNAME 
       drop constraint FKmo9rtr7srq4pwbn2rkqrwemc7;

    alter table tura.CONFIGVARIABLEWITHNICKNAME 
       drop constraint FKpuk5ieat9uutj1ipk8fl09f96;

    alter table tura.CONFIGVARIABLEWITHNICKNAME 
       drop constraint FKo6j1dorybrrqqf3sesq2h4pme;

    alter table tura.CONTEXTPARAMETER 
       drop constraint FKgj04sywrwvtaav1o2addhngto;

    alter table tura.CONTEXTPARAMETER 
       drop constraint FKikxbnc4c2mhek92tl9bfquush;

    alter table tura.CONTEXTPARAMETER 
       drop constraint FKmomyn82km7yyc0ns6v3byeanv;

    alter table tura.CONTEXTPARAMETERSOBJ 
       drop constraint FKlkpkc9musid6nijvs2xfte8ts;

    alter table tura.CONTEXTPARAMETERSOBJ 
       drop constraint FK5og79vkof6a5089qkesfv52l2;

    alter table tura.CONTEXTPARAMETERSOBJ 
       drop constraint FK6mmpryngq2pwehve6j6x7oss3;

    alter table tura.CONTEXTPARAMETERSOBJ 
       drop constraint FKijmwlwvjudx8j8mgcoxqgxajk;

    alter table tura.CONTEXTPARAMETERSOBJ 
       drop constraint FKlc6w77di6a7y1mth4v7tp0o67;

    alter table tura.CONTEXTVALUE 
       drop constraint FKipfkimn8t3hvv6ou2ooskrilh;

    alter table tura.CONTEXTVALUE 
       drop constraint FK2x9uxhh52o2orwjob6aqce1s9;

    alter table tura.CONTEXTVALUE 
       drop constraint FKobghc7abhxnq8s941ts7vv7u9;

    alter table tura.CONTEXTVALUE 
       drop constraint FKc39v2c4axoksfcrrhklv6qtjw;

    alter table tura.CONTEXTVALUE 
       drop constraint FKs8i11imdhsa8uga2ewey8f0k1;

    alter table tura.CONTEXTVALUE 
       drop constraint FK6oj968ld5mhay598g5o5sg1n6;

    alter table tura.CONTEXTVALUE 
       drop constraint FK2902ycmp2w583mah6d556ukgj;

    alter table tura.CONTEXTVALUE 
       drop constraint FKi5g1l5lfu6hut8lyksh2xjfkg;

    alter table tura.CONTEXTVALUE 
       drop constraint FKchhm3x70fi9tvdhsmjsma16g8;

    alter table tura.CONTEXTVALUE 
       drop constraint FK99ipp1v45vvmnh9et18lt0975;

    alter table tura.CONTEXTVALUE 
       drop constraint FKra5kfqhw4991wcs5q4nuwamds;

    alter table tura.CONTEXTVALUE 
       drop constraint FK82rjjg8qmku674jc4bh97pepu;

    alter table tura.CONTEXTVALUE 
       drop constraint FK2mj2mgbi9t6jamxxohq18ker2;

    alter table tura.CONTEXTVALUE 
       drop constraint FKa0uel26y48oc1wvtrog7kqrje;

    alter table tura.CONTROLPOINTER 
       drop constraint FKh3o23qcp8avml3g5pb8kr65y2;

    alter table tura.CONTROLPOINTER 
       drop constraint FK2rrnk71ne9ggqwo2i4xcjb08o;

    alter table tura.CONTROLPOINTER 
       drop constraint FKidf3k9m4q4ik1qk6o53yj9dp9;

    alter table tura.CONTROLPOINTER 
       drop constraint FKnr9rss4vumwi3e0dubtj7l22r;

    alter table tura.CONTROLS 
       drop constraint FKa925gegj0k45vwxis4si6vfip;

    alter table tura.CONTROLS 
       drop constraint FKcp9xqxwc0t8nnu01gptd7u0ok;

    alter table tura.CREATETRIGGER 
       drop constraint FK4494aim2hgtvi1h3l6ox2oj03;

    alter table tura.CREATETRIGGER 
       drop constraint FK5h4li3e0kkfu644ujk09l9v4y;

    alter table tura.CREATETRIGGER 
       drop constraint FKsntqc86h71n21u65vpq9l3i7t;

    alter table tura.CREATETRIGGER 
       drop constraint FKfutaofllh8mu2ma2c2bcv0d95;

    alter table tura.CREATETRIGGER 
       drop constraint FK8h6nkuuwyhekxm9l72u7qbsxm;

    alter table tura.CSSMAPPER 
       drop constraint FK3xsusgvwnv4q8hi3qnbs3laew;

    alter table tura.CSSMAPPER 
       drop constraint FKmfx13jpqq6dyo431s78dp4jcw;

    alter table tura.CSSMAPPER 
       drop constraint FKaogidfu6fnl2nhy6p5r4ksds5;

    alter table tura.DATACENTER 
       drop constraint FKkoeno7svk8w3wo44x6r5rno7h;

    alter table tura.DATACENTER 
       drop constraint FKmqjtj1bm7xcl2u60p88wm963b;

    alter table tura.DATACONTROL 
       drop constraint FKqxj3nht7qe3ojho9ixpjpos3c;

    alter table tura.DATACONTROL 
       drop constraint FKibm12lc0ba0030w4gjugan1tv;

    alter table tura.DATACONTROL 
       drop constraint FK4ydyyp3pbulnjwj9wrgq2lv5d;

    alter table tura.DELETETRIGGER 
       drop constraint FKn43qlkwk8i6qr433t7lxmc62e;

    alter table tura.DELETETRIGGER 
       drop constraint FKmp8yriai9ewuh0a5wpytbo1o8;

    alter table tura.DELETETRIGGER 
       drop constraint FK88p7uxn62kkuhvrsyrshkie6k;

    alter table tura.DELETETRIGGER 
       drop constraint FKp37r4oj5bk41c4d4kramdo4ur;

    alter table tura.DEPENDENCY 
       drop constraint FK5t5c363ly40hp6y8b1troerf3;

    alter table tura.DEPENDENCY 
       drop constraint FK6kdf7trqyeuy26td5obaxefpf;

    alter table tura.DEPENDENCY 
       drop constraint FKeq78vdx2u05nb0yw32x0yd2fe;

    alter table tura.DEPENDENCY 
       drop constraint FKfe497ywm4cvpw9ns9s8mc0qyn;

    alter table tura.DEPLOYMENTCOMPONENT 
       drop constraint FK9gsfehtrvoqciseqfq5drq712;

    alter table tura.DEPLOYMENTCOMPONENT 
       drop constraint FKgtv3fa5eamklkblvcwpxxkmw6;

    alter table tura.DEPLOYMENTCOMPONENT 
       drop constraint FKdqq1f92bkqm8cw8rben3mp3me;

    alter table tura.DEPLOYMENTCOMPONENT 
       drop constraint FKjqf0gfmpjuunudca5fq08rkxm;

    alter table tura.DEPLOYMENTSTARSTEP 
       drop constraint FK45e23laeb9ixgvyn024ngnhjp;

    alter table tura.DEPLOYMENTSTARSTEP 
       drop constraint FKh8tyingqqnh6gekqbc8ksaeld;

    alter table tura.DEPLOYMENTSTARSTEP 
       drop constraint FK5lkxv71tq800g1c7mwmlb4ga6;

    alter table tura.DOMAIN 
       drop constraint FKlvecges0q8tpbrnhttw2rj7p9;

    alter table tura.DOMAINAPPLICATION 
       drop constraint FKlvjol5lxp4bumio89suag8wp9;

    alter table tura.DOMAINAPPLICATION 
       drop constraint FKirxdqrp1xnbl6ieqbo6av8j2r;

    alter table tura.DOMAINAPPLICATIONS 
       drop constraint FKmutol0faogybx9ygwoq3req0j;

    alter table tura.DOMAINAPPLICATIONS 
       drop constraint FKs6u6km1higsoqi0e603op4olj;

    alter table tura.DOMAINARTIFACT 
       drop constraint FK3y4ov0627d3hvkru08ap0j0nj;

    alter table tura.DOMAINARTIFACT 
       drop constraint FKekpgjxnfulhq8s0ex1441mkwo;

    alter table tura.DOMAINARTIFACTS 
       drop constraint FKfsqn9xdhb43d3mb9y346hbapd;

    alter table tura.DOMAINARTIFACTS 
       drop constraint FKonimg6aqm9uqkolbxktvqcec8;

    alter table tura.DOMAINMAPPER 
       drop constraint FKo4afl6gerdm5nn5397a7oapqb;

    alter table tura.DOMAINMAPPER 
       drop constraint FKj3dp1mitvta1a4th0yjrli5t4;

    alter table tura.DOMAINMAPPERS 
       drop constraint FK85kl32sv66cp5jdqw7iqmsk9k;

    alter table tura.DOMAINMAPPERS 
       drop constraint FKn2e4mccnkc6i8g2ovgqbld7r;

    alter table tura.DOMAINTYPES 
       drop constraint FKdwck11lm27sc7h6hfrx4nu6fx;

    alter table tura.DOMAINTYPES 
       drop constraint FKc9a9k6388au7m5g35b5ev67th;

    alter table tura.DOMAINTYPESREPOSITORY 
       drop constraint FK32nuon2mv3hbuffshh5px3jpn;

    alter table tura.DOMAINTYPESREPOSITORY 
       drop constraint FK4ihffgp4mauio2nb7jtd5yn93;

    alter table tura.ENTERPRISEINFRASTRUCTURE 
       drop constraint FKkhk00fkhsoyeldonjfoxh8fb5;

    alter table tura.ENTERPRISEINFRASTRUCTURE 
       drop constraint FKottxuenmyfo49xnu0nxp2013t;

    alter table tura.ENUMATTRIBUTE 
       drop constraint FKbjaq08lgaigfadll8ylphuadh;

    alter table tura.ENUMATTRIBUTE 
       drop constraint FK2adh5ppglx5aoirgb0ookd865;

    alter table tura.ENUMATTRIBUTE 
       drop constraint FKn8o6msv7itnwmfp1igvbd3751;

    alter table tura.EXPRESSIONPART 
       drop constraint FKt2sywv4huf8lmns5aeuoewbl4;

    alter table tura.EXPRESSIONPART 
       drop constraint FKkhghbov8y9wved306lpwaco8a;

    alter table tura.EXPRESSIONPART 
       drop constraint FK44butki01ntydli4ge60l8aoc;

    alter table tura.FORM 
       drop constraint FKrauvf5hs1sqtolyewwdbj0c3l;

    alter table tura.FORM 
       drop constraint FKmpmmyvss4nfgo1bgshd5x65lm;

    alter table tura.FORMPARAMETER 
       drop constraint FKlg3mc6cqha7uvv9b8n1wdte42;

    alter table tura.FORMPARAMETER 
       drop constraint FKhpgwptycq279o4itu7pxxhl2k;

    alter table tura.FORMPARAMETER 
       drop constraint FK5pen584d3ih97mibmlysryoeo;

    alter table tura.FORMVARIABLE 
       drop constraint FK6lqa1aki200u5g3nmij8tnsh8;

    alter table tura.FORMVARIABLE 
       drop constraint FK5sar1sipn176tgyiqcb42vff8;

    alter table tura.FORMVARIABLE 
       drop constraint FK6lkpoyrtxowa1guctosu0n2s3;

    alter table tura.FORMVARIABLE 
       drop constraint FKf3uxjcv4ryspkmb93jdi78qq1;

    alter table tura.GENERATIONHINT 
       drop constraint FKd4bw7rgqkf87tgtgm0syg0xfe;

    alter table tura.GENERATIONHINT 
       drop constraint FKkn5bgn4gv1erdhvmk2wawhlga;

    alter table tura.GENERATIONHINTWITHNICKNAME 
       drop constraint FKrrqg5yqg8ft1a4rneb1i02ar9;

    alter table tura.GENERATIONHINTWITHNICKNAME 
       drop constraint FK9u8u06rqwta2p7kacbb4amx7u;

    alter table tura.GENERATIONHINTWITHNICKNAME 
       drop constraint FK47t6gm7788vcdn8feiqmn1t91;

    alter table tura.GRANTACCESS 
       drop constraint FK3ygkj271wtrdlt1mhp4m0m3wf;

    alter table tura.GRANTACCESS 
       drop constraint FKaakv1dl51kfl8w7ei81hrhbs3;

    alter table tura.GRANTACCESS 
       drop constraint FKg5d515bm5y3g1npewolst2sqw;

    alter table tura.GROUP2GROUP 
       drop constraint FK3aqojb3yeyliokia3n4wwsl4;

    alter table tura.GROUP2GROUP 
       drop constraint FKdspulvvfqxtr1tasok3tivaxn;

    alter table tura.GROUP2GROUP 
       drop constraint FKehbykj8jxg8ggoqv6oxr100yn;

    alter table tura.GROUP2GROUP 
       drop constraint FKgusdov16b11i01ydiuhuow6li;

    alter table tura.GROUP2ROLE 
       drop constraint FK1bkvs7jduefnlaarje32rljot;

    alter table tura.GROUP2ROLE 
       drop constraint FK7ffcs2xer6vt8xpxpqvjvaflh;

    alter table tura.GROUP2ROLE 
       drop constraint FKqgsn58rwto484hobjrfnnvbhu;

    alter table tura.GROUP2ROLE 
       drop constraint FKsi285ax1pubtsbadcjtbxjaoo;

    alter table tura.GROUP_ 
       drop constraint FKo2sns001r8om8w4p40fyeb91q;

    alter table tura.GROUP_ 
       drop constraint FKbbw58yg00gfuhjekon9knp0g;

    alter table tura.GROUP_ 
       drop constraint FKct8gh0gus7pd3rwsela50gnou;

    alter table tura.HASHPROPERTY 
       drop constraint FKgduvnaitpn0ecl0jv7e3q86q4;

    alter table tura.HASHPROPERTY 
       drop constraint FKnxc344s3lqk6563vrh08u6dyv;

    alter table tura.HASHPROPERTY 
       drop constraint FKh6nf7y590q96lxeopglscam7k;

    alter table tura.INFRASTRUCTURE 
       drop constraint FKsxulbyppl5hsadibk9spioiiw;

    alter table tura.INFRASTRUCTURE 
       drop constraint FKm3useux9071jcif1if5g6qi2i;

    alter table tura.INFRASTRUCTURE2CONFIGURATION 
       drop constraint FKgo4m2tcbmwwoyfbs96gnm3tt5;

    alter table tura.INFRASTRUCTURE2CONFIGURATION 
       drop constraint FKnikyacflduge7ty90itydjhsd;

    alter table tura.INFRASTRUCTURE2CONFIGURATION 
       drop constraint FKl9o9ktswmhcrfunre3jktk553;

    alter table tura.INFRASTRUCTURE2CONFIGURATION 
       drop constraint FK8mprant9cy361g5noj7lqw3id;

    alter table tura.INFRASTRUCTURECOMPONENT 
       drop constraint FKna67um4har2ow1rj0my2tp734;

    alter table tura.INFRASTRUCTURECOMPONENT 
       drop constraint FKgcae2pldqc1g3hkfo0jjd2qwk;

    alter table tura.INFRASTRUCTURECOMPONENT 
       drop constraint FKfsuoqy2wf2t50p4l63gechh1w;

    alter table tura.INFRASTRUCTURECONNECTION 
       drop constraint FK9yc0n7q9pnjwc4e9vcqedfsv0;

    alter table tura.INFRASTRUCTURECONNECTION 
       drop constraint FKdixeugvt4jqnmejj73qvqyjyy;

    alter table tura.INFRASTRUCTURECONNECTION 
       drop constraint FK29x8gm3igvnt9idbwiqts825n;

    alter table tura.INFRASTRUCTURECONNECTION 
       drop constraint FKewwxsrgr4va1pwmutq9rvg4xv;

    alter table tura.INFRASTRUCTURELAYER 
       drop constraint FKlkqhk62j6rxqe8xqqh6mu11ms;

    alter table tura.INFRASTRUCTURELAYER 
       drop constraint FK7idvidkito7a0jgmwho5txoq;

    alter table tura.INGREDIENT 
       drop constraint FKgiocj5mijwwye9dgua2rsfo1y;

    alter table tura.INGREDIENT 
       drop constraint FKol7aya26ypvxrh25p9jfaud5d;

    alter table tura.INGREDIENT 
       drop constraint FKf6o8gr1leca0cgnddw0k04gjd;

    alter table tura.INGREDIENT 
       drop constraint FKra6hesib89h4pidd89ameuvag;

    alter table tura.INGREDIENT 
       drop constraint FK269k1u5er1vfn0yc0xy4w4mdp;

    alter table tura.INGREDIENT 
       drop constraint FK7a6i3skxf8ryq8omlmt2i44j3;

    alter table tura.INSERTTRIGGER 
       drop constraint FK127xsoh5k9t529kjc7kjkxywy;

    alter table tura.INSERTTRIGGER 
       drop constraint FKk28luyftk1p355povnc73fqlf;

    alter table tura.INSERTTRIGGER 
       drop constraint FKe9jskywmj784gttq8fpy9swta;

    alter table tura.INSERTTRIGGER 
       drop constraint FKljr3cah3y9t98ec0a1j9s3kcv;

    alter table tura.JAVAMAPPER 
       drop constraint FK1q99lle4pxgm9g5h49btqxn7i;

    alter table tura.JAVAMAPPER 
       drop constraint FKtkmyvjby0e366rdw1j3lavwgx;

    alter table tura.JAVAMAPPER 
       drop constraint FKsoqp1u1848wqx9fpkbrtg1a1c;

    alter table tura.JAVAMAPPER 
       drop constraint FK1x3fmkiebhmxgrqujg7fuy2e3;

    alter table tura.JAVAMAPPER 
       drop constraint FKduir9y59d689uwfhja9u2rvcc;

    alter table tura.JAVAPACKAGEMAPPER 
       drop constraint FK1yi3hlf6ea59x1feirxsgr1lc;

    alter table tura.JAVAPACKAGEMAPPER 
       drop constraint FKlpmngwcs6npvrw29v4hdoo1s1;

    alter table tura.JAVAPACKAGEMAPPER 
       drop constraint FKtioyqtoeicp42cj5dlg839h6k;

    alter table tura.JAVAPACKAGEMAPPER 
       drop constraint FK9fb39eytndey18s8lsevfbgn7;

    alter table tura.JAVAPACKAGEMAPPER 
       drop constraint FKcxokpq2hf6kr72ej94f16l4uk;

    alter table tura.JAVASCRIPTMAPPER 
       drop constraint FKsrembc3asmee5ebapm1f8siye;

    alter table tura.JAVASCRIPTMAPPER 
       drop constraint FKcriejikbs7s9oswwm38dhtq6q;

    alter table tura.JAVASCRIPTMAPPER 
       drop constraint FKj2qkh9fstiq7g3m7bpojt2hu;

    alter table tura.JAVASCRIPTMAPPER 
       drop constraint FKrk5xxbfgxglu7875t7cjuek3l;

    alter table tura.JAVASCRIPTMAPPER 
       drop constraint FK9k7f23p2it4aavy1vif2j3jku;

    alter table tura.KEYVALUEPAIR 
       drop constraint FKa2cv251e0khkmpc28re8tdt5o;

    alter table tura.KEYVALUEPAIR 
       drop constraint FK4u4gjqa2194lp4e11f54qjxkg;

    alter table tura.LANGUAGE 
       drop constraint FK4qcwwqw7c7ej83hjnatvrhxwg;

    alter table tura.LANGUAGE 
       drop constraint FKdryk6t3y4pylq0efdrpb2eh55;

    alter table tura.LINK 
       drop constraint FKl79owfad5y5ft4mc2ydcdhvc7;

    alter table tura.LINK 
       drop constraint FKawwclboj57ebgbusxtoldaq9i;

    alter table tura.LINK 
       drop constraint FK9ale9pbos3miec732p83f2yir;

    alter table tura.LINK 
       drop constraint FK54useytgyypjaol49ca831is7;

    alter table tura.LINK 
       drop constraint FKjmjy7giveoh8w5o2kvn8kcd6c;

    alter table tura.LINKTOLABEL 
       drop constraint FKh9b1de410v80b6hskj874cpsb;

    alter table tura.LINKTOLABEL 
       drop constraint FK8e0vgfbwer2ffppnuxjw5tbja;

    alter table tura.LINKTOLABEL 
       drop constraint FKssrgppfjashtxdsj9idp52unf;

    alter table tura.LINKTOLABEL 
       drop constraint FKh93w97bimtbu8efd7dgmr8m31;

    alter table tura.LINKTOMESSAGE 
       drop constraint FK2y1seoh4nc6h63oguw30vmxo1;

    alter table tura.LINKTOMESSAGE 
       drop constraint FKow4srtc62y40q5yuhd1pcmfdx;

    alter table tura.LINKTOMESSAGE 
       drop constraint FK4e1eja2q8wnygvn63hd6gdbsb;

    alter table tura.LINKTOMESSAGE 
       drop constraint FKqn1t9bc2rkqvt7e2nduvu9r9x;

    alter table tura.MAPPER 
       drop constraint FKes9bn0h99tcajtcglaodvr9sp;

    alter table tura.MAPPERS 
       drop constraint FK2tjmvt9u9omf09w2tccp6hc3e;

    alter table tura.MAPPERS 
       drop constraint FKqn6c60watkv0frbgkua79opge;

    alter table tura.MAPPINGLAYER 
       drop constraint FKo2bkyelrg427g4o6bu6xu4945;

    alter table tura.MAPPINGLAYER 
       drop constraint FKop1twbxepnklxtoahyhtuqdex;

    alter table tura.MAPPINGTECNOLOGIY 
       drop constraint FKlea8wg0of7srom2a7owctie97;

    alter table tura.MAPPINGTECNOLOGIY 
       drop constraint FK4l8mlohfgd8qedwej9ryvayct;

    alter table tura.MAPPINGTECNOLOGIY 
       drop constraint FKiy615u1b5keoadb86fr3qunca;

    alter table tura.MAPPINGTECNOLOGIY 
       drop constraint FKcqbeykr5ida2gol0kbxjwjuul;

    alter table tura.MENUDEFINITION 
       drop constraint FK9d7922grfkk24qslthp46g3tf;

    alter table tura.MENUDEFINITION 
       drop constraint FKt2kyh0qeuj0evxoqu0rb0t4eu;

    alter table tura.MENUDEFINITION 
       drop constraint FKr2ld883pnl34ga036wmgqdgnq;

    alter table tura.MENUDEFINITION 
       drop constraint FKn66yfagiab7yag4tsu73xj9nj;

    alter table tura.MENUELEMENT 
       drop constraint FKcin54um79divy7rtokax7y6c9;

    alter table tura.MENUELEMENT 
       drop constraint FKa9vju5a00i06yesb89aw5kqd3;

    alter table tura.MENUELEMENT 
       drop constraint FK6qdx4lysruqujafo8xao2igua;

    alter table tura.MENUELEMENT 
       drop constraint FKny8bm1qw37vq6otcmeh5uftes;

    alter table tura.MENUELEMENT 
       drop constraint FKorue4lrgyqfsg1c8fi0adblfc;

    alter table tura.MENUELEMENT 
       drop constraint FKn6ip7ckwy0hu2xlgy87v6i90r;

    alter table tura.MENUELEMENT 
       drop constraint FKgh7r221s14ykqhc5i1bi0qjp0;

    alter table tura.MENUELEMENT 
       drop constraint FK4cmpux41eh80wh9xku5w8lx1j;

    alter table tura.MENUELEMENT 
       drop constraint FKdd3aw8fi5s2dlcl2b3332r2fc;

    alter table tura.MENUELEMENT 
       drop constraint FK50f8x6dxpfqdq3nu42bx13p5b;

    alter table tura.MENUEXTENSIONREF 
       drop constraint FK4j73gjjuq5gtdr97c17el704n;

    alter table tura.MENUFOLDER 
       drop constraint FK63ju9rvdu8mtuq13byf9w5cin;

    alter table tura.MENUFOLDER 
       drop constraint FKoqmd37f3fndi8n1ojrce78qii;

    alter table tura.MENUFOLDER 
       drop constraint FKhmdhjpnr7dgjipe706y0setj1;

    alter table tura.MENUFOLDER 
       drop constraint FKqt2rkpqt711nk2o6q7j71pa52;

    alter table tura.MENUFOLDER 
       drop constraint FKmkl9p0kuwgaa8j45mqi9mgf9s;

    alter table tura.MENUFOLDER 
       drop constraint FK2ukbhe1qnrpgs1a3siy6eui3j;

    alter table tura.MENUFOLDER 
       drop constraint FK86i49kxnxs2idrlewgoyrllb4;

    alter table tura.MENUFOLDER 
       drop constraint FKl6ieimxmbu7yc7gvlf7gxaif9;

    alter table tura.MENUFOLDER 
       drop constraint FKevufkj7ijndta69skjqak1i04;

    alter table tura.MENUHOLDER 
       drop constraint FKnv32v2vnw9hgbax8pxtmdw3hf;

    alter table tura.MESSAGE 
       drop constraint FKcuvqaju8af2rv10531w08dea8;

    alter table tura.MESSAGE 
       drop constraint FK1niwfrk747ba0ui3pw01hp00a;

    alter table tura.MESSAGELIBRARY 
       drop constraint FKbyvt6ysyc9emfewm8eh7jcogv;

    alter table tura.MESSAGELIBRARY 
       drop constraint FKpi6q5sux05ecp6nh27ksm0wjf;

    alter table tura.MESSAGELIBRARY 
       drop constraint FKpcldm00bbss9x7qttcn1hq0k5;

    alter table tura.METAMODELPACKAGEMAPPER 
       drop constraint FKih1o8l0tc22aoixr4sfoqhjn1;

    alter table tura.METAMODELPACKAGEMAPPER 
       drop constraint FK6sgjn27ho7g7lgt5p4ic7in1p;

    alter table tura.METAMODELPACKAGEMAPPER 
       drop constraint FKhjlbvvbsj5vx2i324njs1lgp7;

    alter table tura.METAMODELPACKAGEMAPPER 
       drop constraint FKevme8509e82i1qqpkkykh6y9p;

    alter table tura.METHODPOINTER 
       drop constraint FK1w38viaylldfeq4629vsm2no4;

    alter table tura.MODELMAPPER 
       drop constraint FK5xgdac6sp48dv0qcr30evfy4d;

    alter table tura.MODELMAPPER 
       drop constraint FK3sl2r5vnaacxjldipji1mpb80;

    alter table tura.MODELMAPPER 
       drop constraint FKpppxpnsflns7ftvohk5i71qv;

    alter table tura.MODELMAPPER 
       drop constraint FKm7abvmmk3y5t7991ic266xiv;

    alter table tura.MODELMAPPER 
       drop constraint FK2v056e4nwk0p01q0s68pq938r;

    alter table tura.MODELQUERY 
       drop constraint FKjduyf601tcf08ifbs3etamv7k;

    alter table tura.MODELQUERY 
       drop constraint FK4tw8ra900qbeqg1ddx9iwm4xe;

    alter table tura.OBJECTMAPPER 
       drop constraint FKn606ym1c0uee0sesmu2vrbwgb;

    alter table tura.OBJECTMAPPER 
       drop constraint FK9vsmm43qu5vb6h5ft1yq6fw45;

    alter table tura.OBJECTMAPPER 
       drop constraint FKst9sxpo80pbkaxe1rv5om25lx;

    alter table tura.OBJECTMAPPER 
       drop constraint FKcg90mtlufo2vmaw5oj1ts6y0v;

    alter table tura.OBJECTMAPPERGROUP 
       drop constraint FKqsthg3yw0narj667k0dfjrrsl;

    alter table tura.OBJECTMAPPERGROUP 
       drop constraint FK2x24mx2kjm26duw6nnsqwavqk;

    alter table tura.OMRELATION 
       drop constraint FK6ivfgexhascpysrst4kktln1n;

    alter table tura.OMRELATION 
       drop constraint FK8fu65pac1jbp927s3x6addved;

    alter table tura.OMRELATION 
       drop constraint FKhe1khsk9kmw0gkaj7qfiojbdi;

    alter table tura.OMRELATION 
       drop constraint FKd8f6xyd6aoqfc1gk61mm5mwk7;

    alter table tura.OMRELATION 
       drop constraint FKh1x64fh8epjb1vqoj8jdl8r9h;

    alter table tura.OPERATION 
       drop constraint FKftr6m81n0ynym7koq1esalnbp;

    alter table tura.OPERATION 
       drop constraint FK2ayjf5woisss0913e4lfjwf5b;

    alter table tura.OPERATION 
       drop constraint FK5veauxhepv4ky56hpsf7voedd;

    alter table tura.OPERATION 
       drop constraint FK8471huxanxn2opg7a5gxx57hf;

    alter table tura.OPERATIONCONNECTOR 
       drop constraint FK8tbvyfv3q1s9hmw9fskaqnlt2;

    alter table tura.OPERATIONCONNECTOR 
       drop constraint FKhyl31q5616e2hakvi38v5pbcl;

    alter table tura.OPERATIONCONNECTOR 
       drop constraint FKmbs3tl886o0qefeky3i7exuk;

    alter table tura.OPERATIONCONNECTOR 
       drop constraint FKka6ww24yu3ns6pbcp956ddp8t;

    alter table tura.OPERATIONCONNECTOR 
       drop constraint FKbvmfql2u5naj7u3kcqu754fug;

    alter table tura.OPERATIONCONNECTORREF 
       drop constraint FKc3383cmvxggnjqkhd4sv455j8;

    alter table tura.OPTION 
       drop constraint FKlspyottiw51576rf07oklygdn;

    alter table tura.OPTION 
       drop constraint FK8yhh5h4psvyut2prh3dm7bg37;

    alter table tura.OPTION 
       drop constraint FK3p31t9ucttqmpr81y1sf4qpss;

    alter table tura.OPTIONSELECTION 
       drop constraint FKn0ojk4sbr4ypv3iy479okg8en;

    alter table tura.OPTIONSELECTION 
       drop constraint FKt42q3yid05t78p4lxds8rs4ww;

    alter table tura.OPTIONSELECTION 
       drop constraint FKp50staqtku71kbyvi88s67t5j;

    alter table tura.ORDERBY 
       drop constraint FKo5ulwih4sqwqn8oq9yh78lh9q;

    alter table tura.ORDERBY 
       drop constraint FKhx4r2fdrfq46g2d9d34xirn5p;

    alter table tura.ORDERBY 
       drop constraint FKpsbl9fmwhe6kk3w1o2hkqsixr;

    alter table tura.ORDERS 
       drop constraint FKf8f99pim2ehu4ncuwjh7fniup;

    alter table tura.ORDERS 
       drop constraint FKk43gkbwli95xom5ece4vlhej;

    alter table tura.PACKAGEPOINTER 
       drop constraint FKf13eogf0ny4ecvll7sd6kpnwq;

    alter table tura.PARAMETER 
       drop constraint FK1jm1rdds362fra2sp9fr53qg3;

    alter table tura.PARAMETER 
       drop constraint FK31oomkp9i5orkj93xw3al2o12;

    alter table tura.PARAMETER 
       drop constraint FKawl82jemyhpdx3xqeivp689pn;

    alter table tura.POSTCREATETRIGGER 
       drop constraint FKehjc3vigm72os1b6fipw96xg3;

    alter table tura.POSTCREATETRIGGER 
       drop constraint FKg144xomk7bmc9hk9d8jxkms10;

    alter table tura.POSTCREATETRIGGER 
       drop constraint FK9qsdmbifdb8bl5ada7wbiiatg;

    alter table tura.POSTCREATETRIGGER 
       drop constraint FKh1camvtmm2t6mxvbx4knoa59s;

    alter table tura.POSTCREATETRIGGER 
       drop constraint FKclmfq6024xmng6jw7wws44d6r;

    alter table tura.POSTQUERYTRIGGER 
       drop constraint FKpi02toc6xkngwbte28pgurm1h;

    alter table tura.POSTQUERYTRIGGER 
       drop constraint FKadkj69ay8d5tb73vtrtkami79;

    alter table tura.POSTQUERYTRIGGER 
       drop constraint FKlicgjbo7bqlr9sv24xxdgufsk;

    alter table tura.POSTQUERYTRIGGER 
       drop constraint FKfqc0em1jds9ety2idqbyuk30c;

    alter table tura.POSTQUERYTRIGGER 
       drop constraint FK158xjektfnk118u4a6qxpnmev;

    alter table tura.PREDELETETRIGGER 
       drop constraint FKj26uabuakfd7kdho5gk94bmll;

    alter table tura.PREDELETETRIGGER 
       drop constraint FK1vg97nc0uvu0dlnwuvmdlcrn5;

    alter table tura.PREDELETETRIGGER 
       drop constraint FKmvlvykxjtpgmamwwshjrxs79o;

    alter table tura.PREDELETETRIGGER 
       drop constraint FK1rl7cam451kerd7a7ftlom72l;

    alter table tura.PREDELETETRIGGER 
       drop constraint FKiglmu14aemp1yyr1qctck66na;

    alter table tura.PREFORMTRIGGER 
       drop constraint FKblddnedit5mk0i2inw2o455p5;

    alter table tura.PREFORMTRIGGER 
       drop constraint FKjejyjy7qhwb4jpyh68qdlglt9;

    alter table tura.PREFORMTRIGGER 
       drop constraint FKn52dm5yv7fne78j1rngben8fk;

    alter table tura.PREFORMTRIGGER 
       drop constraint FKm4jrx88lhv4ddeptng4wmit5i;

    alter table tura.PREFORMTRIGGER 
       drop constraint FKkty3nksyemotjetr3swhycs2m;

    alter table tura.PREINSERTTRIGGER 
       drop constraint FKipvlbv74c3tqxujl30endhgu6;

    alter table tura.PREINSERTTRIGGER 
       drop constraint FKm77n6pwxj3fx2t2s53ww77r3k;

    alter table tura.PREINSERTTRIGGER 
       drop constraint FKhcrxt1mrs0eys4d1t9wf9ob24;

    alter table tura.PREINSERTTRIGGER 
       drop constraint FKtnh70xxd1337b0w0icxvwb1kj;

    alter table tura.PREINSERTTRIGGER 
       drop constraint FKn6ps9g3cuy0jkwpknselp85os;

    alter table tura.PREQUERYTRIGGER 
       drop constraint FKls567xccmbc2bqg87k5l4t4j;

    alter table tura.PREQUERYTRIGGER 
       drop constraint FKm3le913iu7vadoh0yw11c1670;

    alter table tura.PREQUERYTRIGGER 
       drop constraint FKk2h76e2cowt8rid5046tuismd;

    alter table tura.PREQUERYTRIGGER 
       drop constraint FKk758ianiyo7hwu9tby0kirrfa;

    alter table tura.PREQUERYTRIGGER 
       drop constraint FKov6s2abhsjjto25pq0ite0g09;

    alter table tura.PREUPDATETRIGGER 
       drop constraint FKm700hpjctyf1ld2lg2qi3lkl9;

    alter table tura.PREUPDATETRIGGER 
       drop constraint FKshw3f9yf4r3lkptfb2xh1e5ea;

    alter table tura.PREUPDATETRIGGER 
       drop constraint FK11mg05wbdc35jq2vk1am8iod6;

    alter table tura.PREUPDATETRIGGER 
       drop constraint FKni3ysie8bpqlqp2axjpj33fnk;

    alter table tura.PREUPDATETRIGGER 
       drop constraint FKrwec1n7q54t6qeo9x0svbvi22;

    alter table tura.PRIMITIVESGROUP 
       drop constraint FK851la4gp64uox2xfydfchcye1;

    alter table tura.PRIMITIVESGROUP 
       drop constraint FK2e7ry5hvx8loptb4g3enavhc0;

    alter table tura.PROCESSINGSTAGE 
       drop constraint FKq1ra2h8nu7bj8kbnxj6i35n2w;

    alter table tura.PROCESSINGSTAGE 
       drop constraint FKntkuuhokfeyts49et3o5rb7cn;

    alter table tura.PROCESSINGSTAGE 
       drop constraint FKlkcerrtlyxl814erx3v49fpff;

    alter table tura.PROPERTY 
       drop constraint FKm94hjq31xi1v41h1dko3687mx;

    alter table tura.PROPERTY 
       drop constraint FKn0kkl43m3jldiiyc5m86cfto9;

    alter table tura.PROPERTY 
       drop constraint FKcyckvx73datfygcfv84p4v32g;

    alter table tura.QUERY 
       drop constraint FK5g92kpuw52b1c7p4hrasbsfyr;

    alter table tura.QUERY 
       drop constraint FKbb5xonctthahp950dk9t5crby;

    alter table tura.QUERY 
       drop constraint FKjtxbktqgn470d2hiwdnups856;

    alter table tura.QUERYPARAMETER 
       drop constraint FKbbx46r9mlja537ri6fj0npy4l;

    alter table tura.QUERYPARAMETER 
       drop constraint FKidqkpyyd7pekubrncvcbfwq3e;

    alter table tura.QUERYVARIABLE 
       drop constraint FKktyxqi3yu0tpa4fcp3k0mkv2k;

    alter table tura.QUERYVARIABLE 
       drop constraint FKasoeej6cdcafq2qk1umngw0k5;

    alter table tura.QUERYVARIABLE 
       drop constraint FK65aqmgc57pwm1bduwxcwj4ync;

    alter table tura.RECIPE 
       drop constraint FKhdqin1ctgqqev7mk43sufy7sv;

    alter table tura.RECIPE 
       drop constraint FKq14qt4mlo4c0nj3qlfjpw73m;

    alter table tura.RECIPE 
       drop constraint FK1sh9b11asip30820mufdp7505;

    alter table tura.RECIPE 
       drop constraint FK5jg7egclic8a83hf0ivtw5uc0;

    alter table tura.RECIPE2INFRASTRUCTURE 
       drop constraint FKpslpv287git0cgcxmr7p1qgu6;

    alter table tura.RECIPE2INFRASTRUCTURE 
       drop constraint FK8ljreaa2fen5bfekl9w3wu4b7;

    alter table tura.RECIPE2INFRASTRUCTURE 
       drop constraint FKekcistkg3yvrbec02mmm3u8po;

    alter table tura.RECIPE2INFRASTRUCTURE 
       drop constraint FK99779aimsj3h7x0m337veakfg;

    alter table tura.RECIPES 
       drop constraint FKefwm32d3t4bh0vppimi2i6cbs;

    alter table tura.RECIPES 
       drop constraint FKmsmohsvimlg6d16wvc0jadifr;

    alter table tura.RELATION 
       drop constraint FKcl04e3ndp55cmpe6w120v34yy;

    alter table tura.RELATION 
       drop constraint FKmhpn2dj1bb45vgbrd9f9jq33a;

    alter table tura.RELATION 
       drop constraint FKmhcy9nmhd1o56wd6wdr9j6wor;

    alter table tura.RELATION 
       drop constraint FKaty5xcvmjh9ejncglb2limhg1;

    alter table tura.RELATION 
       drop constraint FKtqddc01uh6jb33ueuglruw9sa;

    alter table tura.RELATION 
       drop constraint FKafahsvou2jmark41a19kg01g1;

    alter table tura.RELATIONMAPPER 
       drop constraint FKs30mfholqaf8wiapag11ee18c;

    alter table tura.RELATIONMAPPER 
       drop constraint FKk9worqwnborkrrjknjdeb3bcw;

    alter table tura.RELATIONMAPPER 
       drop constraint FKbhy8va66qiv2w3xpcodjetl7s;

    alter table tura.RELATIONMAPPER 
       drop constraint FKpn5tg7mug05eucq7n55ermrxi;

    alter table tura.RELATIONMAPPER 
       drop constraint FK7ixmyk8e8waq04rh3sw52v64p;

    alter table tura.RELATIONSHIP 
       drop constraint FKiy5s7cvc8l99r5akjyn6gk1g2;

    alter table tura.RELATIONSHIP 
       drop constraint FK6ef6g84ax9l80l8oom68cv2vm;

    alter table tura.RELATIONSHIP 
       drop constraint FK6y718g6yqqpkm5fum3wd41wlx;

    alter table tura.RELATIONSHIP 
       drop constraint FKehfvm91kmnug28jel4uqj2v0x;

    alter table tura.RELATIONSHIP 
       drop constraint FKmxcj5s6346j4uwjbat31f5nvu;

    alter table tura.RETURNVALUE 
       drop constraint FK7la2aset2l165mcgxsmftqrsr;

    alter table tura.RETURNVALUE 
       drop constraint FK33erjo3vs56fx16l9mxmn39tk;

    alter table tura.RETURNVALUE 
       drop constraint FKpfotyba5qh5vl4lh5j37duwya;

    alter table tura.RL_LAYERS_OPLAYERSMAPPER 
       drop constraint FKoe91g8o3nxs8i35st5bblx8pm;

    alter table tura.RL_LAYERS_OPLAYERSMAPPER 
       drop constraint FKj76gvx6ohevrmnbe17y663jvg;

    alter table tura.RL_MAPPERS_OPMAPPERSUSINGMAPPERS 
       drop constraint FK84pq0ilfj57ip5bsluxwpw68t;

    alter table tura.RL_MAPPERS_OPMAPPERSUSINGMAPPERS 
       drop constraint FKd3ixddyqkup7dna90kcf6rb6i;

    alter table tura.RL_MODELLAYER_OPMODELLAYERINGREDIENT 
       drop constraint FKch444ma83186jxcjco8e4gyij;

    alter table tura.RL_MODELLAYER_OPMODELLAYERINGREDIENT 
       drop constraint FKjwqx6o8bcbge6cyufwfydapcy;

    alter table tura.RL_VEWLAYER_OPVEWLAYERINGREDIENT 
       drop constraint FK8yc5tcopvjej7f1tncrbe4xu0;

    alter table tura.RL_VEWLAYER_OPVEWLAYERINGREDIENT 
       drop constraint FK3sum5frkltcwi9xe76pxd8puh;

    alter table tura.ROLE_ 
       drop constraint FKkkl2sit0esqlhlw63svuntehi;

    alter table tura.ROLE_ 
       drop constraint FK4ygwvvdt1fhum90pbme0xke2q;

    alter table tura.ROLE_ 
       drop constraint FKlykkt6pcrim3qgs8po5lyomon;

    alter table tura.ROLEMAPPER 
       drop constraint FKib7o5xiyxo8up2ouvkinfja47;

    alter table tura.ROLEMAPPER 
       drop constraint FK4ydh0agb7ib06cxi5rqbusmbp;

    alter table tura.ROLEMAPPER 
       drop constraint FKckgwf4nev96fcm7fperr95oou;

    alter table tura.ROLES 
       drop constraint FK9sg2spbn3hwr9fkcbeqj1u347;

    alter table tura.ROLES 
       drop constraint FKvw3e0oitf2gj5rla6u1ftrrs;

    alter table tura.ROOT 
       drop constraint FK431s8h2bwwc00wq9elpfd82s8;

    alter table tura.ROOT 
       drop constraint FKabmv195gmtnonrcgavyq28vtf;

    alter table tura.SEARCHTRIGGER 
       drop constraint FKfr7lytn3mj4qymw7aknh7lkvg;

    alter table tura.SEARCHTRIGGER 
       drop constraint FKs4ur7ctdeotkj89trsqimw7bu;

    alter table tura.SEARCHTRIGGER 
       drop constraint FKm1rtkqqoa8ls5uvpmo80c65v;

    alter table tura.SEARCHTRIGGER 
       drop constraint FK10hsc9yitajb2vc5fmul21t1q;

    alter table tura.SEARCHTRIGGER 
       drop constraint FK3r59y7xlav7l9bdej5tuf2b32;

    alter table tura.SECURITYENTITYPOINTER 
       drop constraint FK8ut7hb8ryi69q50m7tp7drrju;

    alter table tura.SELECTION 
       drop constraint FKgxqwunrl46agvo0vr0ldc7wbk;

    alter table tura.SELECTION 
       drop constraint FKnio3lofo3son46vks4fyvoueo;

    alter table tura.SELECTION 
       drop constraint FK75p03qpimsaqm7q1k88tsm6ue;

    alter table tura.SELECTION 
       drop constraint FK42ffrocau7nnei15bp8qdhs2k;

    alter table tura.SELECTION 
       drop constraint FKt8q5kr8wyb750xjr5p513b02t;

    alter table tura.STYLELIBRARY 
       drop constraint FKbdpdywckmlid8kwgsxgov34us;

    alter table tura.STYLELIBRARY 
       drop constraint FKcaesvwuqce1923ng9m21nixke;

    alter table tura.STYLEPOINTER 
       drop constraint FKhkhx1lniyuxxla98w53a8tqkv;

    alter table tura.STYLESET 
       drop constraint FKdsbop6x5qq7fhewu0j8rm86eb;

    alter table tura.STYLESET 
       drop constraint FK1w42v82ulgc8arbk7er8g695v;

    alter table tura.SUBSYSTEM 
       drop constraint FK4h0e0bmje5ln32wn2nhaqp62f;

    alter table tura.SUBSYSTEM 
       drop constraint FK82oj6sps41kevljmfusgu7uw0;

    alter table tura.TABPAGESINHERITANCE 
       drop constraint FKbhafa6m57cfp9etlfpv0utjr3;

    alter table tura.TABPAGESINHERITANCE 
       drop constraint FK6kxtvdgdsvlkvm6gxhpt4x9r1;

    alter table tura.TABPAGESINHERITANCE 
       drop constraint FK4apqseecpx9612tfppqmjmwks;

    alter table tura.TABPAGESINHERITANCE 
       drop constraint FKrt1434crvcvoq989dn6hxvtit;

    alter table tura.TECHLEAF 
       drop constraint FKs9fgqpaf6npmcirhxk96stgr0;

    alter table tura.TECHLEAF 
       drop constraint FKskua9r4yfpxcqkv8tmtscf0r5;

    alter table tura.TECHLEAF 
       drop constraint FKi6xch2grij4u7tpdo2pt2247h;

    alter table tura.TECHNOLOGY 
       drop constraint FKspf3mcyvxtfmpl1nwrffuxaut;

    alter table tura.TECHNOLOGY 
       drop constraint FKqb43lla7v97k8tfcw56efpnmh;

    alter table tura.TOSUBMENU 
       drop constraint FKh8a72ci3wkv6di18k7lnnvebv;

    alter table tura.TOSUBMENU 
       drop constraint FKio5ra0wm81e2fwm6usnx439yj;

    alter table tura.TOSUBMENU 
       drop constraint FK17c4yiiqgoyo8uw67lrprqr4e;

    alter table tura.TOSUBMENU 
       drop constraint FK4gjf8ciccfgce5wwd76vy7ady;

    alter table tura.TRANSLATION 
       drop constraint FK63xayjkw4k9uou8xhujj2rod2;

    alter table tura.TRANSLATION 
       drop constraint FKo2b35w1fmhg07pxqmgwi8cbw6;

    alter table tura.TRANSLATION 
       drop constraint FK2jq1w0v3iwxb14hi7b7735b0r;

    alter table tura.TYPEELEMENT 
       drop constraint FK3xxqdvf23q81rwiux8ncb6vo4;

    alter table tura.TYPEELEMENT 
       drop constraint FKff97q6tpga990gy2gji51fdyq;

    alter table tura.TYPEELEMENT 
       drop constraint FK7i65v2rf935fh9tarpeuhqgna;

    alter table tura.TYPEELEMENT 
       drop constraint FK21hw169fbc61nk4c31jq13vp6;

    alter table tura.TYPEELEMENT 
       drop constraint FKow89y0trir31h7e2xtyfyvcx2;

    alter table tura.TYPEGROUP 
       drop constraint FKio2neehwc4e1qga11mn2r43qh;

    alter table tura.TYPEGROUP 
       drop constraint FK74sdaco0qqih9rifm4tnynseo;

    alter table tura.TYPEGROUP 
       drop constraint FKlxfgfco7dobmbgj7yiqq275lr;

    alter table tura.TYPEPOINTER 
       drop constraint FKk5qoe4aayppjtmtpdh13ktu7d;

    alter table tura.TYPEPOINTER 
       drop constraint FK83a2xpwru6lkdeef9u48vmc79;

    alter table tura.TYPEPOINTEROBJ 
       drop constraint FK8wlg1wypx6koy5nsgd4n61j3y;

    alter table tura.TYPEPOINTEROBJ 
       drop constraint FKdj15nitwclxaeo8mi0y2gr3qd;

    alter table tura.TYPEPOINTEROBJ 
       drop constraint FKrikoeq479199sncrkdu9qlb2b;

    alter table tura.TYPEPOINTEROBJ 
       drop constraint FKdxkw6okgshdl11hu7ye6jh4rf;

    alter table tura.UIELEMENT 
       drop constraint FKr9bvi0wvaf3chgfjtsyurj4ex;

    alter table tura.UIELEMENT 
       drop constraint FKofdul25xmlu6opsl6jmm8y3d2;

    alter table tura.UIELEMENT 
       drop constraint FK4k67ecx76aeol9ox0wegu6n57;

    alter table tura.UIELEMENT 
       drop constraint FK9yqau8g3v1q50egite6299y4y;

    alter table tura.UIELEMENT 
       drop constraint FKhgtsduybvcat2yiu0ceiyaujm;

    alter table tura.UIELEMENT 
       drop constraint FKefu5ge6xvd6rho3j5gd7kg88h;

    alter table tura.UIELEMENT 
       drop constraint FKqruigw0f5hwwklcmm2u7ad7o3;

    alter table tura.UIELEMENT 
       drop constraint FKeg4odgmrn7p5y88l5sel6xhld;

    alter table tura.UIELEMENT 
       drop constraint FKmm85dolyghvn8tmdrabqayuq6;

    alter table tura.UIELEMENT 
       drop constraint FK1fn5vxavfdvr9hbxq7jyncx8m;

    alter table tura.UIELEMENT 
       drop constraint FK688v6us3f0h2ulbgvk63wf6pw;

    alter table tura.UIELEMENT 
       drop constraint FKik261wgcxect5oxk9m9gac7t0;

    alter table tura.UIELEMENT 
       drop constraint FKtngu5dlhpjq5lcr5j9y2wde5k;

    alter table tura.UIELEMENT 
       drop constraint FKpe7jie6rcuykwv6m6yt65vp1o;

    alter table tura.UIELEMENT 
       drop constraint FKkcoe5bh0knotj6lkafnakwl3i;

    alter table tura.UIELEMENT 
       drop constraint FKpbbbhbi7ryvem9c8i0ekahtw9;

    alter table tura.UIELEMENT 
       drop constraint FK433l2nmw4851f24qhs1pks1pi;

    alter table tura.UIELEMENT 
       drop constraint FKfp18le10f027h8o97v9wt55fu;

    alter table tura.UIELEMENT 
       drop constraint FKd31g33ashwyfsms77wxr11om3;

    alter table tura.UPDATETRIGGER 
       drop constraint FKqyqjlgg0rj3px2ux73x64nhm8;

    alter table tura.UPDATETRIGGER 
       drop constraint FK6e9e05qmh20bjyui2fvsllrjw;

    alter table tura.UPDATETRIGGER 
       drop constraint FKmhmpvasj8hcsctuq7kkfh65u3;

    alter table tura.UPDATETRIGGER 
       drop constraint FKi9hr9neavlmr52pe57c0ytm81;

    alter table tura.VERSION 
       drop constraint FKb3arj1vcw3bwx2m21hd7b8nn4;

    alter table tura.VERSION 
       drop constraint FKtdwllpeh22fsbdgvx4v3m7tgn;

    alter table tura.VERSIONREF 
       drop constraint FKm7soj8p0o4mxhpd2eielc7778;

    alter table tura.VIEWAREA 
       drop constraint FK3ih7lksj3absui1aqdthebq12;

    alter table tura.VIEWAREA 
       drop constraint FKor0i522jdse68x1niqig43957;

    alter table tura.VIEWAREA 
       drop constraint FK6q98m268cux9blcvxdlb6wn6;

    alter table tura.VIEWAREA 
       drop constraint FKr6whyhon4uw9g0ah78x6vry63;

    alter table tura.VIEWAREA 
       drop constraint FK1klplcxkmp3epy4644vdp7od0;

    alter table tura.VIEWAREA 
       drop constraint FKjswmi664s6gvm7yqvkr66t19s;

    alter table tura.VIEWAREA 
       drop constraint FKmo71sbjkay8jffgq6dlo01try;

    alter table tura.VIEWELEMENT 
       drop constraint FK5pl94fxoo7c0l9dqpkvq5hxsc;

    alter table tura.VIEWINHERITANCE 
       drop constraint FK5av4f2bldip42cecgqe7gv74a;

    alter table tura.VIEWINHERITANCE 
       drop constraint FKbge81kwjla685bs58sarowwbe;

    alter table tura.VIEWINHERITANCE 
       drop constraint FK4td7ydu5bqpye2m8ajuc3913u;

    alter table tura.VIEWINHERITANCE 
       drop constraint FKoii2wh8tjx8h4equ960t32n4;

    alter table tura.VIEWPORT 
       drop constraint FKe052ld9ddftmg9rg59bx1pmc5;

    alter table tura.VIEWPORT 
       drop constraint FKtp7adaqp00skxdmsrek1ak7hk;

    alter table tura.VIEWPORT 
       drop constraint FKcrrcwlo1n7n7reuh870x34m7g;

    alter table tura.VIEWPORT 
       drop constraint FK5ghhef0p6pirtbnrrnll2ss24;

    alter table tura.VIEWPORT 
       drop constraint FK6u0kd29m8jje04cyjhplto0jw;

    alter table tura.VIEWPORT 
       drop constraint FK100xxldtk3ape43t6m7r7jfp3;

    alter table tura.VIEWPORT 
       drop constraint FKmbh0f48ph6j0t0f0tbtb6qe1w;

    alter table tura.VIEWPORTTRIGGER 
       drop constraint FKfc243jv7h679fgdc096hw6esb;

    alter table tura.VIEWPORTTRIGGER 
       drop constraint FKlvt5kwfsh4ex6ewwobxgdvl0w;

    alter table tura.VIEWPORTTRIGGER 
       drop constraint FKnlom9kbv005o9ny132qjejp42;

    alter table tura.VIEWPORTTRIGGER 
       drop constraint FKcm7y0bbi7g2oae917n2s1rfaa;

    alter table tura.VIEWPORTTRIGGER 
       drop constraint FKdmb9ghx1vi9jib3bi82p04xu5;

    alter table tura.VIEWS 
       drop constraint FKqwfkhoq86dx14ouqrv4he8my5;

    alter table tura.VIEWS 
       drop constraint FK5um8xi8t6uxonixdvrh733dds;

    alter table tura.XMLPACKAGEMAPPER 
       drop constraint FKfpcvclcvc50gg9m5g6vpd46cv;

    alter table tura.XMLPACKAGEMAPPER 
       drop constraint FKs4fr6fphhuf0j4idw4qqy7jh;

    alter table tura.XMLPACKAGEMAPPER 
       drop constraint FK28f8iyu7swf5oskw7k9lr5ijs;

    alter table tura.XMLPACKAGEMAPPER 
       drop constraint FKlpdxr7at8lq9xaytpdrcdxb9b;

    alter table tura.XMLTYPEMAPPER 
       drop constraint FKdg2yo99ebjlquyq6exp01hh3h;

    alter table tura.XMLTYPEMAPPER 
       drop constraint FKdcj6xjwcldrtoayigmqb7rbdt;

    alter table tura.XMLTYPEMAPPER 
       drop constraint FKrjr03jp83pyya0a7ifjtksl71;

    alter table tura.XMLTYPEMAPPER 
       drop constraint FK42e78ovcaku0xm9ej9kpflhsn;

    drop table if exists tura.APPLICATION cascade;

    drop table if exists tura.APPLICATIONGROUP cascade;

    drop table if exists tura.APPLICATIONINFRASTRUCTURELAYER cascade;

    drop table if exists tura.APPLICATIONINFRASTRUCTURELAYERS cascade;

    drop table if exists tura.APPLICATIONLANGUAGES cascade;

    drop table if exists tura.APPLICATIONMAPPER cascade;

    drop table if exists tura.APPLICATIONMAPPERS cascade;

    drop table if exists tura.APPLICATIONMESSAGELIBRARIES cascade;

    drop table if exists tura.APPLICATIONMESSAGELIBRARY cascade;

    drop table if exists tura.APPLICATIONREALM cascade;

    drop table if exists tura.APPLICATIONREALMS cascade;

    drop table if exists tura.APPLICATIONRECIPE cascade;

    drop table if exists tura.APPLICATIONRECIPES cascade;

    drop table if exists tura.APPLICATIONSTYLE cascade;

    drop table if exists tura.APPLICATIONSTYLELIBRARIES cascade;

    drop table if exists tura.APPLICATIONUILAYER cascade;

    drop table if exists tura.APPLICATIONUIPACKAGE cascade;

    drop table if exists tura.AREAREF cascade;

    drop table if exists tura.ARTIFACT cascade;

    drop table if exists tura.ARTIFACTGROUP cascade;

    drop table if exists tura.ARTIFACTREF cascade;

    drop table if exists tura.ARTIFICIALFIELD cascade;

    drop table if exists tura.ATTRIBUTE cascade;

    drop table if exists tura.ATTRIBUTECONNECTOR cascade;

    drop table if exists tura.ATTRIBUTEPOINTER cascade;

    drop table if exists tura.BLOCKABLE cascade;

    drop table if exists tura.CALCULATEDFIELD cascade;

    drop table if exists tura.CANVASFRAME cascade;

    drop table if exists tura.CATEGORIZED cascade;

    drop table if exists tura.CHILDRENHOLDER cascade;

    drop table if exists tura.CLASSIFIER cascade;

    drop table if exists tura.COLUMN cascade;

    drop table if exists tura.COMPONENT cascade;

    drop table if exists tura.CONFIGEXTENSION cascade;

    drop table if exists tura.CONFIGHASH cascade;

    drop table if exists tura.CONFIGHASHWITHNICKNAME cascade;

    drop table if exists tura.CONFIGURATION cascade;

    drop table if exists tura.CONFIGVARIABLE cascade;

    drop table if exists tura.CONFIGVARIABLEWITHNICKNAME cascade;

    drop table if exists tura.CONTEXTPARAMETER cascade;

    drop table if exists tura.CONTEXTPARAMETERS cascade;

    drop table if exists tura.CONTEXTPARAMETERSOBJ cascade;

    drop table if exists tura.CONTEXTVALUE cascade;

    drop table if exists tura.CONTROLPOINTER cascade;

    drop table if exists tura.CONTROLS cascade;

    drop table if exists tura.CREATETRIGGER cascade;

    drop table if exists tura.CSSMAPPER cascade;

    drop table if exists tura.DATACENTER cascade;

    drop table if exists tura.DATACONTROL cascade;

    drop table if exists tura.DEFAULTCAVAS cascade;

    drop table if exists tura.DELETETRIGGER cascade;

    drop table if exists tura.DEPENDENCY cascade;

    drop table if exists tura.DEPLOYMENTCOMPONENT cascade;

    drop table if exists tura.DEPLOYMENTSTARSTEP cascade;

    drop table if exists tura.DOMAIN cascade;

    drop table if exists tura.DOMAINAPPLICATION cascade;

    drop table if exists tura.DOMAINAPPLICATIONS cascade;

    drop table if exists tura.DOMAINARTIFACT cascade;

    drop table if exists tura.DOMAINARTIFACTS cascade;

    drop table if exists tura.DOMAINMAPPER cascade;

    drop table if exists tura.DOMAINMAPPERS cascade;

    drop table if exists tura.DOMAINTYPES cascade;

    drop table if exists tura.DOMAINTYPESREPOSITORY cascade;

    drop table if exists tura.ENABLEDUIITEM cascade;

    drop table if exists tura.ENTERPRISEINFRASTRUCTURE cascade;

    drop table if exists tura.ENUMATTRIBUTE cascade;

    drop table if exists tura.EXPRESSIONPART cascade;

    drop table if exists tura.FLEXFIELDS cascade;

    drop table if exists tura.FORM cascade;

    drop table if exists tura.FORMATABLE cascade;

    drop table if exists tura.FORMPARAMETER cascade;

    drop table if exists tura.FORMVARIABLE cascade;

    drop table if exists tura.GENERATIONHINT cascade;

    drop table if exists tura.GENERATIONHINTWITHNICKNAME cascade;

    drop table if exists tura.GRANTACCESS cascade;

    drop table if exists tura.GROUP2GROUP cascade;

    drop table if exists tura.GROUP2ROLE cascade;

    drop table if exists tura.GROUP_ cascade;

    drop table if exists tura.HASHPROPERTY cascade;

    drop table if exists tura.HTMLLAYERHOLDER cascade;

    drop table if exists tura.INFRASTRUCTURE cascade;

    drop table if exists tura.INFRASTRUCTURE2CONFIGURATION cascade;

    drop table if exists tura.INFRASTRUCTURECOMPONENT cascade;

    drop table if exists tura.INFRASTRUCTURECONNECTION cascade;

    drop table if exists tura.INFRASTRUCTURELAYER cascade;

    drop table if exists tura.INGREDIENT cascade;

    drop table if exists tura.INSERTTRIGGER cascade;

    drop table if exists tura.ITEMICON cascade;

    drop table if exists tura.JAVAMAPPER cascade;

    drop table if exists tura.JAVAPACKAGEMAPPER cascade;

    drop table if exists tura.JAVASCRIPTMAPPER cascade;

    drop table if exists tura.KEYVALUEPAIR cascade;

    drop table if exists tura.LANGUAGE cascade;

    drop table if exists tura.LINK cascade;

    drop table if exists tura.LINKTOLABEL cascade;

    drop table if exists tura.LINKTOMESSAGE cascade;

    drop table if exists tura.LISTOFLANGUAGES cascade;

    drop table if exists tura.MAPPER cascade;

    drop table if exists tura.MAPPERS cascade;

    drop table if exists tura.MAPPINGLAYER cascade;

    drop table if exists tura.MAPPINGTECNOLOGIY cascade;

    drop table if exists tura.MENUDEFINITION cascade;

    drop table if exists tura.MENUELEMENT cascade;

    drop table if exists tura.MENUEXTENSIONREF cascade;

    drop table if exists tura.MENUFOLDER cascade;

    drop table if exists tura.MENUHOLDER cascade;

    drop table if exists tura.MESSAGE cascade;

    drop table if exists tura.MESSAGELIBRARY cascade;

    drop table if exists tura.METAMODELPACKAGEMAPPER cascade;

    drop table if exists tura.METAOBJECT cascade;

    drop table if exists tura.METHODPOINTER cascade;

    drop table if exists tura.MODELMAPPER cascade;

    drop table if exists tura.MODELQUERY cascade;

    drop table if exists tura.MULTILANGLABEL cascade;

    drop table if exists tura.NICKNAMED cascade;

    drop table if exists tura.OBJECTMAPPER cascade;

    drop table if exists tura.OBJECTMAPPERGROUP cascade;

    drop table if exists tura.OMRELATION cascade;

    drop table if exists tura.OPERATION cascade;

    drop table if exists tura.OPERATIONCONNECTOR cascade;

    drop table if exists tura.OPERATIONCONNECTORREF cascade;

    drop table if exists tura.OPTION cascade;

    drop table if exists tura.OPTIONSELECTION cascade;

    drop table if exists tura.OPTIONSSET cascade;

    drop table if exists tura.ORDERABLE cascade;

    drop table if exists tura.ORDERBY cascade;

    drop table if exists tura.ORDERS cascade;

    drop table if exists tura.PACKAGEMAPPER cascade;

    drop table if exists tura.PACKAGEPOINTER cascade;

    drop table if exists tura.PARAMETER cascade;

    drop table if exists tura.POSTCREATETRIGGER cascade;

    drop table if exists tura.POSTQUERYTRIGGER cascade;

    drop table if exists tura.PREDELETETRIGGER cascade;

    drop table if exists tura.PREFORMTRIGGER cascade;

    drop table if exists tura.PREINSERTTRIGGER cascade;

    drop table if exists tura.PREQUERYTRIGGER cascade;

    drop table if exists tura.PREUPDATETRIGGER cascade;

    drop table if exists tura.PRIMITIVESGROUP cascade;

    drop table if exists tura.PROCESSINGSTAGE cascade;

    drop table if exists tura.PROPERTY cascade;

    drop table if exists tura.QUERY cascade;

    drop table if exists tura.QUERYPARAMETER cascade;

    drop table if exists tura.QUERYVARIABLE cascade;

    drop table if exists tura.RECIPE cascade;

    drop table if exists tura.RECIPE2INFRASTRUCTURE cascade;

    drop table if exists tura.RECIPES cascade;

    drop table if exists tura.RELATION cascade;

    drop table if exists tura.RELATIONMAPPER cascade;

    drop table if exists tura.RELATIONSHIP cascade;

    drop table if exists tura.RETURNVALUE cascade;

    drop table if exists tura.RL_LAYERS_OPLAYERSMAPPER cascade;

    drop table if exists tura.RL_MAPPERS_OPMAPPERSUSINGMAPPERS cascade;

    drop table if exists tura.RL_MODELLAYER_OPMODELLAYERINGREDIENT cascade;

    drop table if exists tura.RL_VEWLAYER_OPVEWLAYERINGREDIENT cascade;

    drop table if exists tura.ROLE_ cascade;

    drop table if exists tura.ROLEMAPPER cascade;

    drop table if exists tura.ROLES cascade;

    drop table if exists tura.ROOT cascade;

    drop table if exists tura.SEARCHTRIGGER cascade;

    drop table if exists tura.SECURED cascade;

    drop table if exists tura.SECURITYENTITY cascade;

    drop table if exists tura.SECURITYENTITYPOINTER cascade;

    drop table if exists tura.SELECTION cascade;

    drop table if exists tura.STYLEELEMENT cascade;

    drop table if exists tura.STYLELIBRARY cascade;

    drop table if exists tura.STYLEPOINTER cascade;

    drop table if exists tura.STYLESET cascade;

    drop table if exists tura.SUBSYSTEM cascade;

    drop table if exists tura.TABPAGESINHERITANCE cascade;

    drop table if exists tura.TECHLEAF cascade;

    drop table if exists tura.TECHNOLOGY cascade;

    drop table if exists tura.TOSUBMENU cascade;

    drop table if exists tura.TRANSLATION cascade;

    drop table if exists tura.TRIGGER cascade;

    drop table if exists tura.TYPEELEMENT cascade;

    drop table if exists tura.TYPEGROUP cascade;

    drop table if exists tura.TYPEMAPPER cascade;

    drop table if exists tura.TYPEPOINTER cascade;

    drop table if exists tura.TYPEPOINTEROBJ cascade;

    drop table if exists tura.UIELEMENT cascade;

    drop table if exists tura.UPDATETRIGGER cascade;

    drop table if exists tura.USINGMAPPERS cascade;

    drop table if exists tura.VERSION cascade;

    drop table if exists tura.VERSIONREF cascade;

    drop table if exists tura.VIEWAREA cascade;

    drop table if exists tura.VIEWELEMENT cascade;

    drop table if exists tura.VIEWINHERITANCE cascade;

    drop table if exists tura.VIEWPORT cascade;

    drop table if exists tura.VIEWPORTHOLDER cascade;

    drop table if exists tura.VIEWPORTTRIGGER cascade;

    drop table if exists tura.VIEWS cascade;

    drop table if exists tura.XMLPACKAGEMAPPER cascade;

    drop table if exists tura.XMLTYPEMAPPER cascade;

    create table tura.APPLICATION (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATION int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATIONS_APPLICATION_GROUP varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONGROUP (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONGROUP int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_PACKAGES_DOMAIN_APPLICATION varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONINFRASTRUCTURELAYER (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONINFRASTRUCTURELAYER int4,
        ref_suid_metaObject varchar(255),
        REF_INFARASTRUCTURE_LAYERS_APPLICATION_INFRASTRUCTURE_LAYERS varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONINFRASTRUCTURELAYERS (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONINFRASTRUCTURELAYERS int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_INFRASTRUCTURE_LAYER_APPLICATION varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONLANGUAGES (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONLANGUAGES int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_LANGUAGES_APPLICATION_MESSAGE_LIBRARIES varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONMAPPER (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONMAPPER int4,
        ref_suid_metaObject varchar(255),
        REF_MAPPERS_APPLICATION_MAPPERS varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONMAPPERS (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONMAPPERS int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_MAPPERS_APPLICATION varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONMESSAGELIBRARIES (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONMESSAGELIBRARIES int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_MESSAGES_APPLICATION varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONMESSAGELIBRARY (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONMESSAGELIBRARY int4,
        ref_suid_metaObject varchar(255),
        REF_MESSAGE_LIBRARIES_APPLICATION_MESSAGE_LIBRARIES varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONREALM (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONREALM int4,
        ref_suid_metaObject varchar(255),
        REF_REALMS_APPLICATION_REALMS varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONREALMS (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONREALMS int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_ROLE_APPLICATION varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONRECIPE (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONRECIPE int4,
        ref_suid_metaObject varchar(255),
        REF_RECIPES_APPLICATION_RECIPES varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONRECIPES (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONRECIPES int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_RECIPES_APPLICATION varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONSTYLE (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONSTYLE int4,
        ref_suid_metaObject varchar(255),
        REF_STYLE_LIBRARIES_APPLICATION_STYLE_LIBRARIES varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONSTYLELIBRARIES (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONSTYLELIBRARIES int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_STYLE_APPLICATION varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONUILAYER (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONUILAYER int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_U_I_LAYER_APPLICATION varchar(255),
        primary key (UID)
    );

    create table tura.APPLICATIONUIPACKAGE (
       UID varchar(255) not null,
        NAME varchar(255),
        V_APPLICATIONUIPACKAGE int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATION_U_I_PACKAGES_APPLICATION_U_I_LAYER varchar(255),
        primary key (UID)
    );

    create table tura.AREAREF (
       UID varchar(255) not null,
        GROUP_ int4,
        V_AREAREF int4,
        REF_OP_AREA_AREA_REF_NICK_NAMED varchar(255),
        ref_suid_metaObject varchar(255),
        REF_BLOCK_BLOCKABLE varchar(255),
        REF_REFRESH_AREAS_MENU_ITEM varchar(255),
        REF_REFRESH_AREAS_UIELEMENT varchar(255),
        REF_SOURCE_TARGET_DATA_EXPORTER varchar(255),
        REF_SOURCE_TARGET_OVERLAY_CANVAS varchar(255),
        primary key (UID)
    );

    create table tura.ARTIFACT (
       UID varchar(255) not null,
        DESCRIPTION varchar(255),
        KEY_ID varchar(255),
        NAME varchar(255),
        TEMPLATE varchar(255),
        V_ARTIFACT int4,
        ref_suid_metaObject varchar(255),
        REF_ARTIFACTS_ARTIFACT_GROUP varchar(255),
        primary key (UID)
    );

    create table tura.ARTIFACTGROUP (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_ARTIFACTGROUP int4,
        ref_suid_metaObject varchar(255),
        REF_ARTIFACT_PACKAGES_DOMAIN_ARTIFACT varchar(255),
        primary key (UID)
    );

    create table tura.ARTIFACTREF (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_ARTIFACTREF int4,
        REF_OP_ARTIFACT_REF_ARTIFACT_REF_ARTIFACT varchar(255),
        primary key (SUID)
    );

    create table tura.ARTIFICIALFIELD (
       UID varchar(255) not null,
        NAME varchar(255),
        V_ARTIFICIALFIELD int4,
        ref_suid_metaObject varchar(255),
        ref_suid_typePointer varchar(255),
        REF_ARTIFICIAL_FIELDS_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.ATTRIBUTE (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        PK boolean,
        UK boolean,
        V_ATTRIBUTE int4,
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_typePointer varchar(255),
        REF_ATTRIBUTES_TYPE varchar(255),
        primary key (UID)
    );

    create table tura.ATTRIBUTECONNECTOR (
       UID varchar(255) not null,
        MERGE_ATTR boolean,
        V_ATTRIBUTECONNECTOR int4,
        ref_suid_metaObject varchar(255),
        ref_suid_operationConnectorRef varchar(255),
        REF_ATTRIBUTES_CONNECTOR_OBJECT_MAPPER_GROUP varchar(255),
        REF_OP_SOURCE_ATTRIBUTE_CONNECTOR_META_OBJECT varchar(255),
        REF_OP_TARGET_ATTRIBUTE_CONNECTOR_META_OBJECT varchar(255),
        primary key (UID)
    );

    create table tura.ATTRIBUTEPOINTER (
       UID varchar(255) not null,
        V_ATTRIBUTEPOINTER int4,
        REF_OP_ATTRIBUTE_REF_ATTRIBUTE_POINTER_ATTRIBUTE varchar(255),
        ref_suid_metaObject varchar(255),
        REF_ATTRIBUTES_OBJECT_MAPPER varchar(255),
        primary key (UID)
    );

    create table tura.BLOCKABLE (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_BLOCKABLE int4,
        primary key (SUID)
    );

    create table tura.CALCULATEDFIELD (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        NAME varchar(255),
        V_CALCULATEDFIELD int4,
        VALUE varchar(255),
        ref_suid_typePointer varchar(255),
        REF_CALCULATIONS_OBJECT_MAPPER varchar(255),
        ref_suid_metaObject varchar(255),
        REF_VARIABLES_OBJECT_MAPPER_GROUP varchar(255),
        REF_AGGRIGATIONS_OBJECT_MAPPER varchar(255),
        primary key (UID)
    );

    create table tura.CANVASFRAME (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        NAME varchar(255),
        V_CANVASFRAME int4,
        MODAL boolean,
        ORIENTATION varchar(255),
        TAB_SEQUENCE int4,
        ref_suid_styleElement varchar(255),
        REF_CANVASES_VIEWS varchar(255),
        ref_suid_categorized varchar(255),
        ref_suid_defaultCavas varchar(255),
        ref_suid_flexFields varchar(255),
        ref_suid_hTMLLayerHolder varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_multiLangLabel varchar(255),
        ref_suid_viewPortHolder varchar(255),
        ref_suid_nickNamed varchar(255),
        ref_suid_blockable varchar(255),
        ref_suid_secured varchar(255),
        ref_suid_orderable varchar(255),
        primary key (UID)
    );

    create table tura.CATEGORIZED (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_CATEGORIZED int4,
        primary key (SUID)
    );

    create table tura.CHILDRENHOLDER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_CHILDRENHOLDER int4,
        primary key (SUID)
    );

    create table tura.CLASSIFIER (
       UID varchar(255) not null,
        DETAILS varchar(255),
        KEY_ID varchar(255),
        V_CLASSIFIER int4,
        REF_OP_HINT_CLASSIFIER_GENERATION_HINT varchar(255),
        ref_suid_metaObject varchar(255),
        REF_CLASSIFIERS_CATEGORIZED varchar(255),
        primary key (UID)
    );

    create table tura.COLUMN (
       UID varchar(255) not null,
        LABEL varchar(255),
        PRIORITY int4,
        SORTABLE varchar(255),
        V_COLUMN int4,
        ref_suid_categorized varchar(255),
        ref_suid_flexFields varchar(255),
        ref_suid_hTMLLayerHolder varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_multiLangLabel varchar(255),
        ref_suid_orderable varchar(255),
        ref_suid_styleElement varchar(255),
        REF_COLS_TABLE varchar(255),
        REF_COLS_TREE varchar(255),
        primary key (UID)
    );

    create table tura.COMPONENT (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        COMPONENT_ROOT varchar(255),
        NAME varchar(255),
        SKIP boolean,
        V_COMPONENT int4,
        ARTIFACT_ID varchar(255),
        BASE_PACKAGE varchar(255),
        GROUP_ID varchar(255),
        PACKAGE_NAME varchar(255),
        ref_suid_hTMLLayerHolder varchar(255),
        ref_suid_orderable varchar(255),
        REF_COMPONENTS_INGREDIENT varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_versionRef varchar(255),
        REF_OP_MAPPER_REF_JAVA_COMPONENT_MAPPER varchar(255),
        REF_OP_MAPPER_REF_JAVA_SCRIPT_COMPONENT_MAPPER varchar(255),
        primary key (UID)
    );

    create table tura.CONFIGEXTENSION (
       UID varchar(255) not null,
        CONFIG_BRANCH varchar(255),
        V_CONFIGEXTENSION int4,
        ref_suid_metaObject varchar(255),
        REF_CONFIG_EXTENSIONS_RECIPES varchar(255),
        REF_OP_SOURCE_CONFIG_EXTENSION_CONFIGURATION varchar(255),
        REF_OP_TARGET_CONFIG_EXTENSION_CONFIGURATION varchar(255),
        primary key (UID)
    );

    create table tura.CONFIGHASH (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_CONFIGHASH int4,
        ref_suid_metaObject varchar(255),
        REF_CONFIG_HASHES_TECH_LEAF varchar(255),
        primary key (UID)
    );

    create table tura.CONFIGHASHWITHNICKNAME (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_CONFIGHASHWITHNICKNAME int4,
        REF_OP_HASH_CONFIG_HASH_WITH_NICK_NAME_CONFIG_HASH varchar(255),
        ref_suid_metaObject varchar(255),
        REF_CONFIG_HASHES_ARTIFACT varchar(255),
        primary key (UID)
    );

    create table tura.CONFIGURATION (
       UID varchar(255) not null,
        NAME varchar(255),
        V_CONFIGURATION int4,
        ref_suid_metaObject varchar(255),
        REF_CONFIGURATIONS_RECIPES varchar(255),
        primary key (UID)
    );

    create table tura.CONFIGVARIABLE (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_CONFIGVARIABLE int4,
        ref_suid_metaObject varchar(255),
        REF_CONFIG_VARIABLES_TECH_LEAF varchar(255),
        primary key (UID)
    );

    create table tura.CONFIGVARIABLEWITHNICKNAME (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_CONFIGVARIABLEWITHNICKNAME int4,
        ref_suid_metaObject varchar(255),
        REF_CONFIG_VARIABLES_ARTIFACT varchar(255),
        REF_OP_VAR_REF_CONFIG_VARIABLE_WITH_NICK_NAME_CONFIG_VARIABLE varchar(255),
        primary key (UID)
    );

    create table tura.CONTEXTPARAMETER (
       UID varchar(255) not null,
        OPERATION varchar(255),
        V_CONTEXTPARAMETER int4,
        ref_suid_metaObject varchar(255),
        REF_PARAMETERS_CONTEXT_PARAMETERS varchar(255),
        REF_OP_REF_OBJ_CONTEXT_PARAMETER_META_OBJECT varchar(255),
        primary key (UID)
    );

    create table tura.CONTEXTPARAMETERS (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_CONTEXTPARAMETERS int4,
        primary key (SUID)
    );

    create table tura.CONTEXTPARAMETERSOBJ (
       UID varchar(255) not null,
        V_CONTEXTPARAMETERSOBJ int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        REF_DEFAULT_SEARCH_ATTRIBUTE_CONNECTOR varchar(255),
        REF_DEFAULT_SEARCH_DATA_CONTROL varchar(255),
        REF_DEFAULT_SEARCH_OPERATION_CONNECTOR varchar(255),
        primary key (UID)
    );

    create table tura.CONTEXTVALUE (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        CONSTANT boolean,
        V_CONTEXTVALUE int4,
        VALUE varchar(255),
        REF_VALUE_CONTEXT_PARAMETER varchar(255),
        ref_suid_contextParameters varchar(255),
        REF_ENABLED_ENABLED_U_I_ITEM varchar(255),
        REF_ICON_ITEM_ICON varchar(255),
        REF_IMAGE_TREE varchar(255),
        REF_INITIAL_OPTION_MESSAGE_OPTION_SELECTION varchar(255),
        REF_MULTI_LANG_LABEL_MULTI_LANG_LABEL varchar(255),
        REF_READ_ONLY_UIELEMENT varchar(255),
        REF_REQUIRED_UIELEMENT varchar(255),
        REF_STYLE_STYLE_ELEMENT varchar(255),
        REF_TRANSITION_MENU_ITEM varchar(255),
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        REF_FIELDS_FLEX_FIELDS varchar(255),
        primary key (UID)
    );

    create table tura.CONTROLPOINTER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_CONTROLPOINTER int4,
        REF_OP_SOURCE_CAST_CONTROL_POINTER_TYPE varchar(255),
        REF_OP_SOURCE_CAST_DATA_CONTROL_CONTROL_POINTER_DATA_CONTROL varchar(255),
        REF_OP_SOURCE_POINTER_CONTROL_POINTER_DATA_CONTROL varchar(255),
        REF_OP_VALUE_POINTER_CONTROL_POINTER_META_OBJECT varchar(255),
        primary key (SUID)
    );

    create table tura.CONTROLS (
       UID varchar(255) not null,
        V_CONTROLS int4,
        ref_suid_metaObject varchar(255),
        REF_DATACONTROLS_FORM varchar(255),
        primary key (UID)
    );

    create table tura.CREATETRIGGER (
       UID varchar(255) not null,
        V_CREATETRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_CREATE_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.CSSMAPPER (
       UID varchar(255) not null,
        LIBRARY_URL varchar(255),
        V_CSSMAPPER int4,
        ref_suid_mapper varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_stylePointer varchar(255),
        primary key (UID)
    );

    create table tura.DATACENTER (
       UID varchar(255) not null,
        NAME varchar(255),
        V_DATACENTER int4,
        ref_suid_metaObject varchar(255),
        REF_DATACENTERS_ENTERPRISE_INFRASTRUCTURE varchar(255),
        primary key (UID)
    );

    create table tura.DATACONTROL (
       UID varchar(255) not null,
        NAME varchar(255),
        V_DATACONTROL int4,
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        REF_CONTROLS_CONTROLS varchar(255),
        primary key (UID)
    );

    create table tura.DEFAULTCAVAS (
       SUID varchar(255) not null,
        DEFAULT_CANVAS boolean,
        INH_SWITCH varchar(255),
        V_DEFAULTCAVAS int4,
        primary key (SUID)
    );

    create table tura.DELETETRIGGER (
       UID varchar(255) not null,
        V_DELETETRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        primary key (UID)
    );

    create table tura.DEPENDENCY (
       UID varchar(255) not null,
        NAME varchar(255),
        V_DEPENDENCY int4,
        REF_OP_DETAIL_DEPENDENCY_DATA_CONTROL varchar(255),
        ref_suid_metaObject varchar(255),
        REF_OP_MASTER_DEPENDENCY_DATA_CONTROL varchar(255),
        REF_DEPENDENCIES_CONTROLS varchar(255),
        primary key (UID)
    );

    create table tura.DEPLOYMENTCOMPONENT (
       UID varchar(255) not null,
        NAME varchar(255),
        SKIP boolean,
        V_DEPLOYMENTCOMPONENT int4,
        REF_DEPLOYMENT_COMPONENT_LINK_DEPLOYMENT_COMPONENT varchar(255),
        ref_suid_metaObject varchar(255),
        REF_OP_MAPPER_DEPLOYMENT_COMPONENT_MODEL_MAPPER varchar(255),
        REF_DEPLYMENT_STEP_RECIPE varchar(255),
        primary key (UID)
    );

    create table tura.DEPLOYMENTSTARSTEP (
       UID varchar(255) not null,
        NAME varchar(255),
        V_DEPLOYMENTSTARSTEP int4,
        REF_OP_FIRST_STEP_DEPLOYMENT_STAR_STEP_DEPLOYMENT_COMPONENT varchar(255),
        ref_suid_metaObject varchar(255),
        REF_START_SEQ_RECIPE varchar(255),
        primary key (UID)
    );

    create table tura.DOMAIN (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        V_DOMAIN int4,
        ref_suid_metaObject varchar(255),
        primary key (UID)
    );

    create table tura.DOMAINAPPLICATION (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_DOMAINAPPLICATION int4,
        ref_suid_metaObject varchar(255),
        REF_APPLICATIONS_DOMAIN_APPLICATIONS varchar(255),
        primary key (UID)
    );

    create table tura.DOMAINAPPLICATIONS (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_DOMAINAPPLICATIONS int4,
        ref_suid_metaObject varchar(255),
        REF_DOMAIN_APPLICATIONS_DOMAIN varchar(255),
        primary key (UID)
    );

    create table tura.DOMAINARTIFACT (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_DOMAINARTIFACT int4,
        ref_suid_metaObject varchar(255),
        REF_DOMAIN_ARTIFACT_DOMAIN_ARTIFACTS varchar(255),
        primary key (UID)
    );

    create table tura.DOMAINARTIFACTS (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_DOMAINARTIFACTS int4,
        ref_suid_metaObject varchar(255),
        REF_DOMAIN_ARTIFACTS_DOMAIN varchar(255),
        primary key (UID)
    );

    create table tura.DOMAINMAPPER (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_DOMAINMAPPER int4,
        ref_suid_metaObject varchar(255),
        REF_MAPPERS_DOMAIN_MAPPERS varchar(255),
        primary key (UID)
    );

    create table tura.DOMAINMAPPERS (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_DOMAINMAPPERS int4,
        ref_suid_metaObject varchar(255),
        REF_DOMAIN_MAPPERS_DOMAIN varchar(255),
        primary key (UID)
    );

    create table tura.DOMAINTYPES (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_DOMAINTYPES int4,
        ref_suid_metaObject varchar(255),
        REF_DOMAIN_TYPES_DOMAIN varchar(255),
        primary key (UID)
    );

    create table tura.DOMAINTYPESREPOSITORY (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_DOMAINTYPESREPOSITORY int4,
        ref_suid_metaObject varchar(255),
        REF_TYPES_REPOSITORY_DOMAIN_TYPES varchar(255),
        primary key (UID)
    );

    create table tura.ENABLEDUIITEM (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_ENABLEDUIITEM int4,
        primary key (SUID)
    );

    create table tura.ENTERPRISEINFRASTRUCTURE (
       UID varchar(255) not null,
        NAME varchar(255),
        V_ENTERPRISEINFRASTRUCTURE int4,
        ref_suid_metaObject varchar(255),
        REF_INFARASTRUCTURES_APPLICATION_INFRASTRUCTURE_LAYER varchar(255),
        primary key (UID)
    );

    create table tura.ENUMATTRIBUTE (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_ENUMATTRIBUTE int4,
        VALUE varchar(255),
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        REF_VALUES_ENUMERATOR varchar(255),
        primary key (UID)
    );

    create table tura.EXPRESSIONPART (
       UID varchar(255) not null,
        EXPRESSION_TYPE varchar(255),
        ORDER_ int4,
        V_EXPRESSIONPART int4,
        ref_suid_metaObject varchar(255),
        REF_OP_OBJ_REF_EXPRESSION_PART_META_OBJECT varchar(255),
        REF_EXPRESSION_CONTEXT_VALUE varchar(255),
        primary key (UID)
    );

    create table tura.FLEXFIELDS (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_FLEXFIELDS int4,
        primary key (SUID)
    );

    create table tura.FORM (
       UID varchar(255) not null,
        NAME varchar(255),
        V_FORM int4,
        ref_suid_metaObject varchar(255),
        REF_FORMS_APPLICATION_U_I_PACKAGE varchar(255),
        primary key (UID)
    );

    create table tura.FORMATABLE (
       SUID varchar(255) not null,
        FORMAT varchar(255),
        INH_SWITCH varchar(255),
        V_FORMATABLE int4,
        primary key (SUID)
    );

    create table tura.FORMPARAMETER (
       UID varchar(255) not null,
        NAME varchar(255),
        V_FORMPARAMETER int4,
        ref_suid_metaObject varchar(255),
        ref_suid_typePointer varchar(255),
        REF_PARAMETERS_FORM varchar(255),
        primary key (UID)
    );

    create table tura.FORMVARIABLE (
       UID varchar(255) not null,
        NAME varchar(255),
        V_FORMVARIABLE int4,
        ref_suid_metaObject varchar(255),
        ref_suid_typePointer varchar(255),
        REF_VARIABLES_ROOT varchar(255),
        REF_OP_PARAM_REF_FORM_VARIABLE_FORM_PARAMETER varchar(255),
        primary key (UID)
    );

    create table tura.GENERATIONHINT (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_GENERATIONHINT int4,
        ref_suid_metaObject varchar(255),
        REF_HINTS_TECH_LEAF varchar(255),
        primary key (UID)
    );

    create table tura.GENERATIONHINTWITHNICKNAME (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_GENERATIONHINTWITHNICKNAME int4,
        REF_OP_HINT_GENERATION_HINT_WITH_NICK_NAME_GENERATION_HINT varchar(255),
        ref_suid_metaObject varchar(255),
        REF_HINTS_ARTIFACT varchar(255),
        primary key (UID)
    );

    create table tura.GRANTACCESS (
       UID varchar(255) not null,
        V_GRANTACCESS int4,
        ref_suid_metaObject varchar(255),
        ref_suid_securityEntityPointer varchar(255),
        REF_GRANTS_SECURED varchar(255),
        primary key (UID)
    );

    create table tura.GROUP2GROUP (
       UID varchar(255) not null,
        V_GROUP2GROUP int4,
        ref_suid_metaObject varchar(255),
        REF_GROUP2_GROUPS_ROLES varchar(255),
        REF_OP_SOURCE_GROUP2_GROUP_GROUP varchar(255),
        REF_OP_TARGET_GROUP2_GROUP_GROUP varchar(255),
        primary key (UID)
    );

    create table tura.GROUP2ROLE (
       UID varchar(255) not null,
        V_GROUP2ROLE int4,
        ref_suid_metaObject varchar(255),
        REF_GROUP2_ROLES_ROLES varchar(255),
        REF_OP_SOURCE_GROUP2_ROLE_GROUP varchar(255),
        REF_OP_TARGET_GROUP2_ROLE_ROLE varchar(255),
        primary key (UID)
    );

    create table tura.GROUP_ (
       UID varchar(255) not null,
        V_GROUP int4,
        ref_suid_metaObject varchar(255),
        ref_suid_securityEntity varchar(255),
        REF_GROUPS_ROLES varchar(255),
        primary key (UID)
    );

    create table tura.HASHPROPERTY (
       UID varchar(255) not null,
        V_HASHPROPERTY int4,
        REF_OP_CONF_HASH_REF_HASH_PROPERTY_CONFIG_HASH varchar(255),
        ref_suid_metaObject varchar(255),
        REF_HASH_PROPERTIES_CONFIGURATION varchar(255),
        primary key (UID)
    );

    create table tura.HTMLLAYERHOLDER (
       SUID varchar(255) not null,
        COLUMNS int4,
        INH_SWITCH varchar(255),
        V_HTMLLAYERHOLDER int4,
        primary key (SUID)
    );

    create table tura.INFRASTRUCTURE (
       UID varchar(255) not null,
        NAME varchar(255),
        V_INFRASTRUCTURE int4,
        ref_suid_metaObject varchar(255),
        REF_INFRASTRUCTURES_RECIPES varchar(255),
        primary key (UID)
    );

    create table tura.INFRASTRUCTURE2CONFIGURATION (
       UID varchar(255) not null,
        CONFIG_BRANCH varchar(255),
        V_INFRASTRUCTURE2CONFIGURATION int4,
        ref_suid_metaObject varchar(255),
        REF_INFRASTRUCTURE2_CONFIGURATIONS_RECIPES varchar(255),
        REF_OP_SOURCE_INFRASTRUCTURE2_CONFIGURATION_INFRASTRUCTURE varchar(255),
        REF_OP_TARGET_INFRASTRUCTURE2_CONFIGURATION_CONFIGURATION varchar(255),
        primary key (UID)
    );

    create table tura.INFRASTRUCTURECOMPONENT (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        NAME varchar(255),
        V_INFRASTRUCTURECOMPONENT int4,
        REF_INFRASTRUCTURE_COMPONENT_INFRASTRUCTURE_LAYER varchar(255),
        ref_suid_metaObject varchar(255),
        REF_SERVERS_SERVER_CLASTER varchar(255),
        primary key (UID)
    );

    create table tura.INFRASTRUCTURECONNECTION (
       UID varchar(255) not null,
        V_INFRASTRUCTURECONNECTION int4,
        ref_suid_metaObject varchar(255),
        REF_INFRASTRUCTURE_CONNECTIONS_ENTERPRISE_INFRASTRUCTURE varchar(255),
        REF_OP_SOURCE_INFRASTRUCTURE_CONNECTION_INFRASTRUCTURE_COMPONENT varchar(255),
        REF_OP_TARGET_INFRASTRUCTURE_CONNECTION_INFRASTRUCTURE_COMPONENT varchar(255),
        primary key (UID)
    );

    create table tura.INFRASTRUCTURELAYER (
       UID varchar(255) not null,
        NAME varchar(255),
        V_INFRASTRUCTURELAYER int4,
        ref_suid_metaObject varchar(255),
        REF_INFRASTRUCTURE_LAYER_SUBSYSTEM varchar(255),
        primary key (UID)
    );

    create table tura.INGREDIENT (
       UID varchar(255) not null,
        NAME varchar(255),
        SKIP boolean,
        V_INGREDIENT int4,
        REF_OP_CONTROLLER_LAYER_INGREDIENT_MAPPING_LAYER varchar(255),
        ref_suid_hTMLLayerHolder varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_orderable varchar(255),
        ref_suid_usingMappers varchar(255),
        REF_INGREDIENTS_RECIPE varchar(255),
        primary key (UID)
    );

    create table tura.INSERTTRIGGER (
       UID varchar(255) not null,
        V_INSERTTRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        primary key (UID)
    );

    create table tura.ITEMICON (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_ITEMICON int4,
        primary key (SUID)
    );

    create table tura.JAVAMAPPER (
       UID varchar(255) not null,
        ARTIFACT_ID varchar(255),
        ARTIFACT_TYPE varchar(255),
        GROUP_ID varchar(255),
        LIBRARY_NAME varchar(255),
        MAPPED_TO_CLASS_NAME varchar(255),
        MAPPED_TO_PACKAGE_NAME varchar(255),
        SCOPE varchar(255),
        V_JAVAMAPPER int4,
        ref_suid_mapper varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_typeMapper varchar(255),
        ref_suid_typePointer varchar(255),
        ref_suid_versionRef varchar(255),
        primary key (UID)
    );

    create table tura.JAVAPACKAGEMAPPER (
       UID varchar(255) not null,
        ARTIFACT_ID varchar(255),
        ARTIFACT_TYPE varchar(255),
        GROUP_ID varchar(255),
        LIBRARY_NAME varchar(255),
        MAPPED_TO_PACKAGE_NAME varchar(255),
        SCOPE varchar(255),
        V_JAVAPACKAGEMAPPER int4,
        ref_suid_mapper varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_packageMapper varchar(255),
        ref_suid_packagePointer varchar(255),
        ref_suid_versionRef varchar(255),
        primary key (UID)
    );

    create table tura.JAVASCRIPTMAPPER (
       UID varchar(255) not null,
        ARTIFACT_ID varchar(255),
        ARTIFACT_TYPE varchar(255),
        GROUP_ID varchar(255),
        JS_PACKAGE_NAME varchar(255),
        LIBRARY_URL varchar(255),
        LOCAL boolean,
        MAPPED_TO_CLASS_NAME varchar(255),
        MAPPED_TO_INTERNAL_LOCATION varchar(255),
        V_JAVASCRIPTMAPPER int4,
        ref_suid_mapper varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_typeMapper varchar(255),
        ref_suid_typePointer varchar(255),
        ref_suid_versionRef varchar(255),
        primary key (UID)
    );

    create table tura.KEYVALUEPAIR (
       UID varchar(255) not null,
        KEY_CODE varchar(255),
        V_KEYVALUEPAIR int4,
        VALUE varchar(255),
        ref_suid_metaObject varchar(255),
        REF_HASH_HASH_PROPERTY varchar(255),
        primary key (UID)
    );

    create table tura.LANGUAGE (
       UID varchar(255) not null,
        CODE varchar(255),
        DEFAULT_LANG boolean,
        LANG varchar(255),
        V_LANGUAGE int4,
        ref_suid_metaObject varchar(255),
        REF_LANGUAGES_APPLICATION_LANGUAGES varchar(255),
        primary key (UID)
    );

    create table tura.LINK (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        V_LINK int4,
        REF_OP_DETAIL_FIELD_LINK_ATTRIBUTE varchar(255),
        ref_suid_metaObject varchar(255),
        REF_OP_MASTER_FIELD_LINK_ATTRIBUTE varchar(255),
        REF_LINKS_ASSOSIATION varchar(255),
        REF_LINKS_RELATION varchar(255),
        primary key (UID)
    );

    create table tura.LINKTOLABEL (
       UID varchar(255) not null,
        V_LINKTOLABEL int4,
        ref_suid_metaObject varchar(255),
        REF_LINK_TO_LABELS_VIEW_AREA varchar(255),
        REF_OP_SOURCE_LINK_TO_LABEL_INPUT_ELEMENT varchar(255),
        REF_OP_TARGET_LINK_TO_LABEL_LABEL varchar(255),
        primary key (UID)
    );

    create table tura.LINKTOMESSAGE (
       UID varchar(255) not null,
        V_LINKTOMESSAGE int4,
        ref_suid_metaObject varchar(255),
        REF_LINK_TO_MESSAGES_VIEW_AREA varchar(255),
        REF_OP_SOURCE_LINK_TO_MESSAGE_INPUT_ELEMENT varchar(255),
        REF_OP_TARGET_LINK_TO_MESSAGE_MESSAGE_ELEMENT varchar(255),
        primary key (UID)
    );

    create table tura.LISTOFLANGUAGES (
       UID varchar(255) not null,
        CODE varchar(255),
        DESCRIPTION varchar(255),
        LANGUAGE varchar(255),
        V_LISTOFLANGUAGES int4,
        primary key (UID)
    );

    create table tura.MAPPER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_MAPPER int4,
        REF_MAPPERS_MAPPERS varchar(255),
        primary key (SUID)
    );

    create table tura.MAPPERS (
       UID varchar(255) not null,
        V_MAPPERS int4,
        ref_suid_metaObject varchar(255),
        REF_MAPPER_APPLICATION_MAPPER varchar(255),
        primary key (UID)
    );

    create table tura.MAPPINGLAYER (
       UID varchar(255) not null,
        NAME varchar(255),
        ORDER_ int4,
        V_MAPPINGLAYER int4,
        ref_suid_metaObject varchar(255),
        REF_APP_LAYERS_APPLICATION_MAPPERS varchar(255),
        primary key (UID)
    );

    create table tura.MAPPINGTECNOLOGIY (
       UID varchar(255) not null,
        V_MAPPINGTECNOLOGIY int4,
        ref_suid_metaObject varchar(255),
        REF_TECHNOLOGIES_MODEL_MAPPER varchar(255),
        REF_OP_TECH_REF_MAPPING_TECNOLOGIY_TECHNOLOGY varchar(255),
        REF_OP_VALUE_REF_MAPPING_TECNOLOGIY_OPTION varchar(255),
        primary key (UID)
    );

    create table tura.MENUDEFINITION (
       UID varchar(255) not null,
        NAME varchar(255),
        V_MENUDEFINITION int4,
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_styleElement varchar(255),
        REF_MENUS_VIEWS varchar(255),
        primary key (UID)
    );

    create table tura.MENUELEMENT (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        NAME varchar(255),
        V_MENUELEMENT int4,
        ref_suid_categorized varchar(255),
        ref_suid_enabledUIItem varchar(255),
        ref_suid_flexFields varchar(255),
        ref_suid_multiLangLabel varchar(255),
        ref_suid_orderable varchar(255),
        ref_suid_styleElement varchar(255),
        REF_MENU_ELEMENTS_MENU_FOLDER varchar(255),
        ref_suid_itemIcon varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_menuExtensionRef varchar(255),
        primary key (UID)
    );

    create table tura.MENUEXTENSIONREF (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_MENUEXTENSIONREF int4,
        REF_OP_EXTENSION_REF_MENU_EXTENSION_REF_MENU_FOLDER varchar(255),
        primary key (SUID)
    );

    create table tura.MENUFOLDER (
       UID varchar(255) not null,
        EXTENSION_POINT boolean,
        NAME varchar(255),
        V_MENUFOLDER int4,
        ref_suid_categorized varchar(255),
        ref_suid_enabledUIItem varchar(255),
        ref_suid_flexFields varchar(255),
        ref_suid_hTMLLayerHolder varchar(255),
        ref_suid_itemIcon varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_multiLangLabel varchar(255),
        ref_suid_styleElement varchar(255),
        REF_MENU_FOLDERS_MENU_DEFINITION varchar(255),
        primary key (UID)
    );

    create table tura.MENUHOLDER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_MENUHOLDER int4,
        REF_OP_MENU_MENU_HOLDER_MENU_FOLDER varchar(255),
        primary key (SUID)
    );

    create table tura.MESSAGE (
       UID varchar(255) not null,
        NAME varchar(255),
        V_MESSAGE int4,
        ref_suid_metaObject varchar(255),
        REF_MESSAGES_MESSAGE_LIBRARY varchar(255),
        primary key (UID)
    );

    create table tura.MESSAGELIBRARY (
       UID varchar(255) not null,
        NAME varchar(255),
        V_MESSAGELIBRARY int4,
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        REF_LIBRARIES_APPLICATION_MESSAGE_LIBRARY varchar(255),
        primary key (UID)
    );

    create table tura.METAMODELPACKAGEMAPPER (
       UID varchar(255) not null,
        MAPPED_TO_PACKAGE_NAME varchar(255),
        V_METAMODELPACKAGEMAPPER int4,
        ref_suid_mapper varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_packageMapper varchar(255),
        ref_suid_packagePointer varchar(255),
        primary key (UID)
    );

    create table tura.METAOBJECT (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_METAOBJECT int4,
        primary key (SUID)
    );

    create table tura.METHODPOINTER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_METHODPOINTER int4,
        REF_OP_METHOD_REF_METHOD_POINTER_OPERATION varchar(255),
        primary key (SUID)
    );

    create table tura.MODELMAPPER (
       UID varchar(255) not null,
        ARTIFACT_EXTENSION varchar(255),
        ARTIFACT_ROOT varchar(255),
        CONFIG_BRANCH varchar(255),
        NAME varchar(255),
        SKIP boolean,
        V_MODELMAPPER int4,
        ref_suid_artifactRef varchar(255),
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_orderable varchar(255),
        REF_MAPPERS_COMPONENT varchar(255),
        primary key (UID)
    );

    create table tura.MODELQUERY (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        QUERY varchar(1024),
        V_MODELQUERY int4,
        ref_suid_metaObject varchar(255),
        REF_MODEL_QUERY_ARTIFACT varchar(255),
        primary key (UID)
    );

    create table tura.MULTILANGLABEL (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_MULTILANGLABEL int4,
        primary key (SUID)
    );

    create table tura.NICKNAMED (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        NICKNAME varchar(255),
        V_NICKNAMED int4,
        primary key (SUID)
    );

    create table tura.OBJECTMAPPER (
       UID varchar(255) not null,
        NAME varchar(255),
        V_OBJECTMAPPER int4,
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        REF_OBJECT_MAPPERS_OBJECT_MAPPER_GROUP varchar(255),
        REF_OP_STAGE_OBJECT_MAPPER_PROCESSING_STAGE varchar(255),
        primary key (UID)
    );

    create table tura.OBJECTMAPPERGROUP (
       UID varchar(255) not null,
        NAME varchar(255),
        V_OBJECTMAPPERGROUP int4,
        ref_suid_metaObject varchar(255),
        REF_OBJECT_MAPPER_PACKAGES_DOMAIN_MAPPER varchar(255),
        primary key (UID)
    );

    create table tura.OMRELATION (
       UID varchar(255) not null,
        NAME varchar(255),
        V_OMRELATION int4,
        REF_OP_ASSOSIATION_REF_OM_RELATION_ASSOSIATION varchar(255),
        ref_suid_metaObject varchar(255),
        REF_OP_OBJECT_MAPPER_REF_OM_RELATION_OBJECT_MAPPER varchar(255),
        REF_RELATIONS_OBJECT_MAPPER varchar(255),
        REF_OP_TYPE_REF_OM_RELATION_TYPE_ELEMENT varchar(255),
        primary key (UID)
    );

    create table tura.OPERATION (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_OPERATION int4,
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_secured varchar(255),
        REF_OPERATIONS_TYPE varchar(255),
        primary key (UID)
    );

    create table tura.OPERATIONCONNECTOR (
       UID varchar(255) not null,
        NAME varchar(255),
        OPERATION_TYPE varchar(255),
        V_OPERATIONCONNECTOR int4,
        ref_suid_metaObject varchar(255),
        ref_suid_operationConnectorRef varchar(255),
        REF_OPERATIONS_CONNECTOR_OBJECT_MAPPER_GROUP varchar(255),
        REF_OP_SOURCE_OPERATION_CONNECTOR_OBJECT_MAPPER varchar(255),
        REF_OP_TARGET_OPERATION_CONNECTOR_OBJECT_MAPPER varchar(255),
        primary key (UID)
    );

    create table tura.OPERATIONCONNECTORREF (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_OPERATIONCONNECTORREF int4,
        REF_OP_OPERATION_REF_OPERATION_CONNECTOR_REF_OPERATION_CONNECTOR varchar(255),
        primary key (SUID)
    );

    create table tura.OPTION (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        V_OPTION int4,
        ref_suid_metaObject varchar(255),
        REF_OPTIONS_TECHNOLOGY varchar(255),
        REF_OP_VALUE_OPTION_TECH_LEAF varchar(255),
        primary key (UID)
    );

    create table tura.OPTIONSELECTION (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        INITIAL_OPTION_VALUE varchar(255),
        V_OPTIONSELECTION int4,
        REF_OP_OPTION_CAST_OPTION_SELECTION_TYPE varchar(255),
        REF_OP_OPTION_CAST_DATA_CONTROL_OPTION_SELECTION_DATA_CONTROL varchar(255),
        REF_OP_OPTION_POINTER_OPTION_SELECTION_DATA_CONTROL varchar(255),
        primary key (SUID)
    );

    create table tura.OPTIONSSET (
       UID varchar(255) not null,
        KEY_NAME varchar(255),
        OPTIONSET varchar(255),
        STR_VALUE varchar(255),
        V_OPTIONSSET int4,
        primary key (UID)
    );

    create table tura.ORDERABLE (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        ORDER_ int4,
        V_ORDERABLE int4,
        primary key (SUID)
    );

    create table tura.ORDERBY (
       UID varchar(255) not null,
        ORDER_ varchar(255),
        V_ORDERBY int4,
        ref_suid_metaObject varchar(255),
        REF_ORDER_RULES_ORDERS varchar(255),
        REF_OP_REF_OBJ_ORDER_BY_META_OBJECT varchar(255),
        primary key (UID)
    );

    create table tura.ORDERS (
       UID varchar(255) not null,
        V_ORDERS int4,
        ref_suid_metaObject varchar(255),
        REF_DEFAULT_ORDER_BY_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.PACKAGEMAPPER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_PACKAGEMAPPER int4,
        primary key (SUID)
    );

    create table tura.PACKAGEPOINTER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_PACKAGEPOINTER int4,
        REF_OP_PACKAGE_REF_PACKAGE_POINTER_TYPE_GROUP varchar(255),
        primary key (SUID)
    );

    create table tura.PARAMETER (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        ORDER_ int4,
        V_PARAMETER int4,
        ref_suid_metaObject varchar(255),
        ref_suid_typePointer varchar(255),
        REF_PARAMETERS_OPERATION varchar(255),
        primary key (UID)
    );

    create table tura.POSTCREATETRIGGER (
       UID varchar(255) not null,
        V_POSTCREATETRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_POST_CREATE_TRIGGER_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.POSTQUERYTRIGGER (
       UID varchar(255) not null,
        V_POSTQUERYTRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_POST_QUERY_TRIGGER_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.PREDELETETRIGGER (
       UID varchar(255) not null,
        V_PREDELETETRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_PRE_DELETE_TRIGGER_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.PREFORMTRIGGER (
       UID varchar(255) not null,
        V_PREFORMTRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_PRE_FORM_TRIGGER_ROOT varchar(255),
        primary key (UID)
    );

    create table tura.PREINSERTTRIGGER (
       UID varchar(255) not null,
        V_PREINSERTTRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_PRE_INSERT_TRIGGER_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.PREQUERYTRIGGER (
       UID varchar(255) not null,
        V_PREQUERYTRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_PRE_QUERY_TRIGGER_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.PREUPDATETRIGGER (
       UID varchar(255) not null,
        V_PREUPDATETRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_PRE_UPDATE_TRIGGER_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.PRIMITIVESGROUP (
       UID varchar(255) not null,
        V_PRIMITIVESGROUP int4,
        ref_suid_metaObject varchar(255),
        REF_PRIMITIVES_DOMAIN_TYPES varchar(255),
        primary key (UID)
    );

    create table tura.PROCESSINGSTAGE (
       UID varchar(255) not null,
        NAME varchar(255),
        V_PROCESSINGSTAGE int4,
        ref_suid_metaObject varchar(255),
        REF_NEXT_STAGE_PROCESSING_STAGE varchar(255),
        REF_STAGES_OBJECT_MAPPER_GROUP varchar(255),
        primary key (UID)
    );

    create table tura.PROPERTY (
       UID varchar(255) not null,
        V_PROPERTY int4,
        VALUE varchar(255),
        REF_OP_CONF_VAR_REF_PROPERTY_CONFIG_VARIABLE varchar(255),
        ref_suid_metaObject varchar(255),
        REF_PROPERTIES_CONFIGURATION varchar(255),
        primary key (UID)
    );

    create table tura.QUERY (
       UID varchar(255) not null,
        NAME varchar(255),
        V_QUERY int4,
        ref_suid_metaObject varchar(255),
        REF_QUERIES_MODEL_MAPPER varchar(255),
        REF_OP_QUERY_REF_QUERY_MODEL_QUERY varchar(255),
        primary key (UID)
    );

    create table tura.QUERYPARAMETER (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_QUERYPARAMETER int4,
        ref_suid_metaObject varchar(255),
        REF_PARAMETERS_MODEL_QUERY varchar(255),
        primary key (UID)
    );

    create table tura.QUERYVARIABLE (
       UID varchar(255) not null,
        V_QUERYVARIABLE int4,
        VALUE varchar(255),
        ref_suid_metaObject varchar(255),
        REF_VARIABLES_QUERY varchar(255),
        REF_OP_QUERY_PARAM_REF_QUERY_VARIABLE_QUERY_PARAMETER varchar(255),
        primary key (UID)
    );

    create table tura.RECIPE (
       UID varchar(255) not null,
        NAME varchar(255),
        V_RECIPE int4,
        ref_suid_hTMLLayerHolder varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_usingMappers varchar(255),
        REF_RECIPE_RECIPES varchar(255),
        primary key (UID)
    );

    create table tura.RECIPE2INFRASTRUCTURE (
       UID varchar(255) not null,
        V_RECIPE2INFRASTRUCTURE int4,
        ref_suid_metaObject varchar(255),
        REF_RECIPE2_INFRASTRUCTURES_RECIPES varchar(255),
        REF_OP_SOURCE_RECIPE2_INFRASTRUCTURE_RECIPE varchar(255),
        REF_OP_TARGET_RECIPE2_INFRASTRUCTURE_INFRASTRUCTURE varchar(255),
        primary key (UID)
    );

    create table tura.RECIPES (
       UID varchar(255) not null,
        NAME varchar(255),
        V_RECIPES int4,
        ref_suid_metaObject varchar(255),
        REF_RECIPES_APPLICATION_RECIPE varchar(255),
        primary key (UID)
    );

    create table tura.RELATION (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        IS_TREE boolean,
        NAME varchar(255),
        V_RELATION int4,
        REF_OP_DETAIL_RELATION_DATA_CONTROL varchar(255),
        ref_suid_categorized varchar(255),
        REF_OP_MASTER_RELATION_DATA_CONTROL varchar(255),
        REF_RELATIONS_CONTROLS varchar(255),
        REF_OP_ASSOSIATION_REF_INTERNAL_RELATION_ASSOSIATION varchar(255),
        ref_suid_metaObject varchar(255),
        primary key (UID)
    );

    create table tura.RELATIONMAPPER (
       UID varchar(255) not null,
        V_RELATIONMAPPER int4,
        REF_OP_ASSOSIATION_REF_RELATION_MAPPER_ASSOSIATION varchar(255),
        REF_OP_DATA_CONTROL_REF_RELATION_MAPPER_DATA_CONTROL varchar(255),
        ref_suid_metaObject varchar(255),
        REF_RELATION_MAPPERS_DATA_CONTROL varchar(255),
        REF_OP_TYPE_REF_RELATION_MAPPER_TYPE_ELEMENT varchar(255),
        primary key (UID)
    );

    create table tura.RELATIONSHIP (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        KEY_ID varchar(255),
        V_RELATIONSHIP int4,
        CONTAINMENT varchar(255),
        INTERNAL boolean,
        LAZY boolean,
        SOURCE_OPERATION varchar(255),
        TARGET_OPERATION varchar(255),
        TYPE varchar(255),
        ref_suid_categorized varchar(255),
        REF_RELATIONSHIPS_TYPE_GROUP varchar(255),
        REF_OP_SOURCE_RELATIONSHIP_TYPE_ELEMENT varchar(255),
        REF_OP_TARGET_RELATIONSHIP_TYPE_ELEMENT varchar(255),
        ref_suid_metaObject varchar(255),
        primary key (UID)
    );

    create table tura.RETURNVALUE (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        V_RETURNVALUE int4,
        ref_suid_metaObject varchar(255),
        ref_suid_typePointer varchar(255),
        REF_RETURN_VALUE_OPERATION varchar(255),
        primary key (UID)
    );

    create table tura.RL_LAYERS_OPLAYERSMAPPER (
       layers_suid varchar(255) not null,
        oplayersmapper_uid varchar(255) not null
    );

    create table tura.RL_MAPPERS_OPMAPPERSUSINGMAPPERS (
       mappers_suid varchar(255) not null,
        opmappersusingmappers_uid varchar(255) not null
    );

    create table tura.RL_MODELLAYER_OPMODELLAYERINGREDIENT (
       modellayer_uid varchar(255) not null,
        opmodellayeringredient_uid varchar(255) not null
    );

    create table tura.RL_VEWLAYER_OPVEWLAYERINGREDIENT (
       vewlayer_uid varchar(255) not null,
        opvewlayeringredient_uid varchar(255) not null
    );

    create table tura.ROLE_ (
       UID varchar(255) not null,
        V_ROLE int4,
        ref_suid_metaObject varchar(255),
        ref_suid_securityEntity varchar(255),
        REF_ROLES_ROLES varchar(255),
        primary key (UID)
    );

    create table tura.ROLEMAPPER (
       UID varchar(255) not null,
        GLOBAL_ROLE_NAME varchar(255),
        LOCAL_ROLE_NAME varchar(255),
        V_ROLEMAPPER int4,
        ref_suid_mapper varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_securityEntityPointer varchar(255),
        primary key (UID)
    );

    create table tura.ROLES (
       UID varchar(255) not null,
        V_ROLES int4,
        ref_suid_metaObject varchar(255),
        REF_ROLES_APPLICATION_REALM varchar(255),
        primary key (UID)
    );

    create table tura.ROOT (
       UID varchar(255) not null,
        NAME varchar(255),
        V_ROOT int4,
        ref_suid_metaObject varchar(255),
        REF_ROOT_CONTROLS varchar(255),
        primary key (UID)
    );

    create table tura.SEARCHTRIGGER (
       UID varchar(255) not null,
        V_SEARCHTRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_SEARCH_DATA_CONTROL varchar(255),
        primary key (UID)
    );

    create table tura.SECURED (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_SECURED int4,
        primary key (SUID)
    );

    create table tura.SECURITYENTITY (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        NAME varchar(255),
        V_SECURITYENTITY int4,
        primary key (SUID)
    );

    create table tura.SECURITYENTITYPOINTER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_SECURITYENTITYPOINTER int4,
        REF_OP_SECURITY_ENTITY_SECURITY_ENTITY_POINTER_SECURITY_ENTITY varchar(255),
        primary key (SUID)
    );

    create table tura.SELECTION (
       UID varchar(255) not null,
        V_SELECTION int4,
        REF_OP_DISPLAY_OPTION_POINTER_SELECTION_META_OBJECT varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_styleElement varchar(255),
        REF_SELECTION_OPTION_SELECTION varchar(255),
        REF_OP_VALUE_OPTION_POINTER_SELECTION_META_OBJECT varchar(255),
        primary key (UID)
    );

    create table tura.STYLEELEMENT (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_STYLEELEMENT int4,
        primary key (SUID)
    );

    create table tura.STYLELIBRARY (
       UID varchar(255) not null,
        NAME varchar(255),
        V_STYLELIBRARY int4,
        ref_suid_metaObject varchar(255),
        REF_LIBRARIES_APPLICATION_STYLE varchar(255),
        primary key (UID)
    );

    create table tura.STYLEPOINTER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_STYLEPOINTER int4,
        REF_OP_STYLE_LIBRARY_STYLE_POINTER_STYLE_LIBRARY varchar(255),
        primary key (SUID)
    );

    create table tura.STYLESET (
       UID varchar(255) not null,
        NAME varchar(255),
        V_STYLESET int4,
        ref_suid_metaObject varchar(255),
        REF_STYLES_STYLE_LIBRARY varchar(255),
        primary key (UID)
    );

    create table tura.SUBSYSTEM (
       UID varchar(255) not null,
        NAME varchar(255),
        V_SUBSYSTEM int4,
        ref_suid_metaObject varchar(255),
        REF_SUBSYSTEMS_DATACENTER varchar(255),
        primary key (UID)
    );

    create table tura.TABPAGESINHERITANCE (
       UID varchar(255) not null,
        V_TABPAGESINHERITANCE int4,
        ref_suid_metaObject varchar(255),
        REF_TAB_PAGES_INHERITANCES_VIEWS varchar(255),
        REF_OP_SOURCE_TAB_PAGES_INHERITANCE_TAB_CANVAS varchar(255),
        REF_OP_TARGET_TAB_PAGES_INHERITANCE_TAB_PAGE varchar(255),
        primary key (UID)
    );

    create table tura.TECHLEAF (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_TECHLEAF int4,
        ref_suid_metaObject varchar(255),
        REF_TECH_LEAFS_DOMAIN_ARTIFACTS varchar(255),
        REF_TECH_LEAFS_TECH_LEAF varchar(255),
        primary key (UID)
    );

    create table tura.TECHNOLOGY (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_TECHNOLOGY int4,
        ref_suid_metaObject varchar(255),
        REF_TECHNOLOGIES_ARTIFACT varchar(255),
        primary key (UID)
    );

    create table tura.TOSUBMENU (
       UID varchar(255) not null,
        V_TOSUBMENU int4,
        ref_suid_metaObject varchar(255),
        REF_TO_SUB_MENU_MENU_DEFINITION varchar(255),
        REF_OP_SOURCE_TO_SUBMENU_SUB_MENU varchar(255),
        REF_OP_TARGET_TO_SUBMENU_MENU_FOLDER varchar(255),
        primary key (UID)
    );

    create table tura.TRANSLATION (
       UID varchar(255) not null,
        TRANSLATION varchar(255),
        V_TRANSLATION int4,
        ref_suid_metaObject varchar(255),
        REF_OP_LANG_TRANSLATION_LANGUAGE varchar(255),
        REF_TRANSLATIOINS_MESSAGE varchar(255),
        primary key (UID)
    );

    create table tura.TRIGGER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_TRIGGER int4,
        primary key (SUID)
    );

    create table tura.TYPEELEMENT (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_TYPEELEMENT int4,
        REF_TYPES_TYPE_GROUP varchar(255),
        ref_suid_metaObject varchar(255),
        REF_PRIMITIVES_PRIMITIVES_GROUP varchar(255),
        ref_suid_categorized varchar(255),
        ref_suid_typePointer varchar(255),
        primary key (UID)
    );

    create table tura.TYPEGROUP (
       UID varchar(255) not null,
        KEY_ID varchar(255),
        NAME varchar(255),
        V_TYPEGROUP int4,
        ref_suid_categorized varchar(255),
        ref_suid_metaObject varchar(255),
        REF_REPOSITORY_PACKAGES_DOMAIN_TYPES_REPOSITORY varchar(255),
        primary key (UID)
    );

    create table tura.TYPEMAPPER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_TYPEMAPPER int4,
        primary key (SUID)
    );

    create table tura.TYPEPOINTER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_TYPEPOINTER int4,
        REF_MANY2MANY_HELPER_ASSOSIATION varchar(255),
        REF_OP_TYPE_REF_TYPE_POINTER_TYPE_ELEMENT varchar(255),
        primary key (SUID)
    );

    create table tura.TYPEPOINTEROBJ (
       UID varchar(255) not null,
        V_TYPEPOINTEROBJ int4,
        ref_suid_metaObject varchar(255),
        ref_suid_typePointer varchar(255),
        REF_BASE_TYPE_DATA_CONTROL varchar(255),
        REF_BASE_TYPE_OBJECT_MAPPER varchar(255),
        primary key (UID)
    );

    create table tura.UIELEMENT (
       DTYPE varchar(31) not null,
        UID varchar(255) not null,
        V_UIELEMENT int4,
        COLUMNS int4,
        MASK varchar(255),
        ROWS int4,
        LABEL varchar(255),
        LAYOUT varchar(255),
        TYPE varchar(255),
        ROW_NUMBER int4,
        SCROLL_HEIGHT int4,
        SCROLLABLE boolean,
        SELECTION_MODE varchar(255),
        COL_NUMBER int4,
        ALIGN varchar(255),
        VIEW_TYPE varchar(255),
        ref_suid_categorized varchar(255),
        ref_suid_enabledUIItem varchar(255),
        ref_suid_flexFields varchar(255),
        ref_suid_menuHolder varchar(255),
        ref_suid_nickNamed varchar(255),
        ref_suid_orderable varchar(255),
        ref_suid_styleElement varchar(255),
        REF_CHILDREN_CHILDREN_HOLDER varchar(255),
        REF_ELEMENT_COLUMN varchar(255),
        ref_suid_controlPointer varchar(255),
        ref_suid_blockable varchar(255),
        ref_suid_childrenHolder varchar(255),
        ref_suid_hTMLLayerHolder varchar(255),
        ref_suid_metaObject varchar(255),
        REF_BASE_CANVAS_VIEW_AREA varchar(255),
        ref_suid_formatable varchar(255),
        ref_suid_multiLangLabel varchar(255),
        ref_suid_optionSelection varchar(255),
        ref_suid_itemIcon varchar(255),
        primary key (UID)
    );

    create table tura.UPDATETRIGGER (
       UID varchar(255) not null,
        V_UPDATETRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        primary key (UID)
    );

    create table tura.USINGMAPPERS (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_USINGMAPPERS int4,
        primary key (SUID)
    );

    create table tura.VERSION (
       UID varchar(255) not null,
        NAME varchar(255),
        V_VERSION int4,
        VERSION varchar(255),
        ref_suid_metaObject varchar(255),
        REF_VERSIONS_APPLICATION_MAPPERS varchar(255),
        primary key (UID)
    );

    create table tura.VERSIONREF (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_VERSIONREF int4,
        REF_OP_VERSION_REF_VERSION_REF_VERSION varchar(255),
        primary key (SUID)
    );

    create table tura.VIEWAREA (
       UID varchar(255) not null,
        NAME varchar(255),
        V_VIEWAREA int4,
        ref_suid_categorized varchar(255),
        ref_suid_flexFields varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_nickNamed varchar(255),
        ref_suid_orderable varchar(255),
        ref_suid_styleElement varchar(255),
        ref_suid_viewElement varchar(255),
        primary key (UID)
    );

    create table tura.VIEWELEMENT (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_VIEWELEMENT int4,
        REF_VIEW_ELEMENT_VIEW_PORT_HOLDER varchar(255),
        primary key (SUID)
    );

    create table tura.VIEWINHERITANCE (
       UID varchar(255) not null,
        V_VIEWINHERITANCE int4,
        ref_suid_metaObject varchar(255),
        REF_VIEW_INHERITANCES_VIEWS varchar(255),
        REF_OP_SOURCE_VIEW_INHERITANCE_VIEW_PORT varchar(255),
        REF_OP_TARGET_VIEW_INHERITANCE_CANVAS_FRAME varchar(255),
        primary key (UID)
    );

    create table tura.VIEWPORT (
       UID varchar(255) not null,
        NAME varchar(255),
        V_VIEWPORT int4,
        ref_suid_categorized varchar(255),
        ref_suid_flexFields varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_nickNamed varchar(255),
        ref_suid_orderable varchar(255),
        ref_suid_styleElement varchar(255),
        ref_suid_viewElement varchar(255),
        primary key (UID)
    );

    create table tura.VIEWPORTHOLDER (
       SUID varchar(255) not null,
        INH_SWITCH varchar(255),
        V_VIEWPORTHOLDER int4,
        primary key (SUID)
    );

    create table tura.VIEWPORTTRIGGER (
       UID varchar(255) not null,
        V_VIEWPORTTRIGGER int4,
        ref_suid_contextParameters varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_methodPointer varchar(255),
        ref_suid_trigger varchar(255),
        REF_VIEW_PORT_TRIGGER_VIEW_PORT varchar(255),
        primary key (UID)
    );

    create table tura.VIEWS (
       UID varchar(255) not null,
        V_VIEWS int4,
        ref_suid_metaObject varchar(255),
        REF_VIEW_FORM varchar(255),
        primary key (UID)
    );

    create table tura.XMLPACKAGEMAPPER (
       UID varchar(255) not null,
        NAMESPACE varchar(255),
        V_XMLPACKAGEMAPPER int4,
        ref_suid_mapper varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_packageMapper varchar(255),
        ref_suid_packagePointer varchar(255),
        primary key (UID)
    );

    create table tura.XMLTYPEMAPPER (
       UID varchar(255) not null,
        NAMESPACE varchar(255),
        TYPENAME varchar(255),
        V_XMLTYPEMAPPER int4,
        ref_suid_mapper varchar(255),
        ref_suid_metaObject varchar(255),
        ref_suid_typeMapper varchar(255),
        ref_suid_typePointer varchar(255),
        primary key (UID)
    );

    alter table tura.APPLICATION 
       add constraint FK1uxlt4nh6gddjtgq8db0dcd51 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATION 
       add constraint FK5atlnlgt1cji1y8fqaau6j2if 
       foreign key (REF_APPLICATIONS_APPLICATION_GROUP) 
       references tura.APPLICATIONGROUP;

    alter table tura.APPLICATIONGROUP 
       add constraint FK23uxkdis540139p4kpkdbf5s0 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONGROUP 
       add constraint FKbjr79mm0s1ax8famj7kc6myof 
       foreign key (REF_APPLICATION_PACKAGES_DOMAIN_APPLICATION) 
       references tura.DOMAINAPPLICATION;

    alter table tura.APPLICATIONINFRASTRUCTURELAYER 
       add constraint FKggbpln1f2dh5xnk9umy6kq3p1 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONINFRASTRUCTURELAYER 
       add constraint FKrdnle5ktfmglylx4972yr2o8e 
       foreign key (REF_INFARASTRUCTURE_LAYERS_APPLICATION_INFRASTRUCTURE_LAYERS) 
       references tura.APPLICATIONINFRASTRUCTURELAYERS;

    alter table tura.APPLICATIONINFRASTRUCTURELAYERS 
       add constraint FKe99ec9tyw6ritiqq3dl3flf9t 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONINFRASTRUCTURELAYERS 
       add constraint FKb1iwbv7gf3fmx0cm615yjy0by 
       foreign key (REF_APPLICATION_INFRASTRUCTURE_LAYER_APPLICATION) 
       references tura.APPLICATION;

    alter table tura.APPLICATIONLANGUAGES 
       add constraint FK1yes90gbo1o488ydir2j3gaiw 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONLANGUAGES 
       add constraint FK33ldswebjqsuqo8auw3qnc1qs 
       foreign key (REF_APPLICATION_LANGUAGES_APPLICATION_MESSAGE_LIBRARIES) 
       references tura.APPLICATIONMESSAGELIBRARIES;

    alter table tura.APPLICATIONMAPPER 
       add constraint FKsp8kct8ljlfm5qpj88l3bayso 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONMAPPER 
       add constraint FKpery4l2njtyucarec7qi74w3c 
       foreign key (REF_MAPPERS_APPLICATION_MAPPERS) 
       references tura.APPLICATIONMAPPERS;

    alter table tura.APPLICATIONMAPPERS 
       add constraint FKbt7x1hc53x6lp3fylax41ifh8 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONMAPPERS 
       add constraint FKp70rnwiv8nr6cdpgy21g8ncdy 
       foreign key (REF_APPLICATION_MAPPERS_APPLICATION) 
       references tura.APPLICATION;

    alter table tura.APPLICATIONMESSAGELIBRARIES 
       add constraint FKd0g69uyakwddi44qit42x4bhj 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONMESSAGELIBRARIES 
       add constraint FKrscxntnce5ug3188e2etceicg 
       foreign key (REF_APPLICATION_MESSAGES_APPLICATION) 
       references tura.APPLICATION;

    alter table tura.APPLICATIONMESSAGELIBRARY 
       add constraint FKcdscnc3n79a8ia2kumcubpgq7 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONMESSAGELIBRARY 
       add constraint FKko0n651qhfgc07yq8lmp6pkjo 
       foreign key (REF_MESSAGE_LIBRARIES_APPLICATION_MESSAGE_LIBRARIES) 
       references tura.APPLICATIONMESSAGELIBRARIES;

    alter table tura.APPLICATIONREALM 
       add constraint FK8lydo5iscj7jsr2qph824lrsk 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONREALM 
       add constraint FK5a3phi8kxt3x1mw9v5vrcr023 
       foreign key (REF_REALMS_APPLICATION_REALMS) 
       references tura.APPLICATIONREALMS;

    alter table tura.APPLICATIONREALMS 
       add constraint FK8tjcysjet45h1b8h8yee8nn6e 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONREALMS 
       add constraint FK2v7qhs8ump37kjm09u5ntjj7w 
       foreign key (REF_APPLICATION_ROLE_APPLICATION) 
       references tura.APPLICATION;

    alter table tura.APPLICATIONRECIPE 
       add constraint FK3gds2bnub2ha4hhoqpncnsv2e 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONRECIPE 
       add constraint FKeh6kyrsiin2vv79nklhjic7rg 
       foreign key (REF_RECIPES_APPLICATION_RECIPES) 
       references tura.APPLICATIONRECIPES;

    alter table tura.APPLICATIONRECIPES 
       add constraint FKdxo54unemdalvk23ge8ytktpq 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONRECIPES 
       add constraint FKbl4sgfwxff3tpqv48nyxeqr71 
       foreign key (REF_APPLICATION_RECIPES_APPLICATION) 
       references tura.APPLICATION;

    alter table tura.APPLICATIONSTYLE 
       add constraint FKfqkvppi87xu7y0oy32i3c0feo 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONSTYLE 
       add constraint FK2590mo22yynsq33agysdb90hn 
       foreign key (REF_STYLE_LIBRARIES_APPLICATION_STYLE_LIBRARIES) 
       references tura.APPLICATIONSTYLELIBRARIES;

    alter table tura.APPLICATIONSTYLELIBRARIES 
       add constraint FK3t6aop87b8tdgekfepyt072th 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONSTYLELIBRARIES 
       add constraint FKm4x5y0i3dc9s1crv0twusxssd 
       foreign key (REF_APPLICATION_STYLE_APPLICATION) 
       references tura.APPLICATION;

    alter table tura.APPLICATIONUILAYER 
       add constraint FK5n7efyt465hr5vrvk22ot1bkn 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONUILAYER 
       add constraint FK83lecstg3f0q45q53u39si0x9 
       foreign key (REF_APPLICATION_U_I_LAYER_APPLICATION) 
       references tura.APPLICATION;

    alter table tura.APPLICATIONUIPACKAGE 
       add constraint FKqlykg39fvncrcvcyefbqhshiw 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.APPLICATIONUIPACKAGE 
       add constraint FKstjlm4bhyj4i8omdpw19hqh90 
       foreign key (REF_APPLICATION_U_I_PACKAGES_APPLICATION_U_I_LAYER) 
       references tura.APPLICATIONUILAYER;

    alter table tura.AREAREF 
       add constraint FKma0ydn419tg4000fvdmdqaacb 
       foreign key (REF_OP_AREA_AREA_REF_NICK_NAMED) 
       references tura.NICKNAMED;

    alter table tura.AREAREF 
       add constraint FKr1sc7o5l9ok4qmwgjqx3n6nbx 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.AREAREF 
       add constraint FKl1hm0854tcukdwnr3hn00e48a 
       foreign key (REF_BLOCK_BLOCKABLE) 
       references tura.BLOCKABLE;

    alter table tura.AREAREF 
       add constraint FKme7mclsvpbrv4yn53225tm5lj 
       foreign key (REF_REFRESH_AREAS_MENU_ITEM) 
       references tura.MENUELEMENT;

    alter table tura.AREAREF 
       add constraint FK7q05dcq55fy6i077ia07pgno8 
       foreign key (REF_REFRESH_AREAS_UIELEMENT) 
       references tura.UIELEMENT;

    alter table tura.AREAREF 
       add constraint FK3r3n99sd2hw2rc2oajer0o4pd 
       foreign key (REF_SOURCE_TARGET_DATA_EXPORTER) 
       references tura.UIELEMENT;

    alter table tura.AREAREF 
       add constraint FKi0hb3o7ne0elxheoj53faaycv 
       foreign key (REF_SOURCE_TARGET_OVERLAY_CANVAS) 
       references tura.CANVASFRAME;

    alter table tura.ARTIFACT 
       add constraint FKs1au6cae5sphedvuj83h43mkp 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ARTIFACT 
       add constraint FKiahtxwbanhyueng8snxhpw2oy 
       foreign key (REF_ARTIFACTS_ARTIFACT_GROUP) 
       references tura.ARTIFACTGROUP;

    alter table tura.ARTIFACTGROUP 
       add constraint FKixhskgptuchu8fu2hx4tadc8q 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ARTIFACTGROUP 
       add constraint FKorhmjxlhwyfi9w8moakvq7t1p 
       foreign key (REF_ARTIFACT_PACKAGES_DOMAIN_ARTIFACT) 
       references tura.DOMAINARTIFACT;

    alter table tura.ARTIFACTREF 
       add constraint FKbh4ia6i5cqsmb7ijay4kd6v64 
       foreign key (REF_OP_ARTIFACT_REF_ARTIFACT_REF_ARTIFACT) 
       references tura.ARTIFACT;

    alter table tura.ARTIFICIALFIELD 
       add constraint FKtiu4uesb9edi28pd7er3co9o7 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ARTIFICIALFIELD 
       add constraint FK247r71ulfwxsf7jfl8y1ke8hk 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.ARTIFICIALFIELD 
       add constraint FK4k3cn136cnrvv82m0r7io2d0q 
       foreign key (REF_ARTIFICIAL_FIELDS_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.ATTRIBUTE 
       add constraint FKfi98y1ld38tiqd785k621had8 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.ATTRIBUTE 
       add constraint FKmrosmnhpkpgjera9ujc3edp1u 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ATTRIBUTE 
       add constraint FKkjujmo6mfre3kex2cisi4fclx 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.ATTRIBUTE 
       add constraint FKftu1hlggdm2emcrjslknnc967 
       foreign key (REF_ATTRIBUTES_TYPE) 
       references tura.TYPEELEMENT;

    alter table tura.ATTRIBUTECONNECTOR 
       add constraint FKcqh8h3nk3wnmyriomoeoc2h3f 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ATTRIBUTECONNECTOR 
       add constraint FK9qy0o49h84yudp2uaqq9lotgv 
       foreign key (ref_suid_operationConnectorRef) 
       references tura.OPERATIONCONNECTORREF;

    alter table tura.ATTRIBUTECONNECTOR 
       add constraint FKqx6b0h1jnggmqxwvierxt2qqd 
       foreign key (REF_ATTRIBUTES_CONNECTOR_OBJECT_MAPPER_GROUP) 
       references tura.OBJECTMAPPERGROUP;

    alter table tura.ATTRIBUTECONNECTOR 
       add constraint FK5e7jvcmryfnw24ycgrfab9fga 
       foreign key (REF_OP_SOURCE_ATTRIBUTE_CONNECTOR_META_OBJECT) 
       references tura.METAOBJECT;

    alter table tura.ATTRIBUTECONNECTOR 
       add constraint FKcy5ivqlm7l8n1nyb4uj6l5mu7 
       foreign key (REF_OP_TARGET_ATTRIBUTE_CONNECTOR_META_OBJECT) 
       references tura.METAOBJECT;

    alter table tura.ATTRIBUTEPOINTER 
       add constraint FK9fo3bfwgwmqatd52s0d3nu364 
       foreign key (REF_OP_ATTRIBUTE_REF_ATTRIBUTE_POINTER_ATTRIBUTE) 
       references tura.ATTRIBUTE;

    alter table tura.ATTRIBUTEPOINTER 
       add constraint FKl9wmitn927dejpyq0bh65r1b0 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ATTRIBUTEPOINTER 
       add constraint FK659if0g844ilbecxisafa3bir 
       foreign key (REF_ATTRIBUTES_OBJECT_MAPPER) 
       references tura.OBJECTMAPPER;

    alter table tura.CALCULATEDFIELD 
       add constraint FKh3i0hfkiuuu8214rweocviuui 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.CALCULATEDFIELD 
       add constraint FKg4qxidlkk7kydesiyrd7v7lkj 
       foreign key (REF_CALCULATIONS_OBJECT_MAPPER) 
       references tura.OBJECTMAPPER;

    alter table tura.CALCULATEDFIELD 
       add constraint FK4y1qg05n962mtglsn40498i5o 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CALCULATEDFIELD 
       add constraint FKbwd7xdwvdeg5k7xs063v6dnu2 
       foreign key (REF_VARIABLES_OBJECT_MAPPER_GROUP) 
       references tura.OBJECTMAPPERGROUP;

    alter table tura.CALCULATEDFIELD 
       add constraint FK2e5lp9xiw695fltehavpnt9c 
       foreign key (REF_AGGRIGATIONS_OBJECT_MAPPER) 
       references tura.OBJECTMAPPER;

    alter table tura.CANVASFRAME 
       add constraint FKe9fov6mj4x9xl5d1o8sxbgeld 
       foreign key (ref_suid_styleElement) 
       references tura.STYLEELEMENT;

    alter table tura.CANVASFRAME 
       add constraint FKhiwtxxma88ttefw2y5vqkfk2r 
       foreign key (REF_CANVASES_VIEWS) 
       references tura.VIEWS;

    alter table tura.CANVASFRAME 
       add constraint FKddkla4ma50vl1227a8if9uvmb 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.CANVASFRAME 
       add constraint FKsjkb6xlndbuq9og9j4s5vwdma 
       foreign key (ref_suid_defaultCavas) 
       references tura.DEFAULTCAVAS;

    alter table tura.CANVASFRAME 
       add constraint FKjkwpsrsdxnb2tudjwe5a9aedy 
       foreign key (ref_suid_flexFields) 
       references tura.FLEXFIELDS;

    alter table tura.CANVASFRAME 
       add constraint FKf443k8dbijpeuny53fjo3pbng 
       foreign key (ref_suid_hTMLLayerHolder) 
       references tura.HTMLLAYERHOLDER;

    alter table tura.CANVASFRAME 
       add constraint FKduuv4lx88l8b2frjohpgo5f0q 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CANVASFRAME 
       add constraint FK342vqsgee7lc6nx6p7vdd46yr 
       foreign key (ref_suid_multiLangLabel) 
       references tura.MULTILANGLABEL;

    alter table tura.CANVASFRAME 
       add constraint FKk4qvag66qb83k0j4i5ilhm7pm 
       foreign key (ref_suid_viewPortHolder) 
       references tura.VIEWPORTHOLDER;

    alter table tura.CANVASFRAME 
       add constraint FKlw2p5k7p8dxalbsvpp6bo6xpd 
       foreign key (ref_suid_nickNamed) 
       references tura.NICKNAMED;

    alter table tura.CANVASFRAME 
       add constraint FKe2sv81q027m8uh02ltdse743a 
       foreign key (ref_suid_blockable) 
       references tura.BLOCKABLE;

    alter table tura.CANVASFRAME 
       add constraint FKd1oxnqyl5yj093q2nhvs5wras 
       foreign key (ref_suid_secured) 
       references tura.SECURED;

    alter table tura.CANVASFRAME 
       add constraint FKj1mufxhndp82a73rig2fyf3rr 
       foreign key (ref_suid_orderable) 
       references tura.ORDERABLE;

    alter table tura.CLASSIFIER 
       add constraint FK6ch6q1rfnw8bw8cyfhwat3f1t 
       foreign key (REF_OP_HINT_CLASSIFIER_GENERATION_HINT) 
       references tura.GENERATIONHINT;

    alter table tura.CLASSIFIER 
       add constraint FKo8x2ef4hfjp4w34r2475uifen 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CLASSIFIER 
       add constraint FK56rg5ewctno5ulkkqqxsct5ke 
       foreign key (REF_CLASSIFIERS_CATEGORIZED) 
       references tura.CATEGORIZED;

    alter table tura.COLUMN 
       add constraint FKkgfn8bcl0381rncdgcwg2guwo 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.COLUMN 
       add constraint FKav7r54hs6y4tbmuh0bkk30wco 
       foreign key (ref_suid_flexFields) 
       references tura.FLEXFIELDS;

    alter table tura.COLUMN 
       add constraint FK2d1e4v4mm93wxjspbm7e4rg3v 
       foreign key (ref_suid_hTMLLayerHolder) 
       references tura.HTMLLAYERHOLDER;

    alter table tura.COLUMN 
       add constraint FKrf3detmf6u0351w2b96yws4ad 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.COLUMN 
       add constraint FK1ef4kb5n943s6kv4quy7fuj6h 
       foreign key (ref_suid_multiLangLabel) 
       references tura.MULTILANGLABEL;

    alter table tura.COLUMN 
       add constraint FKhtd36lieb63m2jj3ri0oxjww8 
       foreign key (ref_suid_orderable) 
       references tura.ORDERABLE;

    alter table tura.COLUMN 
       add constraint FK6ipo91885dkre1durvlamc7h9 
       foreign key (ref_suid_styleElement) 
       references tura.STYLEELEMENT;

    alter table tura.COLUMN 
       add constraint FKq6aoma5qfc66e7fugbx0bfo1i 
       foreign key (REF_COLS_TABLE) 
       references tura.UIELEMENT;

    alter table tura.COLUMN 
       add constraint FK8ekpptpj538ng9irm74gq2jwv 
       foreign key (REF_COLS_TREE) 
       references tura.UIELEMENT;

    alter table tura.COMPONENT 
       add constraint FKa74ujrkcbf7o0gu3qla0njra9 
       foreign key (ref_suid_hTMLLayerHolder) 
       references tura.HTMLLAYERHOLDER;

    alter table tura.COMPONENT 
       add constraint FKlbm2nfsvixx06wisuuussst2v 
       foreign key (ref_suid_orderable) 
       references tura.ORDERABLE;

    alter table tura.COMPONENT 
       add constraint FKd4iwd39qg15b5366k34inp0fi 
       foreign key (REF_COMPONENTS_INGREDIENT) 
       references tura.INGREDIENT;

    alter table tura.COMPONENT 
       add constraint FKhtn00ie8lvrn6k4ymo1dj0j0v 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.COMPONENT 
       add constraint FK3hqs77hqdii20osalf7gakdoe 
       foreign key (ref_suid_versionRef) 
       references tura.VERSIONREF;

    alter table tura.COMPONENT 
       add constraint FKpewok349oy3slk0fqgrmxjday 
       foreign key (REF_OP_MAPPER_REF_JAVA_COMPONENT_MAPPER) 
       references tura.MAPPER;

    alter table tura.COMPONENT 
       add constraint FKnkrf08hfeabrgjalwqp1is186 
       foreign key (REF_OP_MAPPER_REF_JAVA_SCRIPT_COMPONENT_MAPPER) 
       references tura.MAPPER;

    alter table tura.CONFIGEXTENSION 
       add constraint FK8m7g4sogxigy6qlxgiwq50c03 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONFIGEXTENSION 
       add constraint FKavhal30dex6akl7xnxvicx815 
       foreign key (REF_CONFIG_EXTENSIONS_RECIPES) 
       references tura.RECIPES;

    alter table tura.CONFIGEXTENSION 
       add constraint FKpkp298cgg9twybdylo96hoj5q 
       foreign key (REF_OP_SOURCE_CONFIG_EXTENSION_CONFIGURATION) 
       references tura.CONFIGURATION;

    alter table tura.CONFIGEXTENSION 
       add constraint FK22uet4df0qsl89buek4tewpmb 
       foreign key (REF_OP_TARGET_CONFIG_EXTENSION_CONFIGURATION) 
       references tura.CONFIGURATION;

    alter table tura.CONFIGHASH 
       add constraint FKca0tp3ncc1plnlix0uy2tf5ac 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONFIGHASH 
       add constraint FKqp3erkqessy5oticfer5i8pew 
       foreign key (REF_CONFIG_HASHES_TECH_LEAF) 
       references tura.TECHLEAF;

    alter table tura.CONFIGHASHWITHNICKNAME 
       add constraint FKepbnr71mfpraq9w3s7dre068r 
       foreign key (REF_OP_HASH_CONFIG_HASH_WITH_NICK_NAME_CONFIG_HASH) 
       references tura.CONFIGHASH;

    alter table tura.CONFIGHASHWITHNICKNAME 
       add constraint FK3dkhr0s9i2ncp0gdsvun6ikat 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONFIGHASHWITHNICKNAME 
       add constraint FK6wcadg8wjfkofcmawqr2wkh0b 
       foreign key (REF_CONFIG_HASHES_ARTIFACT) 
       references tura.ARTIFACT;

    alter table tura.CONFIGURATION 
       add constraint FKnyd16hh2qnjk0o7gry9lwbxab 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONFIGURATION 
       add constraint FKk2cc8d8411aii0abnm9k9db71 
       foreign key (REF_CONFIGURATIONS_RECIPES) 
       references tura.RECIPES;

    alter table tura.CONFIGVARIABLE 
       add constraint FKil6nra1xicwrv0b9k6l2as19v 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONFIGVARIABLE 
       add constraint FK6c02ep03immq88qv0i24vddn1 
       foreign key (REF_CONFIG_VARIABLES_TECH_LEAF) 
       references tura.TECHLEAF;

    alter table tura.CONFIGVARIABLEWITHNICKNAME 
       add constraint FKmo9rtr7srq4pwbn2rkqrwemc7 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONFIGVARIABLEWITHNICKNAME 
       add constraint FKpuk5ieat9uutj1ipk8fl09f96 
       foreign key (REF_CONFIG_VARIABLES_ARTIFACT) 
       references tura.ARTIFACT;

    alter table tura.CONFIGVARIABLEWITHNICKNAME 
       add constraint FKo6j1dorybrrqqf3sesq2h4pme 
       foreign key (REF_OP_VAR_REF_CONFIG_VARIABLE_WITH_NICK_NAME_CONFIG_VARIABLE) 
       references tura.CONFIGVARIABLE;

    alter table tura.CONTEXTPARAMETER 
       add constraint FKgj04sywrwvtaav1o2addhngto 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONTEXTPARAMETER 
       add constraint FKikxbnc4c2mhek92tl9bfquush 
       foreign key (REF_PARAMETERS_CONTEXT_PARAMETERS) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.CONTEXTPARAMETER 
       add constraint FKmomyn82km7yyc0ns6v3byeanv 
       foreign key (REF_OP_REF_OBJ_CONTEXT_PARAMETER_META_OBJECT) 
       references tura.METAOBJECT;

    alter table tura.CONTEXTPARAMETERSOBJ 
       add constraint FKlkpkc9musid6nijvs2xfte8ts 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.CONTEXTPARAMETERSOBJ 
       add constraint FK5og79vkof6a5089qkesfv52l2 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONTEXTPARAMETERSOBJ 
       add constraint FK6mmpryngq2pwehve6j6x7oss3 
       foreign key (REF_DEFAULT_SEARCH_ATTRIBUTE_CONNECTOR) 
       references tura.ATTRIBUTECONNECTOR;

    alter table tura.CONTEXTPARAMETERSOBJ 
       add constraint FKijmwlwvjudx8j8mgcoxqgxajk 
       foreign key (REF_DEFAULT_SEARCH_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.CONTEXTPARAMETERSOBJ 
       add constraint FKlc6w77di6a7y1mth4v7tp0o67 
       foreign key (REF_DEFAULT_SEARCH_OPERATION_CONNECTOR) 
       references tura.OPERATIONCONNECTOR;

    alter table tura.CONTEXTVALUE 
       add constraint FKipfkimn8t3hvv6ou2ooskrilh 
       foreign key (REF_VALUE_CONTEXT_PARAMETER) 
       references tura.CONTEXTPARAMETER;

    alter table tura.CONTEXTVALUE 
       add constraint FK2x9uxhh52o2orwjob6aqce1s9 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.CONTEXTVALUE 
       add constraint FKobghc7abhxnq8s941ts7vv7u9 
       foreign key (REF_ENABLED_ENABLED_U_I_ITEM) 
       references tura.ENABLEDUIITEM;

    alter table tura.CONTEXTVALUE 
       add constraint FKc39v2c4axoksfcrrhklv6qtjw 
       foreign key (REF_ICON_ITEM_ICON) 
       references tura.ITEMICON;

    alter table tura.CONTEXTVALUE 
       add constraint FKs8i11imdhsa8uga2ewey8f0k1 
       foreign key (REF_IMAGE_TREE) 
       references tura.UIELEMENT;

    alter table tura.CONTEXTVALUE 
       add constraint FK6oj968ld5mhay598g5o5sg1n6 
       foreign key (REF_INITIAL_OPTION_MESSAGE_OPTION_SELECTION) 
       references tura.OPTIONSELECTION;

    alter table tura.CONTEXTVALUE 
       add constraint FK2902ycmp2w583mah6d556ukgj 
       foreign key (REF_MULTI_LANG_LABEL_MULTI_LANG_LABEL) 
       references tura.MULTILANGLABEL;

    alter table tura.CONTEXTVALUE 
       add constraint FKi5g1l5lfu6hut8lyksh2xjfkg 
       foreign key (REF_READ_ONLY_UIELEMENT) 
       references tura.UIELEMENT;

    alter table tura.CONTEXTVALUE 
       add constraint FKchhm3x70fi9tvdhsmjsma16g8 
       foreign key (REF_REQUIRED_UIELEMENT) 
       references tura.UIELEMENT;

    alter table tura.CONTEXTVALUE 
       add constraint FK99ipp1v45vvmnh9et18lt0975 
       foreign key (REF_STYLE_STYLE_ELEMENT) 
       references tura.STYLEELEMENT;

    alter table tura.CONTEXTVALUE 
       add constraint FKra5kfqhw4991wcs5q4nuwamds 
       foreign key (REF_TRANSITION_MENU_ITEM) 
       references tura.MENUELEMENT;

    alter table tura.CONTEXTVALUE 
       add constraint FK82rjjg8qmku674jc4bh97pepu 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.CONTEXTVALUE 
       add constraint FK2mj2mgbi9t6jamxxohq18ker2 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONTEXTVALUE 
       add constraint FKa0uel26y48oc1wvtrog7kqrje 
       foreign key (REF_FIELDS_FLEX_FIELDS) 
       references tura.FLEXFIELDS;

    alter table tura.CONTROLPOINTER 
       add constraint FKh3o23qcp8avml3g5pb8kr65y2 
       foreign key (REF_OP_SOURCE_CAST_CONTROL_POINTER_TYPE) 
       references tura.TYPEELEMENT;

    alter table tura.CONTROLPOINTER 
       add constraint FK2rrnk71ne9ggqwo2i4xcjb08o 
       foreign key (REF_OP_SOURCE_CAST_DATA_CONTROL_CONTROL_POINTER_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.CONTROLPOINTER 
       add constraint FKidf3k9m4q4ik1qk6o53yj9dp9 
       foreign key (REF_OP_SOURCE_POINTER_CONTROL_POINTER_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.CONTROLPOINTER 
       add constraint FKnr9rss4vumwi3e0dubtj7l22r 
       foreign key (REF_OP_VALUE_POINTER_CONTROL_POINTER_META_OBJECT) 
       references tura.METAOBJECT;

    alter table tura.CONTROLS 
       add constraint FKa925gegj0k45vwxis4si6vfip 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CONTROLS 
       add constraint FKcp9xqxwc0t8nnu01gptd7u0ok 
       foreign key (REF_DATACONTROLS_FORM) 
       references tura.FORM;

    alter table tura.CREATETRIGGER 
       add constraint FK4494aim2hgtvi1h3l6ox2oj03 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.CREATETRIGGER 
       add constraint FK5h4li3e0kkfu644ujk09l9v4y 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CREATETRIGGER 
       add constraint FKsntqc86h71n21u65vpq9l3i7t 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.CREATETRIGGER 
       add constraint FKfutaofllh8mu2ma2c2bcv0d95 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.CREATETRIGGER 
       add constraint FK8h6nkuuwyhekxm9l72u7qbsxm 
       foreign key (REF_CREATE_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.CSSMAPPER 
       add constraint FK3xsusgvwnv4q8hi3qnbs3laew 
       foreign key (ref_suid_mapper) 
       references tura.MAPPER;

    alter table tura.CSSMAPPER 
       add constraint FKmfx13jpqq6dyo431s78dp4jcw 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.CSSMAPPER 
       add constraint FKaogidfu6fnl2nhy6p5r4ksds5 
       foreign key (ref_suid_stylePointer) 
       references tura.STYLEPOINTER;

    alter table tura.DATACENTER 
       add constraint FKkoeno7svk8w3wo44x6r5rno7h 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DATACENTER 
       add constraint FKmqjtj1bm7xcl2u60p88wm963b 
       foreign key (REF_DATACENTERS_ENTERPRISE_INFRASTRUCTURE) 
       references tura.ENTERPRISEINFRASTRUCTURE;

    alter table tura.DATACONTROL 
       add constraint FKqxj3nht7qe3ojho9ixpjpos3c 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.DATACONTROL 
       add constraint FKibm12lc0ba0030w4gjugan1tv 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DATACONTROL 
       add constraint FK4ydyyp3pbulnjwj9wrgq2lv5d 
       foreign key (REF_CONTROLS_CONTROLS) 
       references tura.CONTROLS;

    alter table tura.DELETETRIGGER 
       add constraint FKn43qlkwk8i6qr433t7lxmc62e 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.DELETETRIGGER 
       add constraint FKmp8yriai9ewuh0a5wpytbo1o8 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DELETETRIGGER 
       add constraint FK88p7uxn62kkuhvrsyrshkie6k 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.DELETETRIGGER 
       add constraint FKp37r4oj5bk41c4d4kramdo4ur 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.DEPENDENCY 
       add constraint FK5t5c363ly40hp6y8b1troerf3 
       foreign key (REF_OP_DETAIL_DEPENDENCY_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.DEPENDENCY 
       add constraint FK6kdf7trqyeuy26td5obaxefpf 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DEPENDENCY 
       add constraint FKeq78vdx2u05nb0yw32x0yd2fe 
       foreign key (REF_OP_MASTER_DEPENDENCY_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.DEPENDENCY 
       add constraint FKfe497ywm4cvpw9ns9s8mc0qyn 
       foreign key (REF_DEPENDENCIES_CONTROLS) 
       references tura.CONTROLS;

    alter table tura.DEPLOYMENTCOMPONENT 
       add constraint FK9gsfehtrvoqciseqfq5drq712 
       foreign key (REF_DEPLOYMENT_COMPONENT_LINK_DEPLOYMENT_COMPONENT) 
       references tura.DEPLOYMENTCOMPONENT;

    alter table tura.DEPLOYMENTCOMPONENT 
       add constraint FKgtv3fa5eamklkblvcwpxxkmw6 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DEPLOYMENTCOMPONENT 
       add constraint FKdqq1f92bkqm8cw8rben3mp3me 
       foreign key (REF_OP_MAPPER_DEPLOYMENT_COMPONENT_MODEL_MAPPER) 
       references tura.MODELMAPPER;

    alter table tura.DEPLOYMENTCOMPONENT 
       add constraint FKjqf0gfmpjuunudca5fq08rkxm 
       foreign key (REF_DEPLYMENT_STEP_RECIPE) 
       references tura.RECIPE;

    alter table tura.DEPLOYMENTSTARSTEP 
       add constraint FK45e23laeb9ixgvyn024ngnhjp 
       foreign key (REF_OP_FIRST_STEP_DEPLOYMENT_STAR_STEP_DEPLOYMENT_COMPONENT) 
       references tura.DEPLOYMENTCOMPONENT;

    alter table tura.DEPLOYMENTSTARSTEP 
       add constraint FKh8tyingqqnh6gekqbc8ksaeld 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DEPLOYMENTSTARSTEP 
       add constraint FK5lkxv71tq800g1c7mwmlb4ga6 
       foreign key (REF_START_SEQ_RECIPE) 
       references tura.RECIPE;

    alter table tura.DOMAIN 
       add constraint FKlvecges0q8tpbrnhttw2rj7p9 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DOMAINAPPLICATION 
       add constraint FKlvjol5lxp4bumio89suag8wp9 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DOMAINAPPLICATION 
       add constraint FKirxdqrp1xnbl6ieqbo6av8j2r 
       foreign key (REF_APPLICATIONS_DOMAIN_APPLICATIONS) 
       references tura.DOMAINAPPLICATIONS;

    alter table tura.DOMAINAPPLICATIONS 
       add constraint FKmutol0faogybx9ygwoq3req0j 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DOMAINAPPLICATIONS 
       add constraint FKs6u6km1higsoqi0e603op4olj 
       foreign key (REF_DOMAIN_APPLICATIONS_DOMAIN) 
       references tura.DOMAIN;

    alter table tura.DOMAINARTIFACT 
       add constraint FK3y4ov0627d3hvkru08ap0j0nj 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DOMAINARTIFACT 
       add constraint FKekpgjxnfulhq8s0ex1441mkwo 
       foreign key (REF_DOMAIN_ARTIFACT_DOMAIN_ARTIFACTS) 
       references tura.DOMAINARTIFACTS;

    alter table tura.DOMAINARTIFACTS 
       add constraint FKfsqn9xdhb43d3mb9y346hbapd 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DOMAINARTIFACTS 
       add constraint FKonimg6aqm9uqkolbxktvqcec8 
       foreign key (REF_DOMAIN_ARTIFACTS_DOMAIN) 
       references tura.DOMAIN;

    alter table tura.DOMAINMAPPER 
       add constraint FKo4afl6gerdm5nn5397a7oapqb 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DOMAINMAPPER 
       add constraint FKj3dp1mitvta1a4th0yjrli5t4 
       foreign key (REF_MAPPERS_DOMAIN_MAPPERS) 
       references tura.DOMAINMAPPERS;

    alter table tura.DOMAINMAPPERS 
       add constraint FK85kl32sv66cp5jdqw7iqmsk9k 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DOMAINMAPPERS 
       add constraint FKn2e4mccnkc6i8g2ovgqbld7r 
       foreign key (REF_DOMAIN_MAPPERS_DOMAIN) 
       references tura.DOMAIN;

    alter table tura.DOMAINTYPES 
       add constraint FKdwck11lm27sc7h6hfrx4nu6fx 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DOMAINTYPES 
       add constraint FKc9a9k6388au7m5g35b5ev67th 
       foreign key (REF_DOMAIN_TYPES_DOMAIN) 
       references tura.DOMAIN;

    alter table tura.DOMAINTYPESREPOSITORY 
       add constraint FK32nuon2mv3hbuffshh5px3jpn 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.DOMAINTYPESREPOSITORY 
       add constraint FK4ihffgp4mauio2nb7jtd5yn93 
       foreign key (REF_TYPES_REPOSITORY_DOMAIN_TYPES) 
       references tura.DOMAINTYPES;

    alter table tura.ENTERPRISEINFRASTRUCTURE 
       add constraint FKkhk00fkhsoyeldonjfoxh8fb5 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ENTERPRISEINFRASTRUCTURE 
       add constraint FKottxuenmyfo49xnu0nxp2013t 
       foreign key (REF_INFARASTRUCTURES_APPLICATION_INFRASTRUCTURE_LAYER) 
       references tura.APPLICATIONINFRASTRUCTURELAYER;

    alter table tura.ENUMATTRIBUTE 
       add constraint FKbjaq08lgaigfadll8ylphuadh 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.ENUMATTRIBUTE 
       add constraint FK2adh5ppglx5aoirgb0ookd865 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ENUMATTRIBUTE 
       add constraint FKn8o6msv7itnwmfp1igvbd3751 
       foreign key (REF_VALUES_ENUMERATOR) 
       references tura.TYPEELEMENT;

    alter table tura.EXPRESSIONPART 
       add constraint FKt2sywv4huf8lmns5aeuoewbl4 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.EXPRESSIONPART 
       add constraint FKkhghbov8y9wved306lpwaco8a 
       foreign key (REF_OP_OBJ_REF_EXPRESSION_PART_META_OBJECT) 
       references tura.METAOBJECT;

    alter table tura.EXPRESSIONPART 
       add constraint FK44butki01ntydli4ge60l8aoc 
       foreign key (REF_EXPRESSION_CONTEXT_VALUE) 
       references tura.CONTEXTVALUE;

    alter table tura.FORM 
       add constraint FKrauvf5hs1sqtolyewwdbj0c3l 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.FORM 
       add constraint FKmpmmyvss4nfgo1bgshd5x65lm 
       foreign key (REF_FORMS_APPLICATION_U_I_PACKAGE) 
       references tura.APPLICATIONUIPACKAGE;

    alter table tura.FORMPARAMETER 
       add constraint FKlg3mc6cqha7uvv9b8n1wdte42 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.FORMPARAMETER 
       add constraint FKhpgwptycq279o4itu7pxxhl2k 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.FORMPARAMETER 
       add constraint FK5pen584d3ih97mibmlysryoeo 
       foreign key (REF_PARAMETERS_FORM) 
       references tura.FORM;

    alter table tura.FORMVARIABLE 
       add constraint FK6lqa1aki200u5g3nmij8tnsh8 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.FORMVARIABLE 
       add constraint FK5sar1sipn176tgyiqcb42vff8 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.FORMVARIABLE 
       add constraint FK6lkpoyrtxowa1guctosu0n2s3 
       foreign key (REF_VARIABLES_ROOT) 
       references tura.ROOT;

    alter table tura.FORMVARIABLE 
       add constraint FKf3uxjcv4ryspkmb93jdi78qq1 
       foreign key (REF_OP_PARAM_REF_FORM_VARIABLE_FORM_PARAMETER) 
       references tura.FORMPARAMETER;

    alter table tura.GENERATIONHINT 
       add constraint FKd4bw7rgqkf87tgtgm0syg0xfe 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.GENERATIONHINT 
       add constraint FKkn5bgn4gv1erdhvmk2wawhlga 
       foreign key (REF_HINTS_TECH_LEAF) 
       references tura.TECHLEAF;

    alter table tura.GENERATIONHINTWITHNICKNAME 
       add constraint FKrrqg5yqg8ft1a4rneb1i02ar9 
       foreign key (REF_OP_HINT_GENERATION_HINT_WITH_NICK_NAME_GENERATION_HINT) 
       references tura.GENERATIONHINT;

    alter table tura.GENERATIONHINTWITHNICKNAME 
       add constraint FK9u8u06rqwta2p7kacbb4amx7u 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.GENERATIONHINTWITHNICKNAME 
       add constraint FK47t6gm7788vcdn8feiqmn1t91 
       foreign key (REF_HINTS_ARTIFACT) 
       references tura.ARTIFACT;

    alter table tura.GRANTACCESS 
       add constraint FK3ygkj271wtrdlt1mhp4m0m3wf 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.GRANTACCESS 
       add constraint FKaakv1dl51kfl8w7ei81hrhbs3 
       foreign key (ref_suid_securityEntityPointer) 
       references tura.SECURITYENTITYPOINTER;

    alter table tura.GRANTACCESS 
       add constraint FKg5d515bm5y3g1npewolst2sqw 
       foreign key (REF_GRANTS_SECURED) 
       references tura.SECURED;

    alter table tura.GROUP2GROUP 
       add constraint FK3aqojb3yeyliokia3n4wwsl4 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.GROUP2GROUP 
       add constraint FKdspulvvfqxtr1tasok3tivaxn 
       foreign key (REF_GROUP2_GROUPS_ROLES) 
       references tura.ROLES;

    alter table tura.GROUP2GROUP 
       add constraint FKehbykj8jxg8ggoqv6oxr100yn 
       foreign key (REF_OP_SOURCE_GROUP2_GROUP_GROUP) 
       references tura.GROUP_;

    alter table tura.GROUP2GROUP 
       add constraint FKgusdov16b11i01ydiuhuow6li 
       foreign key (REF_OP_TARGET_GROUP2_GROUP_GROUP) 
       references tura.GROUP_;

    alter table tura.GROUP2ROLE 
       add constraint FK1bkvs7jduefnlaarje32rljot 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.GROUP2ROLE 
       add constraint FK7ffcs2xer6vt8xpxpqvjvaflh 
       foreign key (REF_GROUP2_ROLES_ROLES) 
       references tura.ROLES;

    alter table tura.GROUP2ROLE 
       add constraint FKqgsn58rwto484hobjrfnnvbhu 
       foreign key (REF_OP_SOURCE_GROUP2_ROLE_GROUP) 
       references tura.GROUP_;

    alter table tura.GROUP2ROLE 
       add constraint FKsi285ax1pubtsbadcjtbxjaoo 
       foreign key (REF_OP_TARGET_GROUP2_ROLE_ROLE) 
       references tura.ROLE_;

    alter table tura.GROUP_ 
       add constraint FKo2sns001r8om8w4p40fyeb91q 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.GROUP_ 
       add constraint FKbbw58yg00gfuhjekon9knp0g 
       foreign key (ref_suid_securityEntity) 
       references tura.SECURITYENTITY;

    alter table tura.GROUP_ 
       add constraint FKct8gh0gus7pd3rwsela50gnou 
       foreign key (REF_GROUPS_ROLES) 
       references tura.ROLES;

    alter table tura.HASHPROPERTY 
       add constraint FKgduvnaitpn0ecl0jv7e3q86q4 
       foreign key (REF_OP_CONF_HASH_REF_HASH_PROPERTY_CONFIG_HASH) 
       references tura.CONFIGHASH;

    alter table tura.HASHPROPERTY 
       add constraint FKnxc344s3lqk6563vrh08u6dyv 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.HASHPROPERTY 
       add constraint FKh6nf7y590q96lxeopglscam7k 
       foreign key (REF_HASH_PROPERTIES_CONFIGURATION) 
       references tura.CONFIGURATION;

    alter table tura.INFRASTRUCTURE 
       add constraint FKsxulbyppl5hsadibk9spioiiw 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.INFRASTRUCTURE 
       add constraint FKm3useux9071jcif1if5g6qi2i 
       foreign key (REF_INFRASTRUCTURES_RECIPES) 
       references tura.RECIPES;

    alter table tura.INFRASTRUCTURE2CONFIGURATION 
       add constraint FKgo4m2tcbmwwoyfbs96gnm3tt5 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.INFRASTRUCTURE2CONFIGURATION 
       add constraint FKnikyacflduge7ty90itydjhsd 
       foreign key (REF_INFRASTRUCTURE2_CONFIGURATIONS_RECIPES) 
       references tura.RECIPES;

    alter table tura.INFRASTRUCTURE2CONFIGURATION 
       add constraint FKl9o9ktswmhcrfunre3jktk553 
       foreign key (REF_OP_SOURCE_INFRASTRUCTURE2_CONFIGURATION_INFRASTRUCTURE) 
       references tura.INFRASTRUCTURE;

    alter table tura.INFRASTRUCTURE2CONFIGURATION 
       add constraint FK8mprant9cy361g5noj7lqw3id 
       foreign key (REF_OP_TARGET_INFRASTRUCTURE2_CONFIGURATION_CONFIGURATION) 
       references tura.CONFIGURATION;

    alter table tura.INFRASTRUCTURECOMPONENT 
       add constraint FKna67um4har2ow1rj0my2tp734 
       foreign key (REF_INFRASTRUCTURE_COMPONENT_INFRASTRUCTURE_LAYER) 
       references tura.INFRASTRUCTURELAYER;

    alter table tura.INFRASTRUCTURECOMPONENT 
       add constraint FKgcae2pldqc1g3hkfo0jjd2qwk 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.INFRASTRUCTURECOMPONENT 
       add constraint FKfsuoqy2wf2t50p4l63gechh1w 
       foreign key (REF_SERVERS_SERVER_CLASTER) 
       references tura.INFRASTRUCTURECOMPONENT;

    alter table tura.INFRASTRUCTURECONNECTION 
       add constraint FK9yc0n7q9pnjwc4e9vcqedfsv0 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.INFRASTRUCTURECONNECTION 
       add constraint FKdixeugvt4jqnmejj73qvqyjyy 
       foreign key (REF_INFRASTRUCTURE_CONNECTIONS_ENTERPRISE_INFRASTRUCTURE) 
       references tura.ENTERPRISEINFRASTRUCTURE;

    alter table tura.INFRASTRUCTURECONNECTION 
       add constraint FK29x8gm3igvnt9idbwiqts825n 
       foreign key (REF_OP_SOURCE_INFRASTRUCTURE_CONNECTION_INFRASTRUCTURE_COMPONENT) 
       references tura.INFRASTRUCTURECOMPONENT;

    alter table tura.INFRASTRUCTURECONNECTION 
       add constraint FKewwxsrgr4va1pwmutq9rvg4xv 
       foreign key (REF_OP_TARGET_INFRASTRUCTURE_CONNECTION_INFRASTRUCTURE_COMPONENT) 
       references tura.INFRASTRUCTURECOMPONENT;

    alter table tura.INFRASTRUCTURELAYER 
       add constraint FKlkqhk62j6rxqe8xqqh6mu11ms 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.INFRASTRUCTURELAYER 
       add constraint FK7idvidkito7a0jgmwho5txoq 
       foreign key (REF_INFRASTRUCTURE_LAYER_SUBSYSTEM) 
       references tura.SUBSYSTEM;

    alter table tura.INGREDIENT 
       add constraint FKgiocj5mijwwye9dgua2rsfo1y 
       foreign key (REF_OP_CONTROLLER_LAYER_INGREDIENT_MAPPING_LAYER) 
       references tura.MAPPINGLAYER;

    alter table tura.INGREDIENT 
       add constraint FKol7aya26ypvxrh25p9jfaud5d 
       foreign key (ref_suid_hTMLLayerHolder) 
       references tura.HTMLLAYERHOLDER;

    alter table tura.INGREDIENT 
       add constraint FKf6o8gr1leca0cgnddw0k04gjd 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.INGREDIENT 
       add constraint FKra6hesib89h4pidd89ameuvag 
       foreign key (ref_suid_orderable) 
       references tura.ORDERABLE;

    alter table tura.INGREDIENT 
       add constraint FK269k1u5er1vfn0yc0xy4w4mdp 
       foreign key (ref_suid_usingMappers) 
       references tura.USINGMAPPERS;

    alter table tura.INGREDIENT 
       add constraint FK7a6i3skxf8ryq8omlmt2i44j3 
       foreign key (REF_INGREDIENTS_RECIPE) 
       references tura.RECIPE;

    alter table tura.INSERTTRIGGER 
       add constraint FK127xsoh5k9t529kjc7kjkxywy 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.INSERTTRIGGER 
       add constraint FKk28luyftk1p355povnc73fqlf 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.INSERTTRIGGER 
       add constraint FKe9jskywmj784gttq8fpy9swta 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.INSERTTRIGGER 
       add constraint FKljr3cah3y9t98ec0a1j9s3kcv 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.JAVAMAPPER 
       add constraint FK1q99lle4pxgm9g5h49btqxn7i 
       foreign key (ref_suid_mapper) 
       references tura.MAPPER;

    alter table tura.JAVAMAPPER 
       add constraint FKtkmyvjby0e366rdw1j3lavwgx 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.JAVAMAPPER 
       add constraint FKsoqp1u1848wqx9fpkbrtg1a1c 
       foreign key (ref_suid_typeMapper) 
       references tura.TYPEMAPPER;

    alter table tura.JAVAMAPPER 
       add constraint FK1x3fmkiebhmxgrqujg7fuy2e3 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.JAVAMAPPER 
       add constraint FKduir9y59d689uwfhja9u2rvcc 
       foreign key (ref_suid_versionRef) 
       references tura.VERSIONREF;

    alter table tura.JAVAPACKAGEMAPPER 
       add constraint FK1yi3hlf6ea59x1feirxsgr1lc 
       foreign key (ref_suid_mapper) 
       references tura.MAPPER;

    alter table tura.JAVAPACKAGEMAPPER 
       add constraint FKlpmngwcs6npvrw29v4hdoo1s1 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.JAVAPACKAGEMAPPER 
       add constraint FKtioyqtoeicp42cj5dlg839h6k 
       foreign key (ref_suid_packageMapper) 
       references tura.PACKAGEMAPPER;

    alter table tura.JAVAPACKAGEMAPPER 
       add constraint FK9fb39eytndey18s8lsevfbgn7 
       foreign key (ref_suid_packagePointer) 
       references tura.PACKAGEPOINTER;

    alter table tura.JAVAPACKAGEMAPPER 
       add constraint FKcxokpq2hf6kr72ej94f16l4uk 
       foreign key (ref_suid_versionRef) 
       references tura.VERSIONREF;

    alter table tura.JAVASCRIPTMAPPER 
       add constraint FKsrembc3asmee5ebapm1f8siye 
       foreign key (ref_suid_mapper) 
       references tura.MAPPER;

    alter table tura.JAVASCRIPTMAPPER 
       add constraint FKcriejikbs7s9oswwm38dhtq6q 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.JAVASCRIPTMAPPER 
       add constraint FKj2qkh9fstiq7g3m7bpojt2hu 
       foreign key (ref_suid_typeMapper) 
       references tura.TYPEMAPPER;

    alter table tura.JAVASCRIPTMAPPER 
       add constraint FKrk5xxbfgxglu7875t7cjuek3l 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.JAVASCRIPTMAPPER 
       add constraint FK9k7f23p2it4aavy1vif2j3jku 
       foreign key (ref_suid_versionRef) 
       references tura.VERSIONREF;

    alter table tura.KEYVALUEPAIR 
       add constraint FKa2cv251e0khkmpc28re8tdt5o 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.KEYVALUEPAIR 
       add constraint FK4u4gjqa2194lp4e11f54qjxkg 
       foreign key (REF_HASH_HASH_PROPERTY) 
       references tura.HASHPROPERTY;

    alter table tura.LANGUAGE 
       add constraint FK4qcwwqw7c7ej83hjnatvrhxwg 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.LANGUAGE 
       add constraint FKdryk6t3y4pylq0efdrpb2eh55 
       foreign key (REF_LANGUAGES_APPLICATION_LANGUAGES) 
       references tura.APPLICATIONLANGUAGES;

    alter table tura.LINK 
       add constraint FKl79owfad5y5ft4mc2ydcdhvc7 
       foreign key (REF_OP_DETAIL_FIELD_LINK_ATTRIBUTE) 
       references tura.ATTRIBUTE;

    alter table tura.LINK 
       add constraint FKawwclboj57ebgbusxtoldaq9i 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.LINK 
       add constraint FK9ale9pbos3miec732p83f2yir 
       foreign key (REF_OP_MASTER_FIELD_LINK_ATTRIBUTE) 
       references tura.ATTRIBUTE;

    alter table tura.LINK 
       add constraint FK54useytgyypjaol49ca831is7 
       foreign key (REF_LINKS_ASSOSIATION) 
       references tura.RELATIONSHIP;

    alter table tura.LINK 
       add constraint FKjmjy7giveoh8w5o2kvn8kcd6c 
       foreign key (REF_LINKS_RELATION) 
       references tura.RELATION;

    alter table tura.LINKTOLABEL 
       add constraint FKh9b1de410v80b6hskj874cpsb 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.LINKTOLABEL 
       add constraint FK8e0vgfbwer2ffppnuxjw5tbja 
       foreign key (REF_LINK_TO_LABELS_VIEW_AREA) 
       references tura.VIEWAREA;

    alter table tura.LINKTOLABEL 
       add constraint FKssrgppfjashtxdsj9idp52unf 
       foreign key (REF_OP_SOURCE_LINK_TO_LABEL_INPUT_ELEMENT) 
       references tura.UIELEMENT;

    alter table tura.LINKTOLABEL 
       add constraint FKh93w97bimtbu8efd7dgmr8m31 
       foreign key (REF_OP_TARGET_LINK_TO_LABEL_LABEL) 
       references tura.UIELEMENT;

    alter table tura.LINKTOMESSAGE 
       add constraint FK2y1seoh4nc6h63oguw30vmxo1 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.LINKTOMESSAGE 
       add constraint FKow4srtc62y40q5yuhd1pcmfdx 
       foreign key (REF_LINK_TO_MESSAGES_VIEW_AREA) 
       references tura.VIEWAREA;

    alter table tura.LINKTOMESSAGE 
       add constraint FK4e1eja2q8wnygvn63hd6gdbsb 
       foreign key (REF_OP_SOURCE_LINK_TO_MESSAGE_INPUT_ELEMENT) 
       references tura.UIELEMENT;

    alter table tura.LINKTOMESSAGE 
       add constraint FKqn1t9bc2rkqvt7e2nduvu9r9x 
       foreign key (REF_OP_TARGET_LINK_TO_MESSAGE_MESSAGE_ELEMENT) 
       references tura.UIELEMENT;

    alter table tura.MAPPER 
       add constraint FKes9bn0h99tcajtcglaodvr9sp 
       foreign key (REF_MAPPERS_MAPPERS) 
       references tura.MAPPERS;

    alter table tura.MAPPERS 
       add constraint FK2tjmvt9u9omf09w2tccp6hc3e 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MAPPERS 
       add constraint FKqn6c60watkv0frbgkua79opge 
       foreign key (REF_MAPPER_APPLICATION_MAPPER) 
       references tura.APPLICATIONMAPPER;

    alter table tura.MAPPINGLAYER 
       add constraint FKo2bkyelrg427g4o6bu6xu4945 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MAPPINGLAYER 
       add constraint FKop1twbxepnklxtoahyhtuqdex 
       foreign key (REF_APP_LAYERS_APPLICATION_MAPPERS) 
       references tura.APPLICATIONMAPPERS;

    alter table tura.MAPPINGTECNOLOGIY 
       add constraint FKlea8wg0of7srom2a7owctie97 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MAPPINGTECNOLOGIY 
       add constraint FK4l8mlohfgd8qedwej9ryvayct 
       foreign key (REF_TECHNOLOGIES_MODEL_MAPPER) 
       references tura.MODELMAPPER;

    alter table tura.MAPPINGTECNOLOGIY 
       add constraint FKiy615u1b5keoadb86fr3qunca 
       foreign key (REF_OP_TECH_REF_MAPPING_TECNOLOGIY_TECHNOLOGY) 
       references tura.TECHNOLOGY;

    alter table tura.MAPPINGTECNOLOGIY 
       add constraint FKcqbeykr5ida2gol0kbxjwjuul 
       foreign key (REF_OP_VALUE_REF_MAPPING_TECNOLOGIY_OPTION) 
       references tura.OPTION;

    alter table tura.MENUDEFINITION 
       add constraint FK9d7922grfkk24qslthp46g3tf 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.MENUDEFINITION 
       add constraint FKt2kyh0qeuj0evxoqu0rb0t4eu 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MENUDEFINITION 
       add constraint FKr2ld883pnl34ga036wmgqdgnq 
       foreign key (ref_suid_styleElement) 
       references tura.STYLEELEMENT;

    alter table tura.MENUDEFINITION 
       add constraint FKn66yfagiab7yag4tsu73xj9nj 
       foreign key (REF_MENUS_VIEWS) 
       references tura.VIEWS;

    alter table tura.MENUELEMENT 
       add constraint FKcin54um79divy7rtokax7y6c9 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.MENUELEMENT 
       add constraint FKa9vju5a00i06yesb89aw5kqd3 
       foreign key (ref_suid_enabledUIItem) 
       references tura.ENABLEDUIITEM;

    alter table tura.MENUELEMENT 
       add constraint FK6qdx4lysruqujafo8xao2igua 
       foreign key (ref_suid_flexFields) 
       references tura.FLEXFIELDS;

    alter table tura.MENUELEMENT 
       add constraint FKny8bm1qw37vq6otcmeh5uftes 
       foreign key (ref_suid_multiLangLabel) 
       references tura.MULTILANGLABEL;

    alter table tura.MENUELEMENT 
       add constraint FKorue4lrgyqfsg1c8fi0adblfc 
       foreign key (ref_suid_orderable) 
       references tura.ORDERABLE;

    alter table tura.MENUELEMENT 
       add constraint FKn6ip7ckwy0hu2xlgy87v6i90r 
       foreign key (ref_suid_styleElement) 
       references tura.STYLEELEMENT;

    alter table tura.MENUELEMENT 
       add constraint FKgh7r221s14ykqhc5i1bi0qjp0 
       foreign key (REF_MENU_ELEMENTS_MENU_FOLDER) 
       references tura.MENUFOLDER;

    alter table tura.MENUELEMENT 
       add constraint FK4cmpux41eh80wh9xku5w8lx1j 
       foreign key (ref_suid_itemIcon) 
       references tura.ITEMICON;

    alter table tura.MENUELEMENT 
       add constraint FKdd3aw8fi5s2dlcl2b3332r2fc 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MENUELEMENT 
       add constraint FK50f8x6dxpfqdq3nu42bx13p5b 
       foreign key (ref_suid_menuExtensionRef) 
       references tura.MENUEXTENSIONREF;

    alter table tura.MENUEXTENSIONREF 
       add constraint FK4j73gjjuq5gtdr97c17el704n 
       foreign key (REF_OP_EXTENSION_REF_MENU_EXTENSION_REF_MENU_FOLDER) 
       references tura.MENUFOLDER;

    alter table tura.MENUFOLDER 
       add constraint FK63ju9rvdu8mtuq13byf9w5cin 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.MENUFOLDER 
       add constraint FKoqmd37f3fndi8n1ojrce78qii 
       foreign key (ref_suid_enabledUIItem) 
       references tura.ENABLEDUIITEM;

    alter table tura.MENUFOLDER 
       add constraint FKhmdhjpnr7dgjipe706y0setj1 
       foreign key (ref_suid_flexFields) 
       references tura.FLEXFIELDS;

    alter table tura.MENUFOLDER 
       add constraint FKqt2rkpqt711nk2o6q7j71pa52 
       foreign key (ref_suid_hTMLLayerHolder) 
       references tura.HTMLLAYERHOLDER;

    alter table tura.MENUFOLDER 
       add constraint FKmkl9p0kuwgaa8j45mqi9mgf9s 
       foreign key (ref_suid_itemIcon) 
       references tura.ITEMICON;

    alter table tura.MENUFOLDER 
       add constraint FK2ukbhe1qnrpgs1a3siy6eui3j 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MENUFOLDER 
       add constraint FK86i49kxnxs2idrlewgoyrllb4 
       foreign key (ref_suid_multiLangLabel) 
       references tura.MULTILANGLABEL;

    alter table tura.MENUFOLDER 
       add constraint FKl6ieimxmbu7yc7gvlf7gxaif9 
       foreign key (ref_suid_styleElement) 
       references tura.STYLEELEMENT;

    alter table tura.MENUFOLDER 
       add constraint FKevufkj7ijndta69skjqak1i04 
       foreign key (REF_MENU_FOLDERS_MENU_DEFINITION) 
       references tura.MENUDEFINITION;

    alter table tura.MENUHOLDER 
       add constraint FKnv32v2vnw9hgbax8pxtmdw3hf 
       foreign key (REF_OP_MENU_MENU_HOLDER_MENU_FOLDER) 
       references tura.MENUFOLDER;

    alter table tura.MESSAGE 
       add constraint FKcuvqaju8af2rv10531w08dea8 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MESSAGE 
       add constraint FK1niwfrk747ba0ui3pw01hp00a 
       foreign key (REF_MESSAGES_MESSAGE_LIBRARY) 
       references tura.MESSAGELIBRARY;

    alter table tura.MESSAGELIBRARY 
       add constraint FKbyvt6ysyc9emfewm8eh7jcogv 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.MESSAGELIBRARY 
       add constraint FKpi6q5sux05ecp6nh27ksm0wjf 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MESSAGELIBRARY 
       add constraint FKpcldm00bbss9x7qttcn1hq0k5 
       foreign key (REF_LIBRARIES_APPLICATION_MESSAGE_LIBRARY) 
       references tura.APPLICATIONMESSAGELIBRARY;

    alter table tura.METAMODELPACKAGEMAPPER 
       add constraint FKih1o8l0tc22aoixr4sfoqhjn1 
       foreign key (ref_suid_mapper) 
       references tura.MAPPER;

    alter table tura.METAMODELPACKAGEMAPPER 
       add constraint FK6sgjn27ho7g7lgt5p4ic7in1p 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.METAMODELPACKAGEMAPPER 
       add constraint FKhjlbvvbsj5vx2i324njs1lgp7 
       foreign key (ref_suid_packageMapper) 
       references tura.PACKAGEMAPPER;

    alter table tura.METAMODELPACKAGEMAPPER 
       add constraint FKevme8509e82i1qqpkkykh6y9p 
       foreign key (ref_suid_packagePointer) 
       references tura.PACKAGEPOINTER;

    alter table tura.METHODPOINTER 
       add constraint FK1w38viaylldfeq4629vsm2no4 
       foreign key (REF_OP_METHOD_REF_METHOD_POINTER_OPERATION) 
       references tura.OPERATION;

    alter table tura.MODELMAPPER 
       add constraint FK5xgdac6sp48dv0qcr30evfy4d 
       foreign key (ref_suid_artifactRef) 
       references tura.ARTIFACTREF;

    alter table tura.MODELMAPPER 
       add constraint FK3sl2r5vnaacxjldipji1mpb80 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.MODELMAPPER 
       add constraint FKpppxpnsflns7ftvohk5i71qv 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MODELMAPPER 
       add constraint FKm7abvmmk3y5t7991ic266xiv 
       foreign key (ref_suid_orderable) 
       references tura.ORDERABLE;

    alter table tura.MODELMAPPER 
       add constraint FK2v056e4nwk0p01q0s68pq938r 
       foreign key (REF_MAPPERS_COMPONENT) 
       references tura.COMPONENT;

    alter table tura.MODELQUERY 
       add constraint FKjduyf601tcf08ifbs3etamv7k 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.MODELQUERY 
       add constraint FK4tw8ra900qbeqg1ddx9iwm4xe 
       foreign key (REF_MODEL_QUERY_ARTIFACT) 
       references tura.ARTIFACT;

    alter table tura.OBJECTMAPPER 
       add constraint FKn606ym1c0uee0sesmu2vrbwgb 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.OBJECTMAPPER 
       add constraint FK9vsmm43qu5vb6h5ft1yq6fw45 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.OBJECTMAPPER 
       add constraint FKst9sxpo80pbkaxe1rv5om25lx 
       foreign key (REF_OBJECT_MAPPERS_OBJECT_MAPPER_GROUP) 
       references tura.OBJECTMAPPERGROUP;

    alter table tura.OBJECTMAPPER 
       add constraint FKcg90mtlufo2vmaw5oj1ts6y0v 
       foreign key (REF_OP_STAGE_OBJECT_MAPPER_PROCESSING_STAGE) 
       references tura.PROCESSINGSTAGE;

    alter table tura.OBJECTMAPPERGROUP 
       add constraint FKqsthg3yw0narj667k0dfjrrsl 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.OBJECTMAPPERGROUP 
       add constraint FK2x24mx2kjm26duw6nnsqwavqk 
       foreign key (REF_OBJECT_MAPPER_PACKAGES_DOMAIN_MAPPER) 
       references tura.DOMAINMAPPER;

    alter table tura.OMRELATION 
       add constraint FK6ivfgexhascpysrst4kktln1n 
       foreign key (REF_OP_ASSOSIATION_REF_OM_RELATION_ASSOSIATION) 
       references tura.RELATIONSHIP;

    alter table tura.OMRELATION 
       add constraint FK8fu65pac1jbp927s3x6addved 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.OMRELATION 
       add constraint FKhe1khsk9kmw0gkaj7qfiojbdi 
       foreign key (REF_OP_OBJECT_MAPPER_REF_OM_RELATION_OBJECT_MAPPER) 
       references tura.OBJECTMAPPER;

    alter table tura.OMRELATION 
       add constraint FKd8f6xyd6aoqfc1gk61mm5mwk7 
       foreign key (REF_RELATIONS_OBJECT_MAPPER) 
       references tura.OBJECTMAPPER;

    alter table tura.OMRELATION 
       add constraint FKh1x64fh8epjb1vqoj8jdl8r9h 
       foreign key (REF_OP_TYPE_REF_OM_RELATION_TYPE_ELEMENT) 
       references tura.TYPEELEMENT;

    alter table tura.OPERATION 
       add constraint FKftr6m81n0ynym7koq1esalnbp 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.OPERATION 
       add constraint FK2ayjf5woisss0913e4lfjwf5b 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.OPERATION 
       add constraint FK5veauxhepv4ky56hpsf7voedd 
       foreign key (ref_suid_secured) 
       references tura.SECURED;

    alter table tura.OPERATION 
       add constraint FK8471huxanxn2opg7a5gxx57hf 
       foreign key (REF_OPERATIONS_TYPE) 
       references tura.TYPEELEMENT;

    alter table tura.OPERATIONCONNECTOR 
       add constraint FK8tbvyfv3q1s9hmw9fskaqnlt2 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.OPERATIONCONNECTOR 
       add constraint FKhyl31q5616e2hakvi38v5pbcl 
       foreign key (ref_suid_operationConnectorRef) 
       references tura.OPERATIONCONNECTORREF;

    alter table tura.OPERATIONCONNECTOR 
       add constraint FKmbs3tl886o0qefeky3i7exuk 
       foreign key (REF_OPERATIONS_CONNECTOR_OBJECT_MAPPER_GROUP) 
       references tura.OBJECTMAPPERGROUP;

    alter table tura.OPERATIONCONNECTOR 
       add constraint FKka6ww24yu3ns6pbcp956ddp8t 
       foreign key (REF_OP_SOURCE_OPERATION_CONNECTOR_OBJECT_MAPPER) 
       references tura.OBJECTMAPPER;

    alter table tura.OPERATIONCONNECTOR 
       add constraint FKbvmfql2u5naj7u3kcqu754fug 
       foreign key (REF_OP_TARGET_OPERATION_CONNECTOR_OBJECT_MAPPER) 
       references tura.OBJECTMAPPER;

    alter table tura.OPERATIONCONNECTORREF 
       add constraint FKc3383cmvxggnjqkhd4sv455j8 
       foreign key (REF_OP_OPERATION_REF_OPERATION_CONNECTOR_REF_OPERATION_CONNECTOR) 
       references tura.OPERATIONCONNECTOR;

    alter table tura.OPTION 
       add constraint FKlspyottiw51576rf07oklygdn 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.OPTION 
       add constraint FK8yhh5h4psvyut2prh3dm7bg37 
       foreign key (REF_OPTIONS_TECHNOLOGY) 
       references tura.TECHNOLOGY;

    alter table tura.OPTION 
       add constraint FK3p31t9ucttqmpr81y1sf4qpss 
       foreign key (REF_OP_VALUE_OPTION_TECH_LEAF) 
       references tura.TECHLEAF;

    alter table tura.OPTIONSELECTION 
       add constraint FKn0ojk4sbr4ypv3iy479okg8en 
       foreign key (REF_OP_OPTION_CAST_OPTION_SELECTION_TYPE) 
       references tura.TYPEELEMENT;

    alter table tura.OPTIONSELECTION 
       add constraint FKt42q3yid05t78p4lxds8rs4ww 
       foreign key (REF_OP_OPTION_CAST_DATA_CONTROL_OPTION_SELECTION_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.OPTIONSELECTION 
       add constraint FKp50staqtku71kbyvi88s67t5j 
       foreign key (REF_OP_OPTION_POINTER_OPTION_SELECTION_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.ORDERBY 
       add constraint FKo5ulwih4sqwqn8oq9yh78lh9q 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ORDERBY 
       add constraint FKhx4r2fdrfq46g2d9d34xirn5p 
       foreign key (REF_ORDER_RULES_ORDERS) 
       references tura.ORDERS;

    alter table tura.ORDERBY 
       add constraint FKpsbl9fmwhe6kk3w1o2hkqsixr 
       foreign key (REF_OP_REF_OBJ_ORDER_BY_META_OBJECT) 
       references tura.METAOBJECT;

    alter table tura.ORDERS 
       add constraint FKf8f99pim2ehu4ncuwjh7fniup 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ORDERS 
       add constraint FKk43gkbwli95xom5ece4vlhej 
       foreign key (REF_DEFAULT_ORDER_BY_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.PACKAGEPOINTER 
       add constraint FKf13eogf0ny4ecvll7sd6kpnwq 
       foreign key (REF_OP_PACKAGE_REF_PACKAGE_POINTER_TYPE_GROUP) 
       references tura.TYPEGROUP;

    alter table tura.PARAMETER 
       add constraint FK1jm1rdds362fra2sp9fr53qg3 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.PARAMETER 
       add constraint FK31oomkp9i5orkj93xw3al2o12 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.PARAMETER 
       add constraint FKawl82jemyhpdx3xqeivp689pn 
       foreign key (REF_PARAMETERS_OPERATION) 
       references tura.OPERATION;

    alter table tura.POSTCREATETRIGGER 
       add constraint FKehjc3vigm72os1b6fipw96xg3 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.POSTCREATETRIGGER 
       add constraint FKg144xomk7bmc9hk9d8jxkms10 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.POSTCREATETRIGGER 
       add constraint FK9qsdmbifdb8bl5ada7wbiiatg 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.POSTCREATETRIGGER 
       add constraint FKh1camvtmm2t6mxvbx4knoa59s 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.POSTCREATETRIGGER 
       add constraint FKclmfq6024xmng6jw7wws44d6r 
       foreign key (REF_POST_CREATE_TRIGGER_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.POSTQUERYTRIGGER 
       add constraint FKpi02toc6xkngwbte28pgurm1h 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.POSTQUERYTRIGGER 
       add constraint FKadkj69ay8d5tb73vtrtkami79 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.POSTQUERYTRIGGER 
       add constraint FKlicgjbo7bqlr9sv24xxdgufsk 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.POSTQUERYTRIGGER 
       add constraint FKfqc0em1jds9ety2idqbyuk30c 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.POSTQUERYTRIGGER 
       add constraint FK158xjektfnk118u4a6qxpnmev 
       foreign key (REF_POST_QUERY_TRIGGER_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.PREDELETETRIGGER 
       add constraint FKj26uabuakfd7kdho5gk94bmll 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.PREDELETETRIGGER 
       add constraint FK1vg97nc0uvu0dlnwuvmdlcrn5 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.PREDELETETRIGGER 
       add constraint FKmvlvykxjtpgmamwwshjrxs79o 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.PREDELETETRIGGER 
       add constraint FK1rl7cam451kerd7a7ftlom72l 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.PREDELETETRIGGER 
       add constraint FKiglmu14aemp1yyr1qctck66na 
       foreign key (REF_PRE_DELETE_TRIGGER_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.PREFORMTRIGGER 
       add constraint FKblddnedit5mk0i2inw2o455p5 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.PREFORMTRIGGER 
       add constraint FKjejyjy7qhwb4jpyh68qdlglt9 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.PREFORMTRIGGER 
       add constraint FKn52dm5yv7fne78j1rngben8fk 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.PREFORMTRIGGER 
       add constraint FKm4jrx88lhv4ddeptng4wmit5i 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.PREFORMTRIGGER 
       add constraint FKkty3nksyemotjetr3swhycs2m 
       foreign key (REF_PRE_FORM_TRIGGER_ROOT) 
       references tura.ROOT;

    alter table tura.PREINSERTTRIGGER 
       add constraint FKipvlbv74c3tqxujl30endhgu6 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.PREINSERTTRIGGER 
       add constraint FKm77n6pwxj3fx2t2s53ww77r3k 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.PREINSERTTRIGGER 
       add constraint FKhcrxt1mrs0eys4d1t9wf9ob24 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.PREINSERTTRIGGER 
       add constraint FKtnh70xxd1337b0w0icxvwb1kj 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.PREINSERTTRIGGER 
       add constraint FKn6ps9g3cuy0jkwpknselp85os 
       foreign key (REF_PRE_INSERT_TRIGGER_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.PREQUERYTRIGGER 
       add constraint FKls567xccmbc2bqg87k5l4t4j 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.PREQUERYTRIGGER 
       add constraint FKm3le913iu7vadoh0yw11c1670 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.PREQUERYTRIGGER 
       add constraint FKk2h76e2cowt8rid5046tuismd 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.PREQUERYTRIGGER 
       add constraint FKk758ianiyo7hwu9tby0kirrfa 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.PREQUERYTRIGGER 
       add constraint FKov6s2abhsjjto25pq0ite0g09 
       foreign key (REF_PRE_QUERY_TRIGGER_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.PREUPDATETRIGGER 
       add constraint FKm700hpjctyf1ld2lg2qi3lkl9 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.PREUPDATETRIGGER 
       add constraint FKshw3f9yf4r3lkptfb2xh1e5ea 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.PREUPDATETRIGGER 
       add constraint FK11mg05wbdc35jq2vk1am8iod6 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.PREUPDATETRIGGER 
       add constraint FKni3ysie8bpqlqp2axjpj33fnk 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.PREUPDATETRIGGER 
       add constraint FKrwec1n7q54t6qeo9x0svbvi22 
       foreign key (REF_PRE_UPDATE_TRIGGER_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.PRIMITIVESGROUP 
       add constraint FK851la4gp64uox2xfydfchcye1 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.PRIMITIVESGROUP 
       add constraint FK2e7ry5hvx8loptb4g3enavhc0 
       foreign key (REF_PRIMITIVES_DOMAIN_TYPES) 
       references tura.DOMAINTYPES;

    alter table tura.PROCESSINGSTAGE 
       add constraint FKq1ra2h8nu7bj8kbnxj6i35n2w 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.PROCESSINGSTAGE 
       add constraint FKntkuuhokfeyts49et3o5rb7cn 
       foreign key (REF_NEXT_STAGE_PROCESSING_STAGE) 
       references tura.PROCESSINGSTAGE;

    alter table tura.PROCESSINGSTAGE 
       add constraint FKlkcerrtlyxl814erx3v49fpff 
       foreign key (REF_STAGES_OBJECT_MAPPER_GROUP) 
       references tura.OBJECTMAPPERGROUP;

    alter table tura.PROPERTY 
       add constraint FKm94hjq31xi1v41h1dko3687mx 
       foreign key (REF_OP_CONF_VAR_REF_PROPERTY_CONFIG_VARIABLE) 
       references tura.CONFIGVARIABLE;

    alter table tura.PROPERTY 
       add constraint FKn0kkl43m3jldiiyc5m86cfto9 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.PROPERTY 
       add constraint FKcyckvx73datfygcfv84p4v32g 
       foreign key (REF_PROPERTIES_CONFIGURATION) 
       references tura.CONFIGURATION;

    alter table tura.QUERY 
       add constraint FK5g92kpuw52b1c7p4hrasbsfyr 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.QUERY 
       add constraint FKbb5xonctthahp950dk9t5crby 
       foreign key (REF_QUERIES_MODEL_MAPPER) 
       references tura.MODELMAPPER;

    alter table tura.QUERY 
       add constraint FKjtxbktqgn470d2hiwdnups856 
       foreign key (REF_OP_QUERY_REF_QUERY_MODEL_QUERY) 
       references tura.MODELQUERY;

    alter table tura.QUERYPARAMETER 
       add constraint FKbbx46r9mlja537ri6fj0npy4l 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.QUERYPARAMETER 
       add constraint FKidqkpyyd7pekubrncvcbfwq3e 
       foreign key (REF_PARAMETERS_MODEL_QUERY) 
       references tura.MODELQUERY;

    alter table tura.QUERYVARIABLE 
       add constraint FKktyxqi3yu0tpa4fcp3k0mkv2k 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.QUERYVARIABLE 
       add constraint FKasoeej6cdcafq2qk1umngw0k5 
       foreign key (REF_VARIABLES_QUERY) 
       references tura.QUERY;

    alter table tura.QUERYVARIABLE 
       add constraint FK65aqmgc57pwm1bduwxcwj4ync 
       foreign key (REF_OP_QUERY_PARAM_REF_QUERY_VARIABLE_QUERY_PARAMETER) 
       references tura.QUERYPARAMETER;

    alter table tura.RECIPE 
       add constraint FKhdqin1ctgqqev7mk43sufy7sv 
       foreign key (ref_suid_hTMLLayerHolder) 
       references tura.HTMLLAYERHOLDER;

    alter table tura.RECIPE 
       add constraint FKq14qt4mlo4c0nj3qlfjpw73m 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.RECIPE 
       add constraint FK1sh9b11asip30820mufdp7505 
       foreign key (ref_suid_usingMappers) 
       references tura.USINGMAPPERS;

    alter table tura.RECIPE 
       add constraint FK5jg7egclic8a83hf0ivtw5uc0 
       foreign key (REF_RECIPE_RECIPES) 
       references tura.RECIPES;

    alter table tura.RECIPE2INFRASTRUCTURE 
       add constraint FKpslpv287git0cgcxmr7p1qgu6 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.RECIPE2INFRASTRUCTURE 
       add constraint FK8ljreaa2fen5bfekl9w3wu4b7 
       foreign key (REF_RECIPE2_INFRASTRUCTURES_RECIPES) 
       references tura.RECIPES;

    alter table tura.RECIPE2INFRASTRUCTURE 
       add constraint FKekcistkg3yvrbec02mmm3u8po 
       foreign key (REF_OP_SOURCE_RECIPE2_INFRASTRUCTURE_RECIPE) 
       references tura.RECIPE;

    alter table tura.RECIPE2INFRASTRUCTURE 
       add constraint FK99779aimsj3h7x0m337veakfg 
       foreign key (REF_OP_TARGET_RECIPE2_INFRASTRUCTURE_INFRASTRUCTURE) 
       references tura.INFRASTRUCTURE;

    alter table tura.RECIPES 
       add constraint FKefwm32d3t4bh0vppimi2i6cbs 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.RECIPES 
       add constraint FKmsmohsvimlg6d16wvc0jadifr 
       foreign key (REF_RECIPES_APPLICATION_RECIPE) 
       references tura.APPLICATIONRECIPE;

    alter table tura.RELATION 
       add constraint FKcl04e3ndp55cmpe6w120v34yy 
       foreign key (REF_OP_DETAIL_RELATION_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.RELATION 
       add constraint FKmhpn2dj1bb45vgbrd9f9jq33a 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.RELATION 
       add constraint FKmhcy9nmhd1o56wd6wdr9j6wor 
       foreign key (REF_OP_MASTER_RELATION_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.RELATION 
       add constraint FKaty5xcvmjh9ejncglb2limhg1 
       foreign key (REF_RELATIONS_CONTROLS) 
       references tura.CONTROLS;

    alter table tura.RELATION 
       add constraint FKtqddc01uh6jb33ueuglruw9sa 
       foreign key (REF_OP_ASSOSIATION_REF_INTERNAL_RELATION_ASSOSIATION) 
       references tura.RELATIONSHIP;

    alter table tura.RELATION 
       add constraint FKafahsvou2jmark41a19kg01g1 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.RELATIONMAPPER 
       add constraint FKs30mfholqaf8wiapag11ee18c 
       foreign key (REF_OP_ASSOSIATION_REF_RELATION_MAPPER_ASSOSIATION) 
       references tura.RELATIONSHIP;

    alter table tura.RELATIONMAPPER 
       add constraint FKk9worqwnborkrrjknjdeb3bcw 
       foreign key (REF_OP_DATA_CONTROL_REF_RELATION_MAPPER_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.RELATIONMAPPER 
       add constraint FKbhy8va66qiv2w3xpcodjetl7s 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.RELATIONMAPPER 
       add constraint FKpn5tg7mug05eucq7n55ermrxi 
       foreign key (REF_RELATION_MAPPERS_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.RELATIONMAPPER 
       add constraint FK7ixmyk8e8waq04rh3sw52v64p 
       foreign key (REF_OP_TYPE_REF_RELATION_MAPPER_TYPE_ELEMENT) 
       references tura.TYPEELEMENT;

    alter table tura.RELATIONSHIP 
       add constraint FKiy5s7cvc8l99r5akjyn6gk1g2 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.RELATIONSHIP 
       add constraint FK6ef6g84ax9l80l8oom68cv2vm 
       foreign key (REF_RELATIONSHIPS_TYPE_GROUP) 
       references tura.TYPEGROUP;

    alter table tura.RELATIONSHIP 
       add constraint FK6y718g6yqqpkm5fum3wd41wlx 
       foreign key (REF_OP_SOURCE_RELATIONSHIP_TYPE_ELEMENT) 
       references tura.TYPEELEMENT;

    alter table tura.RELATIONSHIP 
       add constraint FKehfvm91kmnug28jel4uqj2v0x 
       foreign key (REF_OP_TARGET_RELATIONSHIP_TYPE_ELEMENT) 
       references tura.TYPEELEMENT;

    alter table tura.RELATIONSHIP 
       add constraint FKmxcj5s6346j4uwjbat31f5nvu 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.RETURNVALUE 
       add constraint FK7la2aset2l165mcgxsmftqrsr 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.RETURNVALUE 
       add constraint FK33erjo3vs56fx16l9mxmn39tk 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.RETURNVALUE 
       add constraint FKpfotyba5qh5vl4lh5j37duwya 
       foreign key (REF_RETURN_VALUE_OPERATION) 
       references tura.OPERATION;

    alter table tura.RL_LAYERS_OPLAYERSMAPPER 
       add constraint FKoe91g8o3nxs8i35st5bblx8pm 
       foreign key (oplayersmapper_uid) 
       references tura.MAPPER;

    alter table tura.RL_LAYERS_OPLAYERSMAPPER 
       add constraint FKj76gvx6ohevrmnbe17y663jvg 
       foreign key (layers_suid) 
       references tura.MAPPINGLAYER;

    alter table tura.RL_MAPPERS_OPMAPPERSUSINGMAPPERS 
       add constraint FK84pq0ilfj57ip5bsluxwpw68t 
       foreign key (opmappersusingmappers_uid) 
       references tura.USINGMAPPERS;

    alter table tura.RL_MAPPERS_OPMAPPERSUSINGMAPPERS 
       add constraint FKd3ixddyqkup7dna90kcf6rb6i 
       foreign key (mappers_suid) 
       references tura.MAPPERS;

    alter table tura.RL_MODELLAYER_OPMODELLAYERINGREDIENT 
       add constraint FKch444ma83186jxcjco8e4gyij 
       foreign key (opmodellayeringredient_uid) 
       references tura.INGREDIENT;

    alter table tura.RL_MODELLAYER_OPMODELLAYERINGREDIENT 
       add constraint FKjwqx6o8bcbge6cyufwfydapcy 
       foreign key (modellayer_uid) 
       references tura.MAPPINGLAYER;

    alter table tura.RL_VEWLAYER_OPVEWLAYERINGREDIENT 
       add constraint FK8yc5tcopvjej7f1tncrbe4xu0 
       foreign key (opvewlayeringredient_uid) 
       references tura.INGREDIENT;

    alter table tura.RL_VEWLAYER_OPVEWLAYERINGREDIENT 
       add constraint FK3sum5frkltcwi9xe76pxd8puh 
       foreign key (vewlayer_uid) 
       references tura.MAPPINGLAYER;

    alter table tura.ROLE_ 
       add constraint FKkkl2sit0esqlhlw63svuntehi 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ROLE_ 
       add constraint FK4ygwvvdt1fhum90pbme0xke2q 
       foreign key (ref_suid_securityEntity) 
       references tura.SECURITYENTITY;

    alter table tura.ROLE_ 
       add constraint FKlykkt6pcrim3qgs8po5lyomon 
       foreign key (REF_ROLES_ROLES) 
       references tura.ROLES;

    alter table tura.ROLEMAPPER 
       add constraint FKib7o5xiyxo8up2ouvkinfja47 
       foreign key (ref_suid_mapper) 
       references tura.MAPPER;

    alter table tura.ROLEMAPPER 
       add constraint FK4ydh0agb7ib06cxi5rqbusmbp 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ROLEMAPPER 
       add constraint FKckgwf4nev96fcm7fperr95oou 
       foreign key (ref_suid_securityEntityPointer) 
       references tura.SECURITYENTITYPOINTER;

    alter table tura.ROLES 
       add constraint FK9sg2spbn3hwr9fkcbeqj1u347 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ROLES 
       add constraint FKvw3e0oitf2gj5rla6u1ftrrs 
       foreign key (REF_ROLES_APPLICATION_REALM) 
       references tura.APPLICATIONREALM;

    alter table tura.ROOT 
       add constraint FK431s8h2bwwc00wq9elpfd82s8 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.ROOT 
       add constraint FKabmv195gmtnonrcgavyq28vtf 
       foreign key (REF_ROOT_CONTROLS) 
       references tura.CONTROLS;

    alter table tura.SEARCHTRIGGER 
       add constraint FKfr7lytn3mj4qymw7aknh7lkvg 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.SEARCHTRIGGER 
       add constraint FKs4ur7ctdeotkj89trsqimw7bu 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.SEARCHTRIGGER 
       add constraint FKm1rtkqqoa8ls5uvpmo80c65v 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.SEARCHTRIGGER 
       add constraint FK10hsc9yitajb2vc5fmul21t1q 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.SEARCHTRIGGER 
       add constraint FK3r59y7xlav7l9bdej5tuf2b32 
       foreign key (REF_SEARCH_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.SECURITYENTITYPOINTER 
       add constraint FK8ut7hb8ryi69q50m7tp7drrju 
       foreign key (REF_OP_SECURITY_ENTITY_SECURITY_ENTITY_POINTER_SECURITY_ENTITY) 
       references tura.SECURITYENTITY;

    alter table tura.SELECTION 
       add constraint FKgxqwunrl46agvo0vr0ldc7wbk 
       foreign key (REF_OP_DISPLAY_OPTION_POINTER_SELECTION_META_OBJECT) 
       references tura.METAOBJECT;

    alter table tura.SELECTION 
       add constraint FKnio3lofo3son46vks4fyvoueo 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.SELECTION 
       add constraint FK75p03qpimsaqm7q1k88tsm6ue 
       foreign key (ref_suid_styleElement) 
       references tura.STYLEELEMENT;

    alter table tura.SELECTION 
       add constraint FK42ffrocau7nnei15bp8qdhs2k 
       foreign key (REF_SELECTION_OPTION_SELECTION) 
       references tura.OPTIONSELECTION;

    alter table tura.SELECTION 
       add constraint FKt8q5kr8wyb750xjr5p513b02t 
       foreign key (REF_OP_VALUE_OPTION_POINTER_SELECTION_META_OBJECT) 
       references tura.METAOBJECT;

    alter table tura.STYLELIBRARY 
       add constraint FKbdpdywckmlid8kwgsxgov34us 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.STYLELIBRARY 
       add constraint FKcaesvwuqce1923ng9m21nixke 
       foreign key (REF_LIBRARIES_APPLICATION_STYLE) 
       references tura.APPLICATIONSTYLE;

    alter table tura.STYLEPOINTER 
       add constraint FKhkhx1lniyuxxla98w53a8tqkv 
       foreign key (REF_OP_STYLE_LIBRARY_STYLE_POINTER_STYLE_LIBRARY) 
       references tura.STYLELIBRARY;

    alter table tura.STYLESET 
       add constraint FKdsbop6x5qq7fhewu0j8rm86eb 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.STYLESET 
       add constraint FK1w42v82ulgc8arbk7er8g695v 
       foreign key (REF_STYLES_STYLE_LIBRARY) 
       references tura.STYLELIBRARY;

    alter table tura.SUBSYSTEM 
       add constraint FK4h0e0bmje5ln32wn2nhaqp62f 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.SUBSYSTEM 
       add constraint FK82oj6sps41kevljmfusgu7uw0 
       foreign key (REF_SUBSYSTEMS_DATACENTER) 
       references tura.DATACENTER;

    alter table tura.TABPAGESINHERITANCE 
       add constraint FKbhafa6m57cfp9etlfpv0utjr3 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.TABPAGESINHERITANCE 
       add constraint FK6kxtvdgdsvlkvm6gxhpt4x9r1 
       foreign key (REF_TAB_PAGES_INHERITANCES_VIEWS) 
       references tura.VIEWS;

    alter table tura.TABPAGESINHERITANCE 
       add constraint FK4apqseecpx9612tfppqmjmwks 
       foreign key (REF_OP_SOURCE_TAB_PAGES_INHERITANCE_TAB_CANVAS) 
       references tura.CANVASFRAME;

    alter table tura.TABPAGESINHERITANCE 
       add constraint FKrt1434crvcvoq989dn6hxvtit 
       foreign key (REF_OP_TARGET_TAB_PAGES_INHERITANCE_TAB_PAGE) 
       references tura.CANVASFRAME;

    alter table tura.TECHLEAF 
       add constraint FKs9fgqpaf6npmcirhxk96stgr0 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.TECHLEAF 
       add constraint FKskua9r4yfpxcqkv8tmtscf0r5 
       foreign key (REF_TECH_LEAFS_DOMAIN_ARTIFACTS) 
       references tura.DOMAINARTIFACTS;

    alter table tura.TECHLEAF 
       add constraint FKi6xch2grij4u7tpdo2pt2247h 
       foreign key (REF_TECH_LEAFS_TECH_LEAF) 
       references tura.TECHLEAF;

    alter table tura.TECHNOLOGY 
       add constraint FKspf3mcyvxtfmpl1nwrffuxaut 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.TECHNOLOGY 
       add constraint FKqb43lla7v97k8tfcw56efpnmh 
       foreign key (REF_TECHNOLOGIES_ARTIFACT) 
       references tura.ARTIFACT;

    alter table tura.TOSUBMENU 
       add constraint FKh8a72ci3wkv6di18k7lnnvebv 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.TOSUBMENU 
       add constraint FKio5ra0wm81e2fwm6usnx439yj 
       foreign key (REF_TO_SUB_MENU_MENU_DEFINITION) 
       references tura.MENUDEFINITION;

    alter table tura.TOSUBMENU 
       add constraint FK17c4yiiqgoyo8uw67lrprqr4e 
       foreign key (REF_OP_SOURCE_TO_SUBMENU_SUB_MENU) 
       references tura.MENUELEMENT;

    alter table tura.TOSUBMENU 
       add constraint FK4gjf8ciccfgce5wwd76vy7ady 
       foreign key (REF_OP_TARGET_TO_SUBMENU_MENU_FOLDER) 
       references tura.MENUFOLDER;

    alter table tura.TRANSLATION 
       add constraint FK63xayjkw4k9uou8xhujj2rod2 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.TRANSLATION 
       add constraint FKo2b35w1fmhg07pxqmgwi8cbw6 
       foreign key (REF_OP_LANG_TRANSLATION_LANGUAGE) 
       references tura.LANGUAGE;

    alter table tura.TRANSLATION 
       add constraint FK2jq1w0v3iwxb14hi7b7735b0r 
       foreign key (REF_TRANSLATIOINS_MESSAGE) 
       references tura.MESSAGE;

    alter table tura.TYPEELEMENT 
       add constraint FK3xxqdvf23q81rwiux8ncb6vo4 
       foreign key (REF_TYPES_TYPE_GROUP) 
       references tura.TYPEGROUP;

    alter table tura.TYPEELEMENT 
       add constraint FKff97q6tpga990gy2gji51fdyq 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.TYPEELEMENT 
       add constraint FK7i65v2rf935fh9tarpeuhqgna 
       foreign key (REF_PRIMITIVES_PRIMITIVES_GROUP) 
       references tura.PRIMITIVESGROUP;

    alter table tura.TYPEELEMENT 
       add constraint FK21hw169fbc61nk4c31jq13vp6 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.TYPEELEMENT 
       add constraint FKow89y0trir31h7e2xtyfyvcx2 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.TYPEGROUP 
       add constraint FKio2neehwc4e1qga11mn2r43qh 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.TYPEGROUP 
       add constraint FK74sdaco0qqih9rifm4tnynseo 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.TYPEGROUP 
       add constraint FKlxfgfco7dobmbgj7yiqq275lr 
       foreign key (REF_REPOSITORY_PACKAGES_DOMAIN_TYPES_REPOSITORY) 
       references tura.DOMAINTYPESREPOSITORY;

    alter table tura.TYPEPOINTER 
       add constraint FKk5qoe4aayppjtmtpdh13ktu7d 
       foreign key (REF_MANY2MANY_HELPER_ASSOSIATION) 
       references tura.RELATIONSHIP;

    alter table tura.TYPEPOINTER 
       add constraint FK83a2xpwru6lkdeef9u48vmc79 
       foreign key (REF_OP_TYPE_REF_TYPE_POINTER_TYPE_ELEMENT) 
       references tura.TYPEELEMENT;

    alter table tura.TYPEPOINTEROBJ 
       add constraint FK8wlg1wypx6koy5nsgd4n61j3y 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.TYPEPOINTEROBJ 
       add constraint FKdj15nitwclxaeo8mi0y2gr3qd 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;

    alter table tura.TYPEPOINTEROBJ 
       add constraint FKrikoeq479199sncrkdu9qlb2b 
       foreign key (REF_BASE_TYPE_DATA_CONTROL) 
       references tura.DATACONTROL;

    alter table tura.TYPEPOINTEROBJ 
       add constraint FKdxkw6okgshdl11hu7ye6jh4rf 
       foreign key (REF_BASE_TYPE_OBJECT_MAPPER) 
       references tura.OBJECTMAPPER;

    alter table tura.UIELEMENT 
       add constraint FKr9bvi0wvaf3chgfjtsyurj4ex 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.UIELEMENT 
       add constraint FKofdul25xmlu6opsl6jmm8y3d2 
       foreign key (ref_suid_enabledUIItem) 
       references tura.ENABLEDUIITEM;

    alter table tura.UIELEMENT 
       add constraint FK4k67ecx76aeol9ox0wegu6n57 
       foreign key (ref_suid_flexFields) 
       references tura.FLEXFIELDS;

    alter table tura.UIELEMENT 
       add constraint FK9yqau8g3v1q50egite6299y4y 
       foreign key (ref_suid_menuHolder) 
       references tura.MENUHOLDER;

    alter table tura.UIELEMENT 
       add constraint FKhgtsduybvcat2yiu0ceiyaujm 
       foreign key (ref_suid_nickNamed) 
       references tura.NICKNAMED;

    alter table tura.UIELEMENT 
       add constraint FKefu5ge6xvd6rho3j5gd7kg88h 
       foreign key (ref_suid_orderable) 
       references tura.ORDERABLE;

    alter table tura.UIELEMENT 
       add constraint FKqruigw0f5hwwklcmm2u7ad7o3 
       foreign key (ref_suid_styleElement) 
       references tura.STYLEELEMENT;

    alter table tura.UIELEMENT 
       add constraint FKeg4odgmrn7p5y88l5sel6xhld 
       foreign key (REF_CHILDREN_CHILDREN_HOLDER) 
       references tura.CHILDRENHOLDER;

    alter table tura.UIELEMENT 
       add constraint FKmm85dolyghvn8tmdrabqayuq6 
       foreign key (REF_ELEMENT_COLUMN) 
       references tura.COLUMN;

    alter table tura.UIELEMENT 
       add constraint FK1fn5vxavfdvr9hbxq7jyncx8m 
       foreign key (ref_suid_controlPointer) 
       references tura.CONTROLPOINTER;

    alter table tura.UIELEMENT 
       add constraint FK688v6us3f0h2ulbgvk63wf6pw 
       foreign key (ref_suid_blockable) 
       references tura.BLOCKABLE;

    alter table tura.UIELEMENT 
       add constraint FKik261wgcxect5oxk9m9gac7t0 
       foreign key (ref_suid_childrenHolder) 
       references tura.CHILDRENHOLDER;

    alter table tura.UIELEMENT 
       add constraint FKtngu5dlhpjq5lcr5j9y2wde5k 
       foreign key (ref_suid_hTMLLayerHolder) 
       references tura.HTMLLAYERHOLDER;

    alter table tura.UIELEMENT 
       add constraint FKpe7jie6rcuykwv6m6yt65vp1o 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.UIELEMENT 
       add constraint FKkcoe5bh0knotj6lkafnakwl3i 
       foreign key (REF_BASE_CANVAS_VIEW_AREA) 
       references tura.VIEWAREA;

    alter table tura.UIELEMENT 
       add constraint FKpbbbhbi7ryvem9c8i0ekahtw9 
       foreign key (ref_suid_formatable) 
       references tura.FORMATABLE;

    alter table tura.UIELEMENT 
       add constraint FK433l2nmw4851f24qhs1pks1pi 
       foreign key (ref_suid_multiLangLabel) 
       references tura.MULTILANGLABEL;

    alter table tura.UIELEMENT 
       add constraint FKfp18le10f027h8o97v9wt55fu 
       foreign key (ref_suid_optionSelection) 
       references tura.OPTIONSELECTION;

    alter table tura.UIELEMENT 
       add constraint FKd31g33ashwyfsms77wxr11om3 
       foreign key (ref_suid_itemIcon) 
       references tura.ITEMICON;

    alter table tura.UPDATETRIGGER 
       add constraint FKqyqjlgg0rj3px2ux73x64nhm8 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.UPDATETRIGGER 
       add constraint FK6e9e05qmh20bjyui2fvsllrjw 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.UPDATETRIGGER 
       add constraint FKmhmpvasj8hcsctuq7kkfh65u3 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.UPDATETRIGGER 
       add constraint FKi9hr9neavlmr52pe57c0ytm81 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.VERSION 
       add constraint FKb3arj1vcw3bwx2m21hd7b8nn4 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.VERSION 
       add constraint FKtdwllpeh22fsbdgvx4v3m7tgn 
       foreign key (REF_VERSIONS_APPLICATION_MAPPERS) 
       references tura.APPLICATIONMAPPERS;

    alter table tura.VERSIONREF 
       add constraint FKm7soj8p0o4mxhpd2eielc7778 
       foreign key (REF_OP_VERSION_REF_VERSION_REF_VERSION) 
       references tura.VERSION;

    alter table tura.VIEWAREA 
       add constraint FK3ih7lksj3absui1aqdthebq12 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.VIEWAREA 
       add constraint FKor0i522jdse68x1niqig43957 
       foreign key (ref_suid_flexFields) 
       references tura.FLEXFIELDS;

    alter table tura.VIEWAREA 
       add constraint FK6q98m268cux9blcvxdlb6wn6 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.VIEWAREA 
       add constraint FKr6whyhon4uw9g0ah78x6vry63 
       foreign key (ref_suid_nickNamed) 
       references tura.NICKNAMED;

    alter table tura.VIEWAREA 
       add constraint FK1klplcxkmp3epy4644vdp7od0 
       foreign key (ref_suid_orderable) 
       references tura.ORDERABLE;

    alter table tura.VIEWAREA 
       add constraint FKjswmi664s6gvm7yqvkr66t19s 
       foreign key (ref_suid_styleElement) 
       references tura.STYLEELEMENT;

    alter table tura.VIEWAREA 
       add constraint FKmo71sbjkay8jffgq6dlo01try 
       foreign key (ref_suid_viewElement) 
       references tura.VIEWELEMENT;

    alter table tura.VIEWELEMENT 
       add constraint FK5pl94fxoo7c0l9dqpkvq5hxsc 
       foreign key (REF_VIEW_ELEMENT_VIEW_PORT_HOLDER) 
       references tura.VIEWPORTHOLDER;

    alter table tura.VIEWINHERITANCE 
       add constraint FK5av4f2bldip42cecgqe7gv74a 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.VIEWINHERITANCE 
       add constraint FKbge81kwjla685bs58sarowwbe 
       foreign key (REF_VIEW_INHERITANCES_VIEWS) 
       references tura.VIEWS;

    alter table tura.VIEWINHERITANCE 
       add constraint FK4td7ydu5bqpye2m8ajuc3913u 
       foreign key (REF_OP_SOURCE_VIEW_INHERITANCE_VIEW_PORT) 
       references tura.VIEWPORT;

    alter table tura.VIEWINHERITANCE 
       add constraint FKoii2wh8tjx8h4equ960t32n4 
       foreign key (REF_OP_TARGET_VIEW_INHERITANCE_CANVAS_FRAME) 
       references tura.CANVASFRAME;

    alter table tura.VIEWPORT 
       add constraint FKe052ld9ddftmg9rg59bx1pmc5 
       foreign key (ref_suid_categorized) 
       references tura.CATEGORIZED;

    alter table tura.VIEWPORT 
       add constraint FKtp7adaqp00skxdmsrek1ak7hk 
       foreign key (ref_suid_flexFields) 
       references tura.FLEXFIELDS;

    alter table tura.VIEWPORT 
       add constraint FKcrrcwlo1n7n7reuh870x34m7g 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.VIEWPORT 
       add constraint FK5ghhef0p6pirtbnrrnll2ss24 
       foreign key (ref_suid_nickNamed) 
       references tura.NICKNAMED;

    alter table tura.VIEWPORT 
       add constraint FK6u0kd29m8jje04cyjhplto0jw 
       foreign key (ref_suid_orderable) 
       references tura.ORDERABLE;

    alter table tura.VIEWPORT 
       add constraint FK100xxldtk3ape43t6m7r7jfp3 
       foreign key (ref_suid_styleElement) 
       references tura.STYLEELEMENT;

    alter table tura.VIEWPORT 
       add constraint FKmbh0f48ph6j0t0f0tbtb6qe1w 
       foreign key (ref_suid_viewElement) 
       references tura.VIEWELEMENT;

    alter table tura.VIEWPORTTRIGGER 
       add constraint FKfc243jv7h679fgdc096hw6esb 
       foreign key (ref_suid_contextParameters) 
       references tura.CONTEXTPARAMETERS;

    alter table tura.VIEWPORTTRIGGER 
       add constraint FKlvt5kwfsh4ex6ewwobxgdvl0w 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.VIEWPORTTRIGGER 
       add constraint FKnlom9kbv005o9ny132qjejp42 
       foreign key (ref_suid_methodPointer) 
       references tura.METHODPOINTER;

    alter table tura.VIEWPORTTRIGGER 
       add constraint FKcm7y0bbi7g2oae917n2s1rfaa 
       foreign key (ref_suid_trigger) 
       references tura.TRIGGER;

    alter table tura.VIEWPORTTRIGGER 
       add constraint FKdmb9ghx1vi9jib3bi82p04xu5 
       foreign key (REF_VIEW_PORT_TRIGGER_VIEW_PORT) 
       references tura.VIEWPORT;

    alter table tura.VIEWS 
       add constraint FKqwfkhoq86dx14ouqrv4he8my5 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.VIEWS 
       add constraint FK5um8xi8t6uxonixdvrh733dds 
       foreign key (REF_VIEW_FORM) 
       references tura.FORM;

    alter table tura.XMLPACKAGEMAPPER 
       add constraint FKfpcvclcvc50gg9m5g6vpd46cv 
       foreign key (ref_suid_mapper) 
       references tura.MAPPER;

    alter table tura.XMLPACKAGEMAPPER 
       add constraint FKs4fr6fphhuf0j4idw4qqy7jh 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.XMLPACKAGEMAPPER 
       add constraint FK28f8iyu7swf5oskw7k9lr5ijs 
       foreign key (ref_suid_packageMapper) 
       references tura.PACKAGEMAPPER;

    alter table tura.XMLPACKAGEMAPPER 
       add constraint FKlpdxr7at8lq9xaytpdrcdxb9b 
       foreign key (ref_suid_packagePointer) 
       references tura.PACKAGEPOINTER;

    alter table tura.XMLTYPEMAPPER 
       add constraint FKdg2yo99ebjlquyq6exp01hh3h 
       foreign key (ref_suid_mapper) 
       references tura.MAPPER;

    alter table tura.XMLTYPEMAPPER 
       add constraint FKdcj6xjwcldrtoayigmqb7rbdt 
       foreign key (ref_suid_metaObject) 
       references tura.METAOBJECT;

    alter table tura.XMLTYPEMAPPER 
       add constraint FKrjr03jp83pyya0a7ifjtksl71 
       foreign key (ref_suid_typeMapper) 
       references tura.TYPEMAPPER;

    alter table tura.XMLTYPEMAPPER 
       add constraint FK42e78ovcaku0xm9ej9kpflhsn 
       foreign key (ref_suid_typePointer) 
       references tura.TYPEPOINTER;
