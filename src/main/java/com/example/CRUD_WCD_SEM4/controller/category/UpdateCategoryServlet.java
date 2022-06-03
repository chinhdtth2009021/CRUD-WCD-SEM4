package com.example.CRUD_WCD_SEM4.controller.category;

import com.example.CRUD_WCD_SEM4.entity.Category;
import com.example.CRUD_WCD_SEM4.model.CategoryModel;
import com.example.CRUD_WCD_SEM4.model.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Category category  = CategoryModel.findById(Integer.parseInt(req.getParameter("id")));
        if(category == null) {
            category = new Category();
        }
        req.setAttribute("product", category);
        req.getRequestDispatcher("admin/category/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
