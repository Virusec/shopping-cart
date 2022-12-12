package com.example.shoppingcart.service;

import com.example.shoppingcart.model.ShoppingCart;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Repository
@SessionScope
public class ShoppingCartService {
    private final List<ShoppingCart> cart = new ArrayList<>();

    public String addShoppingCart(int[] id) {
        if (id == null) {
            throw new IllegalArgumentException("Item should be set!");
        } else {
            for (int j : id) {
                ShoppingCart shoppingCart = new ShoppingCart(j);
                cart.add(shoppingCart);
            }
            return Arrays.toString(id);
        }
    }

    public List<ShoppingCart> getAllShoppingCart() {
        return cart;
    }
}
