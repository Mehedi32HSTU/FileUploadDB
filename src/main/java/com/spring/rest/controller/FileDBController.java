package com.spring.rest.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.rest.model.FileDB;
import com.spring.rest.service.FileDBService;

@RestController
@RequestMapping("file")
public class FileDBController {
	
	@Autowired
	private FileDBService fileDBService;
	
	@PostMapping
	public FileDB uploadFile(@RequestParam ("file") MultipartFile file) throws IOException
	{
		return fileDBService.store(file);
	}
	
	@GetMapping("/{id}")
	public FileDB getFile(@PathVariable(value="id") String Id)
	{
		return fileDBService.getFileById(Id);
	}
	
	@GetMapping("/list")
	public List<FileDB> getFileList()
	{
		return fileDBService.getFileList();
	}

}
