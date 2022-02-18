package com.npci.demo.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.npci.demo.dao.CustomerDao;
import com.npci.demo.response.TransactionResponse;
import com.npci.demo.support.NameParameterJdbcDaoSupportclass;

@Repository
public class CustomerDaoImpl extends NameParameterJdbcDaoSupportclass implements CustomerDao {
	@Autowired JdbcTemplate jdbcTemplate;

	@Override
	public List<TransactionResponse> getTransDetail() {
		// TODO Auto-generated method stub
		List<TransactionResponse> transaction = null;
		try {
			String query = "select t.trans_id,c.name,t.trans_amount as amount,t.to_c_id "
					+ "from customers as c "
					+ "join transaction as t "
					+ "on c.c_id = t.c_id;";
			transaction = getNamedParameterJdbcTemplate()
					.getJdbcOperations()
					.query(
							query, 
							new BeanPropertyRowMapper<TransactionResponse>(
									TransactionResponse.class
									));
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
		return transaction;
	}
	
	
}
