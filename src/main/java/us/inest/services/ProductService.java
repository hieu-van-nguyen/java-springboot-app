package us.inest.services;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import us.inest.model.Product;

@Service
public class ProductService {

    @Cacheable(value = "products", key = "#id")
    public Product getProductById(Long id) {
        simulateSlowService();
        return new Product(id, "Gaming Laptop", 1200.00);
    }

    @CacheEvict(value = "products", key = "#product.id")
    public void updateProduct(Product product) {
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
