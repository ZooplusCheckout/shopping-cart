package com.zooplus.cart.controller;

import com.zooplus.cart.entity.Cart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    /**
     * Add an item to a customer's shopping cart. An example of the result shopping cart:
     * <p>
     * [
     *   {
     *     "product": "Wild Freedom Adult Cold River - Salmon",
     *     "price": 36.99,
     *     "quantity": 2
     *   }, {
     *     "product": "Wild Freedom Fillet Snacks - Chicken",
     *     "price": 2.99,
     *     "quantity": 3
     *   }, {
     *     "product": "Cat Pole Feather Dancer",
     *     "price": 7.49,
     *     "quantity": 1
     *   }
     * ]
     * <p>
     * If the customer doesn't yet have shopping cart in the database, it should be created.
     * <p>
     * If the request is invalid, HTTP 400 code should be returned.
     *
     * @param request Request object.
     * @return Updated cart with the new item added.
     */
    public Cart addItemToCart(AddItemToCartRequest request) {
        return null;
    }


    /**
     * Get the total value in Euro of a shopping cart.
     * <p>
     * If the shopping cart has no items, the value of 0.0 should be returned.
     * <p>
     * If customer's shopping cart doesn't exist, HTTP 404 code should be returned.
     *
     * @param cartId A shopping cart's identifier.
     * @return Total value in Euro of all the items in the shopping cart (up to 2 decimals).
     */
    public double getCartTotal(String cartId) {
        return 0.0;
    }

    /**
     * 1: Add a promotion coupon with 5% discount to the cart total.
     *
     * 2: Add a promotion coupon that will make some products free.
     * Assume that the information on which products are included in the promotion is available from the external API.
     *
     * @param request A shopping cart's identifier.
     * @return Updated cart with the coupon added.
     */
    public Cart addCouponToCart(AddCouponToCartRequest request) {
        // List<String> discountedProducts = you can mock the call to the external promotional items API here
        return null;
    }

}
