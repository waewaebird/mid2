package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int count) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + count);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");

        for(Map.Entry<Product, Integer> cart : cartMap.entrySet()) {
            System.out.println("상품 : " + cart.getKey() + " 수량 : " + cart.getValue());
        }
    }

    public void minus(Product product, int count) {
        if(cartMap.get(product) - count < 1) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, cartMap.get(product) - count);
        }
    }
}
