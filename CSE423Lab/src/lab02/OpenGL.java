/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
//com.jogamp or javax.media
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;
/**
 *
 * @author sbiswas.amit
 */
public class OpenGL {

    /**
     * uses point drawing DDA algorithm 
     **/
    /*public static void main(String[] args) {
     //getting the capabilities object of GL2 profile
    final GLProfile profile=GLProfile.get(GLProfile.GL2);
    GLCapabilities capabilities=new GLCapabilities(profile);
    // The canvas
    final GLCanvas glcanvas=new GLCanvas(capabilities);
    ThirdGLEventListener b =new ThirdGLEventListener();
    glcanvas.addGLEventListener(b);
    glcanvas.setSize(400, 400);
    //creating frame
    final JFrame frame = new JFrame("My frame");
    //adding canvas to frame
    frame.add(glcanvas);
    //frame.setSize(640,480);
    frame.setSize(frame.getContentPane().getPreferredSize());
    frame.setVisible(true);
    }*/
    
    /**
     * uses line drawing method
     **/
    public static void main(String[] args) {

      //getting the capabilities object of GL2 profile        
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);
   
      // The canvas
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      DDALines drawing = new DDALines();
      glcanvas.addGLEventListener(drawing);
      glcanvas.setSize(400, 400);
   
      //creating frame
      final JFrame frame = new JFrame ("straight Line");
   
      //adding canvas to frame
      frame.getContentPane().add(glcanvas);                 
      frame.setSize(frame.getContentPane().getPreferredSize());
      frame.setVisible(true);
      
   }
    
}


