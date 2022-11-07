package dev.practice.theredmsagift.domain;

import java.time.ZonedDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {

//    @CreatedDate
    @CreationTimestamp
    private ZonedDateTime createdAt;

//    @LastModifiedDate
    @UpdateTimestamp
    private ZonedDateTime updatedAt;
}
