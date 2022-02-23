
package com.npci.demo.support;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public class NameParameterJdbcDaoSupportclass extends NamedParameterJdbcDaoSupport {

	@Autowired
	public void SetDataSources(DataSource dataSource) {
		setDataSource(dataSource);
	}
}
