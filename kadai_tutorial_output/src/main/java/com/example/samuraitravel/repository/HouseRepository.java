package com.example.samuraitravel.repository;

 import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;
 public interface HouseRepository extends JpaRepository<House, Integer> {
	 public Page<House> findByNameLike(String keyword, Pageable pageable);
	 
	 public Page<House> findByNameLikeOrAddressLikeOrderByCreatedAtDesc(String nameKeyword, String addressKeyword, Pageable pageable);  
     public Page<House> findByNameLikeOrAddressLikeOrderByPriceAsc(String nameKeyword, String addressKeyword, Pageable pageable);  /*Asc 昇順検索*/
     public Page<House> findByAddressLikeOrderByCreatedAtDesc(String area, Pageable pageable); /*Desc 降順検索*/
     public Page<House> findByAddressLikeOrderByPriceAsc(String area, Pageable pageable);/*Asc 昇順検索*/
     public Page<House> findByPriceLessThanEqualOrderByCreatedAtDesc(Integer price, Pageable pageable);/*Desc 降順検索*/
     public Page<House> findByPriceLessThanEqualOrderByPriceAsc(Integer price, Pageable pageable); /*Asc 昇順検索*/
     public Page<House> findAllByOrderByCreatedAtDesc(Pageable pageable);/*Desc 降順検索*/
     public Page<House> findAllByOrderByPriceAsc(Pageable pageable);/*Asc 昇順検索*/
     
     public List<House> findTop10ByOrderByCreatedAtDesc();/*Desc 降順検索*/
 }