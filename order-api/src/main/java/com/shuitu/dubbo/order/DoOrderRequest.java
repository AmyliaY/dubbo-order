package com.shuitu.dubbo.order;

import java.io.Serializable;

/**
* @author 全恒
*/
public class DoOrderRequest implements Serializable{

    private static final long serialVersionUID = 4632876501724851634L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
