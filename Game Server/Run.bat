@echo off
title RuneHonor - GameServer
"C:\Program Files\Java\jre1.8.0_25\bin\java.exe" -Xmx4000m -cp bin;deps/poi.jar;deps/mysql.jar;deps/RuneTopListV2.jar;deps/GTLVote.jar;deps/mina.jar;deps/slf4j.jar;deps/slf4j-nop.jar;deps/jython.jar;log4j-1.2.15.jar; server.Server
pause