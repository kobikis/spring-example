package org.spring.example.controller;

import org.spring.example.data.Person;
import org.spring.example.persistemce.PersonDB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

	@RequestMapping(method = RequestMethod.GET, value="/all")

	@ResponseBody
	public List<Person> getStudent() {
		return PersonDB.getAll();
	}
}
