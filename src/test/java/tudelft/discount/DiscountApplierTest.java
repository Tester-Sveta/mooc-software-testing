package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    public void priceForProductHome() {
        ProductDao dao = Mockito.mock(ProductDao.class);//we need to mock the adapter ProductDao with the same functionality as the real one
        Product product_a = new Product("chair",20.0,"HOME");

        ArrayList<Product> all_products = new ArrayList<>();
        all_products.add(product_a);

        //List<Product> all_products = Arrays.asList(product_a);

        Mockito.when(dao.all()).thenReturn(all_products);

        DiscountApplier myDiscountApplier = new DiscountApplier(dao);
        myDiscountApplier.setNewPrices();

        Assertions.assertEquals(18.0,product_a.getPrice());


    }
    @Test
    public void priceForProductBusiness() {
        ProductDao dao = Mockito.mock(ProductDao.class);//we need to mock the adapter with the same functionality as the real one
        Product product_b = new Product("laptop",800.0,"BUSINESS");

        ArrayList<Product> all_products = new ArrayList<>();
        all_products.add(product_b);

        //List<Product> all_products = Arrays.asList(product_b);

        Mockito.when(dao.all()).thenReturn(all_products);

        DiscountApplier myDiscountApplier = new DiscountApplier(dao);
        myDiscountApplier.setNewPrices();

        Assertions.assertEquals(880.0,product_b.getPrice());

    }

}
