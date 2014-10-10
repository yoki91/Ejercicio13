package edu.upc.eetac.dsa.yifeige.Ejercicio13;
import java.io.*; 
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MultiThreadServer extends Thread
{
	private Socket sok=null;
	public MultiThreadServer(Socket s)
	{
		super("MultiThreadServer");
		this.sok=s;
		
	}
	public void run()
	{
		try
		{
			Date fecha=new Date();
        	SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        	PrintWriter escritor=new PrintWriter(sok.getOutputStream(),true);
        	BufferedReader lector=new BufferedReader(new InputStreamReader(sok.getInputStream()));
        	
        	int opcionrecibido;
        	opcionrecibido=Integer.parseInt(lector.readLine());
        	String hora=formato.format(fecha);
        	if(opcionrecibido==0)
        	escritor.println(hora);
        	else
        	  System.exit(1);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
