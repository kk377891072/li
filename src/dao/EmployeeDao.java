package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.Dept;
import entity.Employee;

public class EmployeeDao {

	private Connection conn;
	private PreparedStatement ppst;
	private ResultSet rs;

	// ��ȡ���ݿ�����
	public Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/company?useUnicode=true&characterEncoding=utf8";
			conn = DriverManager.getConnection(url, "root", "kevin");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	
	public List<Employee> getList(Employee e) {
		
		String empId = e.getEmpId();
		String empName = e.getEmpName();
		String deptId = e.getDept().getDeptId();
		
		List<Object> args = new ArrayList<>();
		
		List<Employee> list = new ArrayList<>();
		
		StringBuffer sql = new StringBuffer("SELECT e.`stu_no`,e.`stu_name`,e.`age`,d.`dept_id`,d.`dept_name`"
				+ " FROM t_employee e" + " LEFT JOIN t_dept d" + " ON e.`stu_no` = d.`stu_name`" + " WHERE 1=1");
		
		if (empId != null) {
			sql.append(" and e.stu_no=?");
			args.add(empId);
		}
		if (empName != null) {
			args.add(empName);
			sql.append(" and e.stu_name=?");
		}
		if (deptId != null) {
			sql.append(" and d.dept_sex=?");
			args.add(deptId);
		}
		
		try {
			ppst = getConn().prepareStatement(sql.toString());
			
			for (int i = 0; i < args.size(); i++) {
				ppst.setObject(i + 1, args.get(i));
			}
			// ִ��sql
			rs = ppst.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getString("stu_no"));
				emp.setEmpName(rs.getString("stu_name"));
				emp.setSex(rs.getInt("stu_sex"));
				emp.setDept(new Dept(rs.getString("stu_email"), rs.getString("stu_email")));
				list.add(emp);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			close1();
		}
		return list;
	}

	// ���
	public String add(Employee e) {
		try {
			ppst = getConn().prepareStatement("insert into student1 values(?,?,?,?)");
			ppst.setString(1, e.getEmpId());
			ppst.setString(2, e.getEmpName());
			ppst.setInt(3, e.getSex());
			ppst.setString(4, e.getDept().getDeptId());
			ppst.executeUpdate();
			return "ok";
		} catch (SQLException e1) {
			e1.printStackTrace();
			return "error";
		} finally {
			close2();
		}
	}

	// ɾ��
	public String delete(String eid) {
		try {
			
			ppst = getConn()
				.prepareStatement("delete from student1 where stu_no=?");
			ppst.setString(1, eid);

			ppst.executeUpdate();
			return "ok";
		} catch (SQLException e1) {
			e1.printStackTrace();
			return "error";
		} finally {
			close2();
		}
	}

	// �ر�����
	public void close1() {
		try {
			rs.close();
			ppst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// �ر�����
	public void close2() {
		try {
			ppst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
