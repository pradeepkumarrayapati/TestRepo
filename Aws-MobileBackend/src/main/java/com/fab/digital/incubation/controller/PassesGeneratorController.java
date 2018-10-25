package com.fab.digital.incubation.controller;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;
import java.sql.Time;

import com.fab.digital.incubation.model.SignPassRequest;
import com.google.gson.Gson;
/**Pradeep kumar code to invoke python scrip to create walletpass and read passkitpass zip 
 * file and return zip as byte array*/
  
@RestController
@RequestMapping("/mobileserver")
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
		   System.out.println("****Execute python script Begin***");  
		   String cmd = "python"+" /home/ec2-user/components/script.py";
		   //+" >/home/ec2-user/components/pylog.out";
		   System.out.println("****Py-Cmd:***"+cmd);
		   Process proc = Runtime.getRuntime().exec(cmd);
		   System.out.println("****Process alive?:***:"+proc.isAlive());
		  
		   InputStream stderr = proc.getErrorStream();
           InputStreamReader isr = new InputStreamReader(stderr);
           BufferedReader br = new BufferedReader(isr);
           String line = null;
           System.out.println("<ERROR>");
           while ( (line = br.readLine()) != null)
               System.out.println(line);
           System.out.println("</ERROR>");
           int exitVal = proc.waitFor();
           System.out.println("exitvalue"+exitVal);
//		   p.waitFor();
//		   p.destroyForcibly();
		   System.out.println("****Execute python script End***");
		   //File file = new File("/data/incubation/PassKit/Pass/BoardingPass.pkpass");
		   System.out.println("****Read pass zip file Begin***");  
		   File file = new File("/home/ec2-user/components/BoardingPass.zip");
		   System.out.println("****Read pass zip file Begin***");
		 //File file = new File("C:\\updatedcode\\BigDataConsumer\\target\\BoardingPass.zip\\");
		         FileInputStream fin = null;

		         fin = new FileInputStream(file);
		         passContent = new byte[(int)file.length()];
		         fin.read(passContent);
		         System.out.println("****Check if process alive:***:"+proc.isAlive());
		         if( proc.isAlive())
				  {
					  
					  proc.destroy();
					  System.out.println("****process destroyed :***:"+proc.isAlive());
				  }
		System.out.println("Respone Sent SuccessFully");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {

			System.out.println(e.getMessage());

        }
		
		return passContent;
	}
}