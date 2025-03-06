/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.dht.hibernatedemov1;

import com.dht.repository.impl.CategoryRepositoryImpl;
import com.dht.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemoV1 {

    public static void main(String[] args) {
        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
        s.getCates().forEach(c -> System.out.println(c.getName()));
        
        ProductRepositoryImpl s2 = new ProductRepositoryImpl();
        
        Map<String, String> params = new HashMap<>();
        params.put("kw", "Iphone");
        s2.getProducts(params).forEach(p -> System.out.printf("%d - %s - %.1f\n",p.getId(),p.getName(),p.getPrice()));
    }
}
