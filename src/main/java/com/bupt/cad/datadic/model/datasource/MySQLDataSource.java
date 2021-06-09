package com.bupt.cad.datadic.model.datasource;


import com.bupt.cad.datadic.util.DataSourceUtil;
import lombok.Data;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/10:33
 * @Description:
 */
@Data
public class MySQLDataSource implements BaseDataSource {

    private Integer id;

    private String name;

    private String type;

    private String description;

    private MySQLDataSourceDetailInfo detailInfo;

    private String createTime;

    private String updateTime;

    @Override
    public boolean testConnection() {
        JdbcTemplate jdbcTemplate = DataSourceUtil.getJdbcTemplate(this);
        try {
            jdbcTemplate.queryForList("show databases");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
