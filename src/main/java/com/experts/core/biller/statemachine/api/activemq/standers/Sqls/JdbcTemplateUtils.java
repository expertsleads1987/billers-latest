package com.experts.core.biller.statemachine.api.activemq.standers.Sqls;

import com.experts.core.biller.statemachine.api.activemq.standers.config.CustomerConfig;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlInOutParameter;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.nio.charset.Charset;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

@Component
@Configuration
@Import({CustomerConfig.class,AGREEMENTINFO.class})
public class JdbcTemplateUtils {
    Logger logger = LoggerFactory.getLogger(JdbcTemplateUtils.class);
    private SimpleJdbcCall simpleJdbcCall ;
    final String procedureCall = "{call BILLMAIN.madfooat_utility.GET_AGREEMENT_INFO( ? , ? , ? , ? , ? , ? , ? )}";

    @Autowired
    private DataSource datasource;

    @Autowired
    private AGREEMENTINFO agreementInfo;

    public AGREEMENTINFO callStoredFunction(String functionName, Map<String,Object> maps, Class classreturn) throws SQLException {

       /* System.out.println(datasource);

        CallableStatement callableStatement = datasource.getConnection().prepareCall("{call BILLMAIN.madfooat_utility.GET_AGREEMENT_INFO( ? , ? , ? , ?, ? , ? , ? )}");

        maps.put("P_CENTER_ID","1");
        maps.put("P_COLLECTOR","99999");
        maps.put("P_AGREEMENT_ID","30514");
        maps.put("P_BALANCE_TYPE", "3");

        System.out.println(" value ................ : "+ maps.get("P_CENTER_ID"));

        callableStatement.setString  ( 1 ,     "1");
        callableStatement.setString  ( 2  ,     "99999");
        callableStatement.setString  ( 3 , "30514");
        callableStatement.setString  ( 4  ,     "3");

        callableStatement.registerOutParameter (5  , Types.VARCHAR);
        callableStatement.registerOutParameter (6, Types.INTEGER);
        callableStatement.registerOutParameter (7, Types.VARCHAR);



        String name  = "TestCase";*//*callableStatement.getString(5);*//*
        *//*byte ptext[] = name.getBytes();*//*
        *//*String finalName =   new String(name , Charset.forName("UTF-8")) ;*//*


        Integer balance =  callableStatement.getInt(6);
        String result = callableStatement.getString(7);

        agreementInfo.setBalance(balance);
        agreementInfo.setName(new String (name.getBytes() ,  Charset.forName("UTF8")));
        agreementInfo.setResult(result);
        *//*agreementInfo.setResult("Success");
        agreementInfo.setName("ATAYA");
        agreementInfo.setBalance(1200);*//*
        return  agreementInfo;*/


        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(datasource).withCatalogName("madfooat_utility").withProcedureName("GET_AGREEMENT_INFO").withSchemaName("BILLMAIN").useInParameterNames("P_CENTER_ID","P_COLLECTOR","P_AGREEMENT_ID","P_BALANCE_TYPE");
        SqlParameterSource in = new MapSqlParameterSource().addValue("P_CENTER_ID", 1).addValue("P_COLLECTOR","99999").
                addValue("P_AGREEMENT_ID","30514").addValue("P_BALANCE_TYPE","3");
        Map<String, Object> out = jdbcCall.execute(in);

        /*Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));*/
        agreementInfo.setResult("Success");
        agreementInfo.setName("ATAYA");
        agreementInfo.setBalance(1200);
        return  agreementInfo;

    }


    @Autowired
    private JdbcTemplate jdbcTemplate;;

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
