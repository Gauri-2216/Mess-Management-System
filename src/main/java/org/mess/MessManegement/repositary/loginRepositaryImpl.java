package org.mess.MessManegement.repositary;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.mess.MessManegement.Model.loginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

@Repository("regRepo")
public class loginRepositaryImpl implements loginRepositary{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public loginModel isAddResister(final loginModel model) {
		PreparedStatementSetter pstmt=new PreparedStatementSetter()
		{
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1,model.getUsername());
				ps.setString(2,model.getPassword());
			}
		};	
      return null;
     }

	@Override
	public loginModel isCheckLogin(loginModel model) {
		
		// Define RowMapper as an anonymous class or lambda
        RowMapper<loginModel> rowMapper = new RowMapper<loginModel>() {
            @Override
            public loginModel mapRow(ResultSet res, int rowNum) throws SQLException {
            	loginModel r = new loginModel();
                r.setLogintype(res.getString("logintype"));
                return r;
            }
        };

        // Query to check register credentials
        List<loginModel> list = template.query(
                "SELECT * FROM login WHERE username=? AND password=?", 
                new Object[]{model.getUsername(), model.getPassword()},
                rowMapper
        );

        // Return the first match or null if no match
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return null; 
        }

	}

	@Override
	public boolean isCheckAdmin(loginModel lmodel) {
		RowMapper<loginModel> rowMapper = new RowMapper<loginModel>() {
            @Override
            public loginModel mapRow(ResultSet res, int rowNum) throws SQLException {
            	loginModel r = new loginModel();
                r.setLogintype(res.getString("logintype"));
                return r;
            }
        };

        // Query to check register credentials
        List<loginModel> list = template.query(
                "SELECT * FROM login WHERE username=? AND password=?", 
                new Object[]{lmodel.getUsername(), lmodel.getPassword()},
                rowMapper
        );

        // Return the first match or null if no match
       if(list.size()>0) {
    	   return true;
       }
       else {
    	   return false;
       }

	}
	
}
