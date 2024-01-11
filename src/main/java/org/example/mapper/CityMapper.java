package org.example.mapper;

import org.example.model.City;
import org.example.model.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityMapper implements RowMapper<City> {
    @Override
    public City mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new City(
                rs.getInt(1),
                rs.getString(2),
                new Country(
                        rs.getInt(3),
                        rs.getString(4)
                )
        );
    }
}
