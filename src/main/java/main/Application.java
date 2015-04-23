package main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Application {

	public static void main(String[] args) {
        // SQL Server DataSource
		SQLServerDataSource ds = new SQLServerDataSource();
				ds.setPortNumber(1433);
				ds.setHostNameInCertificate("localhost");
				ds.setDatabaseName("Fields");
				ds.setUser("sergey");
				ds.setPassword("lenoblgissergey");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);

        /*System.out.println("Creating tables");
        jdbcTemplate.execute("create table customers(" +
                "id int, first_name varchar(255), last_name varchar(255))");

        String[] names = "John Woo;Jeff Dean;Josh Bloch;Josh Long".split(";");
        for (String fullname : names) {
            String[] name = fullname.split(" ");
            System.out.printf("Inserting customer record for %s %s\n", name[0], name[1]);
            jdbcTemplate.update(
                    "INSERT INTO customers(first_name,last_name) values(?,?)",
                    name[0], name[1]);
        }

        System.out.println("Querying for customer records where first_name = 'Josh':");
        List<Customer> results = jdbcTemplate.query(
                "select * from customers where first_name = ?", new Object[] { "Josh" },
                new RowMapper<Customer>() {
                    
                    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return new Customer(rs.getLong("id"), rs.getString("first_name"),
                                rs.getString("last_name"));
                    }
                });

        for (Customer customer : results) {
            System.out.println(customer);
        }*/
        System.out.println("Hello");
        List<Organization> results = jdbcTemplate.query(
                "select * from Organization_table where id = ?", new Object[] { 3 },
                new RowMapper<Organization>() {
                    public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return new Organization(rs.getInt("id"), rs.getString("name"),
                                rs.getInt("INN"), rs.getString("address"));
                    }
                });

        for (Organization organization : results) {
            System.out.println(organization);
        }
    }
}
