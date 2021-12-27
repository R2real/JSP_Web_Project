package controller;

import model.product.ProductDAO;
import model.product.ProductVO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class MainAction implements Action{
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDAO dao = new ProductDAO();
        ArrayList<ProductVO> datas = dao.selectAll();
        request.setAttribute("datas", datas);

        ActionForward forward = new ActionForward();
        forward.setPath("main.jsp");
        forward.setRedirect(false);
        return forward;
    }
}