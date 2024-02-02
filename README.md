# JDBC-Login-Gui
This Java application, utilizing the Swing framework for the graphical user interface, employs the Java Database Connectivity (JDBC) technology to create a secure and efficient login system. Following the Model-View-Controller (MVC) design pattern, the application ensures a clear separation of concerns, enhancing maintainability and scalability. The Data Access Object (DAO) design pattern is implemented to encapsulate the interaction with the underlying database, promoting a modular and flexible architecture. With a focus on user authentication, this project establishes a robust and user-friendly login interface, showcasing the seamless integration of Java, Swing, JDBC, and design patterns for a well-structured and maintainable codebase.
<br>
Tools used:
Java17,JDBC,JAVA swing , Netbeans
Patterns:
MVC
<br>
<br>
Features :
<br>
Login form 
<br>
![imagen](https://github.com/wuzupKev/JDBCLoginGui/assets/103788196/1132c9b4-1c22-48c6-8826-37f2f9fa7bb8)
<br>
<h2>Configurations</h2> 
<h3>tools you need to make it work</h3>
<ul>
  <li>Java 17</li>
  <li>JDBC Connector</li>
   <li>database  schema</li>
</ul>
<p>Go to connections folder and the connection class, change the paramethers of the connect method depending on your DATABASE ADMINISTRATOR</p>
<br>
<pre>
  <xmp>
     public Connection connect(){
        String jdbc= "jdbc:mysql://localhost:3306/logindb";
        try {
           connection= DriverManager.getConnection(jdbc,"root","AdminDB123");
           
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
</xmp>
</pre>




<br>
<br>





