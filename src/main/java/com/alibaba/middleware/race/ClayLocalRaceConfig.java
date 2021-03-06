package com.alibaba.middleware.race;

import java.io.Serializable;

public class ClayLocalRaceConfig implements Serializable {
    private static final long serialVersionUID = 4441842861070190453L;
    public static String teamcode = "361233bpvz";
    public static String prex_tmall = "platformTmall_" + teamcode + "_";
    public static String prex_taobao = "platformTaobao_" + teamcode + "_";
    public static String prex_ratio = "ratio_" + teamcode + "_";

    /*********** Config Value For Local **********************/
    public static String JstormTopologyName = teamcode;

    public static String MetaConsumerGroup = teamcode;
    public static String MqPayTopic = "MiddlewareRaceTestData_Pay";
    public static String MqTmallTradeTopic = "MiddlewareRaceTestData_TMOrder";
    public static String MqTaobaoTradeTopic = "MiddlewareRaceTestData_TBOrder";

    public static String TairConfigServer = "10.214.192.66:5198";
    public static String TairSalveConfigServer = "";
    public static String TairGroup = "group_1";
    public static Integer TairNamespace = 0;

}
