package org.acottage.scabbard.core.common.exception;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/11/22 下午 2:19
 * @Version 1.0
 */
public class GlobalException extends RuntimeException {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GlobalException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public GlobalException(String message, String code, String message1) {
        super(message);
        this.code = code;
        this.message = message1;
    }

    public GlobalException(String message, Throwable cause, String code, String message1) {
        super(message, cause);
        this.code = code;
        this.message = message1;
    }

    public GlobalException(Throwable cause, String code, String message) {
        super(cause);
        this.code = code;
        this.message = message;
    }

    public GlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.message = message1;
    }
}
