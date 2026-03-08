import com.mycompany.springrestmysql.controller.CustomNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.ServletWebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleCustomNotFoundException(CustomNotFoundException ex, ServletWebRequest request) {
        ErrorResponse error = new ErrorResponse();
        error.setErrorCode("RESOURCE_NOT_FOUND");
        error.setStatusCode(HttpStatus.NOT_FOUND.value());
        error.setMessage(ex.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        error.setPath(request.getRequest().getRequestURI());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    
    // Add more @ExceptionHandler methods for other specific exception types
}