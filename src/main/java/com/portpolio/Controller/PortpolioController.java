package com.portpolio.Controller;

import com.portpolio.mapper.PortpolioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortpolioController {

    @Autowired(required = false)
    PortpolioMapper ptMapper;

    @RequestMapping("/")
    public String main() throws Exception{

        return "th/main/main";
    }

    @RequestMapping("/project")
    public String project(Model model) throws Exception{

        model.addAttribute("ptList", ptMapper.PortpolioList());

        return "th/project/project";
    }

    @RequestMapping("/project/{ptName}")
    public String projectDetail(Model model, @PathVariable String ptName) throws Exception{

        model.addAttribute("pt", ptMapper.PortpolioDetail(ptName));
        return "th/project/projectDetail";
    }

    @RequestMapping("/skill")
    public String skill() throws Exception{

        return "th/skill/skill";
    }
}
