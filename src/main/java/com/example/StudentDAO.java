package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

/*Driver -Spring.xml
 * Connection-Spring.xml -url,username,pwd
 * statement
 * execution
 * close
 */

public class StudentDAO {

private JdbcTemplate temp;

public void setTemp(JdbcTemplate temp) {
	this.temp = temp;
}

public int insert(Student s) {
	
	String sql="insert into student values("+s.getSid()+",'"+s.getSname()+"','"+s.getSemail()+"',"+s.getPhone()+")";
	System.out.println(sql);
    //insert, update, delete like executeUpdate() used in JDBC
	return temp.update(sql) ;
}

}
