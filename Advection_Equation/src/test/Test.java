package test;

import org.jblas.DoubleMatrix;
import doubleMatrix.Concat;
import model.filterModel;
import model.ModelKF;
import Jama.*;

import trueSolution.TrueinGround;
import trueSolution.TrueSolution;
import filters.Estimation;
import targetGroundTruth.*;

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) {
		//**Start network setup
		int cells=11;//*number of cells in each section
		//each section only share one boundary cell with its adjacent sections
		//*total number of sections
//		int Shocksec =7;//*the index of the section with a status transition located initially 
		double dt=1d;
		double dx=1d;
		//**End network setup

//	    double rhoLeft = 0.8;//*initial density to the left of the central status transition
//	    double rhoRight = 0.2;//*initial density to the right of the central status transition
	    TargetGroundTruth groundtruth=new GroundTruth(cells,dt,dx);


	    //setting adjacent sections

	    Estimation.exportResult(groundtruth, 2000, "SensorSchedule_1018-sg-correlation-6-cfl1");
	}	
}
