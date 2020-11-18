package eclipse_project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



public class Test {
	public  List<region> getTodaynovel()
			throws IOException, NullPointerException {

		// 连接中央气象台的API
		URL url = new URL("https://view.inews.qq.com/g2/getOnsInfo?name=disease_h5");
		URLConnection connectionData = url.openConnection();
		connectionData.setConnectTimeout(1000);
		List<region> list = new ArrayList<region>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					connectionData.getInputStream(), "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = br.readLine()) != null)
				sb.append(line);
			String datas = sb.toString();
			JSONObject jsonData = JSONObject.fromObject(datas);
			
			String data = jsonData.getString("data").toString();
			JSONObject data_json = JSONObject.fromObject(data);
			
			String areaTree = data_json.getString("areaTree").toString();
			areaTree = areaTree.substring(1,areaTree.length()-1);
			JSONObject areaTree_json = JSONObject.fromObject(areaTree);
			
			String children = areaTree_json.getString("children").toString();
			JSONArray children_Array=JSONArray.fromObject(children);
			int count = 0;
			for (int i = 0; i < children_Array.size(); i++) {
				JSONObject children_json = children_Array.getJSONObject(i);
				String province = children_json.getString("name").toString();
				String children_children = children_json.getString("children").toString();
				JSONArray children_children_Array=JSONArray.fromObject(children_children);
				for (int j = 0; j < children_children_Array.size(); j++) {
					JSONObject children_children_json = children_children_Array.getJSONObject(j);
					String region = children_children_json.getString("name").toString();
					
					JSONObject children_children_total = JSONObject.fromObject(children_children_json.getString("total").toString());
					String people = children_children_total.getString("confirm").toString();
//					System.out.println(province+"."+region+":"+people+"人");
					region reg = new region();
					reg.setId(count);
					reg.setName(province);
					reg.setChildren(region);
					reg.setAmount(Integer.parseInt(people));
					list.add(reg);
					count++;
				}
			}
		} catch (SocketTimeoutException e) {
			System.out.println("连接超时");
		} catch (FileNotFoundException e) {
			System.out.println("加载文件出错");
		}
		return list;
 
	}
	
    public  List<region> array_rank(List<region> list){
        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = 0; j <list.size()-1 ; j++) {
                if(list.get(j).getAmount()<list.get(j+1).getAmount()){
                	region s=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,s);
                }
            }
        }
        return list;
    }
	
	public static void main(String[] args) 
			throws IOException, NullPointerException{
		List<region> list ;
		List<region> array_list ;
		//txt
		FileWriter fileWriter = null;
		fileWriter = new FileWriter("D:/a.txt");//创建文本文件
		Test test = new Test();
		
		try {
			fileWriter.write("-----------------------排序前-----------------------"+"\r\n");
			list = test.getTodaynovel();
			for (int i = 0; i < list.size()-1; i++) {
				fileWriter.write(list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i).getChildren()+" "+list.get(i).getAmount()+"人"+"\r\n");
		}
			fileWriter.write("-----------------------排序后-----------------------"+"\r\n");
			array_list = test.array_rank(list);
			
			for (int i = 0; i < 5; i++) {
				fileWriter.write(i+" "+ array_list.get(i).getName()+" "+array_list.get(i).getChildren()+" "+array_list.get(i).getAmount()+"人"+"\r\n");
		}
			fileWriter.flush();
			fileWriter.close();
			System.out.println("finsh the project");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}