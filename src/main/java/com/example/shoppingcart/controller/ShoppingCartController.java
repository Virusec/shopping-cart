package com.example.shoppingcart.controller;

import com.example.shoppingcart.model.ShoppingCart;
import com.example.shoppingcart.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/order/add")
    public String addShoppingCart(@RequestParam(name = "id", required = false) int[] id) {
        return shoppingCartService.addShoppingCart(id);
    }

    @GetMapping("/order/get")
    public List<ShoppingCart> getAllShoppingCart() {
        return shoppingCartService.getAllShoppingCart();
    }
}
