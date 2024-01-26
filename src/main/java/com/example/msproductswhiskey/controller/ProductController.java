package com.example.msproductswhiskey.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping
    public List<String> getProducts(){
        return List.of("T-Shirt", "Coat", "Jeans");
    }

}
