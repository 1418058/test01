package recognition01;

import java.io.File;
import java.io.FileNotFoundException;

import com.ibm.watson.developer_cloud.service.security.IamOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectFacesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;

public class Recognition01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				VisualRecognition service = new VisualRecognition("2018-03-19");
		         service.setApiKey("RV9y0Bfh4txllREzGMPob8G32KtmHCMkyJtY0gtCW2Pq");
		
				DetectFacesOptions detectFacesOptions = null;
				try {
					detectFacesOptions = new DetectFacesOptions.Builder()
					  .imagesFile(new File("img/toranpu.jpeg"))
					  .build();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				DetectedFaces result = service.detectFaces(detectFacesOptions).execute();
				System.out.println(result);
	}

}
