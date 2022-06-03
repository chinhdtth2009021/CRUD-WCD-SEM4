package com.example.CRUD_WCD_SEM4.controller.product;

import com.example.CRUD_WCD_SEM4.entity.Product;
import com.example.CRUD_WCD_SEM4.model.MySqlProductModel;
import com.example.CRUD_WCD_SEM4.model.ProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateProductServlet  extends HttpServlet {
    private ProductModel productModel;
    @Override
    public void init() throws ServletException {
        productModel = new MySqlProductModel();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product product = productModel.findById(Integer.parseInt(req.getParameter("id")));
        if(product == null) {
            product = new Product();
        }
        req.setAttribute("product", product);
        req.getRequestDispatcher("admin/product/update.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

    }
}
