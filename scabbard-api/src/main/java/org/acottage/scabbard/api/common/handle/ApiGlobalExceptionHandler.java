package org.acottage.scabbard.api.common.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author liuli email:liulitongxue@126.com
 * @Date 2020/08/16 下午 5:45
 * @Version 1.0
 */
@ControllerAdvice
public class ApiGlobalExceptionHandler {

    private static final String DEFAULT_ERROR_VIEW = "/page/error.html";

    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req, Exception e) {
        return "redirect:" + DEFAULT_ERROR_VIEW;
    }
}
