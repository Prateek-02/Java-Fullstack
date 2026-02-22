import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

        //   Step 10
public class AccountDaoImpl implements AccountDao {
   	
    // dataSource reference wants database connection 
	 // username,password,url,database 
	  // how this dataSource gets : driver class,url ,username,pass
	  // this dataSource gets username,password like .. from applicationContex_Dao.xml
	private DataSource dataSource;   //Step 11
	//dataSource=dataSourceRam
	             // driver = driverClassName(Spring attribute)
	
	public AccountDaoImpl() {
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource; //driverclass ,url ,username,pass
	}
	
	    
	         //Step 15      // 59  Ravi Saving1 7777
	public void save(Account account) {
		  System.out.println("AccountDaoImpl  save()");
		// Declare resources
		Connection connection = null;
		PreparedStatement pstmt = null;
		try { // Get connection.
			connection = dataSource.getConnection();  //Step 16  (internally goto Step 11 and take db connection)
			// Create statement.                          
			pstmt = connection.prepareStatement("INSERT INTO account VALUES(?,?,?,?)");
			// Set parameters.
			pstmt.setInt(1, account.getAccno());  //59
			pstmt.setString(2, account.getAccName()); //RAVI
			pstmt.setString(3, account.getAccType()); //Saving
			pstmt.setDouble(4, account.getBal());   //7777
			// Execute statement.
			pstmt.execute();
			// Handle Exceptions
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Clean up resources to avoid memory leaks problems.
		finally {
			try {
				pstmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Account get(int accno) {
		 //System.out.println("AccountDaoImpl  get()");
		// Declare resources.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Account avo = null;
		try {
			// Get connection.
			con = dataSource.getConnection();
			// Create statement object.
			stmt = con.createStatement();
			// Prepare query.
			String query = "SELECT * FROM account WHERE ACC_NO=" + accno;
			// Execute query.
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				avo = new Account();
				avo.setAccno(rs.getInt(1));
				avo.setAccName(rs.getString(2));
				avo.setAccType(rs.getString(3));
				avo.setBal(rs.getDouble(4));
			}
			// Handle exceptions
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Release resources to avoid memory leaks.
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return avo;
	}

	@Override
	public void remove(int accno) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		try {
			// Get connection.
			con = dataSource.getConnection();
			// Create statement object.
			stmt = con.createStatement();
			// Prepare query.
			String query = "DELETE FROM account WHERE ACC_NO= "+accno;
			
			int rowsAffected = stmt.executeUpdate(query);
			if (rowsAffected > 0) {
				System.out.println("Account " + accno + " deleted successfully.");
			} else {
				System.out.println("No account found with account number: " + accno);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		// Release resources to avoid memory leaks.
		finally {
			try {
				stmt.close();
				con.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		System.out.println("AccountDaoImpl  update()");
		// Declare resources
		Connection connection = null;
		Statement stmt = null;
		
		try {
			// Get connection
			connection = dataSource.getConnection();
			// Create statement
			stmt = connection.createStatement();
			// Build the query directly with values inserted into the string
			String query = "UPDATE account SET ACC_NAME='" + account.getAccName() +
						   "', ACC_TYPE='" + account.getAccType() +
						   "', BAL=" + account.getBal() +
						   " WHERE ACC_NO=" + account.getAccno();
			// Execute the update
			int rowsAffected = stmt.executeUpdate(query);
			if (rowsAffected > 0) {
				System.out.println("Account " + account.getAccno() + " updated successfully.");
			} else {
				System.out.println("No account found with account number: " + account.getAccno());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Clean up resources to avoid memory leaks
		finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
