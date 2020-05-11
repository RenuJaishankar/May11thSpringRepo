package com.example.demo;

import com.example.demo.Model.Fruit;
import com.example.demo.Repo.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private FruitRepo fruitRepo;

    @Override
//This run method will resolve at the start of the program's runtime
    public void  run(String ...args) throws Exception{
        fruitRepo.save(new Fruit("Asian Pears","Red","Connecticut"));
        fruitRepo.save(new Fruit("Oranges","Orange","Florida"));

    }
}
