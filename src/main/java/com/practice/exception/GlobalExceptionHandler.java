package com.practice.exception;

import com.practice.dto.UnifyResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public UnifyResponse handleMethodArgumentNotValidException(HttpServletRequest httpServletRequest, MethodArgumentNotValidException e){
        String requestURL = httpServletRequest.getRequestURI();
        String method = httpServletRequest.getMethod();
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        String message = formatAllErrorMessages(errors);
        UnifyResponse response = new UnifyResponse();
        response.setMessage(message);
        response.setCode("10001");
        response.setRequest(method + " " + requestURL);
        System.out.println("error catch");
        return response;
    }

    private String formatAllErrorMessages(List<ObjectError> errors){
        StringBuffer errMsg = new StringBuffer();
        Integer errorCount = errors.size();
        errMsg.append(errorCount).append("errors :");
        errors.forEach(error ->errMsg.append(error.getDefaultMessage()).append(";"));
        return errMsg.toString();
    }
}
