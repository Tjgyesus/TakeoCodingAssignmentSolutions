//package com.takeo.userservlet;
//
//import com.takeo.userservlet.model.User;
//import dao.UserDao;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//
//@WebServlet("/UserServlet")
//public class UserServlet extends HttpServlet {
//
//    private UserDao userDao;
//
//    public void init(){
//        userDao = new UserDao();
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        String Id = request.getParameter("Id");
//        String name = request.getParameter("Name");
//        String address = request.getParameter("Address");
//
//        User user = new User(Id,name,address);
//        user.setId(Id);
//        user.setName(name);
//        user.setAddress(address);
//
//try {
//    userDao.registerUser(user);
//        request.getRequestDispatcher("userAccount.jsp").forward(request, response);
//
//} catch (ClassNotFoundException e) {
//    throw new RuntimeException(e);
//}
//    response.sendRedirect("");
//    }
//}