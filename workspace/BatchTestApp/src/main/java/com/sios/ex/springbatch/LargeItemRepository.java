package com.sios.ex.springbatch;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LargeItemRepository extends JpaRepository<LargeItemEntity, String> {

}
