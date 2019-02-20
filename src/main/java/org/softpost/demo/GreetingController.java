package org.softpost.demo;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }


    @RequestMapping("/users")
    public Map users(@RequestParam(value="id", defaultValue="1") String id) {

        int a [] = {1,2,3};
        Map map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", a);
        map.put("aa", "bb");
        return map;
    }
}
