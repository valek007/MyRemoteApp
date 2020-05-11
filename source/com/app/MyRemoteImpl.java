package com.app;
import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public MyRemoteImpl() throws RemoteException{

		try{
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("Remote Hello", service);
		
		} catch(Exception e) {}
	}

	public String sayHello(){
		return "Server say: 'Hello'";
	}

}