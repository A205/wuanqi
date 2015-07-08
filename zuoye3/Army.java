package zuoye3;

public class Army {
       Weapon[] w;
      private int count=0;
       public Army(int s){
    	   w=new Weapon[s]; 
       }
       public void addWeapon(Weapon wa){
    	   if(count<w.length){
    		   w[count]=wa;
    		   count++;
    		   
    	   }else{
    		   System.out.println("无法装备武器");
    	   }
       }
       public void attackAll(){
    	   for(int i=0;i<count;i++){
    	   w[i].attack();
    	   }
       }
       public void moveAll(){
    	   
    	   for(int i=0;i<count;i++){
    		   w[i].move();
    	   }
       }
}
