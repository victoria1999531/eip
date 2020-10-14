package com.kingland.Service;

public interface IocService {
    void setBean(Class cls, String id, Constant... args);
    Object getBean(String id);
}
