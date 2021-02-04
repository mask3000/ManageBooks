package cn.lightina.managebooks.controller;

import cn.lightina.managebooks.pojo.User;
import cn.lightina.managebooks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/managebooks")
public class LoginController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/detail")
    public String detail(Model model, HttpServletRequest request) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        User user;
        if (userName == null){
            return "login";
        }

        user = new User(userName, password);
        User u = userService.checkManager(user);
        if (u == null){
            u = userService.checkUser(user);
            if(u == null){
                return "login";
            }else {
                model.addAttribute("user", u);
                request.getSession().setAttribute("user", u);
                return "detail_user";
            }
        }else {
            model.addAttribute("user", u);
            request.getSession().setAttribute("user", u);
            return "detail_admin";
        }
    }

    @GetMapping(value = "/homepage")
    public String homepage(Model model,  HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "detail_user";
    }

    @GetMapping(value = "admin/homepage")
    public String adminHomepage(Model model, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user", user);
        return "detail_admin";
    }
}
