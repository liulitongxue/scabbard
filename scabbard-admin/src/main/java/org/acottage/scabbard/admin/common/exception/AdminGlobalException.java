package org.acottage.scabbard.admin.common.exception;

import org.acottage.scabbard.core.common.exception.GlobalException;

/**
 * @Author liuli
 * @Email liulitongxue@126.com
 * @Date 2020/11/22 下午 2:26
 * @Version 1.0
 */
public class AdminGlobalException extends GlobalException {
    public AdminGlobalException(String code, String message) {
        super(code, message);
    }

    public AdminGlobalException(String message, String code, String message1) {
        super(message, code, message1);
    }

    public AdminGlobalException(String message, Throwable cause, String code, String message1) {
        super(message, cause, code, message1);
    }

    public AdminGlobalException(Throwable cause, String code, String message) {
        super(cause, code, message);
    }

    public AdminGlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code, String message1) {
        super(message, cause, enableSuppression, writableStackTrace, code, message1);
    }
}
