package com.app.dao;

import com.app.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Ondrej Kvasnovsky
 */
@Repository
public class OrderDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createDbTable() {
        jdbcTemplate.execute("create table if not exists orders (id integer, label varchar(100))");
    }

    public List<Order> findAll() {
        String query = "select * from orders";
        RowMapper mapper = new RowMapper() {

            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Order order = new Order();
                order.setId(rs.getInt("id"));
                order.setLabel(rs.getString("label"));
                return order;
            }
        };
        return jdbcTemplate.query(query, mapper);
    }

    public void save(Order order) {
        String query = "insert into orders (label) values (?)";
        jdbcTemplate.update(query, new Object[]{order.getLabel()});
    }
}
