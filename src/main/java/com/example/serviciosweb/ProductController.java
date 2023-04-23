package com.example.serviciosweb;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/nexsys/v1")
public class ProductController {
    private static final String PRODUCTS_API = "https://api.escuelajs.co/api/v1/products";
    private static final String CATEGORIES_API = "https://api.escuelajs.co/api/v1/categories";

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Product>> response = restTemplate.exchange(
                PRODUCTS_API,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>() {}
        );
        return response.getBody();
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Category>> response = restTemplate.exchange(
                CATEGORIES_API,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Category>>() {}
        );
        return response.getBody();
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<Product> request = new HttpEntity<>(product, headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Product> response = restTemplate.postForEntity(
                PRODUCTS_API,
                request,
                Product.class
        );

        return response.getBody();
    }

}
