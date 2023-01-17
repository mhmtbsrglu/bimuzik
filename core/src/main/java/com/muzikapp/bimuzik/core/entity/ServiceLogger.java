package com.muzikapp.bimuzik.core.entity;

import com.muzikapp.bimuzik.core.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class ServiceLogger extends BaseEntity {
    private int id;
    private String className;
    private String methodName;
    private String args;
}