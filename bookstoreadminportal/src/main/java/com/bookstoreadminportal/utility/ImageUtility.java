package com.bookstoreadminportal.utility;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.web.multipart.MultipartFile;

import com.bookstoreadminportal.model.Book;

public class ImageUtility {

	public static void saveImage(MultipartFile bookImage,Book book) {
		// TODO Auto-generated method stub
		try {
			byte[] bytes = bookImage.getBytes();
			String name = book.getId()+".png";
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("src/main/resources/static/images/book/"+name)));
			stream.write(bytes);
			stream.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
