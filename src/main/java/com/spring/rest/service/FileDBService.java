package com.spring.rest.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.rest.model.FileDB;
import com.spring.rest.repository.FileDBRepository;

@Service
public class FileDBService {
	
	@Autowired
	private FileDBRepository fileDBRepository;
	
//	Store file in DB
	public FileDB store(MultipartFile file) throws IOException
	{
		String fileName= file.getOriginalFilename();
		FileDB fileDB= new FileDB (UUID.randomUUID().toString(), fileName, file.getContentType(), file.getBytes());
		return fileDBRepository.save(fileDB);
	}
	
//	Find a file by it's Id
	public FileDB getFileById(String Id)
	{
		Optional<FileDB> fileOptional =  fileDBRepository.findById(Id);
		if (fileOptional.isPresent()) {
			return fileOptional.get();
		}
		return null;
	}
	
//	Get All files
	public List<FileDB> getFileList()
	{
		return fileDBRepository.findAll();
	}
	

}
