package us.inest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import us.inest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
