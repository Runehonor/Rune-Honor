@ECHO OFF
COLOR 1F
CLS
ECHO.
ECHO Exporting Old Cache Files.
ECHO.
java -cp ./data/CacheExport2.jar cacheexport2.Main ./data/old.dat
ECHO.
pause