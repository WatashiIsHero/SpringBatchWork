package com.sios.ex.springbatch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "large_item",  schema="public")
public class LargeItemEntity {
 
    @Id
    @Column(name = "name", nullable = false)
    @Getter
    private String name;
 
    @Column(name = "value", nullable = false)
    @Getter
    private String value;
    
    public LargeItemEntity() {
    	
    }
 
    public LargeItemEntity(String name, String value) {
        this.name = name;
        this.value = value;
    }
}