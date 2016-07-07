package com.springapp.mvc.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        HashMap<String, String> map = (HashMap<String, String>) session.getAttribute("Map");
        String y = "1";
        if (req.getAttribute("in") == null) {
            session.setAttribute("in", y);
        }
        if (map == null) {
            HashMap<String, String> map1 = new HashMap<String, String>();
          /*  map1.put("1", "2");
            map1.put("2", "22");
            map1.put("3", "3");
            map1.put("4", "3332");
            map1.put("5", "42");
            map1.put("6", "25");
            map1.put("15", "42");*/
            session.setAttribute("Map", map1);
        }

        map =(HashMap<String, String>) session.getAttribute("Map");
     /*   String t = (String) session.getAttribute("in");
        String temp = y + t;
        map.put(temp, "211111");
        session.setAttribute("in",temp);
        session.setAttribute("Map",map );*/

        String Category = req.getParameter("Category");
        String Task = req.getParameter("Task");
        if (Task != null ) {
            map.put(Task, Category);
            session.setAttribute("Map", map);
        }


        String id = req.getParameter("id");
        if(id != null){
            map.remove(id);
        }



        session.setAttribute("Map", map);


        resp.sendRedirect("example.jsp");


    }
}
