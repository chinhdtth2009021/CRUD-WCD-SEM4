package com.example.CRUD_WCD_SEM4.controller.category;

import com.example.CRUD_WCD_SEM4.entity.Category;
import com.example.CRUD_WCD_SEM4.model.CategoryModel;
import com.example.CRUD_WCD_SEM4.model.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> productList = categoryModel.findByAll();
        req.setAttribute("productList", productList);
        req.getRequestDispatcher("admin/category/list.jsp").forward(req, resp);
    }
}
