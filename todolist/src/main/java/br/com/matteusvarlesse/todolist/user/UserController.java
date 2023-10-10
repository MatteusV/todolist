package br.com.matteusvarlesse.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {
    /**
     * String   (text)
     * Integer  (int = 1)
     * Double   (double = 0.0000)
     * Float    (float = 0.000)
     * Char     (A C)
     * Date     (data)
     * Void
     */

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    } 

}
