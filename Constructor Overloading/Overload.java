/* Java Program Example - Java Use Objects as Parameters
 * In this program, Box allows one object to
 * initialize another 
 */

class Box
{
    double width;
    double height;
    double depth;
    
    /* notice this constructor, it takes an object of the type Box */
     Box(Box ob)        // pass object to the constructor
     {
         width = ob.width;
         height = ob.height;
         depth = ob.depth;
     }
     
     /* constructor used when all the dimensions specified */
     Box(double wid, double hei, double dep)
     {
         width = wid;
         height = hei;
         depth = dep;
     }
     
     /* constructor used when no dimensions specified */
     Box()
     {
         width = -1;         // use -1 to indicate
         height = -1;        // an uninitialized
         depth = -1;         // box
     }
     
     /* constructor used when cube is created */
     Box(double len)
     {
         width = height = depth = len;
     }
     
     /* compute and return the volume */
     double volume()
     {
         return width * height * depth;
     }
}

class Overload
{
    public static void main(String args[])
    {
        
        /* create boxes using the various constructors */
        Box mybox1 = new Box(100, 200, 150);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        
        Box myclone = new Box(mybox1);     // create a copy of mybox1
        
        double vol;
        
        /* get the volume of the first box */
        vol = mybox1.volume();
        
        /* print the volume of the first box */
        System.out.println("Volume of mybox1 is " + vol);
        
        /* get the volume of the second box */
        vol = mybox2.volume();
        
        /* print the volume of the second box */
        System.out.println("Volume of mybox2 is " + vol);
        
        /* get the volume of the cube */
        vol = mycube.volume();
        
        /* print the volume of the cube */
        System.out.println("Volume of cube is " + vol);
        
        /* get the volume of the clone */
        vol = myclone.volume();
        
        /* print the volume of the clone */
        System.out.println("Volume of clone is " + vol);
        
    }
}