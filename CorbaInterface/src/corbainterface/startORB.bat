@echo=OFF
:Direccion del jdk de Java
SET DIR="C:\Program Files\Java\jdk1.8.0_211\bin"
cd %DIR%
:Se levata el Object Request Broker para mantener la conversación por el puerto
start orbd -ORBInitialPort 3700
:pause
