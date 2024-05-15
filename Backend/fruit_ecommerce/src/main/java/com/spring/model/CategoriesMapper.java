package com.spring.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CategoriesMapper implements RowMapper<Categories>
{
    @Override
    public Categories mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Categories categories = new Categories();
        categories.setCateId(rs.getInt("cate_id"));
        categories.setCateName(rs.getString("cate_name"));
        categories.setCateImg(rs.getString("cate_img"));
        categories.setEnable(rs.getBoolean("enable"));
        return categories;
    }
}