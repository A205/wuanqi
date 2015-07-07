package zuoye2;

import java.util.Random;

public class chengjishuzu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random a=new Random();
		String[] t=new String[6];
		t[0]=new String(" ");
        t[1]=new String(" core C++");
        t[2]=new String("core Java");
        t[3]=new String("  Servlet");
        t[4]=new String("     JSP");
        t[5]=new String("    EJB");
        for(int k=0;k<6;k++){
        System.out.print(t[k]+"\t");
        }System.out.println("");
        int[][] s=new int[21][6];
for(int i=1;i<21;i++){
	for(int j=1;j<6;j++){
		s[i][j]=a.nextInt(100);
		System.out.print("             "+s[i][j]+"\t");
	}System.out.println("");
}
for(int i=1;i<21;i++){
	int sum=0;
	for(int j=1;j<6;j++){
		sum=sum+s[i][j];
	}System.out.println("学生总分为"+sum+"\t");
}
for(int i=1;i<6;i++){
	int Sum=0;
	for(int j=1;j<21;j++){
		Sum=Sum+s[j][i];
	}System.out.println(t[i]+"平均分是        "+(Sum/20)+"\t");
}
	}
}
