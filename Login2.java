import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
public class Login2 extends JFrame implements ActionListener{
    
    static int i;
    static String nom1[]=new String[0];
    static String nom2[]=new String[0];
    static String usu1[]=new String[0];
    static String usu2[]=new String[0];
    static String con1[]=new String[0];
    static String con2[]=new String[0];
    static int si1[]=new int[0];
    static int si2[]=new int[0];
    static String emp1[]=new String[0];
    static String emp2[]=new String[0];
    static int mon1[]=new int[0];
    static int mon2[]=new int[0];
    
    int num1[]=new int[0];
    int num2[]=new int[0];
    
    static int den1[]=new int[0];
    static int den2[]=new int[0];
    static int can1[]=new int[0];
    static int can2[]=new int[0];
    int num3[]=new int[0];
    int num4[]=new int[0];
    
    static String usu3[]=new String[0];
    static String usu4[]=new String[0];
    static String ami1[]=new String[0];
    static String ami2[]=new String[0];
    int num5[]=new int[0];
    int num6[]=new int[0];
    
    
    //-- CREAMOS LOS OBJETOS QUE UTLIZAREMOS
        public JButton btnBotonRegistrar = new JButton("Registrar");
        public JLabel lblNombre = new JLabel("NOMBRE : ");
        public JTextField txtNombre = new JTextField(20);
        public JLabel lblPass = new JLabel("CONTRASEÑA : ");
        public JTextField txtPass = new JTextField(20);
        public JLabel lblUsuario = new JLabel("USUARIO : ");
        public JTextField txtUsuario = new JTextField(20);
        public JLabel lblSinicial = new JLabel("SALDO INICIAL : ");
        public JTextField txtSinicial = new JTextField(20);
        public JLabel lblEmpresa = new JLabel("EMPRESA ATIENDE : ");
        public JTextField txtEmpresa = new JTextField(20);
        public JLabel lblMonto = new JLabel("MONTO MAXIMO: ");
        public JTextField txtMonto= new JTextField(20);
        public JButton btnBotonRegresar = new JButton("Salir");
        public JLabel lbltitulo1 = new JLabel("CREAR DENOMINACIONES DE DINERO: ");
        public JLabel lblDenominacion = new JLabel("DENOMINACION: ");
        public JTextField txtDenominacion = new JTextField(20);
        public JLabel lblCantidad = new JLabel("CANTIDAD: ");
        public JTextField txtCantidad= new JTextField(20);
        public JButton btnBotonAsignar = new JButton("ASINGNAR BILLETES");
        public JTextArea Clientes = new JTextArea();
         public JLabel lbltitulo2 = new JLabel("ASIGNAR LISTA DE ESTUDIANTES: ");
        public JLabel lblUsuario2 = new JLabel("USUARIO : ");
        public JTextField txtUsuario2 = new JTextField(20);
        public JLabel lblAmigos = new JLabel("ESTUDIANTE : ");
        public JTextField txtAmigos= new JTextField(20);
        public JButton btnBotonAAmigo = new JButton("ASINGNAR AMIGO");
        public JPanel Contenedor = new JPanel();
        
    
        public Login2 ()
    {
        //-- CONFIGURAMOS LA VENTANA JFRAME
         
        super("SUPERUSUARIO");
        this.setSize(450,730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
         
        this.btnBotonRegistrar.addActionListener(this); 
        this.btnBotonRegresar.addActionListener(this);
        this.btnBotonAsignar.addActionListener(this);
        this.btnBotonAAmigo.addActionListener(this);
        
        


         
        //-- LE AÑADIMOS UN DISTRIBUIDOR DE OBJETOS A LA VENTANA
        
         
        FlowLayout DISTRIBUIDOR = new FlowLayout(FlowLayout.TRAILING,30,30);
        this.setLayout(DISTRIBUIDOR);
         
        //-- LE AGREGAMOS LOS OBJETOS A LA VENTANA
         
        this.add(this.lblNombre);
        this.add(this.txtNombre);
        this.add(this.lblPass);
        this.add(this.txtPass);
        this.add(this.lblUsuario);
        this.add(this.txtUsuario);
        this.add(this.lblSinicial);
        this.add(this.txtSinicial);
        this.add(this.lblEmpresa);
        this.add(this.txtEmpresa);
        this.add(this.lblMonto);
        this.add(this.txtMonto);
        this.add(this.btnBotonRegistrar);
        this.add(this.lbltitulo1);
        this.add(this.lblDenominacion);
        this.add(this.txtDenominacion);
        this.add(this.lblCantidad);
        this.add(this.txtCantidad);
        this.add(this.btnBotonAsignar);
        this.add(this.lbltitulo2);
        this.add(this.lblUsuario2);
        this.add(this.txtUsuario2);
        this.add(this.lblAmigos);
        this.add(this.txtAmigos);
        this.add(this.btnBotonAAmigo);
        this.add(this.btnBotonRegresar);



           
    }
        
        
        
        
           @Override
    public void actionPerformed(ActionEvent AE) 
    {   
     
if (AE.getSource() == this.btnBotonRegistrar){

                  registrar();
                  String nombre="";
                  
        
        for(i=0;i<nom1.length  && i<usu1.length && i<con1.length && i<si1.length  && i<emp1.length && i<mon1.length;i++)
        {
        System.out.println("      " +    nom1[i]     + "        "   +    usu1[i]  +   "        " + con1[i]      +"       " +    si1[i]     + "        "   +    emp1[i]  +   "        " + mon1[i]);
       // System.out.println("vector 2   " + cod1[i] );
        //System.out.println("vector 3   " + not1[i] );
        nombre += "     " +    nom1[i]     + "        "   +    usu1[i]  +   "        " + con1[i]      +"       " +    si1[i]     + "        "   +    emp1[i]  +   "        " + mon1[i] ;
        Clientes.setText(nombre);
        }
      
      limpiar();
              }

 if(AE.getSource() == this.btnBotonRegresar){
      
      this.dispose();
      JOptionPane.showMessageDialog(null, "Adios\n"
      + "Ha salido satisfactoriamente del sistema",   "Mensaje de salida",
      JOptionPane.INFORMATION_MESSAGE);
      login m = new login();
      m.setVisible(true);

}

 if (AE.getSource() == this.btnBotonAsignar){

                  registrar2();
                  
        int suma=0;
        int monto=0;
        for(i=0;i<den1.length  && i<can1.length ;i++)
        {
        System.out.println("Q " +    den1[i]     + "        "   +    can1[i]+ " billetes");
       // System.out.println("vector 2   " + cod1[i] );
        //System.out.println("vector 3   " + not1[i] );
        suma = suma + can1[i];
        monto = monto + (den1[i]*can1[i]);
       
        }
        System.out.println("total billetes: "+ suma);
        System.out.println("Total dinero: "+ monto);

      limpiar2();
              }
 
      
if (AE.getSource() == this.btnBotonAAmigo){

                  registrar3();
                  
        
        for(i=0;i<usu3.length  && i<ami1.length;i++)
        {
            System.out.println("Lista de estudiantes");
        System.out.println("      " +    usu3[i]     + "        "   +    ami1[i]);
       // System.out.println("vector 2   " + cod1[i] );
        //System.out.println("vector 3   " + not1[i] );
        }

      limpiar3();
              }
 

    

 }
    
    public void registrar()

    {
        String nom=this.txtNombre.getText();
        String usu=this.txtUsuario.getText();
        String con=this.txtPass.getText();
        String si=this.txtSinicial.getText();
        String emp=this.txtEmpresa.getText();
        String mon=this.txtMonto.getText();
        if(this.txtNombre.equals("") && this.txtUsuario.equals("") && this.txtPass.equals("") && this.txtSinicial.equals("") && this.txtEmpresa.equals("") && this.txtMonto.equals(""))
        {
          JOptionPane.showMessageDialog(null,"Debe llenar los campos" ,"Aviso",JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
        if(nom1.length==0 && usu1.length==0 && con1.length==0 && si1.length==0 && emp1.length==0 && mon1.length==0 )
        {
          nom1=new String[1];  
          usu1=new String[1];
          con1=new String[1];
          si1=new int[1];  
          emp1=new String[1];
          mon1=new int[1];
          nom1[0]=this.txtNombre.getText();
          usu1[0]=this.txtUsuario.getText();
          con1[0]=this.txtPass.getText();
          si1[0]=Integer.parseInt(this.txtSinicial.getText());
          emp1[0]=this.txtEmpresa.getText();
          mon1[0]=Integer.parseInt(this.txtMonto.getText());
          for(i=0;i<=(num1.length-1)&& i<=(num2.length-1);i++)
          {
              
          }
        }
        
        else if(nom1.length>0 && usu1.length>0 && con1.length>0 && si1.length>0 && emp1.length>0 && mon1.length>0)
        {
            //num_tem=new int [num.length+1]
            nom2=new String[nom1.length+1];
            usu2=new String [usu1.length+1];
            con2=new String [con1.length+1];
            si2=new int[si1.length+1];
            emp2=new String [emp1.length+1];
            mon2=new int [mon1.length+1];
            for( i=0;i<=(nom1.length-1) && i<=(usu1.length-1)&&i<=(con1.length-1) && i<=(si1.length-1) && i<=(emp1.length-1)&&i<=(mon1.length-1) ;i++)//creo un ciclo para pasarle los valores del vector original al vector temporal
            //sin eliminarlo
            {     
             nom2[i]=nom1[i];//realizo el intercambio de datos
             usu2[i]=usu1[i];
             con2[i]=con1[i];
             si2[i]=si1[i];
             emp2[i]=emp1[i];
             mon2[i]=mon1[i];
        }
            nom2[nom2.length-1]=this.txtNombre.getText();
            usu2[usu2.length-1]=this.txtUsuario.getText();
            con2[con2.length-1]=this.txtPass.getText();
            si2[si2.length-1]=Integer.parseInt(this.txtSinicial.getText());
            emp2[emp2.length-1]=this.txtEmpresa.getText();
            mon2[mon2.length-1]=Integer.parseInt(this.txtMonto.getText());
            
            nom1=new String[nom2.length];//al vector original le creo una nueva posicion que va hacer la camtidad de datos que tenga el
            usu1=new String[usu2.length];
            con1=new String[con2.length];
            si1=new int[si2.length];
            emp1=new String[emp2.length];
            mon1=new int[mon2.length];
            //vector temporal
            for( i=0;i<=(nom2.length-1)&&i<=(usu2.length-1)&&i<=(con2.length-1) && i<=(si2.length-1)&&i<=(emp2.length-1)&&i<=(mon2.length-1);i++)//realizo un ciclo para realizar el intercambio de nuevo
           {
        nom1[i]=nom2[i];//los valores del vector temporal los paso al vector original
              usu1[i]=usu2[i];
                con1[i]=con2[i];
                si1[i]=si2[i];
              emp1[i]=emp2[i];
                mon1[i]=mon2[i];
                // y que da el vecot listo para realizar operaciones
                
                // el vector que que con los datos es num[], el vector original
                
           ///con ese este vector se realizaran las operaciones que necesite
                
                
                 }

        }
        }
    }
    
        public void registrar2()

    {
        String den=this.txtDenominacion.getText();
        String can=this.txtCantidad.getText();

        if(this.txtDenominacion.equals("") && this.txtCantidad.equals(""))
        {
          JOptionPane.showMessageDialog(null,"Debe llenar los campos" ,"Aviso",JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
        if(den1.length==0 && can1.length==0)
        {
          den1=new int[1];  
          can1=new int[1];
          den1[0]=Integer.parseInt(this.txtDenominacion.getText());
          can1[0]=Integer.parseInt(this.txtCantidad.getText());
          for(i=0;i<=(num3.length-1)&& i<=(num4.length-1);i++)
          {
              
          }
        }
        
        else if(den1.length>0 && can1.length>0)
        {
            //num_tem=new int [num.length+1]
            den2=new int[den1.length+1];
            can2=new int [can1.length+1];
            for( i=0;i<=(den1.length-1) && i<=(can1.length-1);i++)//creo un ciclo para pasarle los valores del vector original al vector temporal
            //sin eliminarlo
            {     
             den2[i]=den1[i];//realizo el intercambio de datos
             can2[i]=can1[i];
        }
            den2[den2.length-1]=Integer.parseInt(this.txtDenominacion.getText());
            can2[can2.length-1]=Integer.parseInt(this.txtCantidad.getText());
            
            den1=new int[den2.length];//al vector original le creo una nueva posicion que va hacer la camtidad de datos que tenga el
            can1=new int[can2.length];

            //vector temporal
            for( i=0;i<=(den2.length-1)&&i<=(can2.length-1);i++)//realizo un ciclo para realizar el intercambio de nuevo
           {
        den1[i]=den2[i];//los valores del vector temporal los paso al vector original
              can1[i]=can2[i];
                // y que da el vecot listo para realizar operaciones
                
                // el vector que que con los datos es num[], el vector original
                
           ///con ese este vector se realizaran las operaciones que necesite
                
                
                 }

        }
        }
    }
        
              public void registrar3()

    {
        String usua=this.txtUsuario2.getText();
        String ami=this.txtAmigos.getText();

        if(this.txtUsuario2.equals("") && this.txtAmigos.equals(""))
        {
          JOptionPane.showMessageDialog(null,"Debe llenar los campos" ,"Aviso",JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
        if(usu3.length==0 && ami1.length==0)
        {
          usu3=new String[1];  
          ami1=new String[1];
          usu3[0]=this.txtUsuario2.getText();
          ami1[0]=this.txtAmigos.getText();
          for(i=0;i<=(num5.length-1)&& i<=(num6.length-1);i++)
          {
              
          }
        }
        
        else if(usu3.length>0 && ami1.length>0)
        {
            //num_tem=new int [num.length+1]
            usu4=new String[usu3.length+1];
            ami2=new String [ami1.length+1];
            for( i=0;i<=(usu3.length-1) && i<=(ami1.length-1);i++)//creo un ciclo para pasarle los valores del vector original al vector temporal
            //sin eliminarlo
            {     
             usu4[i]=usu3[i];//realizo el intercambio de datos
             ami2[i]=ami1[i];
        }
            usu4[usu4.length-1]=this.txtUsuario2.getText();
            ami2[ami2.length-1]=this.txtAmigos.getText();
            
            usu3=new String [usu4.length];//al vector original le creo una nueva posicion que va hacer la camtidad de datos que tenga el
            ami1=new String [ami2.length];

            //vector temporal
            for( i=0;i<=(usu4.length-1)&&i<=(ami2.length-1);i++)//realizo un ciclo para realizar el intercambio de nuevo
           {
        usu3[i]=usu4[i];//los valores del vector temporal los paso al vector original
              ami1[i]=ami2[i];
                // y que da el vecot listo para realizar operaciones
                
                // el vector que que con los datos es num[], el vector original
                
           ///con ese este vector se realizaran las operaciones que necesite
                
                
                 }

        }
        }
    }
    
        public void limpiar()
    {
        this.txtNombre.setText("");
        this.txtUsuario.setText("");
        this.txtPass.setText("");
        this.txtSinicial.setText("");
        this.txtEmpresa.setText("");
        this.txtMonto.setText("");
              
    }
        
        public void limpiar2()
    {
        this.txtDenominacion.setText("");
        this.txtCantidad.setText("");
              
    }
        
                public void limpiar3()
    {
        this.txtUsuario2.setText("");
        this.txtAmigos.setText("");
              
    }
        

     public static void main(String[] ARGUMENTOS)
    {
        //-- CREAMOS E INICIALIZAMOS LA VENTANA
                
                login  m = new login();
                m.setVisible(true);
                
    }
     
         static class login extends JFrame implements ActionListener{
             
              public JButton btnBotonIngresar = new JButton("INGRESAR");
              public JLabel lblUsuario = new JLabel("USUARIO : ");
              public JTextField txtUsuariol = new JTextField(20);
              public JLabel lblPass = new JLabel("PASSWORD: ");
              public JPasswordField Pass = new JPasswordField(20);
              static public String Usuariocajero;
              static public String Bancocajero;
              static public int Saldocajero;
              static public String Amigo;
              static public String Persona;
              static public int billetes;
              static public int billetes2;
              static public int SaldoPersona;
              static public int Saldoamigo;
              static public int montoc;
              static public int montoa;
              static public int montoa2;
              static String cusu1[]=new String[0];
              static String cusu2[]=new String[0];
              static String cami1[]=new String[0];
              static String cami2[]=new String[0];
              static int cden1[]=new int[0];
              static int cden2[]=new int[0];
              static int ccan1[]=new int[0];
              static int ccan2[]=new int[0];
              static int cnum1[]=new int[0];
              static int cnum2[]=new int[0];
              static String cusu3[]=new String[0];
              static String cusu4[]=new String[0];
              static String cami3[]=new String[0];
              static String cami4[]=new String[0];
              static int cden3[]=new int[0];
              static int cden4[]=new int[0];
              static int ccan3[]=new int[0];
              static int ccan4[]=new int[0];
              static int cnum3[]=new int[0];
              static int cnum4[]=new int[0];
              static String cusu5[]=new String[0];
              static String cusu6[]=new String[0];
              static int cden5[]=new int[0];
              static int cden6[]=new int[0];
              static int ccan5[]=new int[0];
              static int ccan6[]=new int[0];
              static int cnum5[]=new int[0];
              static int cnum6[]=new int[0];
              
              
              
              
                 public login(){
        //-- CONFIGURAMOS LA VENTANA JFRAME
         
        super("LOGIN");
        this.setSize(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.btnBotonIngresar.addActionListener(this);    

         
        //-- LE AÑADIMOS UN DISTRIBUIDOR DE OBJETOS A LA VENTANA
         
        FlowLayout DISTRIBUIDOR = new FlowLayout(FlowLayout.TRAILING,30,30);
        this.setLayout(DISTRIBUIDOR);
         
        //-- LE AGREGAMOS LOS OBJETOS A LA VENTANA
         
        this.add(this.lblUsuario);
        this.add(this.txtUsuariol);
        this.add(this.lblPass);
        this.add(this.Pass);
        this.add(this.btnBotonIngresar);
      
        
        
         
    }
     
    @Override
    public void actionPerformed(ActionEvent AE) 
    {
        //-- CON "getSource()" VEMOS EN QUE BOTON SE HIZO CLICK
            char clave[]=Pass.getPassword();

String clavedef=new String(clave);
         
        if(AE.getSource() == this.btnBotonIngresar)
        {
            if(this.txtUsuariol.getText().equals("ipc1Admin")&& clavedef.equals("aux1"))
            {
                                    this.dispose();


                    JOptionPane.showMessageDialog(null, "Bienvenido\n"
                    + "Has ingresado satisfactoriamente al sistema",   "Mensaje de bienvenida",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                    Login2 m= new Login2();
                    m.setVisible(true);
                    //m.getContentPane().setBackground(Color.green);
                    
                    
            }
            
            else if (!this.txtUsuariol.getText().equals("ipc1Admin")&& !clavedef.equals("aux1")){
                      for(i=0;i<nom1.length  && i<usu1.length && i<con1.length && i<si1.length  && i<emp1.length && i<mon1.length;i++)
        {
        

                              if (this.txtUsuariol.getText().equals(usu1[i]) && clavedef.equals(con1[i]) ){
                          System.out.println("Existe usuario");
                          if (emp1[i].equals("Cash-money")){
                              Bancocajero = emp1[i];
                              Usuariocajero = nom1[i];
                              Saldocajero = si1[i];
                              System.out.println("Usuario que entro:" + Usuariocajero);
                              System.out.println("Empresa:" + Bancocajero);
                              this.dispose();

                              JOptionPane.showMessageDialog(null, "Bienvenido\n"
                              + "Has ingresado satisfactoriamente al cajero",   "Mensaje de bienvenida",
                              JOptionPane.INFORMATION_MESSAGE);
                              cajero m= new cajero();
                              m.setVisible(true);
                              m.getContentPane().setBackground(Color.green);
                              
                          }
                          else if (emp1[i].equals("Pro-pisto")){
                              Bancocajero = emp1[i];
                              Usuariocajero = nom1[i];
                              Saldocajero = si1[i];
                              System.out.println("Usuario que entro:" + Usuariocajero);
                              System.out.println("Usuario que entro:" + Bancocajero);
                              this.dispose();

                              JOptionPane.showMessageDialog(null, "Bienvenido\n"
                              + "Has ingresado satisfactoriamente al cajero",   "Mensaje de bienvenida",
                              JOptionPane.INFORMATION_MESSAGE);
                              cajero m= new cajero();
                              m.setVisible(true);
                              m.getContentPane().setBackground(Color.gray);
                          }
                          
                     
                      }
                             // else  { 
                    //JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                    ///+ "Contraseña o Usuario Incorrecta", "Acceso denegado",
                   // JOptionPane.ERROR_MESSAGE);}
        }
        
                                              
        }  
       
        }

        
    }
    
    
              static class cajero extends JFrame implements ActionListener{
             
              public JButton btnBotonSalir = new JButton("SALIR");
              public JLabel lblUsuario = new JLabel("USUARIO : " + Usuariocajero);
              public JLabel lblSaldo= new JLabel("SALDO ACTUAL : " + Saldocajero);
              public JLabel lblEmpresa= new JLabel ("EMPRESA  :" + Bancocajero);
              public JLabel lblFechaHora = new JLabel();
              public JLabel lbltitulo1 = new JLabel("TRANSFERENCIA ESTUDIANTES : " );
              public JLabel lblAmigo = new JLabel("AMIGO : " );
              public JTextField txtAmigo= new JTextField(20);
              public JLabel lblDenominacion= new JLabel ("DENOMINACION  :");
              public JTextField txtDenominacion = new JTextField(20);
              public JLabel lblCantidad= new JLabel("CANTIDAD : ");
              public JTextField txtCantidad = new JTextField(20);
              public JButton btnBotonTransferira = new JButton("TRANSFERIR");
              public JLabel lbltitulo2 = new JLabel("TRANSFERENCIA LIBRE DINERO : " );
              public JLabel lblPersona = new JLabel("PERSONA : " );
              public JTextField txtPersona= new JTextField(20);
              public JLabel lblDenominacion2= new JLabel ("DENOMINACION  :");
              public JTextField txtDenominacion2 = new JTextField(20);
              public JLabel lblCantidad2= new JLabel("CANTIDAD : ");
              public JTextField txtCantidad2 = new JTextField(20);
              public JButton btnBotonTransferira2 = new JButton("TRANSFERIR");
              public JLabel lbltitulo3 = new JLabel("RETIRO DE DINERO DEL CAJERO: " );
              public JLabel lblDenominacion3= new JLabel ("DENOMINACION  :");
              public JTextField txtDenominacion3 = new JTextField(20);
              public JLabel lblCantidad3= new JLabel("CANTIDAD : ");
              public JTextField txtCantidad3 = new JTextField(20);
              public JButton btnBotonRetirar = new JButton("RETIRAR");
              //public JTextField txtUsuariol = new JTextField(20);
              //public JLabel lblPass = new JLabel("PASSWORD: ");
              //public JPasswordField Pass = new JPasswordField(20);
              //public JLabel lblUsuario = new JLabel("USUARIO : ");
              //public JTextField txtUsuariol = new JTextField(20);
              //public JLabel lblPass = new JLabel("PASSWORD: ");
              //public JPasswordField Pass = new JPasswordField(20);
              
                 public cajero(){
        //-- CONFIGURAMOS LA VENTANA JFRAME
         
        super("CAJERO");
        this.setSize(450,730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);
        this.setResizable(false);
         
        this.btnBotonSalir.addActionListener(this); 
        this.btnBotonTransferira.addActionListener(this);
        this.btnBotonTransferira2.addActionListener(this);
        this.btnBotonRetirar.addActionListener(this);

         
        //-- LE AÑADIMOS UN DISTRIBUIDOR DE OBJETOS A LA VENTANA
         
        FlowLayout DISTRIBUIDOR = new FlowLayout(FlowLayout.TRAILING,30,30);
        this.setLayout(DISTRIBUIDOR);
         
        //-- LE AGREGAMOS LOS OBJETOS A LA VENTANA
         
        //this.add(this.lblUsuario);
        //this.add(this.txtUsuariol);
        //this.add(this.lblPass);
        //this.add(this.Pass);
        this.add(this.lblUsuario);
        this.add(this.lblSaldo);
        this.add(this.lblEmpresa);
        this.add(this.lblFechaHora);
        this.add(this.lbltitulo1);
        this.add(this.lblAmigo);
        this.add(this.txtAmigo);
        this.add(this.lblDenominacion);
        this.add(this.txtDenominacion);
        this.add(this.lblCantidad);
        this.add(this.txtCantidad);
        this.add(this.btnBotonTransferira);
        this.add(this.lbltitulo2);
        this.add(this.lblPersona);
        this.add(this.txtPersona);
        this.add(this.lblDenominacion2);
        this.add(this.txtDenominacion2);
        this.add(this.lblCantidad2);
        this.add(this.txtCantidad2);
        this.add(this.btnBotonTransferira2);
        this.add(this.lbltitulo3);
        this.add(this.lblDenominacion3);
        this.add(this.txtDenominacion3);
        this.add(this.lblCantidad3);
        this.add(this.txtCantidad3);
        this.add(this.btnBotonRetirar);
        this.add(this.btnBotonSalir);

        Calendar Cal= Calendar.getInstance(); 
        String fec="FECHA: " +Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR)+" HORA: "+Cal.get(Cal.HOUR_OF_DAY)+":"+Cal.get(Cal.MINUTE)+":"+Cal.get(Cal.SECOND); 

        this.lblFechaHora.setText(fec);
         
    }
     
    @Override
    public void actionPerformed(ActionEvent AE) 
    {
 if(AE.getSource() == this.btnBotonSalir){
      System.out.println("Ha salido: " + Usuariocajero);
      this.dispose();
      JOptionPane.showMessageDialog(null, "Adios\n"
      + "Ha salido satisfactoriamente del cajero",   "Mensaje de salida",
      JOptionPane.INFORMATION_MESSAGE);
      login m = new login();
      m.setVisible(true);

}
 
  if(AE.getSource() == this.btnBotonTransferira){
      
              for(i=0;i<usu3.length  && i<ami1.length;i++)
        {

        }
              
        int suma=0;
        int monto=0;
        for(i=0;i<den1.length  && i<can1.length ;i++)
        {
        System.out.println("Q " +    den1[i]     + "        "   +    can1[i]+ " billetes");

        suma = suma + can1[i];
        monto = monto + (den1[i]*can1[i]);
        }

   
        int saldoc =Saldocajero;

        registrar4();
        
               
        for(i=0;i<cusu1.length  && i<cami1.length && i<cden1.length && i<ccan1.length;i++)
        {
        System.out.println("Transaccion :");
        System.out.println("      " +    cusu1[i]     + "        "   +    cami1[i]  +   "        " + cden1[i]      +"       " +    ccan1[i]);
        //montototalf = montototalf - (cden1[i]*ccan1[i]);
        billetes =(cden1[i]*ccan1[i]);
        saldoc = saldoc - billetes;
        //saldoa = saldoa + billetes;
               
        }
        
        System.out.println("Mi Saldo: " + saldoc);
        //System.out.println("Saldo Amigo: " + saldoa);
        
                        for(i=0;i<nom1.length  && i<usu1.length && i<con1.length && i<si1.length  && i<emp1.length && i<mon1.length;i++)
        {
            for(i=0;i<usu3.length  && i<ami1.length;i++){

        if (nom1[i].equals(Usuariocajero) && usu3[i].equals(Usuariocajero) && ami1[i].equals(this.txtAmigo.getText())){
            System.out.println("Se va a modificar usuario");
            Amigo =ami1[i];
            System.out.println("Se va a modificar amigo: " + Amigo);
            
            if ( saldoc >= 0){
            int saldoanterior= si1[i];
            System.out.println("Mi saldo anterior: " + saldoanterior);
            si1[i]=saldoc;
            System.out.println("Actualizacion de datos");
            System.out.println("      " +    nom1[i]     + "        "   +    usu1[i]  +   "        " + con1[i]      +"       " +    si1[i]     + "        "   +    emp1[i]  +   "        " + mon1[i]);
            
            JOptionPane.showMessageDialog(null, "Transferencia\n"
            + "Se realizó con exito la transferencia",   "Saldo suficiente en su cuenta",
            JOptionPane.INFORMATION_MESSAGE);
            
            }
            else{
            System.out.println("No se realizo la transaccion");
            
                          JOptionPane.showMessageDialog(null, "Error:\n"
                          + "No se pudó realizar la transferencia", "Ya no tiene saldo en su cuenta",
                          JOptionPane.ERROR_MESSAGE);
            }
            }
          else{
          
                    JOptionPane.showMessageDialog(null, "Error:\n"
                    + "No se pudó realizar la transferencia", "Esta persona no esta en su lista de amigo",
                    JOptionPane.ERROR_MESSAGE);
                    }
            }
        //else{
                       //JOptionPane.showMessageDialog(null, "Error:\n"
                       //+ "No se pudede realizar la transferencia", "Error en transferencia",
                       //JOptionPane.ERROR_MESSAGE);
        //}
        }
                        
                        
        for(i=0;i<nom1.length  && i<usu1.length && i<con1.length && i<si1.length  && i<emp1.length && i<mon1.length;i++)
        {
                
                if (nom1[i].equals(Amigo)){
                Saldoamigo=si1[i];
                montoa=mon1[i];
                
                
                System.out.println("Monto maximo amigo:" + montoa);
                
                
                //if (mon1[i])
                           //     }
           // JOptionPane.showMessageDialog(null, "Transferencia\n"
            //+ "Se realizó con exito la transferencia",   "Mensaje de transferrencia",
           // JOptionPane.INFORMATION_MESSAGE);
            }
        }
                int saldoa =Saldoamigo;
        
                for(i=0;i<cusu1.length  && i<cami1.length && i<cden1.length && i<ccan1.length;i++)
       {
        System.out.println("      " +    cusu1[i]     + "        "   +    cami1[i]  +   "        " + cden1[i]      +"       " +    ccan1[i]);
        //montototalf = montototalf - (cden1[i]*ccan1[i]);
        billetes =(cden1[i]*ccan1[i]);
        saldoa = saldoa + billetes;
               
        }
        System.out.println("Saldo anterior amigo" + Saldoamigo);
        System.out.println("Nuevo saldo Amigo: " + saldoa);
        
        
        
                            for(i=0;i<nom1.length  && i<usu1.length && i<con1.length && i<si1.length  && i<emp1.length && i<mon1.length;i++)
        {
            if (nom1[i].equals(Amigo)){

            if ( saldoa <= montoa){
            int saldoanterior= si1[i];
            si1[i]=saldoa;
            System.out.println("Actualizacion de datos");
            System.out.println("      " +    nom1[i]     + "        "   +    usu1[i]  +   "        " + con1[i]      +"       " +    si1[i]     + "        "   +    emp1[i]  +   "        " + mon1[i]);
            
            }
            else{System.out.println("No se realizo la transaccion");}
            }
          //  else{
          //   System.out.println("      " +    nom1[i]     + "        "   +    usu1[i]  +   "        " + con1[i]      +"       " +    si1[i]     + "        "   +    emp1[i]  +   "        " + mon1[i]);   
                    //   JOptionPane.showMessageDialog(null, "Error:\n"
                    //   + "No se pudó realizar la transferencia", "Error en transferencia",
                    //   JOptionPane.ERROR_MESSAGE);
                    // }
            
        //else{
                       //JOptionPane.showMessageDialog(null, "Error:\n"
                       //+ "No se pudede realizar la transferencia", "Error en transferencia",
                       //JOptionPane.ERROR_MESSAGE);
        //}
        }
        
        
        
  
        
        //System.out.println("Dinero en cajero:" + montototalf);
        //if (montototalf >= 0 && ){
      //JOptionPane.showMessageDialog(null, "Transferencia\n"
     // + "Se realizó con exito la transferencia",   "Mensaje de transferrencia",
     // JOptionPane.INFORMATION_MESSAGE);
            
       // }
        
        //else {
            
                    //JOptionPane.showMessageDialog(null, "Error:\n"
                    //+ "No se pudó realizar la transferencia", "Error en transferencia",
                   // JOptionPane.ERROR_MESSAGE);
            
       // }
        
        
        limpiar4();
        




}
  
    if(AE.getSource() == this.btnBotonTransferira2){
      
              for(i=0;i<usu3.length  && i<ami1.length;i++)
        {
        System.out.println("      " +    usu3[i]     + "        "   +    ami1[i]);
       // System.out.println("vector 2   " + cod1[i] );
        //System.out.println("vector 3   " + not1[i] );
        }
              
        int suma=0;
        int monto=0;
        for(i=0;i<den1.length  && i<can1.length ;i++)
        {
        System.out.println("Q " +    den1[i]     + "        "   +    can1[i]+ " billetes");
       // System.out.println("vector 2   " + cod1[i] );
        //System.out.println("vector 3   " + not1[i] );
        suma = suma + can1[i];
        monto = monto + (den1[i]*can1[i]);
        }
        System.out.println("total billetes: "+ suma);
        System.out.println("Total dinero: "+ monto);
   
        
       //int montototalf = monto;
        int saldoc2 =Saldocajero;
        Persona = this.txtPersona.getText();

        //if (saldoc >= 0){
        
        registrar5();
        
               
        for(i=0;i<cusu3.length  && i<cami3.length && i<cden3.length && i<ccan3.length;i++)
        {
        System.out.println("      " +    cusu3[i]     + "        "   +    cami3[i]  +   "        " + cden3[i]      +"       " +    ccan3[i]);
        //montototalf = montototalf - (cden1[i]*ccan1[i]);
        billetes2 =(cden3[i]*ccan3[i]);
        saldoc2 = saldoc2 - billetes2;
        //saldoa = saldoa + billetes;
               
        }
        
        System.out.println("Saldo: " + saldoc2);
        //System.out.println("Saldo Amigo: " + saldoa);
        
                        for(i=0;i<nom1.length  && i<usu1.length && i<con1.length && i<si1.length  && i<emp1.length && i<mon1.length;i++)
        {

        if (nom1[i].equals(Usuariocajero)){
            System.out.println("Se va a modificar usuario");

            if ( saldoc2 >= 0){
            int saldoanterior= si1[i];
            System.out.println("Saldo anterior: " + saldoanterior);
            si1[i]=saldoc2;
            System.out.println("      " +    nom1[i]     + "        "   +    usu1[i]  +   "        " + con1[i]      +"       " +    si1[i]     + "        "   +    emp1[i]  +   "        " + mon1[i]);
            
            }
            }
          //  else{
          //   System.out.println("      " +    nom1[i]     + "        "   +    usu1[i]  +   "        " + con1[i]      +"       " +    si1[i]     + "        "   +    emp1[i]  +   "        " + mon1[i]);   
                    //   JOptionPane.showMessageDialog(null, "Error:\n"
                    //   + "No se pudó realizar la transferencia", "Error en transferencia",
                    //   JOptionPane.ERROR_MESSAGE);
                    // }
            
        //else{
                       //JOptionPane.showMessageDialog(null, "Error:\n"
                       //+ "No se pudede realizar la transferencia", "Error en transferencia",
                       //JOptionPane.ERROR_MESSAGE);
        //}
        }
                        
                        
                        
        for(i=0;i<nom1.length  && i<usu1.length && i<con1.length && i<si1.length  && i<emp1.length && i<mon1.length;i++)
        {
                
                if (nom1[i].equals(Persona)){
                SaldoPersona=si1[i];
                montoa2=mon1[i];
                
                System.out.println("Nuevo saldo amigo");
                System.out.println("Monto maximo amgigo:" + montoa2);
                
                
                //if (mon1[i])
                           //     }
           // JOptionPane.showMessageDialog(null, "Transferencia\n"
            //+ "Se realizó con exito la transferencia",   "Mensaje de transferrencia",
           // JOptionPane.INFORMATION_MESSAGE);
            }
        }
                int saldoa2 =SaldoPersona;
        
                for(i=0;i<cusu3.length  && i<cami3.length && i<cden3.length && i<ccan3.length;i++)
       {
        System.out.println("      " +    cusu3[i]     + "        "   +    cami3[i]  +   "        " + cden3[i]      +"       " +    ccan3[i]);
        //montototalf = montototalf - (cden1[i]*ccan1[i]);
        billetes2 =(cden3[i]*ccan3[i]);
        saldoa2 = saldoa2 + billetes2;
               
        }
        System.out.println("Saldo" + SaldoPersona);
        System.out.println("Saldo Amigo: " + saldoa2);
        
        
        
                            for(i=0;i<nom1.length  && i<usu1.length && i<con1.length && i<si1.length  && i<emp1.length && i<mon1.length;i++)
        {
            if (nom1[i].equals(Persona)){

            if ( saldoa2 <= montoa2){
            int saldoanterior= si1[i];
            System.out.println("Saldo anterior amigo: " + saldoanterior);
            si1[i]=saldoa2;
            System.out.println("      " +    nom1[i]     + "        "   +    usu1[i]  +   "        " + con1[i]      +"       " +    si1[i]     + "        "   +    emp1[i]  +   "        " + mon1[i]);
            
            }
            }
          //  else{
          //   System.out.println("      " +    nom1[i]     + "        "   +    usu1[i]  +   "        " + con1[i]      +"       " +    si1[i]     + "        "   +    emp1[i]  +   "        " + mon1[i]);   
                    //   JOptionPane.showMessageDialog(null, "Error:\n"
                    //   + "No se pudó realizar la transferencia", "Error en transferencia",
                    //   JOptionPane.ERROR_MESSAGE);
                    // }
            
        //else{
                       //JOptionPane.showMessageDialog(null, "Error:\n"
                       //+ "No se pudede realizar la transferencia", "Error en transferencia",
                       //JOptionPane.ERROR_MESSAGE);
        //}
        }
        
        
        
  
        
        //System.out.println("Dinero en cajero:" + montototalf);
        //if (montototalf >= 0 && ){
      //JOptionPane.showMessageDialog(null, "Transferencia\n"
     // + "Se realizó con exito la transferencia",   "Mensaje de transferrencia",
     // JOptionPane.INFORMATION_MESSAGE);
            
       // }
        
        //else {
            
                    //JOptionPane.showMessageDialog(null, "Error:\n"
                    //+ "No se pudó realizar la transferencia", "Error en transferencia",
                   // JOptionPane.ERROR_MESSAGE);
            
       // }
        
        
        limpiar5();
        





}
    
     if(AE.getSource() == this.btnBotonRetirar){
         
        int suma=0;
        int monto=0;
        for(i=0;i<den1.length  && i<can1.length ;i++)
        {
        System.out.println("Q " +    den1[i]     + "        "   +    can1[i]+ " billetes");
       // System.out.println("vector 2   " + cod1[i] );
        //System.out.println("vector 3   " + not1[i] );
        suma = suma + can1[i];
        monto = monto + (den1[i]*can1[i]);
        montoc = monto;
        }
        System.out.println("total billetes: "+ suma);
        System.out.println("Total dinero: "+ montoc);
         
        int montototalf = montoc;
        
        registrar6();
                  
        for(i=0;i<cusu5.length  && i<cden5.length && i<ccan5.length;i++)
        {
        System.out.println("      " +    cusu5[i]     + "        " + cden5[i]      +"       " +    ccan5[i]);
        
        montototalf = montototalf - (cden5[i]*ccan5[i]);
        }
        System.out.println("Dinero en cajero:" + montototalf);
        
        if (montototalf >= 0 && Saldocajero >= 0){
      JOptionPane.showMessageDialog(null, "Transferencia\n"
      + "Se realizó con exito la transferencia",   "Mensaje de transferrencia",
      JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        else {
            
                    JOptionPane.showMessageDialog(null, "Error:\n"
                    + "No se pudó realizar la transferencia", "Error en transferencia",
                    JOptionPane.ERROR_MESSAGE);
            
        }
         
         limpiar6();

}
 

        
    }
    
    
                  public void registrar4()

    {
        String cusu=this.lblUsuario.getText();
        String cami=this.txtAmigo.getText();
        String cden=this.txtDenominacion.getText();
        String ccan=this.txtCantidad.getText();

        if(this.txtAmigo.equals("") && this.txtDenominacion.equals("") &&  this.txtCantidad.equals(""))
        {
          JOptionPane.showMessageDialog(null,"Debe llenar los campos" ,"Aviso",JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
        if(cusu1.length==0 && cami1.length==0 && cden1.length==0 && ccan1.length==0 )
        {
          cusu1=new String[1];  
          cami1=new String[1];
          cden1=new int[1];  
          ccan1=new int[1];
          cusu1[0]=this.lblUsuario.getText();
          cami1[0]=this.txtAmigo.getText();
          cden1[0]=Integer.parseInt(this.txtDenominacion.getText());
          ccan1[0]=Integer.parseInt(this.txtCantidad.getText());
          for(i=0;i<=(cnum1.length-1)&& i<=(cnum2.length-1);i++)
          {
              
          }
        }
        
        else if(cusu1.length>0 && cami1.length>0 && cden1.length>0 && ccan1.length>0 )
        {
            //num_tem=new int [num.length+1]
            cusu2=new String[cusu1.length+1];
            cami2=new String [cami1.length+1];
            cden2=new int[cden1.length+1];
            ccan2=new int[ccan1.length+1];
            for( i=0;i<=(cusu1.length-1) && i<=(cami1.length-1) && i<=(cden1.length-1) && i<=(ccan1.length-1) ;i++)//creo un ciclo para pasarle los valores del vector original al vector temporal
            //sin eliminarlo
            {     
             cusu2[i]=cusu1[i];//realizo el intercambio de datos
             cami2[i]=cami1[i];
             cden2[i]=cden1[i];
             ccan2[i]=ccan1[i];
        }
            cusu2[cusu2.length-1]=this.lblUsuario.getText();
            cami2[cami2.length-1]=this.txtAmigo.getText();
            cden2[cden2.length-1]=Integer.parseInt(this.txtDenominacion.getText());
            ccan2[ccan2.length-1]=Integer.parseInt(this.txtCantidad.getText());
            
            cusu1=new String [cusu2.length];//al vector original le creo una nueva posicion que va hacer la camtidad de datos que tenga el
            cami1=new String [cami2.length];
            cden1=new int [cden2.length];
            ccan1=new int [ccan2.length];

            //vector temporal
            for( i=0;i<=(cusu2.length-1)&&i<=(cami2.length-1)&& i<=(cden2.length-1)&&i<=(ccan2.length-1);i++)//realizo un ciclo para realizar el intercambio de nuevo
           {
        cusu1[i]=cusu2[i];//los valores del vector temporal los paso al vector original
              cami1[i]=cami2[i];
                cden1[i]=cden2[i];
              ccan1[i]=ccan2[i];
                // y que da el vecot listo para realizar operaciones
                
                // el vector que que con los datos es num[], el vector original
                
           ///con ese este vector se realizaran las operaciones que necesite
                
                
                 }

        }
        }
    }
                  
                  
                                    public void registrar5()

    {
        String cusu=this.lblUsuario.getText();
        String cami=this.txtPersona.getText();
        String cden=this.txtDenominacion2.getText();
        String ccan=this.txtCantidad2.getText();

        if(this.txtPersona.equals("") && this.txtDenominacion2.equals("") &&  this.txtCantidad2.equals(""))
        {
          JOptionPane.showMessageDialog(null,"Debe llenar los campos" ,"Aviso",JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
        if(cusu3.length==0 && cami3.length==0 && cden3.length==0 && ccan3.length==0 )
        {
          cusu3=new String[1];  
          cami3=new String[1];
          cden3=new int[1];  
          ccan3=new int[1];
          cusu3[0]=this.lblUsuario.getText();
          cami3[0]=this.txtPersona.getText();
          cden3[0]=Integer.parseInt(this.txtDenominacion2.getText());
          ccan3[0]=Integer.parseInt(this.txtCantidad2.getText());
          for(i=0;i<=(cnum3.length-1)&& i<=(cnum4.length-1);i++)
          {
              
          }
        }
        
        else if(cusu3.length>0 && cami3.length>0 && cden3.length>0 && ccan3.length>0 )
        {
            //num_tem=new int [num.length+1]
            cusu4=new String[cusu3.length+1];
            cami4=new String [cami3.length+1];
            cden4=new int[cden3.length+1];
            ccan4=new int[ccan3.length+1];
            for( i=0;i<=(cusu3.length-1) && i<=(cami3.length-1) && i<=(cden3.length-1) && i<=(ccan3.length-1) ;i++)//creo un ciclo para pasarle los valores del vector original al vector temporal
            //sin eliminarlo
            {     
             cusu4[i]=cusu3[i];//realizo el intercambio de datos
             cami4[i]=cami3[i];
             cden4[i]=cden3[i];
             ccan4[i]=ccan3[i];
        }
            cusu4[cusu3.length-1]=this.lblUsuario.getText();
                cami4[cami3.length-1]=this.txtPersona.getText();
            cden4[cden3.length-1]=Integer.parseInt(this.txtDenominacion2.getText());
            ccan4[ccan3.length-1]=Integer.parseInt(this.txtCantidad2.getText());
            
            cusu3=new String [cusu4.length];//al vector original le creo una nueva posicion que va hacer la camtidad de datos que tenga el
            cami3=new String [cami4.length];
            cden3=new int [cden4.length];
            ccan3=new int [ccan4.length];

            //vector temporal
            for( i=0;i<=(cusu4.length-1)&&i<=(cami4.length-1)&& i<=(cden4.length-1)&&i<=(ccan4.length-1);i++)//realizo un ciclo para realizar el intercambio de nuevo
           {
        cusu3[i]=cusu4[i];//los valores del vector temporal los paso al vector original
              cami3[i]=cami4[i];
                cden3[i]=cden4[i];
              ccan3[i]=ccan4[i];
                // y que da el vecot listo para realizar operaciones
                
                // el vector que que con los datos es num[], el vector original
                
           ///con ese este vector se realizaran las operaciones que necesite
                
                
                 }

        }
        }
    }
        
                                    
                                                     
                                    public void registrar6()

    {
        String cusu=this.lblUsuario.getText();
        String cden=this.txtDenominacion3.getText();
        String ccan=this.txtCantidad3.getText();

        if( this.txtDenominacion3.equals("") &&  this.txtCantidad3.equals(""))
        {
          JOptionPane.showMessageDialog(null,"Debe llenar los campos" ,"Aviso",JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
        if(cusu5.length==0 &&  cden5.length==0 && ccan5.length==0 )
        {
          cusu5=new String[1];  
          cden5=new int[1];  
          ccan5=new int[1];
          cusu5[0]=this.lblUsuario.getText();
          cden5[0]=Integer.parseInt(this.txtDenominacion3.getText());
          ccan5[0]=Integer.parseInt(this.txtCantidad3.getText());
          for(i=0;i<=(cnum5.length-1)&& i<=(cnum6.length-1);i++)
          {
              
          }
        }
        
        else if(cusu5.length>0 &&  cden5.length>0 && ccan5.length>0 )
        {
            //num_tem=new int [num.length+1]
            cusu6=new String[cusu5.length+1];
            cden6=new int[cden5.length+1];
            ccan6=new int[ccan5.length+1];
            for( i=0;i<=(cusu5.length-1)  && i<=(cden5.length-1) && i<=(ccan5.length-1) ;i++)//creo un ciclo para pasarle los valores del vector original al vector temporal
            //sin eliminarlo
            {     
             cusu6[i]=cusu5[i];//realizo el intercambio de datos
             cden6[i]=cden5[i];
             ccan6[i]=ccan5[i];
        }
            cusu6[cusu5.length-1]=this.lblUsuario.getText();
            cden6[cden5.length-1]=Integer.parseInt(this.txtDenominacion3.getText());
            ccan6[ccan5.length-1]=Integer.parseInt(this.txtCantidad3.getText());
            
            cusu5=new String [cusu6.length];//al vector original le creo una nueva posicion que va hacer la camtidad de datos que tenga el
            cden5=new int [cden6.length];
            ccan5=new int [ccan6.length];

            //vector temporal
            for( i=0;i<=(cusu6.length-1)&& i<=(cden6.length-1)&&i<=(ccan6.length-1);i++)//realizo un ciclo para realizar el intercambio de nuevo
           {
        cusu5[i]=cusu6[i];//los valores del vector temporal los paso al vector original
                cden5[i]=cden6[i];
              ccan5[i]=ccan6[i];
                // y que da el vecot listo para realizar operaciones
                
                // el vector que que con los datos es num[], el vector original
                
           ///con ese este vector se realizaran las operaciones que necesite
                
                
                 }

        }
        }
    }
                  
                          public void limpiar4()
    {
        this.txtAmigo.setText("");
        this.txtDenominacion.setText("");
        this.txtCantidad.setText("");
              
    }
                          
                                                    public void limpiar5()
    {
        this.txtPersona.setText("");
        this.txtDenominacion2.setText("");
        this.txtCantidad2.setText("");
              
    }
                                                                                       public void limpiar6()
    {
        
        this.txtDenominacion3.setText("");
        this.txtCantidad3.setText("");
              
    }
                          

             
         }
             
         }
         
}
    
    
