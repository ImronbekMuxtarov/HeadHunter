package org.example.mapper;

import org.example.model.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityMapper implements RowMapper<City> {
    @Override
    public City mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new City(
                rs.getInt(1),
                rs.getInt(2),
                rs.getString(3)
        );
    }
}
