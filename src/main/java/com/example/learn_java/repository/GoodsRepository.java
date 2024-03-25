
package com.example.learn_java.repository;

import com.example.learn_java.entity.Goods;
import com.example.learn_java.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, UUID> {
}
