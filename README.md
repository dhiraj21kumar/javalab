# javalab
Java lab programs, both part A and part B. 

For the GUI program of part B, we have to create a directory and make a txt file in that directory and write the 
ID, Name, DOJ, DOB etc in that file.
Now give the math in this line:  File fileobj=new File("................./file.txt");

After that when you run the program, in the popped UI enter the same details as in file.txt.
The output can se seen in the console.

For the first program of part B i.e., employee program, before running go to RUN CONFIGURATIONS->ARGUMENTS->PROGRAM ARGUMENTS 
& give only the employee id mentioned in the program and the apply and run.

Program number 11 in lab manual that is video rental store program is present in my repo in the *movie* folder.

Program number 12 in lab manual that is the employee details using JDBC is present in my repo in the *employeeData* folder. 
For this program(program 12) we have to create a db in mysql named as *emp* and them create a table in the emp database named as *employee* . After that we initialize the values that are given in manual, in the created table. After inserting values in the table minimize the terminal and open eclipse and the execute the program. 


NOTE- Before executing go to build-> build configuration-> library-> Add external jar file and search for the connector.jar file.(for me it was "mysql-connector-java-8.0.19.jar" which I had downloaded from internet). It's important as without this connector the connection to mysql db won't be initialized.
