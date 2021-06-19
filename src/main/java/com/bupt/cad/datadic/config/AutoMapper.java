package com.bupt.cad.datadic.config;


import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class AutoMapper {
    public static void main(String[] args) {
        AutoGenerator ap = new AutoGenerator();
        GlobalConfig globalConfig = new GlobalConfig();
        String Path = System.getProperty("user.dir");
        globalConfig.setOutputDir(Path+"\\src\\main\\java");

        globalConfig.setMapperName("%sMapper");
        globalConfig.setServiceName("%sServer");
        globalConfig.setServiceImplName("%sServer");
        globalConfig.setControllerName("%sController");

        ap.setGlobalConfig(globalConfig);

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("yuxie1998");
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        ap.setDataSource(dataSourceConfig);

        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.bupt.cad.datadic");
        ap.setPackageInfo(packageConfig);

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        ap.setStrategy(strategyConfig);

        ap.execute();
    }
}
