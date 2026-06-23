package co.istad.chhaya.ecommerce.repository;

import co.istad.chhaya.ecommerce.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
