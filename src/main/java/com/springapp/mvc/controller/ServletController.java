package com.springapp.mvc.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String Category = req.getParameter("Category");
        String Task = req.getParameter("Task");
        String id = req.getParameter("id");
        HashMap<String, String> map = (HashMap<String, String>) session.getAttribute("Map");
        if (map == null) {
            HashMap<String, String> map1 = new HashMap<String, String>();
            session.setAttribute("Map", map1);
        }
        map = (HashMap<String, String>) session.getAttribute("Map");
        map.put(Task, Category);
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key == "") {
                map.remove(key);
            }
        }
        if (id != null) {
            map.remove(id);
        }
        session.setAttribute("Map", map);
        resp.sendRedirect("example.jsp");
    }
}
