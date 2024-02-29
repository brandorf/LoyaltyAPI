package com.kumandgo.loyalty.data;

import org.hibernate.dialect.Dialect;

public class SnowflakeDialect extends Dialect {
    public static final String JSON_DEFAULT_RESULTS = "with ur";

//    @Override
//    public String transformSelectString(String select)
//    {
//        //var query = "ALTER SESSION SET JDBC_QUERY_RESULT_FORMAT='JSON' \n" + select;
//        return super.transformSelectString(query);
//    }
}