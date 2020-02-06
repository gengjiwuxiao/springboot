package pojo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.ModelAndView;
import po.hui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class IHui {
    @RequestMapping(value = "/save_ihui.do")
    public ModelAndView save(HttpServletRequest request, HttpServletResponse response, hui hu) {
        ModelAndView mv = new ModelAndView();
        if (hu != null) {
            mv.addObject("hu",hu);
            mv.setViewName("huiyuan.jsp");

            return mv;
        }
        mv.setViewName("error.jsp");
        return mv;
    }
}
