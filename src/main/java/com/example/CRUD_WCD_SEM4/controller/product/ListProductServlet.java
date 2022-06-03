package com.example.CRUD_WCD_SEM4.controller.product;

import com.example.CRUD_WCD_SEM4.entity.Product;
import com.example.CRUD_WCD_SEM4.model.MySqlProductModel;
import com.example.CRUD_WCD_SEM4.model.ProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListProductServlet extends HttpServlet {
    private ProductModel productModel;

    @Override
    public void init() throws ServletException {
        productModel = new MySqlProductModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> productList = productModel.findByAll();
        req.setAttribute("productList", productList);
        req.getRequestDispatcher("admin/product/list.jsp").forward(req, resp);
    }
}
