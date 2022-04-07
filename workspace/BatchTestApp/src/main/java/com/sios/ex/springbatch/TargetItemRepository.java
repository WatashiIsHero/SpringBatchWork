package com.sios.ex.springbatch;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface TargetItemRepository extends JpaRepository<TargetItemEntity, String> {
	
}