package auto.aws.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "aws auto test";
    }

    @GetMapping("/test/v1")
    public String test1(){
        return "aws auto update";
    }

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public String check(){
        return "로드벨런서 성공";
    }

    // on
    // why
    //test

    @GetMapping("/health")
    public String home(HttpServletRequest request) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return "Server IP : " + localHost.getHostAddress();
    }

}
