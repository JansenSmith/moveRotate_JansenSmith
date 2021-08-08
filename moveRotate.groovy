//Move and rotate opperations
double size =40;
CSG cube = new Cube(size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
		
		
CSG movedCube = cube

//rotate
//cubeIntersectSphere = cubeIntersectSphere.rot(rx,ry,rz);// vector notation
movedCube = movedCube
			//.rotx(15)
			//.roty(20)
			.rotz(15)


//cubeIntersectSphere = cubeIntersectSphere.move(x,y,z);// vector notation
movedCube = movedCube
			.movex(40)
			//.movey(20)
			//.movez(40)
//set colors
cube.setColor(javafx.scene.paint.Color.CYAN);

return [cube,movedCube]