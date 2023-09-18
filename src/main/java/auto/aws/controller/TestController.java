package auto.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "aws auto test";
    }


//    @GetMapping("/test/v1")
//    public String test1(){
//        return "aws auto update";
//    }

    @GetMapping("/health")
    public String check(){
        return "로드벨런서 성공";
    }



}
