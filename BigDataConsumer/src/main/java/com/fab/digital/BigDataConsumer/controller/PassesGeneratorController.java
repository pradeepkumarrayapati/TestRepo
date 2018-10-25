package com.fab.digital.BigDataConsumer.controller;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;

import com.fab.digital.BigDataConsumer.model.SignPassRequest;
import com.google.gson.Gson;

@RestController
@RequestMapping("/bigdata")
public class PassesGeneratorController {
	@PostMapping("/getpass")
public byte[] getPass(RequestEntity<SignPassRequest> request)  {	

		byte passContent[] = null ;
		try
		{
			Gson gson = new Gson();
			System.out.println(gson.toJson(request.getBody()));
			gson.toJson(request.getBody(), new FileWriter("/home/ec2-user/components/pass.json"));
		   FileWriter fw= new FileWriter("/home/ec2-user/components/pass.json");
		   fw.write(gson.toJson(request.getBody()));
		   fw.flush();
		   fw.close();
		 //String cmd = "/data/incubation/PassKit/Pass/signPass -p /data/incubation/PassKit/Pass/BoardingPass.pass";
//		  if (new File("/home/ec2-user/components/BoardingPass.zip").exists()) {
//		   String cmd1 = "rm /home/ec2-user/components/BoardingPass.zip";
//		   Process p1 = Runtime.getRuntime().exec(cmd1);
//		  }
		   String cmd = "python /home/ec2-user/components/script.py";
		   Process p = Runtime.getRuntime().exec(cmd);
		   
		   //File file = new File("/data/incubation/PassKit/Pass/BoardingPass.pkpass");
		   File file = new File("/home/ec2-user/components/BoardingPass.zip");
		
		 //File file = new File("C:\\updatedcode\\BigDataConsumer\\target\\BoardingPass.zip\\");
		         FileInputStream fin = null;

		         fin = new FileInputStream(file);
		         passContent = new byte[(int)file.length()];
		         fin.read(passContent);

		System.out.println("done");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {

			System.out.println(e.getMessage());

        }
		
		return passContent;
	}
}