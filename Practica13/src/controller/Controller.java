package controller;

import java.util.Scanner;

import db.FlyDB;
import db.PlaneDB;
import modules.Fly;
import modules.Plane;
import utils.GetInfoUtils;

public class Controller {
	
	public static void createPlane(Scanner read, PlaneDB planes) {
		
		planes.getPlanes().add(new Plane(GetInfoUtils.askForPlaneID(read), GetInfoUtils.askForPlaneCapacity(read)));
	}
	
	public static void createFly(Scanner read, PlaneDB planes, FlyDB flies) {
		
		String planeID = GetInfoUtils.askForPlaneID(read);
		
		Plane selectedPlane = searchPlane(planeID, planes);
		if(selectedPlane != null) {
			String startAirport = GetInfoUtils.askForStartAirport(read);
			String endAirport = GetInfoUtils.askForEndAirport(read);
			flies.getFlies().add(new Fly(selectedPlane, startAirport, endAirport));
		}
	}
	
	public static void printPlane (Scanner read, PlaneDB planes) {
		
		Plane plane = searchPlane(GetInfoUtils.askForPlaneID(read), planes);
		System.out.println(plane);
	}
	
	public static void printPlanes(PlaneDB planes) {
		
		for(Plane plane : planes.getPlanes()) {
			System.out.println(plane);
		}
	}
	
	public static void printFlies(FlyDB flies) {
		
		for(Fly fly : flies.getFlies()) {
			System.out.println(fly);
		}
	}
	
	public static Plane searchPlane(String planeID, PlaneDB planes) {
		
		for(Plane plane : planes.getPlanes()) {
			if (planeID.equals(plane.getPlaneID())) {
				return plane;
			}
		}
		System.out.println("This plane does not exist");
		return null;
	}
}
