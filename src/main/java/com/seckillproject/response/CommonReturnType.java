package com.seckillproject.response;

public class CommonReturnType {
    private String status;
    private Object data;

    // 如果创建returntype时只给result参数，代表无错误，直接将status设置为success
    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    // 如果有错则调用这个方法（方法重载）
    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setStatus(status);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
