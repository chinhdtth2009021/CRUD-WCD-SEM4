package com.example.CRUD_WCD_SEM4.controller.category;

import com.example.CRUD_WCD_SEM4.entity.Category;
import com.example.CRUD_WCD_SEM4.entity.EntityEnum.CategoryStatus;
import com.example.CRUD_WCD_SEM4.model.CategoryModel;
import com.example.CRUD_WCD_SEM4.model.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class DeleteCategoryServlet extends HttpServlet {
    private CategoryModel categoryModel;

    @Override
    public void init() throws ServletException {
        categoryModel = new MySqlCategoryModel();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int categoryId = Integer.parseInt(req.getParameter("id"));
        Category category = CategoryModel.findById(categoryId);
        category.setStatus(CategoryStatus.DELETED);
        category.setDeletedAt(LocalDateTime.now());
        if(categoryModel.update(categoryId, Category)) {
            resp.sendRedirect("admin/category/list.jsp");
        }
}
