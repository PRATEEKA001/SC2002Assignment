import main.Utils.FileHandler;
import java.util.ArrayList;
import java.util.List;
public class ReqType1 {
    public void executeRequest(String id,String action){
        //Changing request records
        String newStatus;
        if (action=="APPROVE"){newStatus= "APPROVED";}
        else{newStatus= "REJECTED";}
        String filepath = System.getProperty("user.dir") + "\\main\\Data\\request_record.csv";
        String[] data = FileHandler.readFile(filepath, id, 0);
        String newString = data[0]+","+data[1]+","+data[2]+","+data[3]+","+newStatus+","+data[5]+","+data[6]+","+data[7]+","+data[8];
        FileHandler.writeFile(filepath, id, 0, newString);

        //Finding Student_name and Student_email from req_id
        String filepath2 = System.getProperty("user.dir") + "\\main\\Data\\student_list.csv";
        String[] data2 = FileHandler.readFile(filepath2, data[1], 2);
        String Student_name  =data2[0];
        String Student_email =data2[1];



        //Changing project records
        if (action=="APPROVE") {
            String projPath = System.getProperty("user.dir") + "\\main\\Data\\project_record.csv";
            String[] data1 = FileHandler.readFile(projPath, data[5], 0);
            String newString1;
            newString1 = data1[0] + "," + data1[1] + "," + data1[2] + "," + data1[3] + "," + "ALLOCATED" + "," + Student_name + "," + Student_email;
            FileHandler.writeFile(projPath, data[5], 0, newString1);
        }
        System.out.println("Request successfully processed!");

    }}