package bow.animate.ecommercedemo.dao;

import bow.animate.ecommercedemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long > {
}
