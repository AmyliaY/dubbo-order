package com.shuitu.dubbo.order;

import java.io.Serializable;

/**
* @author 全恒
*/
public class DoOrderResponse implements Serializable{

    private static final long serialVersionUID = 3938659532219361525L;
    
    private Object data;

    private String code;

    private String memo;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "DoOrderResponse{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
