package com.learming.vs.learning.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class homeController {
    /*
     * 
     * List<Student> students = new ArrayList<Student>();
        // logic to build student data
        model.addAttribute("students", students);

        <tbody>
    <tr th:each="student: ${students}">
        <td th:text="${student.id}" />
        <td th:text="${student.name}" />
    </tr>
</tbody>
     */
    @RequestMapping("/home")
    public String getHome(){
        return "home";
    }

    
}
