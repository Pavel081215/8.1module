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
        String category = req.getParameter("category");
        String task = req.getParameter("task");
        String idDelete = req.getParameter("idDelete");
        HashMap<String, String> tasks = (HashMap<String, String>) session.getAttribute("Map");
        if (tasks == null) {
            HashMap<String, String> taskTemp = new HashMap<String, String>();
            session.setAttribute("map", taskTemp);
        }
        tasks = (HashMap<String, String>) session.getAttribute("map");
        if (task != null) {
            if (!task.isEmpty())
                tasks.put(task, category);
        }
        if (idDelete != null) {
            tasks.remove(idDelete);
        }

        session.setAttribute("map", tasks);
        resp.sendRedirect("example.jsp");
    }
}
