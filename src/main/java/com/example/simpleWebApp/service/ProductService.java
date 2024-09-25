package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {



    @Autowired
   private ProductRepo productrepo;

    public List<Product> getProudcts(){


return productrepo.findAll();

    }

    public Product getProudctById(int prodId){

        Optional<Product> pro= productrepo.findById(prodId);

        return pro.get();

    }

    public void addproduct(Product product){
        productrepo.save(product);
    }

    public  void updateproduct(Product product){
//        int index=0;
//
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()== product.getProdId()){
//                 index=i;
//            }
//        }
        productrepo.save(product);
    }

    public void deleteproduct(int prodId){
      productrepo.deleteById(prodId);
    }
}
