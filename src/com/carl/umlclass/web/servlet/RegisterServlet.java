package com.carl.umlclass.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carl.umlclass.bean.Customer;
import com.carl.umlclass.service.impl.CustomerServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerServiceImpl customerServiceImpl = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		customerServiceImpl = new CustomerServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 1.设置编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//2.获取参数
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		String telephone = request.getParameter("telephone");
		Customer customer = new Customer(null, name, password, age, telephone);
		//3.调用业务逻辑service层代码完成业务逻辑
		customerServiceImpl.register(customer);
		// 4.页面跳转
		request.setAttribute("customer", customer);
		request.getRequestDispatcher("/success.jsp").forward(request, response);
	}

}
