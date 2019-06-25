package com.holddie.usercenter.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.holddie.framework.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 角色对象
 *
 * @author holddie
 * @version 1.0
 * @date 2019-05-20 08:27
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "center_authority")
public class Authority extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(max = 50)
    @Column(length = 50)
    private String name;

    @NotNull
    @Size(max = 100)
    @Column(length = 100)
    private String code;

    @NotNull
    @Size(max = 255)
    private String description;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "center_authority_permission",
            joinColumns = {@JoinColumn(name = "authority_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "permission_id", referencedColumnName = "id")})
    @BatchSize(size = 20)
    private Set<Permission> permissions = new HashSet<>();
}
