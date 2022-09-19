package com.mine;

import java.sql.SQLException;

public interface Repository {
	public void insert() throws Exception;
	public void update() throws SQLException;
	public void delete() throws SQLException;
	public void fetch() throws SQLException;	

}
