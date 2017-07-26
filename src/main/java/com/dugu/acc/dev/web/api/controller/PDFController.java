package com.dugu.acc.dev.web.api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dugu.acc.dev.web.api.User;
import com.dugu.acc.dev.web.api.util.PdfGenaratorUtil;

@Controller
public class PDFController {
	@Autowired
	private PdfGenaratorUtil util;

	@RequestMapping("/generatePDF")
	public String getPDFView(Model model) throws Exception {
		List<User> users = getUser();
		Map<Object, Object> data = new HashMap<>();
		data.put("users", users);
		util.createPdf("greeting", data);
		model.addAttribute("message", "PDF Downloaded successfully..");
		return "test";
	}

	private List<User> getUser() {
		List<User> users = new ArrayList<User>();
		for (int i = 1; i <= 50; i++) {
			users.add(new User(i, "user" + i, new Random().nextInt(64),
					"branch" + i, "address" + i));
		}
		return users;
	}
}
