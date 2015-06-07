@echo off
java -Xms512m -Xmx1024m -cp bin;lib/*; ProGuard
pause