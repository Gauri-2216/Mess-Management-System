package org.mess.MessManegement.repositary;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.mess.MessManegement.Model.candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

@Repository("canRepo")
public class candidateRepositaryImpl implements candidateRepositary {

	@Autowired
	JdbcTemplate template;

	@Override
	public boolean isAddNewCandidate(final candidate candi) {

		int value = template.update("insert into candidate values('0',?,?,?,?,?,?,?,?)", new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, candi.getName());
				ps.setString(2, candi.getUsername());
				ps.setString(3, candi.getPassword());
				ps.setString(4, candi.getStart());
				ps.setString(5, candi.getEnd());
				ps.setString(6, candi.getDue());
				ps.setInt(7, candi.getPaid());
				ps.setInt(8, candi.getBalance());
			}

		});
		return value > 0 ? true : false;
	}

	@Override
	public List<candidate> getAllCandidate() {
		List<candidate> list = template.query("select *from candidate", new RowMapper<candidate>() {

			@Override
			public candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
				candidate can = new candidate();
				can.setId(rs.getInt(1));
				can.setName(rs.getString(2));
				can.setUsername(rs.getString(3));
				can.setPassword(rs.getString(4));
				can.setStart(rs.getString(5));
				can.setEnd(rs.getString(6));
				can.setDue(rs.getString(7));
				can.setPaid(rs.getInt(8));
				can.setBalance(rs.getInt(9));
				return can;
			}

		});
		return list.size() > 0 ? list : null;
	}

	@Override
	public void isDeleteCandidateById(int id) {
		template.update("delete from candidate where cid="+id);
	}

	@Override
	public boolean isUpdateCandidate(final candidate model) {
		int value=template.update("update candidate set name=?,email=?,mobile=?,start=?,end=?,due=?,paid=?,balance=? where id=?",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				 ps.setString(1, model.getName());
				 ps.setString(2,model.getUsername());
				 ps.setString(3,model.getPassword());
				 ps.setString(4,model.getStart());
				 ps.setString(5, model.getEnd());
				 ps.setString(6,model.getDue());
				 ps.setInt(7,model.getPaid());
				 ps.setInt(8,model.getBalance());
			}
			
		});
		return value>0?true:false;
	}

	@Override
	public List<candidate> getAllCandidateByName(String name) {
		List<candidate> list = template.query("select *from candidate where name like '%"+name+"%'", new RowMapper<candidate>() {

		public candidate mapRow(ResultSet rs,int rowNum) throws SQLException {
			candidate can = new candidate();
			can.setId(rs.getInt(1));
			can.setName(rs.getString(2));
			can.setUsername(rs.getString(3));
			can.setPassword(rs.getString(4));
			can.setStart(rs.getString(5));
			can.setEnd(rs.getString(6));
			can.setDue(rs.getString(7));
			can.setPaid(rs.getInt(8));
			can.setBalance(rs.getInt(9));
			return can;
		}
		});
	return list.size() > 0 ? list : null;
	}

}
