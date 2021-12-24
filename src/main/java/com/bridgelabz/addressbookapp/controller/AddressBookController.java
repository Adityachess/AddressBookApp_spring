package com.bridgelabz.addressbookapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.model.Contact;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	@RequestMapping(value = { "/greeting" })
	public String welcomeUser() {
		return "Welcome to address book home";
	}

	/**
	 * using get method to fetch all contact details in AddressBook
	 */
	@GetMapping("/get/{id}")
	public String welcomeSpecificUser(@PathVariable String id) {
		return "Welcome, User " + id	;
	}

	/**
	 * Using post method to add contact details in AddressBook
	 */

	@PostMapping("/add")
	public String createContact(@RequestBody Contact contact) {
		return "Added " +"id:"+ contact.getId()+" "+ contact.getName() +" "+ contact.getAuthor()+ " to list";
	}

	/**
	 * using put method to update contact details in AddressBook
	 */
	@PutMapping("/update")
	public String updateContact(@RequestBody Contact contact) {
		return "Updated " + "id:"+ contact.getId()+" "+ contact.getName() +" "+ contact.getAuthor()+" in list";
	}

	/**
	 * using delete method to remove the contact details in AddressBook
	 */
	@DeleteMapping("/remove/{id}")
	public String deleteContact(@PathVariable String id) {
		return "Deleted contact " + id;
	}
}