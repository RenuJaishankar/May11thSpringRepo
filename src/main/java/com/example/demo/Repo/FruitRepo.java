package com.example.demo.Repo;


        import com.example.demo.Model.Fruit;
        import org.springframework.data.repository.CrudRepository;

public interface FruitRepo extends CrudRepository<Fruit,Long> {
}