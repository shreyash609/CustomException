package in.ashokit;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ashokit.binding.AppExInfo;
import in.ashokit.exception.UserNotFoundException;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<AppExInfo> userException(UserNotFoundException e){
		
		AppExInfo info=new AppExInfo();
		info.setExCode("SBIEX001");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
		
		return new ResponseEntity<AppExInfo>(info,HttpStatus.BAD_REQUEST);
	}
}
