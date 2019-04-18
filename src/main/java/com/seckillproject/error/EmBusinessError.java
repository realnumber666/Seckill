package com.seckillproject.error;

public enum EmBusinessError implements CommonError {
    PARAMETER_VALIDATION_ERROR(00001, "参数不合法"),
    USER_NOT_EXIST(10001, "用户不存在");
    ;

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;
    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    // 比如通用错误parameter_validation在不同场景的errMsg可能不同
    // 所以要用这个方法来改写
    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
