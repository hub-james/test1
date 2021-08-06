package ntt.data.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/getHello")
    public String Test1(){
        System.out.println("TestController.Test1");
        return "TestController.Test1";
    }

    @GetMapping("/getHello/{userID}/{password}")
    public String Test1(@PathVariable String userID,@PathVariable String password){
        return "TestController.Test1: userID:" + userID + " password:" + password;
    }

    @GetMapping("/getHello5")
    public String Test5(@RequestParam("userID") String testID,@RequestParam("password") String testPWD){
        return "TestController.Test5: userID:" + testID + " password:" + testPWD;
    }

    @GetMapping("/getHello6")
    public String Test6(@RequestParam Map<String,String> allParamsMap){
        String retrunStr = "TestController.Test6: ";
        for (String keyStr : allParamsMap.keySet() ) {
            retrunStr += keyStr + ":" + allParamsMap.get(keyStr) + "/n";
        }
        return retrunStr;
    }

    @PostMapping("/postHello")
    public String Test2(){
        return "TestController.Test2";
    }

    @DeleteMapping("/deleteHello")
    public String Test3(){
        return "TestController.Test3";
    }

    @PutMapping("/putHello/{userID}/{password}")
    public String Test4(@PathVariable("userID") String testID,@PathVariable("password") String testPWD){
        return "TestController.Test4: userID:" + testID + " password:" + testPWD;
    }

}
