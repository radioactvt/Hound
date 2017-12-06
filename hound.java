import java.io.*;

class hound
{
	static int i=0;
	static int esz=0;
	static int sz=0;
	static int l=0;
	static int ist=0;
	static int sst=0;
	static int b=0;
	
	public static void main(String args[])//main() method is used here as the Command Line Interface method
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		String l="";
		
		hound obj=new hound();

		try
		{
			System.out.println("Enter size of the suspected file in bytes:");
			sz=Integer.parseInt(in.readLine());
			sz=(int)(sz/2)+1; 
			char by[]=new char[sz];
			 
			System.out.println("---------------------------------------------------------------------------------------------");
                        System.out.println("NOTE:In place of a single slash, you have to give a double slash while entering the location.");
                        System.out.println("---------------------------------------------------------------------------------------------");
			
			System.out.println("Enter location of file to be scanned:");
			l=in.readLine();
			
		    FileInputStream inf=new FileInputStream(l);
		
		    
		
			while((b=inf.read())!=-1)
			{
				by[i]=((char)b);
				i=i+1;
			}
			inf.close();
		
		String lo="";
		int len=0;
		String ns="";

			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("NOTE:In place of a single slash, you have to give a double slash while entering the location");
			System.out.println("---------------------------------------------------------------------------------------------");
			
			System.out.println("Enter location of database file:");
			lo=in.readLine();
			
			System.out.println("Enter size of the database file in bytes:");
			esz=Integer.parseInt(in.readLine());
			esz=(int)(esz/2)+1; 
			char edb[]=new char[esz];
			
			FileReader inf2=new FileReader(lo);
			
			int c;
			int j=0;
			int ik=0;
			String ss="";
			int k=0;
			
			while((c=inf2.read())!=-1)
			{
				edb[j]=((char)c);
				j=j+1;
			}
			inf2.close();
			
			while(edb[k]!='\n')
				{
					len=len+1;
				}
			String db[]=new String[len];	
	
	loop:   for(k=0;;k++)
			{
				while(edb[k]!='\n')
				{
					ns=ns+edb[k];
				}
				int li=ns.length();
				
				while(by[k]!='\n')
				{
					for(int zi=ik;zi<(zi+li);zi++)
					{
						ss=ss+by[k];
					}
					ik=ik+1;
				}
				if(k<len)
				{
					if(ns.equals(ss)==true)
						ist=ist+1;
					else if(ns.equalsIgnoreCase(ss)==true)
						sst=sst+1;;	
				}
				if(k==len)
					break loop;
			}
			System.out.println("Infiltration strings patterns detected:"+ist);
				System.out.println("Suspicious string patterns detected,you should check it out in the Cymru API:"+sst);
				
				if(ist==0 && sst==0)
					System.out.println("Hound considers this file to be absolutely clean.");
		   else if(sst!=0)	
				  	System.out.println("Hound considers this file to be suspicious.Check it out in the Cymru API");
			  else
					System.out.println("This file is infected with malware!Malicious string patterns have been detected!");
			
		}
		catch(Exception e1)
		{
			System.out.println("The scan() method of Hound has experienced an unexpected error.Error details:"+e1.getMessage());  			
		}
	}
}			
			
							
		

