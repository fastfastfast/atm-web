package th.ac.ku.atm.data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import th.ac.ku.atm.model.Customer;

@Repository
public class CustomerRepository {

    private JdbcTemplate jdbcTemplate;

    public List<Customer> findAll() {
        String query = "SELECT * FROM customer";
        List<Customer> customers =
                jdbcTemplate.query(query, new CustomerRowMapper());
        return customers;
    }

    public Customer findById(int id) {
        String query = "SELECT * FROM customer" + id;
        Customer customer =
                jdbcTemplate.queryForObject(query, new CustomerRowMapper());
        return customer;
    }

    public void save(Customer customer) {
        String query = "INSERT INTO customer (id,name,pin) VALUES (?,?,?);";
        Object[] data = new Object[]
                { customer.getId(), customer.getName(), customer.getPin() };
        jdbcTemplate.update(query, data);
    }

    public void deleteById(int id) {
        String query = "DELETE FROM customer WHERE id = " + id;
        jdbcTemplate.update(query);
    }

    class CustomerRowMapper implements RowMapper<Customer> {

        @Override
        public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String pin = resultSet.getString("pin");

            return new Customer(id,name, pin);
        }
    }


}
