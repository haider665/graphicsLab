/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midpointCircle;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 *
 * @author sajib
 */
public class MidPointCircle  implements GLEventListener {
    /**
     * Interface to the GLU library.
     */
    private GLU glu;

    /**
     * Take care of initialization here.
     * @param gld
     */
    @Override
    public void init(GLAutoDrawable gld) {
        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }

    /**
     * Take care of drawing here.
     * @param drawable
     */
    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        /*
         * put your code here
         */
       //points should be in the same zone
        DrawMPL(gl,10,5,3);
//        DrawMPL(gl,10,-10,60,-50);
//        DrawMPL(gl,-30,-10,-100,-40);
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        //do nothing
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
        //do nothing
    }
    
    int dx, dy, b;
    private void DrawMPL(GL2 gl, int r, int cx, int cy) {
       //write your own code
       gl.glPointSize(2.0f);
       gl.glColor3d(1, 0, 0);
                    
       gl.glBegin(GL2.GL_POINTS);       
       System.out.println(r);
       int d = 1-r;
       int x1=0, y1=r;
       gl.glVertex2d(0, 0);
       gl.glVertex2d(y1+cx, x1+cy);
       gl.glVertex2d(x1+cx, y1+cy);
       gl.glVertex2d(-x1+cx, y1+cy);
       gl.glVertex2d(-y1+cx, x1+cy);
       gl.glVertex2d(-y1+cx, -x1+cy);
       gl.glVertex2d(-x1+cx, -y1+cy);
       gl.glVertex2d(x1+cx, -y1+cy);
       gl.glVertex2d(y1+cx, -x1+cy); 
       while(x1<y1) {
    	   if(d<0){
    		   d=d+2*x1+3;
    	   } else {
    		   d=d+2*(x1-y1)+5;
    		   y1--;
    	   }
    	   x1++;
    	   gl.glVertex2d(y1+cx, x1+cy);
           gl.glVertex2d(x1+cx, y1+cy);
           gl.glVertex2d(-x1+cx, y1+cy);
           gl.glVertex2d(-y1+cx, x1+cy);
           gl.glVertex2d(-y1+cx, -x1+cy);
           gl.glVertex2d(-x1+cx, -y1+cy);
           gl.glVertex2d(x1+cx, -y1+cy);
           gl.glVertex2d(y1+cx, -x1+cy); 
       }
       
                

       gl.glEnd();
    }
    
    //y=mx+b
    private int func(int x, float y){
        return (int)(dy*x - y*dx + b*dx);
    }
    
    
    int findZone(int x1, int y1, int x2, int y2) {
        int zone = 0;        
        return zone ;
    }
    
    int convertX(int x, int y, int zone){
        int convertedX=0;       
        return convertedX;
    }
    
    int convertY(int x, int y, int zone){
       int convertedY=0;        
       return convertedY;
    }
    
    
    public void dispose(GLAutoDrawable arg0) {
        //do nothing
    }
}

