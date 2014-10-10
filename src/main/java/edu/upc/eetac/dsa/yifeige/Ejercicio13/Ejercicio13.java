package edu.upc.eetac.dsa.yifeige.Ejercicio13;
import  edu.upc.eetac.dsa.yifeige.Ejercicio13.MultiThreadServer;

import java.io.*; 
import java.net.*;

public class Ejercicio13 
{
    public static void main( String[] args )
    {
    	int PortNumber=7005;
    	boolean listen=true;
    	try
    	{
    		ServerSocket soc=new ServerSocket(PortNumber);
    		System.out.print("Socket construido esperando una conexion");
    		while(listen)
    		{
    			MultiThreadServer multiservidor=new MultiThreadServer(soc.accept());
    			
    			multiservidor.start();
    		}
    	}
    	catch(IOException e)
    	{
    		System.out.print("Error de escuchar al puerto"+PortNumber);
    	}
        
    }
}
