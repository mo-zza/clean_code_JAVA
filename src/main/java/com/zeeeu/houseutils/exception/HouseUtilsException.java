package com.zeeeu.houseutils.exception;

public class HouseUtilsException extends RuntimeException {
    private ErrorCode errorCode;
    private String message;

    public HouseUtilsException(ErrorCode errorCode) {
        this(errorCode, errorCode.getMessage());
    }

    public HouseUtilsException(ErrorCode errorCode, String cutomMessage) {
        super(cutomMessage);
        this.errorCode = errorCode;
        this.message = cutomMessage;
    }

}
