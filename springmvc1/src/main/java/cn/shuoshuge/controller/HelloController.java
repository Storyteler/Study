package cn.shuoshuge.controller;

import cn.shuoshuge.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
    public String sayHello() {
        System.out.println("Hello---------");
        return "hello";
    }

    @GetMapping("/send")
    public ModelAndView send() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","你好feng");
        return modelAndView;
    }
/*
    @GetMapping
    public String blog(int id, int tagid, Model model) {
        System.out.println("id -> " + id + "---name -> " + tagid);
        model.addAttribute("id",id);
        model.addAttribute("name",tagid);
        return "hello";
    }*/
    @GetMapping("/movie/{id:\\d+}")
    public String test(@PathVariable int id) {
//        System.out.println(id + "------------");
        return "hello";
    }

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String save(User user, String email, MultipartFile photo, RedirectAttributes attributes) {
        System.out.println(user);

        if(!photo.isEmpty()) {
            System.out.println(photo.getSize());
        }
        attributes.addFlashAttribute("message","正在审核");
        return "redirect:/save";
    }















}
