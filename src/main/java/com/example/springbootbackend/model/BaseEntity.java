package com.example.springbootbackend.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity {

	    @Column(updatable = false)
	    @CreationTimestamp
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date date;
	    @UpdateTimestamp
	    private LocalDateTime updatedAt;
    
}