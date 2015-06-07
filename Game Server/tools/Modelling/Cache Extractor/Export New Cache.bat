@ECHO OFF
COLOR 1F
CLS
ECHO.
ECHO Exporting New Cache Files.
ECHO.
java -cp ./data/CacheExport2.jar cacheexport2.Main ./data/new.dat
ECHO.
pause