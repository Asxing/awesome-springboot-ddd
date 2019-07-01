package com.holddie.framework.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;
import java.time.Instant;

@MappedSuperclass
public class BaseEntity extends AbstractAggregateRoot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    protected Long id;

    @Version
    @Column(columnDefinition = "bigint default 0")
    protected Long version;

    @JsonIgnore
    @CreatedDate
    @Column(name = "created_date", columnDefinition = "timestamp", updatable = false)
    private Instant createdDate = Instant.now();

    @JsonIgnore
    @LastModifiedDate
    @Column(name = "last_modified_date", columnDefinition = "timestamp")
    private Instant lastModifiedDate = Instant.now();
}
