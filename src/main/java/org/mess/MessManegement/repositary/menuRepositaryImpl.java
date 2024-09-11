package org.mess.MessManegement.repositary;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mess.MessManegement.Model.candidate;
import org.mess.MessManegement.Model.menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;


@Repository("mRepo")
public class menuRepositaryImpl implements menuRepositary{

	@Autowired
	JdbcTemplate template;
	@Override
	public boolean isAddNewMenu(final menu m1) {
		int value=template.update("insert into menu values('0',?,?,?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1,m1.getMday());
				ps.setString(2,m1.getLunch());
				ps.setString(3,m1.getLunch());
			}
			
		});
		return value>0?true:false;
	}
	@Override
	public List<menu> getAllMenu() {
		List<menu> list = template.query("select *from menu", new RowMapper<menu>() {

			@Override
			public menu mapRow(ResultSet rs, int rowNum) throws SQLException {
				menu m1 = new menu();
				m1.setMid(rs.getInt(1));
				m1.setMday(rs.getString(2));
				m1.setLunch(rs.getString(3));
				m1.setDinner(rs.getString(4));
				return m1;			
				}

		});
		return list.size() > 0 ? list : null;
	}
	

}
