// get the image
		Part part=request.getPart("edit-user-profile");
		//out.print(part);
		String filename=part.getSubmittedFileName();
    String path=request.getRealPath("/")+"images"+File.separator+u.getProfile();
			DeleteAndSaveFile.deleteFile(path);
			if(DeleteAndSaveFile.saveFile(part.getInputStream(), path))
			{
				out.println("Profile Updated");
			}
			else {
				out.println("Profile are not updated");
        
        
     
     
     
     
     
     
     
     
     
     
     
 using function------------------------------
 
 package technical.blog.com.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class DeleteAndSaveFile {
	
	public static void deleteFile(String path)
	{
		try {
			File file=new File(path);
			file.delete();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static boolean  saveFile(InputStream is,String path)
	{
		boolean f=false;
		try {
			byte[] b=new byte[is.available()];
			is.read(b);
			
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(b);
			fos.flush();
			fos.close();
			f=true;
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}

}
