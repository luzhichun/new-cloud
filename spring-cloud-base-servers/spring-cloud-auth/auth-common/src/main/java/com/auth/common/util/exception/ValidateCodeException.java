package com.auth.common.util.exception;

/**
 * @author summer
 * @date 2017年12月21日20:45:38
 */
public class ValidateCodeException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -7285211528095468156L;

    public ValidateCodeException(String msg) {
        super(msg);
    }

}
