### JPA/Hibernate Console: incorrect embedded database is used by console in case of file: protocol with relative path using in the database URL
 
 - create new Datasource for the database URL specified in the persistence.xml file
   (it uses the file: protocol with the relative path:
   `jdbc:hsqldb:file:target/myDB;shutdown=true`)
 - run the Application: the DB is created in the <project root>/target folder and the table is populated with some records.
 - try to run console from the Database view: the table contents is displayed correctly
 - now run the JPA or Hibernate console from the Persistence view for the 'default' persistence unit:
 you get the empty output, since the console creates and uses the new DB in the <IDEA installation folder>/bin/target

After changing URL to the absolute path
`jdbc:hsqldb:file:/target/myDB;shutdown=true`
the correct DB is used by console

[https://youtrack.jetbrains.com/issue/IDEA-307945](https://youtrack.jetbrains.com/issue/IDEA-307945)