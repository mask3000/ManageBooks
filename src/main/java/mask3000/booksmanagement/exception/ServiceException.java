package mask3000.booksmanagement.exception;

import mask3000.booksmanagement.enumeration.ExceptionEnum;
import lombok.Data;

@Data
public class ServiceException extends RuntimeException {
    private Integer code;

    public ServiceException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
    }
}
