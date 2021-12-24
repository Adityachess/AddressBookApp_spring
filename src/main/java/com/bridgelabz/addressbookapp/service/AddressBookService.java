package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.Contact;

@Service
public class AddressBookService implements IAddressBookService {
	@Override
	public List<Contact> getContact() {
		List<Contact> contactList = new ArrayList<>();
		contactList.add(new Contact(1,
				new ContactDTO("Aditya", "Done", "Dhanori", "Maharashtra", "Pune", "411015", "8554830391")));
		return contactList;
	}

	@Override
	public Contact getContactById(int contactId) {
		Contact contact = new Contact(1,
				new ContactDTO("Anant", "Shinde", "Hadapasar", "Maharshtra", "Pune", "411016", "7220202030S"));
		return contact;
	}

	@Override
	public Contact createContact(ContactDTO contactDTO) {
		Contact contact = new Contact(1, contactDTO);
		return contact;
	}

	@Override
	public Contact updateContact(int contactId, ContactDTO contactDTO) {
		Contact contact = new Contact(1, contactDTO);
		return contact;
	}

	@Override
	public void deleteContact(int contactId) {

	}
}
