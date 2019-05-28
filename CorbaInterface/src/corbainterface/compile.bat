:: Directorio de java SDK
SET JAVA_HOME="C:\Program Files (x86)\Java\jdk1.8.0_201"

:: direccion de las fuentes SRC de proyecto netbeans IDL "CorbaFiboInterface"
SET PATH_IDL="C:\Users\LABAM\Documents\Parra\Sistemas Distribuidos\CORBA\CORBA\CorbaInterface\src\corbainterface"

:: nombre del archivo IDL
SET IDL_NAME=generar.idl

:: comando para compilar
%JAVA_HOME%\bin\idlj -fall -td %PATH_IDL% %PATH_IDL%\%IDL_NAME%
::pause
