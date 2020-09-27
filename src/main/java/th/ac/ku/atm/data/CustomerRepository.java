package th.ac.ku.atm.data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.atm.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {




}
