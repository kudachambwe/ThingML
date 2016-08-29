#!/bin/bash

timeout 8 socat -x -v PTY,link=modem0 PTY,link=modem1&
sleep 1
timeout -s SIGINT 6 ./ServerFloatCfg/ServerFloatCfg > srvStdo.log 2> srvStdr.log&
sleep 1
timeout -s SIGINT 5 ./ClientFloatCfg/ClientFloatCfg > cliStdo.log 2> cliStdr.log&

sleep 6

printf "Cli stdo:\n\n"
cat cliStdo.log
printf "\nCli stdr:\n\n"
cat cliStdr.log

printf "\n\nSrv stdo:\n\n"
cat srvStdo.log
printf "\nSrv stdr:\n\n"
cat srvStdr.log