package com.example.simpleWebApp.controller;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productservice;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productservice.getProudcts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProduct(@PathVariable int prodId){

       return  productservice.getProudctById(prodId);

    }

    @PostMapping("/products")
    public void addproduct(@RequestBody Product product){
         productservice.addproduct(product);

         System.out.println("Product added successfully");
    }


    @PutMapping("/products")
    public void updateproduct(@RequestBody Product prod){

        productservice.updateproduct(prod);
System.out.println("updated successfully");
    }

    @DeleteMapping("products/{id}")
    public void deleteproduct(@PathVariable int id){
        productservice.deleteproduct(id);
    }

}
