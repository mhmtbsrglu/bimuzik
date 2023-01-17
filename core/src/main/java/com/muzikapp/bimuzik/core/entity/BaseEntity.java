package com.muzikapp.bimuzik.core.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)//(Spring-Aspects) Ekleme-Silme-Güncelleme tarihin  kaydını oluşturur ve store eder (Audity)
@Getter
@Setter
@MappedSuperclass
@ToString
public class BaseEntity {

    @Id
    @GeneratedValue
    private int Id;
    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime modifiedDate;

}
