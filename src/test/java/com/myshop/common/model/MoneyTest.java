package com.myshop.common.model;

import com.myshop.catalog.domain.product.Product;
import com.myshop.catalog.domain.product.ProductId;
import com.myshop.order.command.domain.OrderLine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Harley on 2016. 7. 11..
 */
public class MoneyTest {

    @Test
    public void testMoeny() {
        Money price = new Money(1000);
        ProductId product = new ProductId("1");
        OrderLine line = new OrderLine(product, price, 2);

        assertEquals(1000, line.getPrice().getValue());
        assertEquals(2, line.getQuantity());
        assertEquals(2000, line.getAmounts().getValue());

        price.setValueForTest(2000);

        assertEquals(2000, line.getPrice().getValue());
        assertEquals(2, line.getQuantity());
        assertEquals(2000, line.getAmounts().getValue());
    }
}
