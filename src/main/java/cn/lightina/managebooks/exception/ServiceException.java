package cn.lightina.managebooks.exception;

import cn.lightina.managebooks.enumeration.ExceptionEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class ServiceException extends RuntimeException {
    private Integer code;

    public ServiceException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
    }
}
