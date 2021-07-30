package ntt.data.controller;

import ntt.data.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async1")
    public String async1(){
        asyncService.sendMsg("sending shortMsg.");
        return "finished booking.";
    }
}
