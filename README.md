
## Agregar Oracle - cambiar estos datos en package com.eval.model Conexion.java

```java
	private static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:nombreBaseDeDatos";
	private static String JDBC_USER = "user";
	private static String JDBC_PASS = "pass";
```

Y Deben cargar los drivers de oracle en WEB-INF / lib

http://www.java2s.com/Code/Jar/s/Downloadstandardjar.htm
http://www.java2s.com/Code/Jar/j/Downloadjstljar.htm
http://www.java2s.com/Code/Jar/o/Downloadojdbc14jar.htm

