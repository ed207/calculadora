
package calculadora;


public class CALCULADORA {

   
    public static void main(String[] args) {
        ventana inicio= new ventana();
        inicio.setTitle("Calculadora basica");
        inicio.setBounds(500, 100, 400, 600);//Posicion y dimenciones
        inicio.setResizable(false);
        inicio.insertarPanel();
        inicio.insertarEtiquetas();
        inicio.insertarTextos();
        inicio.insetarBotones();
        
    }
    
}
