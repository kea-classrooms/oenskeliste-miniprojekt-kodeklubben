package com.kodeklubben.miniprojekt.controllers;

import com.kodeklubben.miniprojekt.repositories.WishListRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
    WishListRepository wishListRepository = new WishListRepository();

    @GetMapping("/{id}")
    public ResponseEntity<String> getWishLists(@PathVariable String id) {
        return new ResponseEntity<>("wishListRepository.getWishLists(id)", HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<String> getWishList() {
        return new ResponseEntity<>("wishListRepository.getAllSuperheroes()", HttpStatus.OK);
    }
}