package com.TransactionManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		TransactionDemo td = new TransactionDemo();
		td.transferAmount(12, 1001, 5000);
		td.transferAmount(13, 1002, 1200);

	}

	public static Connection getConnection() {

		Connection con = null;

		try {
			// loading driver
			Class.forName("com.mysql.jdbc.Driver");

			// creating connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "9963");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;

	}

	private void addamount(Connection con, int acNo, int amount) throws SQLException {
		String updateSql = "update account1 as t1 JOIN " + " (select facno, (amount + ?) as amount from account1"
				+ " where facno = ?) As acct " + " ON  t1.facno= acct.facno" + " set t1.amount= acct.amount"
				+ " where t1.facno = ?";

		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(updateSql);
			ps.setInt(1, amount);
			ps.setInt(2, acNo);
			ps.setInt(3, acNo);
			int count = ps.executeUpdate();
			System.out.println("number of records inserted:--" + count);
			if (count == 0) {
				throw new SQLException("AcNO not found please valid number");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();

			}

		}
	}

	private void deducatedAmount(Connection con, int Tacno, int amount) throws SQLException {

		String updateSQL = "update account as t1 JOIN " + " (select tacno, (amount - ?) as amount from account"
				+ " where tacno = ?) As acct " + " ON  t1.tacno = acct.tacno" + " set t1.amount = acct.amount"
				+ " where t1.tacno = ?";

		PreparedStatement ps = null;

		try {
			ps = con.prepareStatement(updateSQL);
			ps.setInt(1, amount);
			ps.setInt(2, Tacno);
			ps.setInt(3, Tacno);
			int count = ps.executeUpdate();
			System.out.println("count of rows inserted :-" + count);
			if (count == 0) {
				throw new SQLException("ac number not found");
			}
		} finally {
			if (ps != null) {
				ps.close();
			}

		}
	}

	public void transferAmount(int fromAc, int ToAc, int Amount) {

		Connection con = null;
		con = getConnection();
		try {
			con.setAutoCommit(false);
			deducatedAmount(con, ToAc, Amount);
			addamount(con, fromAc, Amount);
			con.commit();

		} catch (SQLException e) {

			e.printStackTrace();
			if (con != null)
				try {
					System.out.println("rollback the transaction");
					con.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					if (con != null) {
						try {
							con.close();
						} catch (SQLException e1) {

							e1.printStackTrace();
						}
					}
				}

		}

	}

}
