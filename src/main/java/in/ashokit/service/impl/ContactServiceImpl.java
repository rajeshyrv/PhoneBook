package in.ashokit.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;
import in.ashokit.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService{
	private ContactRepository contactRepository;
	

	public ContactServiceImpl(ContactRepository contactRepository) {
		super();
		this.contactRepository = contactRepository;
	}

	@Override
	public boolean saveContact(Contact contact) {
		
		return contactRepository.save(contact) != null;
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return contactRepository.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		
		return contactRepository.findById(contactId).get();
	}

	@Override
	public boolean deleteById(Integer contactId) {
		contactRepository.deleteById(contactId);
		return true;
		
		
	}

}
